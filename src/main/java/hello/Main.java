package hello;

import com.pi4j.io.gpio.RaspiPin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {

    public static PinController[] pinControllers;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebController.class, args);
        pinControllers = new PinController[4];
        pinControllers[0] = new PinController(RaspiPin.GPIO_01);
        pinControllers[1] = new PinController(RaspiPin.GPIO_02);
        pinControllers[2] = new PinController(RaspiPin.GPIO_03);
        pinControllers[3] = new PinController(RaspiPin.GPIO_04);

    }
}
