package com.shwetak3e.deliveryapp.model;

/**
 * Created by cas on 21-07-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class BookingDetails {

    @SerializedName("booking")
    @Expose
    private Booking booking;
    @SerializedName("cashReceiptNumber")
    @Expose
    private String cashReceiptNumber;
    @SerializedName("deliveryChallanNumber")
    @Expose
    private String deliveryChallanNumber;
    @SerializedName("deliveryDate")
    @Expose
    private String deliveryDate;
    @SerializedName("deliveredBy")
    @Expose
    private DeliveredBy deliveredBy;
    @SerializedName("storageCharge")
    @Expose
    private Integer storageCharge;
    @SerializedName("bookingCharge")
    @Expose
    private Integer bookingCharge;
    @SerializedName("deliveryStatus")
    @Expose
    private String deliveryStatus;
    @SerializedName("bookingPaymentType")
    @Expose
    private String bookingPaymentType;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getCashReceiptNumber() {
        return cashReceiptNumber;
    }

    public void setCashReceiptNumber(String cashReceiptNumber) {
        this.cashReceiptNumber = cashReceiptNumber;
    }

    public String getDeliveryChallanNumber() {
        return deliveryChallanNumber;
    }

    public void setDeliveryChallanNumber(String deliveryChallanNumber) {
        this.deliveryChallanNumber = deliveryChallanNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public DeliveredBy getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(DeliveredBy deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public Integer getStorageCharge() {
        return storageCharge;
    }

    public void setStorageCharge(Integer storageCharge) {
        this.storageCharge = storageCharge;
    }

    public Integer getBookingCharge() {
        return bookingCharge;
    }

    public void setBookingCharge(Integer bookingCharge) {
        this.bookingCharge = bookingCharge;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getBookingPaymentType() {
        return bookingPaymentType;
    }

    public void setBookingPaymentType(String bookingPaymentType) {
        this.bookingPaymentType = bookingPaymentType;
    }

    public class Area {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class ArticleType {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortCode")
        @Expose
        private String shortCode;
        @SerializedName("length")
        @Expose
        private Integer length;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("sizeUOM")
        @Expose
        private String sizeUOM;
        @SerializedName("minWeight")
        @Expose
        private Integer minWeight;
        @SerializedName("weightUOM")
        @Expose
        private String weightUOM;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getSizeUOM() {
            return sizeUOM;
        }

        public void setSizeUOM(String sizeUOM) {
            this.sizeUOM = sizeUOM;
        }

        public Integer getMinWeight() {
            return minWeight;
        }

        public void setMinWeight(Integer minWeight) {
            this.minWeight = minWeight;
        }

        public String getWeightUOM() {
            return weightUOM;
        }

        public void setWeightUOM(String weightUOM) {
            this.weightUOM = weightUOM;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }

    public class BookedItem {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class BookedItemInstance {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("instanceNumber")
        @Expose
        private String instanceNumber;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInstanceNumber() {
            return instanceNumber;
        }

        public void setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
        }

    }

    public class BookedItemInstance_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("instanceNumber")
        @Expose
        private String instanceNumber;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInstanceNumber() {
            return instanceNumber;
        }

        public void setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
        }

    }

    public class Booking {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("refNum")
        @Expose
        private String refNum;
        @SerializedName("bookingDate")
        @Expose
        private String bookingDate;
        @SerializedName("principalCustomer")
        @Expose
        private PrincipalCustomer principalCustomer;
        @SerializedName("shippedFrom")
        @Expose
        private ShippedFrom shippedFrom;
        @SerializedName("shippedTo")
        @Expose
        private ShippedTo shippedTo;
        @SerializedName("consignor")
        @Expose
        private Consignor consignor;
        @SerializedName("consignee")
        @Expose
        private Consignee consignee;
        @SerializedName("paymentType")
        @Expose
        private String paymentType;
        @SerializedName("paymentComplete")
        @Expose
        private Boolean paymentComplete;
        @SerializedName("invoiceValue")
        @Expose
        private Integer invoiceValue;
        @SerializedName("minimumChargedWeight")
        @Expose
        private Integer minimumChargedWeight;
        @SerializedName("totalActualWeight")
        @Expose
        private Integer totalActualWeight;
        @SerializedName("totalChargedWeight")
        @Expose
        private Integer totalChargedWeight;
        @SerializedName("totalItemCount")
        @Expose
        private Integer totalItemCount;
        @SerializedName("basicFreight")
        @Expose
        private Integer basicFreight;
        @SerializedName("localInwardTransportationCharge")
        @Expose
        private Integer localInwardTransportationCharge;
        @SerializedName("localOutwardTransportationCharge")
        @Expose
        private Integer localOutwardTransportationCharge;
        @SerializedName("valueSurcharge")
        @Expose
        private Integer valueSurcharge;
        @SerializedName("netTotal")
        @Expose
        private Integer netTotal;
        @SerializedName("grandTotal")
        @Expose
        private Integer grandTotal;
        @SerializedName("serviceTax")
        @Expose
        private Integer serviceTax;
        @SerializedName("sbCess")
        @Expose
        private Integer sbCess;
        @SerializedName("kalyanCess")
        @Expose
        private Integer kalyanCess;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("discountRemarks")
        @Expose
        private String discountRemarks;
        @SerializedName("createdBy")
        @Expose
        private CreatedBy createdBy;
        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("componentItems")
        @Expose
        private List<ComponentItem> componentItems = null;
        @SerializedName("invoices")
        @Expose
        private List<Invoice> invoices = null;
        @SerializedName("bookingStatus")
        @Expose
        private String bookingStatus;
        @SerializedName("bookingPriority")
        @Expose
        private String bookingPriority;
        @SerializedName("priorityApproved")
        @Expose
        private Boolean priorityApproved;
        @SerializedName("priorityApprovedBy")
        @Expose
        private PriorityApprovedBy priorityApprovedBy;
        @SerializedName("priorityApprovedDate")
        @Expose
        private String priorityApprovedDate;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRefNum() {
            return refNum;
        }

        public void setRefNum(String refNum) {
            this.refNum = refNum;
        }

        public String getBookingDate() {
            return bookingDate;
        }

        public void setBookingDate(String bookingDate) {
            this.bookingDate = bookingDate;
        }

        public PrincipalCustomer getPrincipalCustomer() {
            return principalCustomer;
        }

        public void setPrincipalCustomer(PrincipalCustomer principalCustomer) {
            this.principalCustomer = principalCustomer;
        }

        public ShippedFrom getShippedFrom() {
            return shippedFrom;
        }

        public void setShippedFrom(ShippedFrom shippedFrom) {
            this.shippedFrom = shippedFrom;
        }

        public ShippedTo getShippedTo() {
            return shippedTo;
        }

        public void setShippedTo(ShippedTo shippedTo) {
            this.shippedTo = shippedTo;
        }

        public Consignor getConsignor() {
            return consignor;
        }

        public void setConsignor(Consignor consignor) {
            this.consignor = consignor;
        }

        public Consignee getConsignee() {
            return consignee;
        }

        public void setConsignee(Consignee consignee) {
            this.consignee = consignee;
        }

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public Boolean getPaymentComplete() {
            return paymentComplete;
        }

        public void setPaymentComplete(Boolean paymentComplete) {
            this.paymentComplete = paymentComplete;
        }

        public Integer getInvoiceValue() {
            return invoiceValue;
        }

        public void setInvoiceValue(Integer invoiceValue) {
            this.invoiceValue = invoiceValue;
        }

        public Integer getMinimumChargedWeight() {
            return minimumChargedWeight;
        }

        public void setMinimumChargedWeight(Integer minimumChargedWeight) {
            this.minimumChargedWeight = minimumChargedWeight;
        }

        public Integer getTotalActualWeight() {
            return totalActualWeight;
        }

        public void setTotalActualWeight(Integer totalActualWeight) {
            this.totalActualWeight = totalActualWeight;
        }

        public Integer getTotalChargedWeight() {
            return totalChargedWeight;
        }

        public void setTotalChargedWeight(Integer totalChargedWeight) {
            this.totalChargedWeight = totalChargedWeight;
        }

        public Integer getTotalItemCount() {
            return totalItemCount;
        }

        public void setTotalItemCount(Integer totalItemCount) {
            this.totalItemCount = totalItemCount;
        }

        public Integer getBasicFreight() {
            return basicFreight;
        }

        public void setBasicFreight(Integer basicFreight) {
            this.basicFreight = basicFreight;
        }

        public Integer getLocalInwardTransportationCharge() {
            return localInwardTransportationCharge;
        }

        public void setLocalInwardTransportationCharge(Integer localInwardTransportationCharge) {
            this.localInwardTransportationCharge = localInwardTransportationCharge;
        }

        public Integer getLocalOutwardTransportationCharge() {
            return localOutwardTransportationCharge;
        }

        public void setLocalOutwardTransportationCharge(Integer localOutwardTransportationCharge) {
            this.localOutwardTransportationCharge = localOutwardTransportationCharge;
        }

        public Integer getValueSurcharge() {
            return valueSurcharge;
        }

        public void setValueSurcharge(Integer valueSurcharge) {
            this.valueSurcharge = valueSurcharge;
        }

        public Integer getNetTotal() {
            return netTotal;
        }

        public void setNetTotal(Integer netTotal) {
            this.netTotal = netTotal;
        }

        public Integer getGrandTotal() {
            return grandTotal;
        }

        public void setGrandTotal(Integer grandTotal) {
            this.grandTotal = grandTotal;
        }

        public Integer getServiceTax() {
            return serviceTax;
        }

        public void setServiceTax(Integer serviceTax) {
            this.serviceTax = serviceTax;
        }

        public Integer getSbCess() {
            return sbCess;
        }

        public void setSbCess(Integer sbCess) {
            this.sbCess = sbCess;
        }

        public Integer getKalyanCess() {
            return kalyanCess;
        }

        public void setKalyanCess(Integer kalyanCess) {
            this.kalyanCess = kalyanCess;
        }

        public Integer getDiscount() {
            return discount;
        }

        public void setDiscount(Integer discount) {
            this.discount = discount;
        }

        public String getDiscountRemarks() {
            return discountRemarks;
        }

        public void setDiscountRemarks(String discountRemarks) {
            this.discountRemarks = discountRemarks;
        }

        public CreatedBy getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(CreatedBy createdBy) {
            this.createdBy = createdBy;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public List<ComponentItem> getComponentItems() {
            return componentItems;
        }

        public void setComponentItems(List<ComponentItem> componentItems) {
            this.componentItems = componentItems;
        }

        public List<Invoice> getInvoices() {
            return invoices;
        }

        public void setInvoices(List<Invoice> invoices) {
            this.invoices = invoices;
        }

        public String getBookingStatus() {
            return bookingStatus;
        }

        public void setBookingStatus(String bookingStatus) {
            this.bookingStatus = bookingStatus;
        }

        public String getBookingPriority() {
            return bookingPriority;
        }

        public void setBookingPriority(String bookingPriority) {
            this.bookingPriority = bookingPriority;
        }

        public Boolean getPriorityApproved() {
            return priorityApproved;
        }

        public void setPriorityApproved(Boolean priorityApproved) {
            this.priorityApproved = priorityApproved;
        }

        public PriorityApprovedBy getPriorityApprovedBy() {
            return priorityApprovedBy;
        }

        public void setPriorityApprovedBy(PriorityApprovedBy priorityApprovedBy) {
            this.priorityApprovedBy = priorityApprovedBy;
        }

        public String getPriorityApprovedDate() {
            return priorityApprovedDate;
        }

        public void setPriorityApprovedDate(String priorityApprovedDate) {
            this.priorityApprovedDate = priorityApprovedDate;
        }

    }

    public class BookingOffice {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class Branch {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortCode")
        @Expose
        private String shortCode;
        @SerializedName("stationBranchCode")
        @Expose
        private String stationBranchCode;
        @SerializedName("station")
        @Expose
        private Station__ station;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("phoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("bookingAllowed")
        @Expose
        private Boolean bookingAllowed;
        @SerializedName("deliveryAllowed")
        @Expose
        private Boolean deliveryAllowed;
        @SerializedName("transhipmentAllowed")
        @Expose
        private Boolean transhipmentAllowed;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getStationBranchCode() {
            return stationBranchCode;
        }

        public void setStationBranchCode(String stationBranchCode) {
            this.stationBranchCode = stationBranchCode;
        }

        public Station__ getStation() {
            return station;
        }

        public void setStation(Station__ station) {
            this.station = station;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Boolean getBookingAllowed() {
            return bookingAllowed;
        }

        public void setBookingAllowed(Boolean bookingAllowed) {
            this.bookingAllowed = bookingAllowed;
        }

        public Boolean getDeliveryAllowed() {
            return deliveryAllowed;
        }

        public void setDeliveryAllowed(Boolean deliveryAllowed) {
            this.deliveryAllowed = deliveryAllowed;
        }

        public Boolean getTranshipmentAllowed() {
            return transhipmentAllowed;
        }

        public void setTranshipmentAllowed(Boolean transhipmentAllowed) {
            this.transhipmentAllowed = transhipmentAllowed;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }


    public class Branch_ {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class City {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class City_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


    public class ClosedBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }

    public class ComponentItem {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("genericComponent")
        @Expose
        private String genericComponent;
        @SerializedName("componentName")
        @Expose
        private String componentName;
        @SerializedName("value")
        @Expose
        private Integer value;
        @SerializedName("priority")
        @Expose
        private Integer priority;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGenericComponent() {
            return genericComponent;
        }

        public void setGenericComponent(String genericComponent) {
            this.genericComponent = genericComponent;
        }

        public String getComponentName() {
            return componentName;
        }

        public void setComponentName(String componentName) {
            this.componentName = componentName;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

    }

    public class Consignee {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("gstin")
        @Expose
        private String gstin;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("city")
        @Expose
        private City_ city;
        @SerializedName("state")
        @Expose
        private State_ state;
        @SerializedName("country")
        @Expose
        private Country_ country;
        @SerializedName("pinCode")
        @Expose
        private String pinCode;
        @SerializedName("mobileNumber")
        @Expose
        private String mobileNumber;
        @SerializedName("customerId")
        @Expose
        private String customerId;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGstin() {
            return gstin;
        }

        public void setGstin(String gstin) {
            this.gstin = gstin;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public City_ getCity() {
            return city;
        }

        public void setCity(City_ city) {
            this.city = city;
        }

        public State_ getState() {
            return state;
        }

        public void setState(State_ state) {
            this.state = state;
        }

        public Country_ getCountry() {
            return country;
        }

        public void setCountry(Country_ country) {
            this.country = country;
        }

        public String getPinCode() {
            return pinCode;
        }

        public void setPinCode(String pinCode) {
            this.pinCode = pinCode;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

    }


    public class Consignor {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("gstin")
        @Expose
        private String gstin;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("state")
        @Expose
        private State state;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("pinCode")
        @Expose
        private String pinCode;
        @SerializedName("mobileNumber")
        @Expose
        private String mobileNumber;
        @SerializedName("customerId")
        @Expose
        private String customerId;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGstin() {
            return gstin;
        }

        public void setGstin(String gstin) {
            this.gstin = gstin;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getPinCode() {
            return pinCode;
        }

        public void setPinCode(String pinCode) {
            this.pinCode = pinCode;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

    }

    public class Country {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Country_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class CreatedBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }

    public class CreatedBy_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }

    public class DefaultBranch {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class DeliveredBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }

    public class Invoice {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("invoiceNumber")
        @Expose
        private String invoiceNumber;
        @SerializedName("invoiceValue")
        @Expose
        private Integer invoiceValue;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        public Integer getInvoiceValue() {
            return invoiceValue;
        }

        public void setInvoiceValue(Integer invoiceValue) {
            this.invoiceValue = invoiceValue;
        }

    }


    public class Issue {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("issueType")
        @Expose
        private String issueType;
        @SerializedName("issueSourceType")
        @Expose
        private String issueSourceType;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("resolvedDate")
        @Expose
        private String resolvedDate;
        @SerializedName("closedDate")
        @Expose
        private String closedDate;
        @SerializedName("createdBy")
        @Expose
        private CreatedBy_ createdBy;
        @SerializedName("resolvedBy")
        @Expose
        private ResolvedBy resolvedBy;
        @SerializedName("closedBy")
        @Expose
        private ClosedBy closedBy;
        @SerializedName("issueNumber")
        @Expose
        private String issueNumber;
        @SerializedName("branch")
        @Expose
        private Branch_ branch;
        @SerializedName("issueStatus")
        @Expose
        private String issueStatus;
        @SerializedName("issueItemCount")
        @Expose
        private Integer issueItemCount;
        @SerializedName("bookedItem")
        @Expose
        private BookedItem bookedItem;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIssueType() {
            return issueType;
        }

        public void setIssueType(String issueType) {
            this.issueType = issueType;
        }

        public String getIssueSourceType() {
            return issueSourceType;
        }

        public void setIssueSourceType(String issueSourceType) {
            this.issueSourceType = issueSourceType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getResolvedDate() {
            return resolvedDate;
        }

        public void setResolvedDate(String resolvedDate) {
            this.resolvedDate = resolvedDate;
        }

        public String getClosedDate() {
            return closedDate;
        }

        public void setClosedDate(String closedDate) {
            this.closedDate = closedDate;
        }

        public CreatedBy_ getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(CreatedBy_ createdBy) {
            this.createdBy = createdBy;
        }

        public ResolvedBy getResolvedBy() {
            return resolvedBy;
        }

        public void setResolvedBy(ResolvedBy resolvedBy) {
            this.resolvedBy = resolvedBy;
        }

        public ClosedBy getClosedBy() {
            return closedBy;
        }

        public void setClosedBy(ClosedBy closedBy) {
            this.closedBy = closedBy;
        }

        public String getIssueNumber() {
            return issueNumber;
        }

        public void setIssueNumber(String issueNumber) {
            this.issueNumber = issueNumber;
        }

        public Branch_ getBranch() {
            return branch;
        }

        public void setBranch(Branch_ branch) {
            this.branch = branch;
        }

        public String getIssueStatus() {
            return issueStatus;
        }

        public void setIssueStatus(String issueStatus) {
            this.issueStatus = issueStatus;
        }

        public Integer getIssueItemCount() {
            return issueItemCount;
        }

        public void setIssueItemCount(Integer issueItemCount) {
            this.issueItemCount = issueItemCount;
        }

        public BookedItem getBookedItem() {
            return bookedItem;
        }

        public void setBookedItem(BookedItem bookedItem) {
            this.bookedItem = bookedItem;
        }

    }


    public class Item {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("articleType")
        @Expose
        private ArticleType articleType;
        @SerializedName("seqNo")
        @Expose
        private Integer seqNo;
        @SerializedName("itemNumber")
        @Expose
        private String itemNumber;
        @SerializedName("commodityName")
        @Expose
        private String commodityName;
        @SerializedName("sizeUOM")
        @Expose
        private String sizeUOM;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("length")
        @Expose
        private Integer length;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("cftVolume")
        @Expose
        private Integer cftVolume;
        @SerializedName("cftWeight")
        @Expose
        private Integer cftWeight;
        @SerializedName("actualWeight")
        @Expose
        private Integer actualWeight;
        @SerializedName("chargedWeight")
        @Expose
        private Integer chargedWeight;
        @SerializedName("loadedWeight")
        @Expose
        private Integer loadedWeight;
        @SerializedName("unloadedWeight")
        @Expose
        private Integer unloadedWeight;
        @SerializedName("unitCharge")
        @Expose
        private Integer unitCharge;
        @SerializedName("totalCharge")
        @Expose
        private Integer totalCharge;
        @SerializedName("loadedCharge")
        @Expose
        private Integer loadedCharge;
        @SerializedName("unloadedCharge")
        @Expose
        private Integer unloadedCharge;
        @SerializedName("itemCount")
        @Expose
        private Integer itemCount;
        @SerializedName("loadedCount")
        @Expose
        private Integer loadedCount;
        @SerializedName("unloadedCount")
        @Expose
        private Integer unloadedCount;
        @SerializedName("sourceBranch")
        @Expose
        private String sourceBranch;
        @SerializedName("destinationBranch")
        @Expose
        private String destinationBranch;
        @SerializedName("itemInstances")
        @Expose
        private List<ItemInstance> itemInstances = null;
        @SerializedName("vehicleStock")
        @Expose
        private List<VehicleStock> vehicleStock = null;
        @SerializedName("currentBranchStockCount")
        @Expose
        private Integer currentBranchStockCount;
        @SerializedName("otherBranchStock")
        @Expose
        private List<OtherBranchStock> otherBranchStock = null;
        @SerializedName("issues")
        @Expose
        private List<Issue> issues = null;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ArticleType getArticleType() {
            return articleType;
        }

        public void setArticleType(ArticleType articleType) {
            this.articleType = articleType;
        }

        public Integer getSeqNo() {
            return seqNo;
        }

        public void setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
        }

        public String getItemNumber() {
            return itemNumber;
        }

        public void setItemNumber(String itemNumber) {
            this.itemNumber = itemNumber;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getSizeUOM() {
            return sizeUOM;
        }

        public void setSizeUOM(String sizeUOM) {
            this.sizeUOM = sizeUOM;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getCftVolume() {
            return cftVolume;
        }

        public void setCftVolume(Integer cftVolume) {
            this.cftVolume = cftVolume;
        }

        public Integer getCftWeight() {
            return cftWeight;
        }

        public void setCftWeight(Integer cftWeight) {
            this.cftWeight = cftWeight;
        }

        public Integer getActualWeight() {
            return actualWeight;
        }

        public void setActualWeight(Integer actualWeight) {
            this.actualWeight = actualWeight;
        }

        public Integer getChargedWeight() {
            return chargedWeight;
        }

        public void setChargedWeight(Integer chargedWeight) {
            this.chargedWeight = chargedWeight;
        }

        public Integer getLoadedWeight() {
            return loadedWeight;
        }

        public void setLoadedWeight(Integer loadedWeight) {
            this.loadedWeight = loadedWeight;
        }

        public Integer getUnloadedWeight() {
            return unloadedWeight;
        }

        public void setUnloadedWeight(Integer unloadedWeight) {
            this.unloadedWeight = unloadedWeight;
        }

        public Integer getUnitCharge() {
            return unitCharge;
        }

        public void setUnitCharge(Integer unitCharge) {
            this.unitCharge = unitCharge;
        }

        public Integer getTotalCharge() {
            return totalCharge;
        }

        public void setTotalCharge(Integer totalCharge) {
            this.totalCharge = totalCharge;
        }

        public Integer getLoadedCharge() {
            return loadedCharge;
        }

        public void setLoadedCharge(Integer loadedCharge) {
            this.loadedCharge = loadedCharge;
        }

        public Integer getUnloadedCharge() {
            return unloadedCharge;
        }

        public void setUnloadedCharge(Integer unloadedCharge) {
            this.unloadedCharge = unloadedCharge;
        }

        public Integer getItemCount() {
            return itemCount;
        }

        public void setItemCount(Integer itemCount) {
            this.itemCount = itemCount;
        }

        public Integer getLoadedCount() {
            return loadedCount;
        }

        public void setLoadedCount(Integer loadedCount) {
            this.loadedCount = loadedCount;
        }

        public Integer getUnloadedCount() {
            return unloadedCount;
        }

        public void setUnloadedCount(Integer unloadedCount) {
            this.unloadedCount = unloadedCount;
        }

        public String getSourceBranch() {
            return sourceBranch;
        }

        public void setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
        }

        public String getDestinationBranch() {
            return destinationBranch;
        }

        public void setDestinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
        }

        public List<ItemInstance> getItemInstances() {
            return itemInstances;
        }

        public void setItemInstances(List<ItemInstance> itemInstances) {
            this.itemInstances = itemInstances;
        }

        public List<VehicleStock> getVehicleStock() {
            return vehicleStock;
        }

        public void setVehicleStock(List<VehicleStock> vehicleStock) {
            this.vehicleStock = vehicleStock;
        }

        public Integer getCurrentBranchStockCount() {
            return currentBranchStockCount;
        }

        public void setCurrentBranchStockCount(Integer currentBranchStockCount) {
            this.currentBranchStockCount = currentBranchStockCount;
        }

        public List<OtherBranchStock> getOtherBranchStock() {
            return otherBranchStock;
        }

        public void setOtherBranchStock(List<OtherBranchStock> otherBranchStock) {
            this.otherBranchStock = otherBranchStock;
        }

        public List<Issue> getIssues() {
            return issues;
        }

        public void setIssues(List<Issue> issues) {
            this.issues = issues;
        }

    }


    public class ItemInstance {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("instanceNumber")
        @Expose
        private String instanceNumber;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInstanceNumber() {
            return instanceNumber;
        }

        public void setInstanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
        }

    }

    public class OtherBranchStock {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("branch")
        @Expose
        private Branch branch;
        @SerializedName("bookedItemInstance")
        @Expose
        private BookedItemInstance_ bookedItemInstance;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("eventType")
        @Expose
        private String eventType;
        @SerializedName("createdDate")
        @Expose
        private String createdDate;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Branch getBranch() {
            return branch;
        }

        public void setBranch(Branch branch) {
            this.branch = branch;
        }

        public BookedItemInstance_ getBookedItemInstance() {
            return bookedItemInstance;
        }

        public void setBookedItemInstance(BookedItemInstance_ bookedItemInstance) {
            this.bookedItemInstance = bookedItemInstance;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getEventType() {
            return eventType;
        }

        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

    }


    public class PrincipalCustomer {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("customerType")
        @Expose
        private String customerType;
        @SerializedName("customerCode")
        @Expose
        private String customerCode;
        @SerializedName("customerDesignation")
        @Expose
        private String customerDesignation;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("emailID")
        @Expose
        private String emailID;
        @SerializedName("mobileNumber")
        @Expose
        private String mobileNumber;
        @SerializedName("contactPerson")
        @Expose
        private String contactPerson;
        @SerializedName("bookingOffice")
        @Expose
        private BookingOffice bookingOffice;
        @SerializedName("customerApprovalRefNumber")
        @Expose
        private String customerApprovalRefNumber;
        @SerializedName("gstin")
        @Expose
        private String gstin;
        @SerializedName("serviceTaxExempted")
        @Expose
        private Boolean serviceTaxExempted;
        @SerializedName("verified")
        @Expose
        private Boolean verified;
        @SerializedName("status")
        @Expose
        private Boolean status;
        @SerializedName("inward")
        @Expose
        private Boolean inward;
        @SerializedName("outward")
        @Expose
        private Boolean outward;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCustomerType() {
            return customerType;
        }

        public void setCustomerType(String customerType) {
            this.customerType = customerType;
        }

        public String getCustomerCode() {
            return customerCode;
        }

        public void setCustomerCode(String customerCode) {
            this.customerCode = customerCode;
        }

        public String getCustomerDesignation() {
            return customerDesignation;
        }

        public void setCustomerDesignation(String customerDesignation) {
            this.customerDesignation = customerDesignation;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmailID() {
            return emailID;
        }

        public void setEmailID(String emailID) {
            this.emailID = emailID;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getContactPerson() {
            return contactPerson;
        }

        public void setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
        }

        public BookingOffice getBookingOffice() {
            return bookingOffice;
        }

        public void setBookingOffice(BookingOffice bookingOffice) {
            this.bookingOffice = bookingOffice;
        }

        public String getCustomerApprovalRefNumber() {
            return customerApprovalRefNumber;
        }

        public void setCustomerApprovalRefNumber(String customerApprovalRefNumber) {
            this.customerApprovalRefNumber = customerApprovalRefNumber;
        }

        public String getGstin() {
            return gstin;
        }

        public void setGstin(String gstin) {
            this.gstin = gstin;
        }

        public Boolean getServiceTaxExempted() {
            return serviceTaxExempted;
        }

        public void setServiceTaxExempted(Boolean serviceTaxExempted) {
            this.serviceTaxExempted = serviceTaxExempted;
        }

        public Boolean getVerified() {
            return verified;
        }

        public void setVerified(Boolean verified) {
            this.verified = verified;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

        public Boolean getInward() {
            return inward;
        }

        public void setInward(Boolean inward) {
            this.inward = inward;
        }

        public Boolean getOutward() {
            return outward;
        }

        public void setOutward(Boolean outward) {
            this.outward = outward;
        }

    }


    public class PriorityApprovedBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }


    public class Region {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class ResolvedBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }


    public class ShippedFrom {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortCode")
        @Expose
        private String shortCode;
        @SerializedName("stationBranchCode")
        @Expose
        private String stationBranchCode;
        @SerializedName("station")
        @Expose
        private Station station;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("phoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("bookingAllowed")
        @Expose
        private Boolean bookingAllowed;
        @SerializedName("deliveryAllowed")
        @Expose
        private Boolean deliveryAllowed;
        @SerializedName("transhipmentAllowed")
        @Expose
        private Boolean transhipmentAllowed;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getStationBranchCode() {
            return stationBranchCode;
        }

        public void setStationBranchCode(String stationBranchCode) {
            this.stationBranchCode = stationBranchCode;
        }

        public Station getStation() {
            return station;
        }

        public void setStation(Station station) {
            this.station = station;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Boolean getBookingAllowed() {
            return bookingAllowed;
        }

        public void setBookingAllowed(Boolean bookingAllowed) {
            this.bookingAllowed = bookingAllowed;
        }

        public Boolean getDeliveryAllowed() {
            return deliveryAllowed;
        }

        public void setDeliveryAllowed(Boolean deliveryAllowed) {
            this.deliveryAllowed = deliveryAllowed;
        }

        public Boolean getTranshipmentAllowed() {
            return transhipmentAllowed;
        }

        public void setTranshipmentAllowed(Boolean transhipmentAllowed) {
            this.transhipmentAllowed = transhipmentAllowed;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }


    public class ShippedTo {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortCode")
        @Expose
        private String shortCode;
        @SerializedName("stationBranchCode")
        @Expose
        private String stationBranchCode;
        @SerializedName("station")
        @Expose
        private Station_ station;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("phoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("bookingAllowed")
        @Expose
        private Boolean bookingAllowed;
        @SerializedName("deliveryAllowed")
        @Expose
        private Boolean deliveryAllowed;
        @SerializedName("transhipmentAllowed")
        @Expose
        private Boolean transhipmentAllowed;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getStationBranchCode() {
            return stationBranchCode;
        }

        public void setStationBranchCode(String stationBranchCode) {
            this.stationBranchCode = stationBranchCode;
        }

        public Station_ getStation() {
            return station;
        }

        public void setStation(Station_ station) {
            this.station = station;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Boolean getBookingAllowed() {
            return bookingAllowed;
        }

        public void setBookingAllowed(Boolean bookingAllowed) {
            this.bookingAllowed = bookingAllowed;
        }

        public Boolean getDeliveryAllowed() {
            return deliveryAllowed;
        }

        public void setDeliveryAllowed(Boolean deliveryAllowed) {
            this.deliveryAllowed = deliveryAllowed;
        }

        public Boolean getTranshipmentAllowed() {
            return transhipmentAllowed;
        }

        public void setTranshipmentAllowed(Boolean transhipmentAllowed) {
            this.transhipmentAllowed = transhipmentAllowed;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }


    public class State {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class State_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


    public class State__ {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class Station {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class Station_ {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }



    public class Station__ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortCode")
        @Expose
        private String shortCode;
        @SerializedName("cityCharges")
        @Expose
        private Integer cityCharges;
        @SerializedName("defaultBranch")
        @Expose
        private DefaultBranch defaultBranch;
        @SerializedName("transitTime")
        @Expose
        private Integer transitTime;
        @SerializedName("area")
        @Expose
        private Area area;
        @SerializedName("state")
        @Expose
        private State__ state;
        @SerializedName("region")
        @Expose
        private Region region;
        @SerializedName("zone")
        @Expose
        private Zone zone;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public Integer getCityCharges() {
            return cityCharges;
        }

        public void setCityCharges(Integer cityCharges) {
            this.cityCharges = cityCharges;
        }

        public DefaultBranch getDefaultBranch() {
            return defaultBranch;
        }

        public void setDefaultBranch(DefaultBranch defaultBranch) {
            this.defaultBranch = defaultBranch;
        }

        public Integer getTransitTime() {
            return transitTime;
        }

        public void setTransitTime(Integer transitTime) {
            this.transitTime = transitTime;
        }

        public Area getArea() {
            return area;
        }

        public void setArea(Area area) {
            this.area = area;
        }

        public State__ getState() {
            return state;
        }

        public void setState(State__ state) {
            this.state = state;
        }

        public Region getRegion() {
            return region;
        }

        public void setRegion(Region region) {
            this.region = region;
        }

        public Zone getZone() {
            return zone;
        }

        public void setZone(Zone zone) {
            this.zone = zone;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }

    public class Vehicle {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("vehicleModel")
        @Expose
        private VehicleModel vehicleModel;
        @SerializedName("vehicleNumber")
        @Expose
        private String vehicleNumber;
        @SerializedName("vehicleOwnerShipType")
        @Expose
        private String vehicleOwnerShipType;
        @SerializedName("vehicleVolume")
        @Expose
        private Integer vehicleVolume;
        @SerializedName("vehiclePermissibleWeight")
        @Expose
        private Integer vehiclePermissibleWeight;
        @SerializedName("status")
        @Expose
        private Boolean status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public VehicleModel getVehicleModel() {
            return vehicleModel;
        }

        public void setVehicleModel(VehicleModel vehicleModel) {
            this.vehicleModel = vehicleModel;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public void setVehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
        }

        public String getVehicleOwnerShipType() {
            return vehicleOwnerShipType;
        }

        public void setVehicleOwnerShipType(String vehicleOwnerShipType) {
            this.vehicleOwnerShipType = vehicleOwnerShipType;
        }

        public Integer getVehicleVolume() {
            return vehicleVolume;
        }

        public void setVehicleVolume(Integer vehicleVolume) {
            this.vehicleVolume = vehicleVolume;
        }

        public Integer getVehiclePermissibleWeight() {
            return vehiclePermissibleWeight;
        }

        public void setVehiclePermissibleWeight(Integer vehiclePermissibleWeight) {
            this.vehiclePermissibleWeight = vehiclePermissibleWeight;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

    }

    public class VehicleModel {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class VehicleStock {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("vehicle")
        @Expose
        private Vehicle vehicle;
        @SerializedName("bookedItemInstance")
        @Expose
        private BookedItemInstance bookedItemInstance;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("eventType")
        @Expose
        private String eventType;
        @SerializedName("createdDate")
        @Expose
        private String createdDate;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public BookedItemInstance getBookedItemInstance() {
            return bookedItemInstance;
        }

        public void setBookedItemInstance(BookedItemInstance bookedItemInstance) {
            this.bookedItemInstance = bookedItemInstance;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getEventType() {
            return eventType;
        }

        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

    }


    public class Zone {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }



}












