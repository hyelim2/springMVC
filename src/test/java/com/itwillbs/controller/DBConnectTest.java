package com.itwillbs.controller;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBConnectTest {
	// DataSource 객체
	@Inject
	private DataSource ds;

	@Inject
	private SqlSessionFactory fac;
	
	@Inject
	private SqlSession sessoion;

//	@Test
	public void dataSourceTest() {
		System.out.println(ds);
	}

	// @Test
	public void factoryTest() {
		System.out.println(fac);
	}

	@Test
	public void sessionTest() {
		System.out.println(sessoion);
	}
}
