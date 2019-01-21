package prajwal.rentTrack.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Reading 
{
String vin;

double latitude;
double longitude;
String time;
double fuel;
double speed;
double engineHp;
boolean checkEngineLightOn;
boolean engineCoolantLow;
boolean cruiseControlOn;
int engineRpm;

@Embedded
Tire tires;



public String getVin() {
	return vin;
}

public void setVin(String vin) {
	this.vin = vin;
}

public double getLatitude() {
	return latitude;
}

public void setLatitude(double latitude) {
	this.latitude = latitude;
}

public double getLongitude() {
	return longitude;
}

public void setLongitude(double longitude) {
	this.longitude = longitude;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public double getFuel() {
	return fuel;
}

public void setFuel(double fuel) {
	this.fuel = fuel;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public double getEngineHp() {
	return engineHp;
}

public void setEngineHp(double engineHp) {
	this.engineHp = engineHp;
}

public boolean isCheckEngineLightOn() {
	return checkEngineLightOn;
}

public void setCheckEngineLightOn(boolean checkEngineLightOn) {
	this.checkEngineLightOn = checkEngineLightOn;
}

public boolean isEngineCoolantLow() {
	return engineCoolantLow;
}

public void setEngineCoolantLow(boolean engineCoolantLow) {
	this.engineCoolantLow = engineCoolantLow;
}

public boolean isCruiseControlOn() {
	return cruiseControlOn;
}

public void setCruiseControlOn(boolean cruiseControlOn) {
	this.cruiseControlOn = cruiseControlOn;
}

public int getEngineRpm() {
	return engineRpm;
}

public void setEngineRpm(int engineRpm) {
	this.engineRpm = engineRpm;
}

public Tire getTires() {
	return tires;
}

public void setTires(Tire tires) {
	this.tires = tires;
}
}
