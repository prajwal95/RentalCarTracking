package prajwal.rentTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentTrack.entity.Alert;
import prajwal.rentTrack.service.AlertService;

@RestController
public class AlertController 
{
	@Autowired
	AlertService as;
	
	public List<Alert> getAllAlerts()
	{
		return as.getAllAlerts();
	}
	
	public List<Alert> getAlertOfVehicle(String vid)
	{
		return as.getAlertByVehicle(vid);
	}
	
	public Alert getAlertById(String aid)
	{
		return as.getAlertById(aid);
	}
}
