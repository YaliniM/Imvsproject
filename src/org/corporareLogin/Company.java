package org.corporareLogin;

import java.util.ArrayList;
import java.util.List;

public class Company{
	public static void main(String[] args) {
		Employe a = new Employe();
		a.setUsername("suresh");
		a.setPassword(1234);
		 
		
		Employe b = new Employe();
		b.setUsername("ravi");
		b.setPassword(4321);
		
		
		Employe c = new Employe();
		c.setUsername("infoys");
        c.setPassword(76541);
        
        Employe d = new Employe();
        d.setUsername("wipro");
        d.setPassword(123456);
        
        
        List<Employe>u = new ArrayList();
        u.add(a);
        u.add(b);
        u.add(c);
        u.add(d);
        for (int i=0; i<u.size();i++) {
        	System.out.println(u.get(i).getUsername());
        	System.out.println(u.get(i).getpassword());
        }
        
		 
	}
	

}
