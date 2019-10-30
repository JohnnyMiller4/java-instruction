package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB {
	//right click chap21_stuffy_db -> Build Path -> Configure Build Path ->
	//Libraries -> External JAR -> Apply and Exit
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "stuffy_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	
	//pg691
	
	//1 - Get Stuffy
	public List<Stuffy> getAll() throws SQLException {
		String sql = "SELECT * FROM stuffy ORDER BY id ASC";
		
		List<Stuffy> stuf = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				
				Stuffy s = new Stuffy(id2, type, color, size, limbs);
				stuf.add(s);
			}
			return stuf;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	//2 - Get Stuffy by ID
	public Stuffy get(int id) {
		String sql = "select * from stuffy where id = " + id;
			
			Stuffy s = null;
		
		try (Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			boolean stuffyExists = rs.next();
			
			//get Stuffy values
			if (stuffyExists) {
				//result set has a stuffy
				//process the result set row
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				
				s = new Stuffy(id2, type, color, size, limbs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	//3 - Add Stuffy
	public int add(Stuffy s) {
		int rowCount = 0;
		
		String sql = "INSERT INTO stuffy (Type, Color, Size, Limbs) " +
					"VALUES (?, ?, ?, ?)";
		
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			
			rowCount = ps.executeUpdate();
		}
		catch (SQLException se) {
			System.out.println(se);
		}
		return rowCount;
	}
	
	//4 - Update stuffy
	
	public int update(Stuffy s) {
		int rowCount = 0;
		
		String sql = "UPDATE stuffy SET "
					+"type = ?, "
					+"color = ?, "
					+"size = ?, "
					+"limbs = ? "
					+"WHERE id = ?";
		
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			ps.setInt(5, s.getId());
			
			rowCount = ps.executeUpdate();
		}
		catch (SQLException se) {
			System.out.println(se);
		}
		return rowCount;
	}
	
	
	//5 - Delete Stuffy by ID
	public int delete(Stuffy s) {
		int rowCount = 0;
		
		String sql = "DELETE FROM stuffy " +
					"WHERE id = ?";
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, s.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e){
			System.out.println(e);
		}
		return rowCount;
	}
	
	
	}
