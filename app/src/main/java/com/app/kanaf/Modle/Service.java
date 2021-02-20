package com.app.kanaf.Modle;

public class Service {

    private String name_Service ;
    private double lat ;
    private double lng ;

    public Service(String name_Service, double lat, double lng) {
        this.name_Service = name_Service;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName_Service() {
        return name_Service;
    }

    public void setName_Service(String name_Service) {
        this.name_Service = name_Service;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
