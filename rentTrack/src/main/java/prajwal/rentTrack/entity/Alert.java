package prajwal.rentTrack.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alert 
{
@Id
String id;

String vid;
String timeCreated;
String alertReason;
String alertType;

public Alert()
{
	this.id=UUID.randomUUID().toString();
}

public void setId(String id) {
	this.id = id;
}

public String getVid() {
	return vid;
}

public void setVid(String vid) {
	this.vid = vid;
}

public String getTimeCreated() {
	return timeCreated;
}

public void setTimeCreated(String timeCreated) {
	this.timeCreated = timeCreated;
}

public String getAlertReason() {
	return alertReason;
}

public void setAlertReason(String alertReason) {
	this.alertReason = alertReason;
}

public String getAlertType() {
	return alertType;
}

public void setAlertType(String alertType) {
	this.alertType = alertType;
}


}
