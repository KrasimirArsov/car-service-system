package com.progressbg.car.service.system.vehicles.regnumber;

public class RegNumber
{
    private String regionalCode;
    private String serialString;

    public RegNumber(String regionalCode, String serialString) throws IllegalArgumentException
    {
        if(regionalCode.toCharArray().length == 0 ||
                regionalCode.toCharArray().length > 2 ||
                serialString.toCharArray().length != 6)
        {
            throw new IllegalArgumentException("Illegal registration number");
        }

        this.regionalCode = regionalCode;
        this.serialString = serialString;
    }

    @Override
    public String toString()
    {
        return regionalCode + serialString;
    }

    public String getRegionalCode() {
        return regionalCode;
    }

    public String getSerialString() {
        return serialString;
    }
}
