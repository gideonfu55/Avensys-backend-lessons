package com.java.learnspringframework.DataProviderAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FirstDataCollector implements DataProvider {

  @Override
  public int[] provideData() {
    return new int[] {10, 20, 30, 40, 50};
  }

}
