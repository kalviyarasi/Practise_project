

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertDAO {

	
	public int insert(Product p) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(int)s.save(p);
		t.commit();
		
		return r;
		

	}
}
