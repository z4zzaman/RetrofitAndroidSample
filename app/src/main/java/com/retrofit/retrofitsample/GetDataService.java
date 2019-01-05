package com.retrofit.retrofitsample;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 1/5/2019 at 2:19 PM.
 *  * Email : zzaman08@gmail.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 1/5/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
