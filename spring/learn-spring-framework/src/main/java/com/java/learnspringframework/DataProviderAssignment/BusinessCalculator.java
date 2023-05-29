package com.java.learnspringframework.DataProviderAssignment;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculator {

  DataProvider dataProvider;

  public BusinessCalculator(DataProvider dataProvider) {
    this.dataProvider = dataProvider;
  }
  
  public int findMaxValue() {
    return Arrays.stream(dataProvider.provideData())
      .max()
      .orElse(0);
  }

}
