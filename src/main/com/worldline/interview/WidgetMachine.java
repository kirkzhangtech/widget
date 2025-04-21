package com.worldline.interview;

public class WidgetMachine {
    private Engine engine ;

    public WidgetMachine(Engine engine){
        this.engine = engine;
    }


    public double produceWidgets(int quantity) {
    

        engine.start();
        double cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();

        return cost;
    }

    double produce(int quantity) {
        int batch = 0;
        int batchCount = 0;
        double costPerBatch = 0;

        if (engine.getFuelType() == FuelType.PETROL) {
            costPerBatch = 9;
        } else if (engine.getFuelType() == FuelType.DIESEL) {
            costPerBatch = 12;
        } else if ( engine.getFuelType() == FuelType.WOOD) {
            costPerBatch =  4.35;
        } else if ( engine.getFuelType() == FuelType.COAL) {
            costPerBatch =  5.56 ;

        }

        while (batch < quantity) {
            batch = batch + 8;
            batchCount++;
        }

        return batchCount * costPerBatch;
    }


}
