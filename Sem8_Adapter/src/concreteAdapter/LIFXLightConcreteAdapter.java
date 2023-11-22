package concreteAdapter;

import abstractInterface.SmartLight;
import classes.LIFXLight;

public class LIFXLightConcreteAdapter implements SmartLight {
    private LIFXLight lifxLight;
    public LIFXLightConcreteAdapter(LIFXLight lifxLight) {
        this.lifxLight = lifxLight;
    }

    @Override
    public String turnOn() {
        String turnOn = lifxLight.powerOn();
        return turnOn;
    }

    @Override
    public String turnOff() {
        String turnOff = lifxLight.powerOff();
        return turnOff;
    }
}
