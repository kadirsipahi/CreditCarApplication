package com.application.model;

import com.application.model.address.BusinessAddress;
import com.application.model.address.SelfAddress;
import com.application.model.core.BaseModel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_customer")
public class Customer extends BaseModel {

    @Column(name = "name")
    private String name;

    @Column(name = "sur_name")
    private String surName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "car_plate")
    private String carPlate;

    @OneToOne
    @JoinColumn(name = "id")
    private Credit credit;

    @Column(name = "new_id_cart")
    private boolean newIDCart;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "birth_date")
    private Date birthDate;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "id_cart_end_date")
    private Date IDCartEndDate;

    @OneToOne
    @JoinColumn(name = "id")
    private SelfAddress selfAddress;

    @OneToOne
    @JoinColumn(name = "id")
    private BusinessAddress businessAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "home_type")
    private HomeType homeType;

    @Column(name = "business_mode")
    private String businessMode;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "tax_office")
    private String taxOffice;

    @Column(name = "tax_number")
    private String taxNumber;

    @Column(name = "job")
    private String job;

    @Column(name = "salary")
    private int salary;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public boolean isNewIDCart() {
        return newIDCart;
    }

    public void setNewIDCart(boolean newIDCart) {
        this.newIDCart = newIDCart;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getIDCartEndDate() {
        return IDCartEndDate;
    }

    public void setIDCartEndDate(Date IDCartEndDate) {
        this.IDCartEndDate = IDCartEndDate;
    }

    public BusinessAddress getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(BusinessAddress businessAddress) {
        this.businessAddress = businessAddress;
    }

    public SelfAddress getSelfAddress() {
        return selfAddress;
    }

    public void setSelfAddress(SelfAddress selfAddress) {
        this.selfAddress = selfAddress;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    public String getBusinessMode() {
        return businessMode;
    }

    public void setBusinessMode(String businessMode) {
        this.businessMode = businessMode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
