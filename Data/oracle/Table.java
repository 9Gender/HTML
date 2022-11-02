package oracle;
import java.sql.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	     {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","Film");
	        if(con==null)
	        System.out.print("NO CONNECTION..");
	        else
	        System.out.println("CONNECTION CREATED..");  
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select * from cse510");
	        while(rs.next())
	        {
	          System.out.println("emp no>>>>>"+rs.getInt(1));
	          System.out.println("emp name>>>>"+rs.getString(2));
	          System.out.println("emp branch>>>>"+rs.getString(3));
	          System.out.println("emp email>>>>"+rs.getString(4));
	        }
	        rs.close();
	        st.close();
	        con.close();    
	     }
	    catch(Exception e)
	    {
	     e.printStackTrace();
	    }

	}

}
