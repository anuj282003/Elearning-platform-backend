package com.example.demo.utilities;

import java.util.List;

public class UserDashboardDTO {
    private User user;
    private List<Lectures> lectures;

    public UserDashboardDTO(User user, List<Lectures> lectures) {
        this.user = user;
        this.lectures = lectures;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Lectures> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lectures> lectures) {
		this.lectures = lectures;
	}
    
}