package com.example.movieapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TmdbApi {
    @GET("movie/{id}")
    Call<MovieResponse> getMovieById(@Path("id") int movieId, @Query("api_key") String apiKey);
}
