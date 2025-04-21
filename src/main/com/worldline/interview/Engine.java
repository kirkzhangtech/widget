package com.worldline.interview;

public abstract  class Engine {

    protected boolean running;
    protected  int fuelLevel;
    public FuelType fuelType;

    public Engine(boolean runningStatus, int fuelLevel) {
       this.running = runningStatus ;
       this.fuelLevel = fuelLevel ;
    }

    public abstract void fill(FuelType fuelType, int fuelLevel);
    public abstract  boolean  isRunning();
    public abstract  void start();
    public abstract  void stop();
    public abstract  FuelType getFuelType();
}
