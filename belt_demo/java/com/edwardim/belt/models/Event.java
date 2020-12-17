package com.edwardim.belt.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @Size(min=2, max=20, message="Event name must be 2-20")
    private String name;
    
	@NotNull(message = "You must have event date")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date event_date;
    
	@Size(min = 2, max=50, message="City must be 2-50")
	private String city;
	@NotNull
	private String state;
    
	public Event() {}
	
//  RELATIONSHIPS
    @ManyToOne(fetch=FetchType.LAZY) // CREATING MANY TO ONE
    @JoinColumn(name="user_id") // FOREIGN KEY
    private User host;
    
    
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getHost() {
		return host;
	}
	public void setHost(User host) {
		this.host = host;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
