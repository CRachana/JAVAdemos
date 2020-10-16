package com.dao;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import com.model.Employee;

@Repository
public class EmployeeImpl implements EmployeeDao {​​

@Autowired // DI
private SessionFactory sessionFactory;

@Transactional
public Employee readEmployeeById(int empNo) {​​
Session session = sessionFactory.getCurrentSession();
Employee employee = session.get(Employee.class, empNo);
return employee;
}​​

}​​
