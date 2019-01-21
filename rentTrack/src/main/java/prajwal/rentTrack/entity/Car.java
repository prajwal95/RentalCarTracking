package prajwal.rentTrack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car 
{

@Id
String vid;

String make;
String model;
int year;
int redlineRpm;
int maxFuelVolume;
String lastServiceDate;


public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getRedlineRpm() {
	return redlineRpm;
}
public void setRedlineRpm(int redlineRpm) {
	this.redlineRpm = redlineRpm;
}
public int getMaxFuelVolume() {
	return maxFuelVolume;
}
public void setMaxFuelVolume(int maxFuelVolume) {
	this.maxFuelVolume = maxFuelVolume;
}
public String getLastServiceDate() {
	return lastServiceDate;
}
public void setLastServiceDate(String lastServiceDate) {
	this.lastServiceDate = lastServiceDate;
}

}
