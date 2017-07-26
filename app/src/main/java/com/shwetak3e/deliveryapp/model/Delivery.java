package com.shwetak3e.deliveryapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cas on 21-07-2017.
 */

public class Delivery {

    @SerializedName("refNum")
    @Expose
    private String refNum;
    @SerializedName("consignee")
    @Expose
    private String consignee;
    @SerializedName("itemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("paymentType")
    @Expose
    private String paymentType;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("bookingDate")
    @Expose
    private String bookingDate;
    @SerializedName("amountDue")
    @Expose
    private Float amountDue;
    @SerializedName("deliveryDate")
    @Expose
    private String deliveryDate;
    @SerializedName("deliveryStatus")
    @Expose
    private String deliveryStatus;

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Float getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(Float amountDue) {
        this.amountDue = amountDue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }


}
