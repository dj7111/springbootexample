package hello;

import com.pi4j.io.gpio.*;

public class PinController {


    private final GpioController gpio;
    private final GpioPinDigitalOutput gpioPinDigitalOutput;

    public PinController(Pin pin) {

        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        // create gpio controller
        gpio = GpioFactory.getInstance();
        gpioPinDigitalOutput = gpio.provisionDigitalOutputPin(pin, "MyLED", PinState.HIGH);

        // set shutdown state for this gpioPinDigitalOutput
        gpioPinDigitalOutput.setShutdownOptions(true, PinState.LOW);
        gpioPinDigitalOutput.low();
    }

    public void toggle(){
        gpioPinDigitalOutput.toggle();
    }
    
}
