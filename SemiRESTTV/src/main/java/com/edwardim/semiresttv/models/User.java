package com.edwardim.semiresttv.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Email must not be empty")
    private String email;
    
    @NotEmpty(message = "Password must not be empty")
    private String password;
    
    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<Show> shows_created;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Comment> comments;
    
    
    
    
    @Transient
    private String passwordConfirmation;
    @Transient
    private String duplicate;
    
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    public User() {
    }
    
    
    
    
    // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}




	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}




	public Date getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}




	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	public String getDuplicate() {
		return duplicate;
	}




	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}




	public List<Show> getShows_created() {
		return shows_created;
	}




	public void setShows_created(List<Show> shows_created) {
		this.shows_created = shows_created;
	}




	public List<Comment> getComments() {
		return comments;
	}




	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}