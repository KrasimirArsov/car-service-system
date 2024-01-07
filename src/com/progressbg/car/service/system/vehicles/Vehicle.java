package com.progressbg.car.service.system.vehicles;

import com.progressbg.car.service.system.vehicles.procedures.ServiceProcedure;
import com.progressbg.car.service.system.vehicles.regnumber.RegNumber;

import java.util.ArrayList;
import java.util.List;

public class Vehicle
{
    private RegNumber regNumber;
    private String brand;
    private FuelType fuelType;
    private VehicleType vehicleType;
    private String model;
    private List<ServiceProcedure> procedures;

    public Vehicle(RegNumber regNumber, String brand, FuelType fuelType, VehicleType vehicleType, String model) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.fuelType = fuelType;
        this.vehicleType = vehicleType;
        this.model = model;
        this.procedures = new ArrayList<>();
    }
}
