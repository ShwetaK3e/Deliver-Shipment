package com.shwetak3e.deliveryapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cas on 24-07-2017.
 */

public class ConfirmDelivery {


    @SerializedName("refNum")
    @Expose
    String refNum;

    @SerializedName("otp")
    @Expose
    String otp;

    @SerializedName("branchId")
    @Expose
    String branchId;

    public ConfirmDelivery(String refNum, String otp, String branchId) {
        this.refNum = refNum;
        this.otp = otp;
        this.branchId = branchId;
    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
