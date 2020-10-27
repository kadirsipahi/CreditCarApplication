package com.application.model;

import com.application.model.core.BaseModel;

import javax.persistence.*;

@Entity
@Table(name = "t_credit")
public class Credit extends BaseModel {

    @Column(name = "credit_price")
    private int creditPrice;

    @Column(name = "credit_month_period")
    private int creditMonthPeriod;

    public Credit() {
    }

    public int getCreditPrice() {
        return creditPrice;
    }

    public void setCreditPrice(int creditPrice) {
        this.creditPrice = creditPrice;
    }

    public int getCreditMonthPeriod() {
        return creditMonthPeriod;
    }

    public void setCreditMonthPeriod(int creditMonthPeriod) {
        this.creditMonthPeriod = creditMonthPeriod;
    }
}
