package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

//인터페이스로 구성되어있다. 하지만 Spring Boot에서 알아서 클래스와 메소드를 구현해준다.
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	//이름을 바탕으로 찾을 수 있게 알아서 구현해 준다.
	List<Customer> findByLastName(String lastName);

} 