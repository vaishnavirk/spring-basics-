package springdemo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

// by default name of bean will be samsung, we can change using - 
//@Component("mySam")
// default id will be non-capitalised class name
@Component
public class Samsung {
	// autowired by default is ByType
	// to specify which bean we need - we use @Qualifier("name")
	// else it will take which class is annotated with @Primary
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("octal core, 4GB RAM");
		cpu.process();
	}
}
