package techment.deo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import techment.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	

}
