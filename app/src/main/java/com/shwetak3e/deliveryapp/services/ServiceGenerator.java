package com.shwetak3e.deliveryapp.services;

import com.shwetak3e.deliveryapp.model.BookingDetails;
import com.shwetak3e.deliveryapp.model.ConfirmDelivery;
import com.shwetak3e.deliveryapp.model.Delivery;
import com.shwetak3e.deliveryapp.utilities.Constants;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


/**
 * Created by cas on 21-07-2017.
 */

public class ServiceGenerator {
    private static String BASE_URL="http://192.168.0.105:3000/";
    //private static final String BASE_URL= Constants.BASE_URL;

    private static OkHttpClient.Builder okHttpClientBuilder=new OkHttpClient.Builder();
    private  static OkHttpClient okHttpClient =new OkHttpClient();

    private static Retrofit.Builder builder=new Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(BASE_URL);

    private static Retrofit retrofit=builder.build();



    public static <T> T createService( Class<T> serviceClass){

        return createService(serviceClass,null);
    }



    private static void buildHttpInterceptor(final String authToken){
        if(authToken!=null){

            okHttpClientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original=chain.request();
                    Request.Builder requestBuilder=original.newBuilder().addHeader("Authorization","Bearer "+ authToken);
                    Request request=requestBuilder.build();
                    return  chain.proceed(request);
                }
            });
            okHttpClient =okHttpClientBuilder.build();
        }
    }


    public static <T> T createService(Class<T> serviceClass, final String authToken){
        if(authToken!=null){
            buildHttpInterceptor(authToken);
        }
        T service = retrofit.create(serviceClass);
        okHttpClient=new OkHttpClient();
        return service;
    }


    public interface DeliveryClient{


        @GET(Constants.DELIVERY_ALL)
        rx.Observable<List<Delivery>>getBookings(@Query("refnum")  String refnum,@Query("sourceBranchId") String sourceBranchId , @Query("destinationBranchId")String destinationBranchId,@Query("consigneeName") String consigneeName, @Query("pendingOnly") String pendingOnly);


        // Change it BookingDetails from List
        @GET(Constants.DELIVERY)
        rx.Observable<List<BookingDetails>> getBooking(@QueryMap Map<String, String> queries );


        // Change the URL to delivery
        @Headers("Content-Type: application/json")
        @POST(Constants.OTP)
        rx.Observable<BookingDetails> updateBooking(@Body ConfirmDelivery confirmDelivery);





    }


}
