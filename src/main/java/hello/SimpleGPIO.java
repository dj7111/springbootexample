package hello;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;

public class SimpleGPIO {

    private final GpioController gpioController;

    public SimpleGPIO(){
        gpioController = GpioFactory.getInstance();

    }
    
}
