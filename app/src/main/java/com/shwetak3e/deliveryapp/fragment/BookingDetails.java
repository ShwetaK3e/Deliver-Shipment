package com.shwetak3e.deliveryapp.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.shwetak3e.deliveryapp.MainActivity;
import com.shwetak3e.deliveryapp.R;
import com.shwetak3e.deliveryapp.adapter.ShipmentAdapter;
import com.shwetak3e.deliveryapp.model.ConfirmDelivery;
import com.shwetak3e.deliveryapp.utilities.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;


public class BookingDetails extends Fragment {


    private static final String TAG =BookingDetails.class.getSimpleName() ;




    String refnum;
    com.shwetak3e.deliveryapp.model.BookingDetails delivery_item;

    ScrollView content;
    LinearLayout deactivating_overlay;


    ImageView payment_status;
    TextView total_payable_amnt;
    ImageButton see_payment_details;
    boolean show_payment_details=false;
    LinearLayout payment_details_layout;
    TextView storage_pay,services_pay;



    ImageButton see_shipments;
    boolean show_shipment=false;
    LinearLayout shipment_list_layout;
    RecyclerView shipment_list;
    ShipmentAdapter shipmentAdapter;


    ImageButton call_customer;
    ImageButton mail_customer;
    LinearLayout customer_details_layout;
    TextView cstmer_type, company_name, contact_person, cstmer_mail, cstmer_phone;

    ImageButton see_booking_details;
    boolean show_booking;
    LinearLayout booking_details_layout;
    TextView arrival_time;


    LinearLayout confirm_layout;
    Button confirm;
    boolean isConfirmed=false;
    LinearLayout otp_layout;
    EditText otp1,otp2,otp3,otp4;
    StringBuilder otp=new StringBuilder("0000");
    TextView error_otp;

    private Dialog confirmationDialog;



    public static BookingDetails newInstance() {
        BookingDetails fragment = new BookingDetails();
        return fragment;
    }

    void init(){

    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_delivery_item_details, container,false);

        refnum=getActivity().getIntent().getStringExtra("RefNum");
        Log.i("REFNUM",refnum);



