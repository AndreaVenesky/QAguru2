import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PercentOfNum {

    private Integer percentage(Integer num, Integer percentage) {
        return num * percentage / 100;
    }

    private Double fuelConsumption(Double a, Double b) {
        return a * 100 / b;
    }

    @Test
    public void showPercentage() {
        Integer percentageResult;

        percentageResult = percentage(50, 20);
        Assertions.assertEquals(10, percentageResult, "Percentage value is incorrect");

    }
}


