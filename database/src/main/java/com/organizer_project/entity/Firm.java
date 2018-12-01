package com.organizer_project.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Firm {
    private int firmId;
    private String name;
    private String email;
    private String phone;
    private String adress;

    @Id
    @Column(name = "firm_id", nullable = false)
    public int getFirmId() {
        return firmId;
    }

    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "adress", nullable = false, length = 100)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Firm firm = (Firm) o;

        if (firmId != firm.firmId) return false;
        if (name != null ? !name.equals(firm.name) : firm.name != null) return false;
        if (email != null ? !email.equals(firm.email) : firm.email != null) return false;
        if (phone != null ? !phone.equals(firm.phone) : firm.phone != null) return false;
        if (adress != null ? !adress.equals(firm.adress) : firm.adress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firmId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
}
