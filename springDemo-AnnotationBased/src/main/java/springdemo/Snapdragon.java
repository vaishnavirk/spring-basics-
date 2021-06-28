package springdemo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// if we use primary then  samsung class by default takes mediatek
@Primary
@Component
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("inside snapdragon process");
	}

}
