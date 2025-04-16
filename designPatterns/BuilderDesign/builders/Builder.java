package designPatterns.BuilderDesign.builders;

import designPatterns.BuilderDesign.cars.CarType;
import designPatterns.BuilderDesign.components.Engine;
import designPatterns.BuilderDesign.components.GPSNavigator;
import designPatterns.BuilderDesign.components.Transmission;
import designPatterns.BuilderDesign.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
