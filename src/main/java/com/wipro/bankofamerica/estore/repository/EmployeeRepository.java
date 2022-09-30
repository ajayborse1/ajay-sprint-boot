package com.wipro.bankofamerica.estore.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.model.Product;
/**
*
* @author Jeevan
*/
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
	public Employee findById(Integer Id);

	@Query(value="select * from emps where city=?1", nativeQuery =true)
	public List<Employee> findByCity(String city);
}
