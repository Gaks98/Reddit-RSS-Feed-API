package com.moringaschool.redditrssapi;

import com.moringaschool.redditrssapi.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedApi {
    String BASE_URL = "https://www.reddit.com/r/";

    @GET("earthporn/.rss")
    Call<Feed> getFeed();



}
