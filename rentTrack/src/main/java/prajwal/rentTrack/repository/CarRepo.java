package prajwal.rentTrack.repository;

import java.util.List;

import prajwal.rentTrack.entity.Car;

public interface CarRepo 
{
    public List<Car> getAll();
	
	public Car getByVid(String vid);
	
	public Car addCar(Car c);
	
	public Car updateCar(String id, Car c);
	
	public void deleteCar(String id);
}
