package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class FiatMoney {
//Creating fields. From data.sql file:
  //    coinid INT,
  //    name VARCHAR(255),
  //    nameplural VARCHAR(255),
  //    value DOUBLE,
  //    quantity INT)

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long coinid;
  private String name;
  private String nameplural;
  private double value;
  private int quantity;

  public FiatMoney() {
    //default constructor
  }

  public FiatMoney(String name, String nameplural, double value, int quantity) {
    this.name = name;
    this.nameplural = nameplural;
    this.value = value;
    this.quantity = quantity;
  }

  //getters and setters
  public long getCoinid() {
    return coinid;
  }

  public void setCoinid(int coinid) {
    this.coinid = coinid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameplural() {
    return nameplural;
  }

  public void setNameplural(String nameplural) {
    this.nameplural = nameplural;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  //toString()
  @Override
  public String toString() {
    return "FiatMoney{" +
        "coinid=" + coinid +
        ", name='" + name + '\'' +
        ", nameplural='" + nameplural + '\'' +
        ", value=" + value +
        ", quantity=" + quantity +
        '}';
  }
}
