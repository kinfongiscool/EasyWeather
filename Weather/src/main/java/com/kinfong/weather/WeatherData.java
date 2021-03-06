package com.kinfong.weather;

/**
 * Created by Kin on 8/27/13.
 */
public class WeatherData {

    private String latitude = "";
    private String longitude = "";
    private String currentlyTime = "";
    private String currentlySummary = "";
    private String currentlyIcon = "";
    private String currentlyTemperature = "";
    private String minutelySummary = "";
    private String minutelyIcon = "";
    private String hourlySummary = "";
    private String hourlyIcon = "";
    private String dailySummary = "";
    private String dailyIcon = "";
    private String highTemp = "";
    private String lowTemp = "";

    public WeatherData() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCurrentlyTime() {
        return currentlyTime;
    }

    public String getCurrentlyTemperature() {
        return formatTemp(currentlyTemperature);
    }

    public void setCurrentlyTemperature(String currentlyTemperature) {
        this.currentlyTemperature = currentlyTemperature;
    }

    public void setCurrentlyTime(String currentlyTime) {
        this.currentlyTime = currentlyTime;
    }

    public String getCurrentlySummary() {
        return currentlySummary;
    }

    public void setCurrentlySummary(String currentlySummary) {
        this.currentlySummary = currentlySummary;
    }

    public String getCurrentlyIcon() {
        return currentlyIcon;
    }

    public void setCurrentlyIcon(String currentlyIcon) {
        this.currentlyIcon = currentlyIcon;
    }

    public String getMinutelySummary() {
        return minutelySummary;
    }

    public void setMinutelySummary(String minutelySummary) {
        this.minutelySummary = minutelySummary;
    }

    public String getMinutelyIcon() {
        return minutelyIcon;
    }

    public void setMinutelyIcon(String minutelyIcon) {
        this.minutelyIcon = minutelyIcon;
    }

    public String getHourlySummary() {
        return hourlySummary;
    }

    public void setHourlySummary(String hourlySummary) {
        this.hourlySummary = hourlySummary;
    }

    public String getHourlyIcon() {
        return hourlyIcon;
    }

    public void setHourlyIcon(String hourlyIcon) {
        this.hourlyIcon = hourlyIcon;
    }

    public String getDailySummary() {
        return dailySummary;
    }

    public void setDailySummary(String dailySummary) {
        this.dailySummary = dailySummary;
    }

    public String getDailyIcon() {
        return dailyIcon;
    }

    public void setDailyIcon(String dailyIcon) {
        this.dailyIcon = dailyIcon;
    }

    public String getHighTemp() {
        return formatTemp(highTemp);
    }

    public void setHighTemp(String highTemp) {
        this.highTemp = highTemp;
    }

    public String getLowTemp() {
        return formatTemp(lowTemp);
    }

    public void setLowTemp(String lowTemp) {
        this.lowTemp = lowTemp;
    }

    private String formatTemp(String input) {
        return String.valueOf(Math.round(Double.valueOf(input))) + "\u00b0";
    }
}
