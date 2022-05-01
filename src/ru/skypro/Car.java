package ru.skypro;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();

        }
    }
}

