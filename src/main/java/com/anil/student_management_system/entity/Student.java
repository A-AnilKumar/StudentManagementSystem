package com.anil.student_management_system.entity;


import jakarta.persistence.*;
import lombok.*;

//import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;


	@Column(name = "email")
	private String email;

}
