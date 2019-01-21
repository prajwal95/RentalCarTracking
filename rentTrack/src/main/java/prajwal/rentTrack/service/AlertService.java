package prajwal.rentTrack.service;

import java.util.List;

import prajwal.rentTrack.entity.Alert;

public interface AlertService 
{
public List<Alert> getAllAlerts();

public List<Alert> getAlertByVehicle(String aid);

public Alert getAlertById(String aid);
}
