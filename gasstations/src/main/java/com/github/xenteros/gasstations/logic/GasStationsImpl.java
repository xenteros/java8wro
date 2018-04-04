package com.github.xenteros.gasstations.logic;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.math.BigDecimal.valueOf;

public class GasStationsImpl implements GasStations {

    public BigDecimal[] solve(int[][] stations, int capacity, int fuelUsage, int tripLength) {
        validate(stations, capacity, fuelUsage, tripLength);

        int[] cheapestInRange = new int[tripLength];
        Arrays.fill(cheapestInRange, -1);
        for (int i = 0; i < stations.length; i++) {
            int[] station = stations[i];
            int stationPosition = station[0];
            int stationPrice = station[1];
            for (int j = 0; j < Math.min(fuelUsage * capacity, tripLength - stationPosition); j++) {
                if (cheapestInRange[stationPosition + j] == -1 || stations[cheapestInRange[stationPosition + j]][1] > stationPrice) {
                    cheapestInRange[stationPosition + j] = i;
                }
            }
        }
        BigDecimal[] result = new BigDecimal[stations.length];
        Arrays.fill(result, BigDecimal.ZERO);
        BigDecimal fuelForOneKm = BigDecimal.ONE.divide(valueOf(fuelUsage));

        for (int i = 0; i < cheapestInRange.length; i++) {
            result[cheapestInRange[i]] = result[cheapestInRange[i]].add(fuelForOneKm);
        }
        return result;
    }

    private void validate(int[][] stations, int capacity, int fuelUsage, int tripLength) {
        if (tripLength < 0) {
            throw new IllegalArgumentException("Trip length must be positive");
        }
        if (fuelUsage < 0) {
            throw new IllegalArgumentException("Fuel usage must be positive");
        }

        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        if (stations == null) {
            throw new IllegalArgumentException("Stations must not be null");
        }
        if (stations[0][0] != 0) {
            throw new IllegalArgumentException("First station must be at 0th kilometer");
        }
        int range = fuelUsage * capacity;
        for (int i = 0; i < stations.length-1; i++) {
            if (stations[i][0] + range < stations[i+1][0]) {
                throw new IllegalArgumentException("Stations are to far from each other");
            }
        }

    }
}
