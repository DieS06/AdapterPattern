import abstractInterface.SmartLight;
import classes.LIFXLight;
import classes.PhilipsHueLight;
import concreteAdapter.LIFXLightConcreteAdapter;

public class Main {
    // No utilice dos interfaces como el ejemplo de clase, utilice solo una,
    // la SmartLight ya que tiene los métodos a lo que ocupamos adaptar,
    // me parecio que era más eficiente y menos código.
    public static void main(String[] args) {
        // Instancias de Philips Hue y LIFX
        PhilipsHueLight phLight = new PhilipsHueLight();
        LIFXLight lifxLight = new LIFXLight();

        // Crea el Adapter para LIFXLight
        SmartLight lifxLightAdapter = new LIFXLightConcreteAdapter(lifxLight);

        // Encender y apagar las luces
        System.out.println(phLight.turnOn());
        System.out.println(phLight.turnOff());

        System.out.println(lifxLightAdapter.turnOn());
        System.out.println(lifxLightAdapter.turnOff());
    }
}