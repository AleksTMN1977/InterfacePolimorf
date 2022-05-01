package ru.skypro;

public interface ServiceStation {

    void check();

    void check(Truck truck);

    void check(Bicycle bicycle);

    void check(Car car);

    void updateTyre();

    void checkEngine();

    void checkTrailer();

}

