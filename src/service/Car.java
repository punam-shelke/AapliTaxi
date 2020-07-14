package service;

public class Car {
protected int baseDistance;
protected int basePrice;
protected int priceAboveBase;
protected int milestoneDistance;
protected int priceAboveMilestone;
public int getBaseDistance() {
	return baseDistance;
}
public void setBaseDistance(int baseDistance) {
	this.baseDistance = baseDistance;
}
public int getBasePrice() {
	return basePrice;
}
public void setBasePrice(int basePrice) {
	this.basePrice = basePrice;
}
public int getPriceAboveBase() {
	return priceAboveBase;
}
public void setPriceAboveBase(int priceAboveBase) {
	this.priceAboveBase = priceAboveBase;
}
public int getMilestoneDistance() {
	return milestoneDistance;
}
public void setMilestoneDistance(int milestoneDistance) {
	this.milestoneDistance = milestoneDistance;
}
public int getPriceAboveMilestone() {
	return priceAboveMilestone;
}
public void setPriceAboveMilestone(int priceAboveMilestone) {
	this.priceAboveMilestone = priceAboveMilestone;
}

public int calculateFare(int distance) {
	if(distance <= baseDistance) {
		return this.getBasePrice();
	}
	else if(distance > baseDistance && distance <= milestoneDistance) {
		return  basePrice + (distance - baseDistance) * priceAboveBase;
	}
	return distance * priceAboveMilestone;
}
public Car(int baseDistance, int basePrice, int priceAboveBase, int milestoneDistance, int priceAboveMilestone) {
	super();
	this.baseDistance = baseDistance;
	this.basePrice = basePrice;
	this.priceAboveBase = priceAboveBase;
	this.milestoneDistance = milestoneDistance;
	this.priceAboveMilestone = priceAboveMilestone;
}


}
