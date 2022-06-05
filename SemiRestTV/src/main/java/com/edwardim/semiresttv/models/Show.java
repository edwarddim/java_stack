package com.edwardim.semiresttv.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "shows")
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    // MEMBER VARIABLES
	@NotNull
	@Size(min = 2)
	private String title;

	@NotNull
	@Size(min = 2)
	private String network;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date release_date;

	@NotNull
	@Size(min = 10)
	private String description;
	
    // RELATIONSHIPS
	//MtoO FUNCTIONALITY FOR CREATOR OF THIS COMMENT
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id") // FOREIGN KEY NAME
	private User creator;
	
    //MtoM FUNCTIONALITY FOR LEAVING COMMENTS
    @OneToMany(mappedBy="show", fetch = FetchType.LAZY)
    private List<Comment> comments;
	
	

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	// CONSTRUCTOR
	// EMPTY CONSTRUCTOR
	public Show() {

	}

	// FULL CONSTRUCTOR
	public Show(String title, String network, Date release_date, String description) {
		super();
		this.title = title;
		this.network = network;
		this.release_date = release_date;
		this.description = description;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	// OTHER METHODS
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
