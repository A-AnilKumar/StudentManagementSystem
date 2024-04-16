package com.anil.student_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anil.student_management_system.entity.Student;
import com.anil.student_management_system.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
 
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
