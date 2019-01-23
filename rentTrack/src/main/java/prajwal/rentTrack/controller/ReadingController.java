package prajwal.rentTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentTrack.entity.Reading;
import prajwal.rentTrack.service.ReadingService;

@RestController
//@ResponseBody
public class ReadingController
{
	@Autowired
	ReadingService rs;

	@RequestMapping(method=RequestMethod.GET, value="/readings")
	//find all vehicles
	public List<Reading> getAll()
	{
		return rs.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/readings/{vid}")
	// find vehicle by id
	public Reading getByVid(@PathVariable("vid") String id)
	{
		return rs.getByVid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/readings")
	// add vehicle in db
	public Reading addReading(@RequestBody Reading c)
	{
		return rs.addReading(c);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/readings/{vid}")
	// update vehicle in db
	public Reading updateReading(@PathVariable("vid") String id, @RequestBody Reading c)
	{
		return rs.updateReading(id, c);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/readings/{vid}")
	// remove vehicle data
	public void deleteReading(@PathVariable("vid") String id)
	{
		rs.deleteReading(id);
	}
}
