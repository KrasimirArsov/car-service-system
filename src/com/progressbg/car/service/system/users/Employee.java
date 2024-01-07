package com.progressbg.car.service.system.users;

import com.progressbg.car.service.system.vehicles.procedures.ServiceProcedure;
import com.progressbg.car.service.system.vehicles.procedures.Status;

import java.util.ArrayList;
import java.util.List;

public class Employee extends User
{
    private String firstName;
    private String familyName;
    private List<ServiceProcedure> assignedProcedures;

    public Employee(String firstName, String familyName, String userName, String password)
    {
        super(userName, password, AccessLvl.EMPLOYEE);
        this.firstName = firstName;
        this.familyName = familyName;
        this.assignedProcedures = new ArrayList<>();
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

    public List<ServiceProcedure> getAllAssignedProcedures() {
        return assignedProcedures;
    }

    public List<ServiceProcedure> getAssignedProceduresByStatus(Status status) {
        List<ServiceProcedure> queriedProcedures = new ArrayList<>();

        for(ServiceProcedure sp : this.assignedProcedures)
        {
            if(sp.getStatus() == status)
            {
                queriedProcedures.add(sp);
            }
        }

        return queriedProcedures;
    }
}
