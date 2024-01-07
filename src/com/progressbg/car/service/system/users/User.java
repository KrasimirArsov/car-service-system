package com.progressbg.car.service.system.users;

public abstract class User
{
    protected String userName;
    protected String password;
    protected AccessLvl levelOfAccess;

    protected User(String userName, String password, AccessLvl levelOfAccess)
    {
        this.userName = userName;
        this.password = password;
        this.levelOfAccess = levelOfAccess;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String providedPassword)
    {
        return this.password.equals(providedPassword);
    }

    public AccessLvl getLevelOfAccess() {
        return levelOfAccess;
    }
}
