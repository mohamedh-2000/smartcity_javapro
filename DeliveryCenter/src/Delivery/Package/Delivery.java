package Delivery.Package;

public class Delivery {

	private double x;
	private double y;
	private int deliveryId;
	public Delivery(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public int getDeliveryId () {
	return deliveryId;
	}
	public void setDeliveryId (int deliveryId) {
	this. deliveryId = deliveryId;
	}
	public double getX() {
	return x;
	}
	public void setX(double x) {
	this.x = x;
	}
	public double getY() {
	return y;
	}
	public void setY(double y) {
	this.y = y;
	}
	public void delivery (double x, double y, int deliveryId) {
	this.x = x;
	this.y = y;
	this. deliveryId = deliveryId;
	}
	public String toString() {
	return String.format("Delivery: [x= %4.2f y= %4.2f Id = %d]",
	x, y, deliveryId);
	}
	public double getDistanceFrom(double x, double y) {
	return Math.sqrt(Math.pow((this.x-x), 2) + Math.pow((this.y-y),
	2));
	}
	}


