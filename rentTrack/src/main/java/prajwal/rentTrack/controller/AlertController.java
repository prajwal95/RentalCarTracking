package prajwal.rentTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentTrack.entity.Alert;
import prajwal.rentTrack.service.AlertService;

@RestController
public class AlertController 
{
	@Autowired
	AlertService as;
	
	@RequestMapping(method=RequestMethod.GET, value="/alerts")
	public List<Alert> getAllAlerts()
	{
		return as.getAllAlerts();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/alerts/{vid}")
	public List<Alert> getAlertOfVehicle(@PathVariable("vid") String vid)
	{
		return as.getAlertByVehicle(vid);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/alerts/{aid}")
	public Alert getAlertById(@PathVariable("aid") String aid)
	{
		return as.getAlertById(aid);
	}
}
