package com.lab.practice.StudentDetails.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.lab.practice.StudentDetails.Student;
import com.lab.practice.StudentDetails.Bean.StudentDetails;
import com.lab.practice.StudentDetails.Service.*;
import java.util.List;
import java.util.Optional;
import com.lab.practice.StudentDetails.Exception.*;
import javax.validation.Valid;
@RestController
public class StudentController
{
	@Autowired
	StudentService studentService;
	public void setStudentService(StudentService studentService)
	{
		this.studentService=studentService;
	}
	@GetMapping(value="/getStudent/{StudentId}",produces="application/json")
	   public ResponseEntity<Optional<StudentDetails>> getStudent(@PathVariable int StudentId)
	   {
		Optional<StudentDetails> StudentDetails =  studentService.getStudent(StudentId);
	 	  if(StudentDetails.isPresent())
	 		  return new ResponseEntity<Optional<StudentDetails>>(StudentDetails,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<StudentDetails>>(StudentDetails,HttpStatus.NOT_FOUND);
	   }
   @GetMapping("/getStudent")
   public List<StudentDetails> getStudent()
   {
	   return studentService.getStudent();
   }
   @PostMapping(value="/addStudent",consumes="application/json")
   public ResponseEntity<String> insertStudent(@RequestBody()StudentDetails StudentDetails)
   {
	   String message="Student Inserted Successfully";
	   if(studentService.insertStudent(StudentDetails)==null)
		   message="Student Insertion Failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
   }
   @DeleteMapping("/deleteStudent/{studentId}")
   public String deleteStudent(@PathVariable int StudentId)
   {
		return studentService.deleteStudent(StudentId);
   }
   @PutMapping("/UpdateStudent")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDetails student) {
		StudentDetails e = studentService.updateStudent(student);
		if (e == null) {
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("Student updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
  
  

}
