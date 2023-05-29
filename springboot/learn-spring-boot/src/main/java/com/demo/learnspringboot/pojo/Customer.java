package com.demo.learnspringboot.pojo;

public class Customer {
  
  private String id;
  private String name;
  private String billAddress;
  private double amount;

  public Customer(String id, String name, String billAddress, int amount) {
    this.id = id;
    this.name = name;
    this.billAddress = billAddress;
    this.amount = amount;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBillAddress() {
    return this.billAddress;
  }

  public void setBillAddress(String billAddress) {
    this.billAddress = billAddress;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

}
