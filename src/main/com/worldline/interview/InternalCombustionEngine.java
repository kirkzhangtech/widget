package com.worldline.interview;

public class InternalCombustionEngine extends  Engine {


    private FuelType requiredFuelType;

    public InternalCombustionEngine(FuelType requiredFuelType ) {
        super(false, 0);
        this.requiredFuelType = requiredFuelType;
   

    }

    @Override
    public void start() {
        if(fuelLevel > 0 ){
            running = true;
        }else {

            throw new IllegalStateException("there is no fuel.");

        }
        if ( requiredFuelType == fuelType.DIESEL || requiredFuelType == fuelType.PETROL ) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void fill(FuelType fuelType, int fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        }
        else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        }
        else {
            this.fuelLevel = 0;
        }

        this.fuelType = fuelType;
    }
    @Override
    public FuelType getFuelType() {
        return  requiredFuelType;
    }
}
