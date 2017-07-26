package com.shwetak3e.deliveryapp.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by cas on 25-07-2017.
 */

public class UtilityFunc {

    static public void setStringfromSharedPreference(Context context , String Key, String value){
        SharedPreferences pref=context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=pref.edit();
        edit.putString(Key,value);
        edit.commit();
    }

   static public String getStringfromSharedPreference(Context context , String Key){
       SharedPreferences pref=context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
       return pref.getString(Key,null);
   }
}
