package  com.worldline.interview;


import org.junit.Assert;
import org.junit.Test;

public class InternalCombustionEngineTest {
    private static final double delta = 0.001;


    @Test
    public void testBatchproduce() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        double expectedCost = 9;  // 1 batches * £9.00 per batch
        double actualCost = widgetMachine.produce(8);
        
        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test(expected = IllegalStateException.class)
    public void testBatchWihtoutFuel() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.PETROL , 0);

        double expectedCost = 9;  // 1 batches * £9.00 per batch
        double actualCost = widgetMachine.produceWidgets(8);

        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testBatchProduceWidgets() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.PETROL , 1);

        double expectedCost = 9;  // 1 batches * £9.00 per batch
        double actualCost = widgetMachine.produceWidgets(8);

        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testCostPerBatchTwoBatch() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.PETROL , 1);

        int expectedCost = 18;  // 2 batches * £9.00 per batch
        double actualCost = widgetMachine.produceWidgets(16);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testCalculateProductionCostThreeBatch() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.PETROL , 1);

        int expectedCost = 27;  // 3 batches * £9.00 per batch
        double actualCost = widgetMachine.produceWidgets(24);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }

    @Test
    public void testCalculateProductionCostFourBatch() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine = new  WidgetMachine(engine);
        engine.fill(FuelType.PETROL , 1);

        int expectedCost = 36;  // 4 batches * £9.00 per batch
        double actualCost = widgetMachine.produce(32);
        Assert.assertEquals(expectedCost, actualCost , delta);
    }


}
