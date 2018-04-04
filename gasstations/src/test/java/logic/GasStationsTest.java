package logic;

import com.github.xenteros.gasstations.logic.GasStationsImpl;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class GasStationsTest {

    @Test
    public void testWrongData() {
        int tripLength = 100;
        int capacity = 10;
        int fuelUsage = 5;
        int[][] stations = new int[][]{{0, 200}, {100, 300}};

        GasStationsImpl gasStations = new GasStationsImpl();
        try {
            BigDecimal[] result = gasStations.solve(stations, capacity, fuelUsage, tripLength);
            Assert.fail("Stations are to far from each other");
        } catch (IllegalArgumentException e) {
        }

    }

    @Test
    public void testLuckingFirstStation() {
        int tripLength = 100;
        int capacity = 10;
        int fuelUsage = 5;
        int[][] stations = new int[][]{{1, 200}, {10, 300}};
        GasStationsImpl gasStations = new GasStationsImpl();
        try {
            BigDecimal[] result = gasStations.solve(stations, capacity, fuelUsage, tripLength);
            Assert.fail("First station must be at 0th kilometer");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void shouldTankOnEachStation() {
        int tripLength = 100;
        int capacity = 10;
        int fuelUsage = 5;
        int[][] stations = new int[][]{{0, 200}, {50, 300}};
        GasStationsImpl gasStations = new GasStationsImpl();
        BigDecimal[] result = gasStations.solve(stations, capacity, fuelUsage, tripLength);
        Condition<BigDecimal> ten = new Condition<BigDecimal>() {
            @Override
            public boolean matches(BigDecimal value) {
                return value.compareTo(BigDecimal.TEN) == 0;
            }
        };
        assertThat(result).have(ten);
    }

    @Test
    public void shouldNotTankOnSecondStation() {
        int tripLength = 100;
        int capacity = 10;
        int fuelUsage = 5;
        int[][] stations = new int[][]{{0, 200}, {10, 400}, {50, 300}};
        GasStationsImpl gasStations = new GasStationsImpl();
        BigDecimal[] result = gasStations.solve(stations, capacity, fuelUsage, tripLength);
        assertThat(result[1]).isEqualByComparingTo(BigDecimal.ZERO);
        assertThat(result[0]).isEqualByComparingTo(BigDecimal.TEN);
        assertThat(result[2]).isEqualByComparingTo(BigDecimal.TEN);
    }
}
