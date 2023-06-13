package com.exterro.hibernate;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.exterro.hibernate.dao.SessionFactoryProvider;
import com.exterro.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("In MAIN");

		Session session = SessionFactoryProvider.getSessionFactory().openSession();
		
		//Creates Employee
		/*
		Employee employee1 = new Employee(101, "Abhishek", "DEV", 67000.0);
		Employee employee2 = new Employee(102, "Sreeja", "HR", 56000.0);
		Employee employee3 = new Employee(103, "Danny", "DEV", 89000.0);
		Employee employee4 = new Employee(104, "Jagan", "DEV", 75000.0);

		session.beginTransaction();
		
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);

		session.getTransaction().commit();
		
		
		//View Single Employee
		/*
		
		Employee employee = (Employee) session.get(Employee.class, 102);
		System.out.println(employee);
		tx.commit();
		*/
		
		
		//View Multiple Employee Using Criteria
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		//criteria.add(Restrictions.eq("empDept", "DEV"));
//		List empList = criteria.list();
//		System.out.println(empList);
//	
//		Criterion salary = Restrictions.gt("empSalary", 20000.0);
//		Criterion name = Restrictions.ilike("empName","%a");
//		
//		
//		LogicalExpression orExp = Restrictions.and(salary, name);
//		criteria.add( orExp );
//		empList = criteria.list();
		
		criteria.setProjection(Projections.avg("empSalary"));
		System.out.println(criteria.uniqueResult());
		
		// To get records matching with AND conditions
		/*LogicalExpression andExp = Restrictions.and(salary, name);
		criteria.add( andExp );
		empList = criteria.list();
		System.out.println(empList);
		*/
//		Transaction tx = session.beginTransaction();
//		Student st = new Student(106,"Karthik",'B');
//		session.save(st);
//		session.save(new Score(st,100,100,100));
//		tx.commit();
		session.close();
		SessionFactoryProvider.shutdown();
	}
}
