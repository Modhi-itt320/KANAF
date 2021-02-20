package com.app.kanaf.Modle;

public class Associations {

    private  String association_name ;
    private  String address_name ;
    private  String license_number ;
    private  String type_activity ;

    public Associations(String association_name, String address_name, String license_number, String type_activity) {
        this.association_name = association_name;
        this.address_name = address_name;
        this.license_number = license_number;
        this.type_activity = type_activity;
    }

    public String getAssociation_name() {
        return association_name;
    }

    public void setAssociation_name(String association_name) {
        this.association_name = association_name;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getType_activity() {
        return type_activity;
    }

    public void setType_activity(String type_activity) {
        this.type_activity = type_activity;
    }
}
