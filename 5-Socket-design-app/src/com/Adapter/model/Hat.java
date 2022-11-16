package com.Adapter.model;

public class Hat {
private String shortName;
private String longName;
private double BasicPrice;
private double gst;
public Hat(String shortName, String longName, double basicPrice, double gst) {
	super();
	this.shortName = shortName;
	this.longName = longName;
	BasicPrice = basicPrice;
	this.gst = gst;
}
public String getShortName() {
	return shortName;
}
public void setShortName(String shortName) {
	this.shortName = shortName;
}
public String getLongName() {
	return longName;
}
public void setLongName(String longName) {
	this.longName = longName;
}
public double getBasicPrice() {
	return BasicPrice;
}
public void setBasicSalary(double basicPrice) {
	BasicPrice = basicPrice;
}
public double getgst() {
	return gst;
}
public void setgst(double gst) {
	this.gst = gst;
}

}
