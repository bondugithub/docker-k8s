package com.hsbg.dockercompose.api.model;


import com.hsbg.dockercompose.core.enums.Status;


public class BookShelfResource {
    private long id;
    private String name;
    private String category;
    private long capability;
    private Status status;
    private String createdBy;
    private String updatedBy;
	public BookShelfResource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getCapability() {
		return capability;
	}
	public void setCapability(long capability) {
		this.capability = capability;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

    
}
