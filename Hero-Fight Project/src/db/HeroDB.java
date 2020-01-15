package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Hero;

public class HeroDB {
	//right click chap21_stuffy_db -> Build Path -> Configure Build Path ->
		//Libraries -> External JAR -> Apply and Exit
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/hero_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "hero_db_user";
		String pwd = "Martha";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	
	//1 - Get Stuffy
		public List<Hero> getAll() throws SQLException {
			String sql = "SELECT * FROM hero ORDER BY id ASC";
			
			List<Hero> stuf = new ArrayList<>();
			try (Connection connection = getConnection();
					PreparedStatement ps = connection.prepareStatement(sql);
					ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					int id2 = rs.getInt(1);
					String heroName = rs.getString(2);
					String secretID = rs.getString(3);
					double intelligence = rs.getDouble(4);
					double strength = rs.getDouble(5);
					double durability = rs.getDouble(6);
					double speed = rs.getDouble(7);
					double energyPro = rs.getDouble(8);
					double fightSkill = rs.getDouble(9);
					
					Hero h = new Hero(id2, heroName, secretID, intelligence, strength,
							durability, speed, energyPro, fightSkill);
					stuf.add(h);
				}
				return stuf;
			} catch (SQLException e) {
				System.out.println(e);
				return null;
			}
		}
		
		
		//2 - Get Stuffy by ID
		public Hero get(int id) {
			String sql = "select * from hero where id = " + id;
				
				Hero h = null;
			
			try (Statement stmt = getConnection().createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
				boolean heroExists = rs.next();
				
				//get hero values
				if (heroExists) {
					//result set has a hero
					//process the result set row
					int id2 = rs.getInt(1);
					String heroName = rs.getString(2);
					String secretID = rs.getString(3);
					double intelligence = rs.getDouble(4);
					double strength = rs.getDouble(5);
					double durability = rs.getDouble(6);
					double speed = rs.getDouble(7);
					double energyPro = rs.getDouble(8);
					double fightSkill = rs.getDouble(9);
					
					h = new Hero(id2, heroName, secretID, intelligence, strength,
						durability, speed, energyPro, fightSkill);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return h;
		}
		
		//3 - Add Stuffy
		public int add(Hero h) {
			int rowCount = 0;
			
			String sql = "insert into hero (name, secretID, "
					+ "intelligence, strength, durability, speed, energyPro,"
					+ " fightSkill) " +
			"values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				ps.setString(1, h.getHeroName());
				ps.setString(2, h.getSecretID());
				ps.setDouble(3, h.getIntelligence());
				ps.setDouble(4, h.getStrength());
				ps.setDouble(5, h.getDurability());
				ps.setDouble(6, h.getSpeed());
				ps.setDouble(7, h.getEnergyPro());
				ps.setDouble(8, h.getFightSkill());
				
				
				rowCount = ps.executeUpdate();
			}
			catch (SQLException se) {
				System.out.println(se);
			}
			return rowCount;
		}
		
		//4 - Update stuffy
		
		public int update(Hero h) {
			int rowCount = 0;
			
			//String sql = "insert into hero (name, secretID, "
			//		+ "intelligence, strength, durability, speed, energyPro,"
			//		+ " fightSkill, avg) " +
			//		"values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			String sql = "UPDATE hero SET "
						+"name = ?, "
						+"secretID = ?, "
						+"intelligence = ?, "
						+"strength = ?, "
						+"durability = ?, "
						+"speed = ?, "
						+"energyPro = ?, "
						+"fightSkill = ?, "
						+"WHERE id = ?";
			
			try (Connection connection = getConnection();
					PreparedStatement ps = connection.prepareStatement(sql)) {
				ps.setString(1, h.getHeroName());
				ps.setString(2, h.getSecretID());
				ps.setDouble(3, h.getIntelligence());
				ps.setDouble(4, h.getStrength());
				ps.setDouble(5, h.getDurability());
				ps.setDouble(6, h.getSpeed());
				ps.setDouble(7, h.getEnergyPro());
				ps.setDouble(8, h.getFightSkill());
				ps.setInt(10, h.getId());
				
				rowCount = ps.executeUpdate();
			}
			catch (SQLException se) {
				System.out.println(se);
			}
			return rowCount;
		}
		
		
		//5 - Delete Stuffy by ID
		public int delete(Hero h) {
			int rowCount = 0;
			
			String sql = "DELETE FROM hero " +
						"WHERE id = ?";
			try (Connection connection = getConnection();
					PreparedStatement ps = connection.prepareStatement(sql)) {
				ps.setInt(1, h.getId());
				rowCount = ps.executeUpdate();
			} catch (SQLException e){
				System.out.println(e);
			}
			return rowCount;
		}
		
		//Get Hero AVG by ID
		public double getAvg(int id) {
			String sql = "select intelligence, strength, durability, speed, energyPro, "
					+"fightSkill from hero where id = " + id;
			double avg = 0;
		try (Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			boolean heroExists = rs.next();
			
			//get hero avg value
			if (heroExists) {
				double intelligence = rs.getDouble(1);
				double strength = rs.getDouble(2);
				double durability = rs.getDouble(3);
				double speed = rs.getDouble(4);
				double energyPro = rs.getDouble(5);
				double fightSkill = rs.getDouble(6);
				
				avg = ((intelligence+strength+durability+speed+energyPro+fightSkill)/6);
			}
		} 
		catch (SQLException e) {
				e.printStackTrace();
		}
			return avg;
		}

		//Get Hero Name by ID
		public String getHeroName(int id) {
				String sql = "select name from hero where id = " + id;
				String name = null;
			try (Statement stmt = getConnection().createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
				boolean heroExists = rs.next();
				//get hero avg value
				if (heroExists) {
					name = rs.getString(1);
				}
			} 
			catch (SQLException e) {
					e.printStackTrace();
		}
			return name;
		}
		
}
