interface WeatherService {
    void getWeatherReport();
}

class APIWeatherService implements WeatherService {
    public void getWeatherReport() {
        System.out.println("Fetching weather report from API...");
    }
}

class SatelliteWeatherService implements WeatherService {
    public void getWeatherReport() {
        System.out.println("Fetching weather report from satellite...");
    }
}

public class WeatherForecastSystem {
    public static void main(String[] args) {
        WeatherService apiService = new APIWeatherService();
        WeatherService satelliteService = new SatelliteWeatherService();

        apiService.getWeatherReport();
        satelliteService.getWeatherReport();
    }
}
