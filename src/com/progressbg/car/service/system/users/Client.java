package com.progressbg.car.service.system.users;

import com.progressbg.car.service.system.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Client extends User
{
    private String firstName;
    private String familyName;
    private List<Vehicle> vehicles;

    public Client(String firstName, String familyName, String userName, String password)
    {
        super(userName, password, AccessLvl.CLIENT);
        this.firstName = firstName;
        this.familyName = familyName;
        this.vehicles = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.vehicles.add(vehicle);
    }
}
