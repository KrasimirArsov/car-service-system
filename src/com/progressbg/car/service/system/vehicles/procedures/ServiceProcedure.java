package com.progressbg.car.service.system.vehicles.procedures;

import com.progressbg.car.service.system.users.Employee;

import java.util.ArrayList;
import java.util.List;

public class ServiceProcedure
{
    protected ServiceProcedureType type;
    protected String description;
    protected Status status;
    protected Employee assignedTo;
    protected List<Comment> comments;


    public ServiceProcedure(ServiceProcedureType type, String description, Employee assignedTo) {
        this.type = type;
        this.description = description;
        this.status = Status.NEW;
        this.assignedTo = assignedTo;
        this.comments = new ArrayList<>();
    }

    public ServiceProcedureType getType() {
        return this.type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setInProgressStatus() {
        this.status = Status.IN_PROGRESS;
    }

    public void setDoneStatus() {
        this.status = Status.DONE;
    }

    public void setClosedStatus() {
        this.status = Status.CLOSED;
    }

    public void setRejectedStatus() {
        this.status = Status.REJECTED;
    }

    public Employee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }
}
