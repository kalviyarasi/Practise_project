import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO {
public int insert(ProductDetails p) throws ClassNotFoundException, SQLException {
	Connection con=DbUtil.getCon();
	if(con!=null) {
		System.out.println("your connection is established");
	}
	else {
		System.out.println("Oops...connection failed");
	}
	String sql="insert into ProductDetails values (?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1,p.getPid());
	ps.setString(2,p.getPname());
	ps.setInt(3, p.getPcost());
	int row=ps.executeUpdate();
	return row;
}
public ResultSet retrieve(int pid) throws ClassNotFoundException, SQLException {
	Connection con=DbUtil.getCon();
	Statement st=con.createStatement();
	String sql="select * from ProductDetails where pid=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1,pid);
	ResultSet rs=ps.executeQuery();
	return rs;
}
}
