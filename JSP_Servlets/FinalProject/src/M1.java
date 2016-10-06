import java.sql.Connection;

import com.mnr.beans.Book;
import com.mnr.database.DBConnection;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = DBConnection.getConnection();
		if(connection == null){
			System.out.println("fail1");
		}
		Book b1 = DBConnection.findBook(connection, "Book13");
		if(b1==null){
			System.out.println("fail");
		}else{
			System.out.println(b1.getName());
		}
		
		Book[] b2 = DBConnection.findBooks(connection);
		if(b2==null){
			System.out.println("fail");
		}else{
			for(Book b: b2){
				System.out.println(b.getName() + " " + b.getAuthor() + " " + 
						b.getPrice() + ",id: " + b.getId());
			}
			
		}
	}

}
