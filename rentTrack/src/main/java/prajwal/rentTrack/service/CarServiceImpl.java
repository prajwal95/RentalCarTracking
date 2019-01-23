package prajwal.rentTrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prajwal.rentTrack.entity.Car;
import prajwal.rentTrack.repository.CarRepo;

@Service
public class CarServiceImpl implements CarService
{
	@Autowired
	private CarRepo cr;

	public List<Car> getAll() {
		// TODO Auto-generated method stub
		System.out.println("All Vehicles data provided !!");
		
		cr.getAll();
		return null;
	}

	public Car getByVid(String vid) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle's data by id provided !!");
		cr.getByVid(vid);
		return null;
	}

	public Car addCar(Car c) {
		// TODO Auto-generated method stub
		System.out.println("All Vehicles data added !!");
		
		cr.addCar(c);
		return null;
	}

	public Car updateCar(String id, Car c) {
		// TODO Auto-generated method stub
		System.out.println(" Vehicles data updated !!");
		
		cr.updateCar(id, c);
		return null;
	}

	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle's data deleted !!");
		
        cr.deleteCar(id);
		
	}

}
