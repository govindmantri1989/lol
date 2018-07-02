
package onetomany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Onetomany {

    public static void main(String[] args) {
       Configuration c=new Configuration();
        c.configure();
        SessionFactory sf = c.buildSessionFactory();
        Session sess = sf.openSession();
        Customer c1=new Customer();
        c1.setCid(1001);
        c1.setName("Gada Eletronics");
        
        Customer c2=new Customer();
        c2.setCid(1002);
        
        c2.setName("Oberoy electronics");
        Set s=new HashSet();
        s.add(c1);
        s.add(c2);
        Vendor v=new Vendor();
        Vendor v1=new Vendor();
        v.setVid(5000);
        v.setName("LG");
        v1.setVid(6000);
        v1.setName("ANdroid");
        v.setCustomers(s);
        Set veSet=new HashSet();
        veSet.add(v);
        veSet.add(v1);
        c1.setV(veSet);
        c2.setV(veSet);
        sess.save(v);
        sess.save(v1);
        
        sess.beginTransaction().commit();
        
    }
    
}
