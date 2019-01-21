package prajwal.rentTrack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import prajwal.rentTrack.entity.Car;

@Service
public class CarServiceImpl implements CarService
{

	public List<Car> getAll() {
		// TODO Auto-generated method stub
		System.out.println("All Vehicles data provided !!");
		return null;
	}

	public Car getByVid(String vid) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle's data by id provided !!");
		return null;
	}

	public Car addCar(Car c) {
		// TODO Auto-generated method stub
		System.out.println("All Vehicles data added !!");
		return null;
	}

	public Car updateCar(String id, Car c) {
		// TODO Auto-generated method stub
		System.out.println(" Vehicles data updated !!");
		return null;
	}

	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle's data deleted !!");
		
	}

}
