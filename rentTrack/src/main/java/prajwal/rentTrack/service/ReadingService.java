package prajwal.rentTrack.service;

import java.util.List;

import prajwal.rentTrack.entity.Reading;

public interface ReadingService 
{
    public List<Reading> getAll();
	
	public Reading getByVid(String vid);
	
	public Reading addReading(Reading c);
	
	public Reading updateReading(String id, Reading c);
	
	public void deleteReading(String id);
}
