package nandini.com;
import org.springframework.data.repository.CrudRepository;

import nandini.Student;

{
	public interface StudentRepository extends CrudRepository<Student, Integer>
	{
}
