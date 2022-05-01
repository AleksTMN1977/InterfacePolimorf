package ru.skypro;

public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
        public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        }
    }
}

