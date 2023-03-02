package nandini.com;

import java.util.List;

@RestController

public class StudentController 
{
		@Autowired
		StudentService studentService;  
		   
		@GetMapping("/student")  
		private List<Student> getAllStudent()   
		{  
		return studentService.getAllStudent();  
		}  
		@GetMapping("/student/{id}")  
		private Student getStudent(@PathVariable("id") int id)   
		{  
		return studentService.getStudentById(id);  
		}  
		
		@DeleteMapping("/student/{id}")  
		private void deleteStudent(@PathVariable("id") int id)   
		{  
		studentService.delete(id);  
		}  
		  
		@PostMapping("/student")  
		private int saveBook(@RequestBody Student student)   
		{  
		studentService.saveOrUpdate(student);  
		return student.getId();  
		}  
		   
		@PutMapping("/student")  
		private Student update(@RequestBody Student student)   
		{  
		studentService.saveOrUpdate(student);  
		return student;  
		}  

}
