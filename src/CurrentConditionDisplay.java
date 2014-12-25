import java.util.Observable;
import java.util.Observer;

/**
 * Created by urban on 2014-12-24.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.temp();
            this.humidity = weatherData.humidity();
            this.pressure = weatherData.pressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions [%f,%f,%f]", temp, humidity, pressure));

    }
}
