package com.java.learnspringframework.DataProviderAssignment;

import org.springframework.stereotype.Component;

@Component
public class SecondDataCollector implements DataProvider {

  @Override
  public int[] provideData() {
    return new int[] {1, 3, 5, 7, 9};
  }
  
}