        deactivating_overlay=(LinearLayout)view.findViewById(R.id.overlay);
        deactivating_overlay.setVisibility(View.INVISIBLE);
        otp_layout=(LinearLayout)view.findViewById(R.id.otp_layout);
        otp_layout.setVisibility(GONE);
        otp1=(EditText)view.findViewById(R.id.otp_1);
        otp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
              if(s.toString().length()!=0){
                  error_otp.setVisibility(GONE);
                  otp.setCharAt(0,s.charAt(0));
                  otp2.requestFocus();
              }
            }
        });
        otp2=(EditText)view.findViewById(R.id.otp_2);
        otp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()!=0){
                    otp.setCharAt(1,s.charAt(0));
                    otp3.requestFocus();
                }
            }
        });
        otp3=(EditText)view.findViewById(R.id.otp_3);
        otp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()!=0){
                    otp.setCharAt(2,s.charAt(0));
                    otp4.requestFocus();

                }
            }
        });
        otp4=(EditText)view.findViewById(R.id.otp_4);
        otp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {
                if(s.toString().length()!=0){
                    otp.setCharAt(3,s.charAt(0));
                    Log.i("OTP",otp.toString());


                    ConfirmDelivery confirmDelivery=new ConfirmDelivery(refnum,otp.toString(),"1234");

                    if(MainActivity.deliveryClient!=null) {
                        MainActivity.deliveryClient.updateBooking(confirmDelivery).subscribeOn(Schedulers.newThread())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Subscriber<com.shwetak3e.deliveryapp.model.BookingDetails>() {
                                    @Override
                                    public void onCompleted() {

                                    }

                                    @Override
                                    public void onError(Throwable e) {

                                    }

                                    @Override
                                    public void onNext(com.shwetak3e.deliveryapp.model.BookingDetails booking_Details) {
                                        if(Constants.Deliverystatus.DELIVERED.getStatus().equalsIgnoreCase(booking_Details.getDeliveryStatus())){
                                            show_confirmation();
                                            final Intent i=new Intent(getActivity(), MainActivity.class);
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    startActivity(i);
                                                }
                                            },2500);
                                        }else{
                                            otp1.setText("");
                                            otp2.setText("");
                                            otp3.setText("");
                                            otp4.setText("");
                                            otp1.requestFocus();
                                            error_otp.setVisibility(VISIBLE);
                                        }
                                    }
                                });

                    }

                }
            }
        });
        error_otp=(TextView)view.findViewById(R.id.otp_error);
        error_otp.setVisibility(GONE);


        total_payable_amnt=(TextView)view.findViewById(R.id.total_payment);
        payment_status=(ImageView)view.findViewById(R.id.payment_status);


        see_payment_details=(ImageButton)view.findViewById(R.id.see_payment_details);
        see_payment_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_payment_details){
                    show_payment_details=false;
                    payment_details_layout.setVisibility(GONE);
                    see_payment_details.setImageResource(R.drawable.ic_down);
                }else{
                    show_payment_details=true;
                    payment_details_layout.setVisibility(VISIBLE);
                    see_payment_details.setImageResource(R.drawable.ic_up_arrow);
                }
            }
        });

        payment_details_layout=(LinearLayout)view.findViewById(R.id.payment_details_layout);
        payment_details_layout.setVisibility(GONE);
        storage_pay=(TextView)view.findViewById(R.id.storage_pay);
        services_pay=(TextView)view.findViewById(R.id.service_pay);





        see_shipments=(ImageButton)view.findViewById(R.id.see_shipments);
        see_shipments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_shipment){
                   show_shipment=false;
                   shipment_list_layout.setVisibility(GONE);
                   see_shipments.setImageResource(R.drawable.ic_down);
                }else{
                    show_shipment=true;
                    shipment_list_layout.setVisibility(VISIBLE);
                    see_shipments.setImageResource(R.drawable.ic_up_arrow);
                }
            }
        });

        shipment_list_layout=(LinearLayout)view.findViewById(R.id.shipment_list_layout);
        shipment_list_layout.setVisibility(GONE);
        shipment_list=(RecyclerView)view.findViewById(R.id.shipment_list);
        shipment_list.setLayoutManager(new GridLayoutManager(getContext(),1));



        /*PhoneCallListener callListener=new PhoneCallListener();
        TelephonyManager tm= (TelephonyManager)getContext().getSystemService(Context.TELEPHONY_SERVICE);
        tm.listen(callListener, PhoneStateListener.LISTEN_CALL_STATE);*/

        call_customer=(ImageButton)view.findViewById(R.id.call_user);
        call_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+delivery_item.getBooking().getPrincipalCustomer().getMobileNumber()));
                startActivity(intent);
            }
        });

        mail_customer=(ImageButton)view.findViewById(R.id.mail_user);
        mail_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("tel:"+delivery_item.getBooking().getPrincipalCustomer().getMobileNumber()));
                startActivity(intent);
            }
        });


        customer_details_layout=(LinearLayout)view.findViewById(R.id.customer_details_layout);

        cstmer_type=(TextView)view.findViewById(R.id.customer_type);
        company_name=(TextView)view.findViewById(R.id.cmpany_name);
        contact_person=(TextView)view.findViewById(R.id.contact_person);
        cstmer_mail=(TextView)view.findViewById(R.id.email_id);
        cstmer_phone=(TextView)view.findViewById(R.id.mobile);


        see_booking_details=(ImageButton)view.findViewById(R.id.see_booking_details);
        see_booking_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_booking){
                    show_booking=false;
                    booking_details_layout.setVisibility(GONE);
                    see_booking_details.setImageResource(R.drawable.ic_down);
                }else{
                    show_booking=true;
                    booking_details_layout.setVisibility(VISIBLE);
                    see_booking_details.setImageResource(R.drawable.ic_up_arrow);
                }

            }
        });
        booking_details_layout=(LinearLayout)view.findViewById(R.id.booking_details_layout);
        booking_details_layout.setVisibility(GONE);
        arrival_time=(TextView)view.findViewById(R.id.arrival_time);


        confirm_layout=(LinearLayout) view.findViewById(R.id.confirm_layout);
        confirm=(Button)view.findViewById(R.id.confirm);
        confirm_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConfirmed){
                    isConfirmed=false;
                    confirm.setText("CONFIRM");
                    otp_layout.setVisibility(GONE);
                    deactivating_overlay.setVisibility(View.INVISIBLE);
                } else{
                    isConfirmed=true;
                    confirm.setText("RE-VISIT DETAILS");
                    otp_layout.setVisibility(VISIBLE);
                    otp1.requestFocus();
                    deactivating_overlay.setVisibility(VISIBLE);
                }

            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConfirmed){
                    isConfirmed=false;
                    confirm.setText("CONFIRM");
                    otp_layout.setVisibility(GONE);
                    deactivating_overlay.setVisibility(View.INVISIBLE);
                } else{
                    isConfirmed=true;
                    confirm.setText("RE-VISIT DETAILS");
                    otp_layout.setVisibility(VISIBLE);
                    otp1.requestFocus();
                    deactivating_overlay.setVisibility(VISIBLE);
                }

            }
        });



        Map<String, String> deliveryRequestMap=new LinkedHashMap<>();
        if(refnum!=null) {
            deliveryRequestMap = formQueryforDelivery(refnum);
        }

        if(MainActivity.deliveryClient!=null){
            MainActivity.deliveryClient.getBooking(deliveryRequestMap).subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<List<com.shwetak3e.deliveryapp.model.BookingDetails>>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onNext(List<com.shwetak3e.deliveryapp.model.BookingDetails> booking_Details) {

                            delivery_item= booking_Details.get(0);

                            if(Constants.CustomerType.ONACCOUNT.getType().equalsIgnoreCase(booking_Details.get(0).getBooking().getPrincipalCustomer().getCustomerType())){
                                payment_status.setImageResource(R.drawable.ic_unpaid_onaccount);
                            }else if(booking_Details.get(0).getBookingCharge()>0|| booking_Details.get(0).getStorageCharge()>0){
                                payment_status.setImageResource(R.drawable.ic_unpaid);
                            }else{
                                payment_status.setImageResource(R.drawable.ic_paid);
                            }
                            total_payable_amnt.setText("Rs."+String.valueOf(booking_Details.get(0).getStorageCharge()+ booking_Details.get(0).getBookingCharge()));
                            storage_pay.setText("Rs."+String.valueOf(booking_Details.get(0).getStorageCharge()));
                            services_pay.setText("Rs."+String.valueOf(booking_Details.get(0).getBookingCharge()));

                            cstmer_type.setText(booking_Details.get(0).getBooking().getPrincipalCustomer().getCustomerType().toUpperCase());
                            company_name.setText(booking_Details.get(0).getBooking().getPrincipalCustomer().getName());
                            contact_person.setText(booking_Details.get(0).getBooking().getPrincipalCustomer().getContactPerson());
                            cstmer_mail.setText(booking_Details.get(0).getBooking().getPrincipalCustomer().getEmailID());
                            cstmer_phone.setText(booking_Details.get(0).getBooking().getPrincipalCustomer().getMobileNumber());


                            final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                            final SimpleDateFormat display_sdf=new SimpleDateFormat("dd/MM/yyyy KK:MM a",Locale.US);
                            Date date=new Date();
                            try {
                                date=sdf.parse(booking_Details.get(0).getDeliveryDate());
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }

                            arrival_time.setText(display_sdf.format(date));

                            shipmentAdapter=new ShipmentAdapter(getContext(), booking_Details.get(0).getBooking().getItems(), new ShipmentAdapter.OnItemClickListener() {
                                @Override
                                public void onClick(String shipment_id, int pos) {

                                }
                            });
                            shipment_list.setAdapter(shipmentAdapter);


                        }
                    });
        }


        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
    }



    void show_confirmation(){
        confirmationDialog=new Dialog(getContext(),R.style.MyDialogTheme);
        confirmationDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        confirmationDialog.getWindow().getAttributes().windowAnimations=R.style.DialogAnimation;
        confirmationDialog.setContentView(R.layout.delivery_confirmation_dialog);
        confirmationDialog.show();

    }




    class PhoneCallListener extends PhoneStateListener{
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
             if(TelephonyManager.CALL_STATE_IDLE==state){
                 Intent i=getContext().getPackageManager().getLaunchIntentForPackage(getContext().getPackageName());
                 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                 startActivity(i);
             }

        }
    }



    Map<String, String> formQueryforDelivery(String deliver_refnum){
        Map<String, String > queryDelivery=new HashMap<>();
        queryDelivery.put("refNum",deliver_refnum);
        queryDelivery.put("branchId", "1234");

        return  queryDelivery;

    }







}
