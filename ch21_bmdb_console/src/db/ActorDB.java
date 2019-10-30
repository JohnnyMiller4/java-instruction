package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

public class ActorDB extends BaseDB {

	//pg 679 multiple rows
	
	//list
	public List<Actor> list() {
		List<Actor> actorList = new ArrayList<>();
		String sql = "SELECT * from actor";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actorList.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actorList;
	}
	
	//get movie
			public Actor get(int id) {
				Actor actor = null;
				
				String sql = "SELECT * from actor WHERE id = ?";
				
				try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						actor = getActorFromResultSet(rs);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return actor;
			}
	
		//add actor
		public int add(Actor a) {
			int rowCount = 0;
			String sql = "insert into actor (firstName, lastName, gender, birthdate) VALUES " +
							"(?, ?, ?, ?)";
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setString(1, a.getFirstName());
				ps.setString(2, a.getLastName());
				ps.setString(3, a.getGender());
				ps.setObject(4, a.getBirthdate());
				
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rowCount;
		}
		
		//update
		public int update(Actor a) {
			int rowCount = 0;
			String sql = "update actor set birthdate = ? where id = ?";
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setObject(1, a.getBirthdate());
				ps.setInt(2, a.getId());
				
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rowCount;
		}
		
		//delete movie
		public int delete(Actor a) {
			int rowCount = 0;
			String sql = "delete from actor where id = ?";
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setInt(1, a.getId());
				
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rowCount;
		}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		//Get a movie from the result set
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		
		//translate Date to LocalDate
		LocalDate ld = rs.getDate(5).toLocalDate();
		
		
		Actor a = new Actor(id, firstName, lastName, gender, ld);
		return a;
	}
}
