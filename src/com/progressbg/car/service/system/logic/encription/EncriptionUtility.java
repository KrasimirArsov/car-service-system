package com.progressbg.car.service.system.logic.encription;

public class EncriptionUtility
{
    private static final int[] encValues = {2, 5, 4, 9, 6, 4, 1, 3, 2, 2, 5, 9 ,10, 2, 5, 9, 6, 5, 6, 2, 5, 1, 1, 4};

    public static String encryptPassword(String unencryptedPass)
    {
        char[] unencryptedPassChArr = unencryptedPass.toCharArray();
        char[] encryptedPassChArr = new char[unencryptedPassChArr.length];

        for (int i = 0; i < unencryptedPassChArr.length; i++) {
            encryptedPassChArr[i] = (char)((int)unencryptedPassChArr[i] + encValues[i]);
        }

        return new String(encryptedPassChArr);
    }
}
