package com.logisticServices.logisticServices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Logistic Load Data")
public class Logistic {

	@Id
	@Column(name = "Load Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loadId;
	
	@Column(name = "Loading Point")
	private String loadingPoint;
	
	@Column(name = "Unloading Point")
	private String unloadingPoint;
	
	@Column(name = "Product Type")
	private String productType;
	
	@Column(name = "Truck Type")
	private String truckType;
	
	public Logistic(long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noOfTrucks, String weight, String comment, String shipperId, String date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}


	@Column(name = "No of Trucks")
	private String noOfTrucks;
	
	@Column(name = "Weight")
	private String weight;
	
	@Column(name = "Comment")
	private String comment;
	
	@Column(name = "Shipper Id")
	private String shipperId;
	
	@Column(name = "Date")
	private String date;
	
	
	// Getters and Setters
	public long getLoadId() {
		return loadId;
	}
	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	
	public Logistic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
