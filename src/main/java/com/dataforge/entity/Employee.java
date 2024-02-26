package com.dataforge.entity;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{

	      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	      @GeneratedValue(strategy=GenerationType.AUTO)
	      private Integer id;
	      private String username;
	      private String email;
	      private String pwd;
	      @CreationTimestamp
	      private LocalDate createddate;
	      @CreationTimestamp
	      private LocalDate updatedDate;
	      
	      public Employee() {
	    	  
	      }

		public Employee(Integer id, String username, String email, String pwd, LocalDate createddate,
				LocalDate updatedDate) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
			this.pwd = pwd;
			this.createddate = createddate;
			this.updatedDate = updatedDate;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public LocalDate getCreateddate() {
			return createddate;
		}

		public void setCreateddate(LocalDate createddate) {
			this.createddate = createddate;
		}

		public LocalDate getUpdatedDate() {
			return updatedDate;
		}

		public void setUpdatedDate(LocalDate updatedDate) {
			this.updatedDate = updatedDate;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", username=" + username + ", email=" + email + ", pwd=" + pwd
					+ ", createddate=" + createddate + ", updatedDate=" + updatedDate + "]";
		}

	     
}
