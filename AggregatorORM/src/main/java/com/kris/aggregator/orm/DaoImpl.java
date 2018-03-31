package com.kris.aggregator.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements DAO {

	private static SessionFactory sf;

	static {
		sf = new Configuration().configure().buildSessionFactory();
	}

	public Users getUser(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Users user = session.get(Users.class, id);
		session.close();
		return user;
	}

	public Address getAddress(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Address adr = session.get(Address.class, id);
		session.close();
		return adr;
	}

}
