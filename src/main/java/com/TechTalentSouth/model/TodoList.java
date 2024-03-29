package com.TechTalentSouth.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	public class TodoList {

		
		@Id  //id as primary key
		@GeneratedValue(strategy=GenerationType.AUTO) //allows id to be generated by underlying database
		private Long id; 
		
		private String author;
		
		@Size(max=255)
	    private String title;
		
		
		private int difficulty;
		
		@Lob
		@Type(type="text")
		private String todo;
		
		@CreationTimestamp 
		private Date createdAt;
		
		@DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")		
		private Date dateDue;
		
		@Enumerated(value = EnumType.STRING)
		private Status status;
		
		
		
		
	}

