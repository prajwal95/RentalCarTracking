package prajwal.rentTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentTrack.entity.Car;
import prajwal.rentTrack.service.CarService;

@RestController
public class CarController 
{
	@Autowired
	CarService cs;

	@RequestMapping(method=RequestMethod.GET, value="/cars")
	//find all vehicles
	public List<Car> getAll()
	{
		return cs.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/cars/{vid}")
	// find vehicle by id
	public Car getByVid(@PathVariable("vid") String id)
	{
		return cs.getByVid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cars")
	// add vehicle in db
	public Car addCar(@RequestBody Car c)
	{
		return cs.addCar(c);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/cars/{vid}")
	// update vehicle in db
	public Car updateCar(@PathVariable("vid") String id, @RequestBody Car c)
	{
		return cs.updateCar(id, c);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/cars/{vid}")
	// remove vehicle data
	public void deleteCar(@PathVariable("vid") String id)
	{
		cs.deleteCar(id);
	}
	
}
