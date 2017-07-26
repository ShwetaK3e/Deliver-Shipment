package com.shwetak3e.deliveryapp.utilities;

/**
 * Created by cas on 21-07-2017.
 */

public class Constants {
    /*public static final String DELIVERY_ALL="delivery/all";
    public static final String DELIVERY="delivery";*/

    public static final String DELIVERY_ALL="all";
    public static final String DELIVERY="delivery";
    public static final String OTP="otp";

    public static final String BASE_URL="http://api.zentello.com/v1/";


    //Constants Required
    public enum PaymentStatus {
        PAID("PAID"),
        TOPAY("TOPAY"),
        INTERBRANCH("INTERBRANCH"),
        SENDER_TBB("SENDER_TBB"),
        RECEIVER_TBB("RECEIVER_TBB");

        private String status;

        PaymentStatus(String status){
            this.status=status;
        }

        public String getStatus() {
            return status;
        }
    };

    public enum Deliverystatus{
        DELIVERED("DELIVERED"),
        READY("READY"),
        NOTREADY("NOTREADY");

        String status;

        Deliverystatus(String status){
            this.status=status;
        }

        public String getStatus() {
            return status;
        }
    }

    public enum CustomerType{
        ONACCOUNT("ONACCOUNT"),
        REGULAR("REGULAR");

        String type;

        CustomerType(String type){
            this.type=type;
        }

        public String getType() {
            return type;
        }
    }


    // intent extras TAG
    public static final String REFNUM="RefNum";


    //sharedPreferences TAG

    public static final String PREF_NAME="DeliveryPref";
    public static final String BRANCH_ID="BranchID";




}
