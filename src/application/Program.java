package application;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import db.DB;

public class Program {

	public static void main(String[] args) {
		
			Department obj = new Department(1, "Books");
			
			Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
			
			System.out.println(seller);
	}
}			
			//Connection conn = null;
			//PreparedStatement st = null;
			//try {
				// 	conn = DB.getConnection();
				 	
				 //	st = conn.prepareStatement(
				 	//				"DELETE FROM department "
				 		//			+ "WHERE "
				 			//		+ "Id = ? ");
				// 	st.setInt(1, 5);
				 	
				 //	int rowsAffected = st.executeUpdate();
				 	
				// 	System.out.println("Done! Rows affected: " + rowsAffected);
				 			
		//	}
		//	catch (SQLException e){
			//	  e.printStackTrace();
			//	}
		//	finally {
			//		DB.closeStatement(st);
			//		DB.closeConnection();
		//	}
	//	}
//}