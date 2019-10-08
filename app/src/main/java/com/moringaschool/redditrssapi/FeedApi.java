package com.moringaschool.redditrssapi;

import com.moringaschool.redditrssapi.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FeedApi {
    String BASE_URL = "https://www.reddit.com/r/";

    //Non-static feed name
    @GET("{feed_name}/.rss")
    Call<Feed> getFeed(@Path("feed_name") String feed_name);


//    //static
//    @GET("earthporn/.rss")
//    Call<Feed> getFeed();



}
