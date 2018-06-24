/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana02.service;

import com.globant.bootcamp.semana02.model.Forecast;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
@Path("/weatherService")
@Consumes("application/json")
@Produces("application/json")
public class WeatherService {

   

    @GET
    @Path("/weather")
    public List<Forecast> get3DayForecast() {

        ArrayList<Forecast> forecast;

        forecast = new ArrayList<>();
        Forecast day1 = new Forecast();
        day1.setCode(34);
        day1.setDate("22 June 2018");
        day1.setDay("Friday");
        day1.setHigh(65);
        day1.setLow(42);
        day1.setWeatherDescription("Partly Cloudy");
        forecast.add(day1);

        Forecast day2 = new Forecast();
        day2.setCode(34);
        day2.setDate("23 Jun 2018");
        day2.setDay("Saturday");
        day2.setHigh(62);
        day2.setLow(45);
        day2.setWeatherDescription("Mostly Sunny");
        forecast.add(day2);

        Forecast day3 = new Forecast();
        day3.setCode(34);
        day3.setDate("24 June 2018");
        day3.setDay("Sunday");
        day3.setHigh(50);
        day3.setLow(39);
        day3.setWeatherDescription("Mostly Sunny");
        forecast.add(day3);

        return forecast;
    }

}
