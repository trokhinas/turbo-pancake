package com.organizer_project.DTO;

public class FirmDTO {

    private int firmId;
    private String name;
    private String email;
    private String phone;
    private String adress;

    //FirmId
    public int getFirmId() {
        return firmId;
    }
    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    //FirmName
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Adress
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
