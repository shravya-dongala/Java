package com.lab.practice.StudentDetails.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lab.practice.StudentDetails.*;
import com.lab.practice.StudentDetails.Bean.StudentDetails;
import com.lab.practice.StudentDetails.Dao.StudentDao; 


@Service
public class StudentService 
{
	@Autowired
    StudentDao sdao;
    public void setsdao(StudentDao sdao) 
    {
    	this.sdao=sdao;
    }
    public StudentDetails insertStudent(StudentDetails student)
    {
        return sdao.save(student);
    }
    public Optional<StudentDetails> getStudent(int StudentId)
    {
    	return sdao.findById(StudentId);
    }
    public java.util.List<StudentDetails> getStudent()
    {
    	return sdao.findAll();
    }
    public String deleteStudent(int StudentId)
    {
    	sdao.deleteById(StudentId);
    	return "Student Deleted Successfully";
    }
    public StudentDetails updateStudent(StudentDetails StudentDetails) {
		return sdao.save(StudentDetails);
	}
  
}
