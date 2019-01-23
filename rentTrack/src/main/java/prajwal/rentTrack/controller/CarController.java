package prajwal.rentTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentTrack.entity.Car;
import prajwal.rentTrack.service.CarService;

@RestController
@ResponseBody
public class CarController 
{
	@Autowired
	CarService cs;

	@RequestMapping(method=RequestMethod.GET, value="/cars", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	//find all vehicles
	public List<Car> getAll()
	{
		System.out.println("In Controller");
		
		return cs.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/cars/{vid}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	// find vehicle by id
	public Car getByVid(@PathVariable("vid") String id)
	{
		return cs.getByVid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cars",
			consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	// add vehicle in db
	public Car addCar(@RequestBody Car c)
	{
		return cs.addCar(c);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/cars/{vid}", 
			consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
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
