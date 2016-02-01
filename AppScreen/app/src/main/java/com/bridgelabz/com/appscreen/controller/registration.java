package com.bridgelabz.com.appscreen.controller;

import android.util.Log;


/**
 * Created by bridgelabz3 on 1/2/16.
 */
public class registration {

    static boolean flag=false;
    public static boolean verifyNumber(String phoneNo)
    {
        Log.e("Inside",phoneNo);

        if(phoneNo.matches("^[7-9][0-9]{9}$"))
        {
            flag=true;
            Log.e("done","matches");
        }
        Log.e("out","out");
        if(flag ==true)
            return true;
        else {
            Log.e("false", "false");
            return false;
        }
    }
}