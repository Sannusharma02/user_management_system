package com.oehm3.ums.model.dao;


import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oehm3.ums.dto.RegisterDTO;

@Repository
public class RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory ;

	public void register(RegisterDTO dto) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
	}
}
