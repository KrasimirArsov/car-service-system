package com.progressbg.car.service.system.users;

public class Admin extends User
{
    public Admin(String userName, String password)
    {
        super(userName, password, AccessLvl.ADMIN);
    }
}
