package com.github.xenteros.gasstations.logic;

import java.math.BigDecimal;

public interface GasStations {

    BigDecimal[] solve(int[][] stations, int capacity, int fuelUsage, int tripLength);
}
