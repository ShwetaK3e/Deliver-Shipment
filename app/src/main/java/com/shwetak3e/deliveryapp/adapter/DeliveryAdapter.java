package com.shwetak3e.deliveryapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shwetak3e.deliveryapp.R;
import com.shwetak3e.deliveryapp.model.Delivery;
import com.shwetak3e.deliveryapp.utilities.Constants;

import java.util.LinkedList;
import java.util.List;


public class DeliveryAdapter extends RecyclerView.Adapter<DeliveryAdapter.ViewHolder> {

    List<Delivery> deliveryItems=new LinkedList<>();
    Context context;
    OnItemClickListener onItemClickListener;

    public DeliveryAdapter(Context context, List<Delivery> bookingItems, OnItemClickListener onItemclickListener){
        this.deliveryItems=bookingItems;
        this.context=context;
        this.onItemClickListener=onItemclickListener;
    }

    @Override
    public DeliveryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.delivery_list_grid,null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DeliveryAdapter.ViewHolder holder, final int position) {

        holder.refnum.setText(deliveryItems.get(position).getRefNum());
        holder.itemCount.setText(String.valueOf(deliveryItems.get(position).getItemCount()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onClick(deliveryItems.get(position).getRefNum(), position);
            }
        });

        if(Constants.PaymentStatus.INTERBRANCH.getStatus().equalsIgnoreCase(deliveryItems.get(position).getPaymentType())|| Constants.PaymentStatus.RECEIVER_TBB.getStatus().equalsIgnoreCase(deliveryItems.get(position).getPaymentType())|| Constants.PaymentStatus.SENDER_TBB.getStatus().equalsIgnoreCase(deliveryItems.get(position).getPaymentType())){
            holder.paymentType.setImageResource(R.drawable.ic_unpaid_onaccount);
            holder.amountDue.setTextColor(context.getResources().getColor(R.color.colorPrimary));
        }else if(Constants.PaymentStatus.TOPAY.getStatus().equalsIgnoreCase(deliveryItems.get(position).getPaymentType())){
            holder.paymentType.setImageResource(R.drawable.ic_unpaid);
            holder.amountDue.setTextColor(context.getResources().getColor(R.color.red));
        }else{
            holder.paymentType.setImageResource(R.drawable.ic_paid);
            holder.amountDue.setTextColor(context.getResources().getColor(R.color.light_grey));
        }

        holder.amountDue.setText("Rs."+String.valueOf(deliveryItems.get(position).getAmountDue()));

    }

    @Override
    public int getItemCount() {
        return deliveryItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        ImageView paymentType;
        TextView refnum;
        TextView itemCount;
        TextView amountDue;




        public ViewHolder(View itemView) {
            super(itemView);
            paymentType=(ImageView)itemView.findViewById(R.id.payment_status);
            refnum=(TextView)itemView.findViewById(R.id.booking_id);
            itemCount=(TextView)itemView.findViewById(R.id.shipment_count);
            amountDue=(TextView)itemView.findViewById(R.id.amountDue);
        }
    }

    public interface OnItemClickListener{
        void onClick(String shipment_id, int pos);
    }
}
