package springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Car(){
		System.out.println("inside car class");
	}

	public void drive() {
System.out.println("DRIVING CAR"+tyre);		
	}
}
