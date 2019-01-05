package com.retrofit.retrofitsample;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 1/5/2019 at 2:14 PM.
 *  * Email : zzaman08@gmail.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 1/5/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
