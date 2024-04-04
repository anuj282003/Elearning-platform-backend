package com.example.demo.utilities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Attendance {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "student_id")
	    private User  user;

	    @Temporal(TemporalType.DATE)
	    private Date date;

	    private String status;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Attendance(int id, User user, Date date, String status) {
			super();
			this.id = id;
			this.user = user;
			this.date = date;
			this.status = status;
		}

		public Attendance() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Attendance [id=" + id + ", user=" + user + ", date=" + date + ", status=" + status + "]";
		}
	    
	
}
