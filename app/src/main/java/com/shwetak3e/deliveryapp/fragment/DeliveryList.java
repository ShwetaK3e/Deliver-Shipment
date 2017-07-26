package com.shwetak3e.deliveryapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.shwetak3e.deliveryapp.MainActivity;
import com.shwetak3e.deliveryapp.R;
import com.shwetak3e.deliveryapp.adapter.DeliveryAdapter;
import com.shwetak3e.deliveryapp.model.Delivery;
import com.shwetak3e.deliveryapp.utilities.Constants;
import com.shwetak3e.deliveryapp.utilities.UtilityFunc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class DeliveryList extends Fragment {


    private static final String TAG =DeliveryList.class.getSimpleName() ;



    boolean truck_details_visible=false;
    TextView title;
    ImageButton review_list_btn;
    ImageButton search;
    Boolean searchMode=false;
    EditText search_text;
    private RecyclerView delivery_list;
    DeliveryAdapter deliveryAdapter;
    List<Delivery> delivery_items_default=new LinkedList<>();







    public static DeliveryList newInstance() {
        DeliveryList fragment = new DeliveryList();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_items_to_be_delivered_list, container,false);






        title=(TextView)view.findViewById(R.id.title);

        search=(ImageButton)view.findViewById(R.id.search_list);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!searchMode){
                    searchMode=true;
                    title.setVisibility(View.INVISIBLE);
                    search_text.setVisibility(View.VISIBLE);
                    search_text.setSelection(0);
                    search_text.setText("");
                }else{
                    searchMode=false;
                    deliveryAdapter=new DeliveryAdapter(getActivity(),delivery_items_default, new DeliveryAdapter.OnItemClickListener() {
                        @Override
                        public void onClick(String booking_id, int position) {
                            Intent i=new Intent(getActivity(), MainActivity.class);
                            i.putExtra(Constants.REFNUM,delivery_items_default.get(position).getRefNum());
                            i.putExtra("Activity","BOOKING_DETAILS");
                            startActivity(i);
                        }
                    });
                    delivery_list.setAdapter(deliveryAdapter);
                    title.setVisibility(View.VISIBLE);
                    search_text.setVisibility(View.INVISIBLE);
                }
            }
        });
        search_text=(EditText)view.findViewById(R.id.search_text);
        search_text.setVisibility(View.INVISIBLE);
        search_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String searchText = s.toString().toUpperCase();
                if (searchText.length() == 0) {

                    deliveryAdapter = new DeliveryAdapter(getActivity(), delivery_items_default, new DeliveryAdapter.OnItemClickListener() {
                        @Override
                        public void onClick(String booking_id, int position) {
                            Intent i=new Intent(getActivity(), MainActivity.class);
                            i.putExtra(Constants.REFNUM,delivery_items_default.get(position).getRefNum());
                            i.putExtra("Activity","BOOKING_DETAILS");
                            startActivity(i);
                        }
                    });
                    delivery_list.setAdapter(deliveryAdapter);
                } else {

                    final List<Delivery> booking_item_search=new LinkedList<>();
                    for (Delivery item : delivery_items_default) {
                        if (item.getRefNum().contains(searchText)) {
                            booking_item_search.add(item);
                        }
                    }

                    deliveryAdapter = new DeliveryAdapter(getActivity(), booking_item_search, new DeliveryAdapter.OnItemClickListener() {
                        @Override
                        public void onClick(String shipment_id, int position) {
                            Intent i=new Intent(getActivity(), MainActivity.class);
                            i.putExtra("Activity","BOOKING_DETAILS");
                            i.putExtra(Constants.REFNUM,booking_item_search.get(position).getRefNum());
                            startActivity(i);
                        }
                    });
                    delivery_list.setAdapter(deliveryAdapter);
                }
            }
        });
        delivery_list=(RecyclerView)view.findViewById(R.id.shipmemt_list);
        delivery_list.setLayoutManager(new GridLayoutManager(getActivity(),1));

        if(MainActivity.deliveryClient!=null){
            Log.i(TAG, "client is starting");
            MainActivity.deliveryClient.getBookings(null, null, UtilityFunc.getStringfromSharedPreference(getActivity(),Constants.BRANCH_ID), null,null).subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<List<Delivery>>() {
                        @Override
                        public void onCompleted() {
                        }

                        @Override
                        public void onError(Throwable e) {
                        }

                        @Override
                        public void onNext(List<Delivery> deliveries) {
                            final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                            Collections.sort(deliveries, new Comparator<Delivery>() {
                                @Override
                                public int compare(Delivery o1, Delivery o2) {
                                    try {
                                        return (int)(sdf.parse(o1.getDeliveryDate()).getTime()-sdf.parse(o2.getDeliveryDate()).getTime());
                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }
                                    return 0;
                                }

                            });

                            for(Delivery delivery:deliveries){
                                if(Constants.Deliverystatus.READY.getStatus().equalsIgnoreCase(delivery.getDeliveryStatus())){
                                    delivery_items_default.add(delivery);
                                }
                            }

                            deliveryAdapter=new DeliveryAdapter(getActivity(),delivery_items_default, new DeliveryAdapter.OnItemClickListener() {
                                @Override
                                public void onClick(String shipment_id, int position) {
                                    Intent i=new Intent(getActivity(), MainActivity.class);
                                    i.putExtra("Activity","BOOKING_DETAILS");
                                    i.putExtra(Constants.REFNUM,delivery_items_default.get(position).getRefNum());
                                    startActivity(i);
                                }
                            });
                            delivery_list.setAdapter(deliveryAdapter);

                        }
                    });

        }else{
            Log.i(TAG, "client is null");
        }



        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
    }















}
