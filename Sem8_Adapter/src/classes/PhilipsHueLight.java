package classes;

import abstractInterface.SmartLight;

public class PhilipsHueLight implements SmartLight {
    @Override
    public String turnOn() {
        return "Philips Hue Light esta encendido.";
    }

    @Override
    public String turnOff() {
        return "Philips Hue Light esta apagado.";
    }
}
