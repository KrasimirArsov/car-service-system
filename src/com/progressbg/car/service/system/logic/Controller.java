package com.progressbg.car.service.system.logic;

import com.progressbg.car.service.system.users.Admin;
import com.progressbg.car.service.system.users.Client;
import com.progressbg.car.service.system.users.Employee;
import com.progressbg.car.service.system.users.User;
import com.progressbg.car.service.system.vehicles.FuelType;
import com.progressbg.car.service.system.vehicles.procedures.ServiceProcedureType;
import com.progressbg.car.service.system.vehicles.regnumber.RegNumber;
import com.progressbg.car.service.system.vehicles.Vehicle;
import com.progressbg.car.service.system.vehicles.VehicleType;

import java.util.List;

public class Controller
{
    private List<User> loggableUsers;
    private List<Client> allClients;
    private List<Employee> allEmployees;

    public boolean createNewAdminUser(String userName, String password)
    {
        if(checkIfUserNameIsAlreadyTaken(userName))
        {
            return false;
        }
        loggableUsers.add(new Admin(userName, password));
        return true;
    }

    public boolean createNewEmployeeUser(String userName, String password, String firstName, String lastName)
    {
        if(checkIfUserNameIsAlreadyTaken(userName))
        {
            return false;
        }
        Employee em = new Employee(userName, password, firstName, lastName);
        loggableUsers.add(em);
        allEmployees.add(em);

        return true;
    }

    public boolean createNewClientUser(String userName, String password, String firstName, String lastName)
    {
        if(checkIfUserNameIsAlreadyTaken(userName))
        {
            return false;
        }
        Client cl = new Client(userName, password, firstName, lastName);
        loggableUsers.add(cl);
        allClients.add(cl);

        return true;
    }

    public boolean checkIfUserNameIsAlreadyTaken(String userName)
    {
        for(User u : loggableUsers)
        {
            if(u.getUserName().equals(userName))
            {
                return false;
            }
        }
        return true;
    }

    public boolean addVehicleToClient(String userName,
                                      String regCode,
                                      String serialString,
                                      String brand,
                                      String fuelType,
                                      String vehicleType,
                                      String model) throws IllegalArgumentException
    {
        for(Client cl : allClients)
        {
            if(cl.getUserName().equals(userName))
            {
                RegNumber rn = new RegNumber(regCode, serialString);
                FuelType ft = parseFuelType(fuelType);
                VehicleType vt = parseVehicleType(vehicleType);
                Vehicle vh = new Vehicle(rn, brand, ft, vt, model);
                cl.addVehicle(vh);

                return true;
            }
        }
        return false;
    }

    public VehicleType parseVehicleType(String vehicleTypeStr)
    {
        return switch (vehicleTypeStr) {
            case "car" -> VehicleType.CAR;
            case "suv" -> VehicleType.SUV;
            case "mpv" -> VehicleType.MPV;
            default -> throw new IllegalArgumentException("Illegal vehicle type");
        };
    }

    public FuelType parseFuelType(String fuelTypeStr)
    {
        return switch (fuelTypeStr) {
            case "petrol" -> FuelType.PETROL;
            case "diesel" -> FuelType.DIESEL;
            case "naturalgas" -> FuelType.NATURAL_GAS;
            case "electricity" -> FuelType.ELECTRICITY;
            default -> throw new IllegalArgumentException("Illegal fuel type");
        };
    }

    public boolean addServiceProcedure(String userName,
                                       String vehicleRegNumber,
                                       String typeStr,
                                       String description,
                                       Employee assignedTo)
    {
        return false;
    }

    public ServiceProcedureType parseServiceProcedureType(String serProTypeStr)
    {
        return switch (serProTypeStr) {
            case "oilchange" -> ServiceProcedureType.OIL_CHANGE;
            case "partchange" -> ServiceProcedureType.PART_CHANGE;
            case "enginefix" -> ServiceProcedureType.ENGINE_FIX;
            case "bodyfix" -> ServiceProcedureType.BODY_FIX;
            default -> throw new IllegalArgumentException("Illegal service procedure type");
        };
    }
}
