import java.util.Observable;

/**
 * Created by urban on 2014-12-24.
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public void setMeassures(float i, float i1, float v) {
        this.temp = i;
        this.humidity = i1;
        this.pressure = v;

        setChanged();
        notifyObservers();
    }

    public float temp() {
        return temp;
    }

    public float humidity() {
        return humidity;
    }

    public float pressure() {
        return pressure;
    }
}
