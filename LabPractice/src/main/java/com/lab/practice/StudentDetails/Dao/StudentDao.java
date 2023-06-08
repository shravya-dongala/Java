package com.lab.practice.StudentDetails.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lab.practice.StudentDetails.Bean.StudentDetails;
@Repository
public interface StudentDao extends JpaRepository<StudentDetails,Integer>
{

	
	
}
