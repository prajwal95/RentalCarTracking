package prajwal.rentTrack.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import prajwal.rentTrack.entity.Car;

@Repository
public class CarRepoImpl implements CarRepo
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		System.out.println("In repository !!");
		
		TypedQuery<Car> query = em.createQuery("select c from Car c",Car.class);
		
		List<Car> result = query.getResultList();
		
		System.out.println("Car Details:");
		for(Car cObj : result)
		{
			System.out.println("Car Detail:");
			System.out.println(cObj);
		}
		
		return result;
		//return null;
	}

	@Override
	public Car getByVid(String vid) {
		// TODO Auto-generated method stub
		
		Car c = em.find(Car.class, vid);
		
		System.out.println("Found Vehicle by id");
		
		System.out.println(c);
		
		return c;
		//return null;
	}

	@Override
	@Transactional
	public Car addCar(Car c) {
		// TODO Auto-generated method stub
		
		System.out.println("POST in Repo");
		Car newCar = new Car();
		
		newCar.setVid(c.getVid());
		newCar.setMake(c.getMake());
		newCar.setModel(c.getModel());
		newCar.setMaxFuelVolume(c.getMaxFuelVolume());
		newCar.setLastServiceDate(c.getLastServiceDate());
		newCar.setRedlineRpm(c.getRedlineRpm());
		newCar.setYear(c.getYear());
		
		//em.getTransaction().begin();
		em.persist(newCar);
		//em.getTransaction().commit();
		
		return newCar;
		//return null;
	}

	@Override
	@Transactional
	public Car updateCar(String id, Car c) {
		// TODO Auto-generated method stub
		
		System.out.println("PUT in Repo");
		
        Car updCar = em.find(Car.class, id);
		
		updCar.setVid(c.getVid());
		updCar.setMake(c.getMake());
		updCar.setModel(c.getModel());
		updCar.setMaxFuelVolume(c.getMaxFuelVolume());
		updCar.setLastServiceDate(c.getLastServiceDate());
		updCar.setRedlineRpm(c.getRedlineRpm());
		updCar.setYear(c.getYear());
		
		//em.getTransaction().begin();
		em.merge(updCar);
		//em.getTransaction().commit();
		
		return updCar;
		//return null;
	}

	@Override
	@Transactional
	public void deleteCar(String id) {
		// TODO Auto-generated method stub
	Car delCar = em.find(Car.class, id);
		
		//em.getTransaction().begin();
		em.remove(delCar);
		//em.getTransaction().commit();
	}
	
	/*@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Car> getAll() 
	{
		// TODO Auto-generated method stub
		
		TypedQuery<Car> query = em.createQuery("select e from Car c",Car.class);
		
		List<Car> result = query.getResultList();
		
		for(Car cObj : result)
		{
			System.out.println(cObj);
		}
		
		return result;
	}

	@Override
	public Car getByVid(String vid) {                // find by vehicle id
		// TODO Auto-generated method stub
		
		Car c = em.find(Car.class, vid);
		
		System.out.println(c);
		
		return c;
	}

	@Override
	public Car addCar(Car c) {
		// TODO Auto-generated method stub
		
		Car newCar = new Car();
		
		newCar.setVid(c.getVid());
		newCar.setMake(c.getMake());
		newCar.setModel(c.getModel());
		newCar.setMaxFuelVolume(c.getMaxFuelVolume());
		newCar.setLastServiceDate(c.getLastServiceDate());
		newCar.setRedlineRpm(c.getRedlineRpm());
		newCar.setYear(c.getYear());
		
		em.getTransaction().begin();
		em.persist(newCar);
		em.getTransaction().commit();
		
		return newCar;
	}

	@Override
	public Car updateCar(String id, Car c) 
	{
		// TODO Auto-generated method stub
		Car updCar = em.find(Car.class, id);
		
		updCar.setVid(c.getVid());
		updCar.setMake(c.getMake());
		updCar.setModel(c.getModel());
		updCar.setMaxFuelVolume(c.getMaxFuelVolume());
		updCar.setLastServiceDate(c.getLastServiceDate());
		updCar.setRedlineRpm(c.getRedlineRpm());
		updCar.setYear(c.getYear());
		
		em.getTransaction().begin();
		em.merge(updCar);
		em.getTransaction().commit();
		
		return updCar;
	}

	@Override
	public void deleteCar(String id) 
	{
		// TODO Auto-generated method stub
		Car delCar = em.find(Car.class, id);
		
		em.getTransaction().begin();
		em.persist(delCar);
		em.getTransaction().commit();
		
	}*/
	
	

}
