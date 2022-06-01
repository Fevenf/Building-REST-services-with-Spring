package payroll.payroll;

// public class EmployeeRepository {
    
// }

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}