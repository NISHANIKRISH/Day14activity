package com;

import java.util.stream.Stream;

 class customer {
private String customerName;
private String location;
private String plantype;
private int planrange;
private float amount;
public customer(String customerName, String location, String plantype, int planrange, float amount) {
	super();
	this.customerName = customerName;
	this.location = location;
	this.plantype = plantype;
	this.planrange = planrange;
	this.amount = amount;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getPlantype() {
	return plantype;
}
public void setPlantype(String plantype) {
	this.plantype = plantype;
}
public int getPlanrange() {
	return planrange;
}
public void setPlanrange(int planrange) {
	this.planrange = planrange;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
@Override
public String toString() {
    return "Customer{" +
            "customerName='" + customerName + '\'' +
            ", location='" + location + '\'' +
            ", planType='" + plantype + '\'' +
            ", planRange=" + planrange +
            ", amount=" + amount +
            '}';
}


	
}

