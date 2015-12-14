package net.aung.sunshine.network;

import net.aung.sunshine.data.responses.WeatherStatusListResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by aung on 12/14/15.
 */
public interface OWMApi {

    @GET("/forecast/daily")
    void getDailyForecast(
            @Query("q") String city,
            @Query("appid") String apiKey,
            @Query("mode") String responseFormat,
            @Query("units") String responseUnit,
            @Query("cnt") String responseCount,
            Callback<WeatherStatusListResponse> response
    );
}
