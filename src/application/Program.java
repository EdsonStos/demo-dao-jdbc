package application;
import model.dao.DaoFactory;
import model.entities.Seller;
import model.dao.SellerDao;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import db.DB;

public class Program {

	public static void main(String[] args) {
			
			SellerDao sellerDao = DaoFactory.createSellerDao();
		
			System.out.println("==== TEST 1: seller findbyId ==== ");
			Seller seller = sellerDao.findById(3);
			
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