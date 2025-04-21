package com.worldline.interview;

import org.junit.Assert;
import org.junit.Test;

public class SteamEngineTest {


    private static final double delta = 0.001;


    @Test
    public void testBatchproduce() {
        SteamEngine engine = new SteamEngine(FuelType.WOOD);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        double expectedCost = 4.35;  // 1 batches * £4.35 per batch
        double actualCost = widgetMachine.produce(8);

        Assert.assertEquals(expectedCost, actualCost , delta);
    }



    @Test
    public void testCostPerBatchWithoutFuel() {
        SteamEngine engine = new SteamEngine(FuelType.WOOD);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.WOOD , 0);

        double expectedCost = 8.7;  // 2 batches * £4.35 per batch
        double actualCost = widgetMachine.produce(16);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testCalculateProductionCostThreeBatch() {
        SteamEngine engine = new SteamEngine(FuelType.WOOD);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        double expectedCost = 13.05;  // 3 batches * £4.35 per batch
        double actualCost = widgetMachine.produce(24);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testCalculateProductionCostFourBatch() {
        SteamEngine engine = new SteamEngine(FuelType.WOOD);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        double expectedCost = 17.4;  // 4 batches * £4.35 per batch
        double actualCost = widgetMachine.produce(32);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }


}
