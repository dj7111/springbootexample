package hello;

import com.pi4j.io.gpio.*;

public class SimpleGPIO {


    private final GpioController gpio;
    private final GpioPinDigitalOutput pin;

    public SimpleGPIO() {

        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        // create gpio controller
        gpio = GpioFactory.getInstance();

        // provision gpio pin #01 as an output pin and turn on
        pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

        // set shutdown state for this pin
        pin.setShutdownOptions(true, PinState.LOW);
        pin.low();
    }

    public void toggle(){
        pin.toggle();
    }
    
}
