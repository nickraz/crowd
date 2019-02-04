package repo;

import org.springframework.data.repository.CrudRepository;
import razilov.crowd.Emp;

import java.util.List;

public interface EmpRepo extends CrudRepository<Emp, Long> {
    List<Emp> getEmpById(long id);
    List<Emp> getEmpByIdOrderById(long id);
}
