package com.qualogy.example.restapi;

import java.time.Instant;

class WeatherInfo {
  private String forecast = "It is gonna rain!";
  private long timeInMilliseconds = 0;

  WeatherInfo(long l) {
    timeInMilliseconds = l;
  }

  public String getForecast() {
    return forecast;
  }

  public long getTimeInMilliseconds() {
    return timeInMilliseconds;
  }

  @Override
  public String toString() {
    return "You asked for the weather on " + Instant.ofEpochMilli(timeInMilliseconds).toString()
        + " and I can tell you that... " + forecast;
  }
}
