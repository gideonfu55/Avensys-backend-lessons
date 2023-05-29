package com.demo.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.learnspringboot.configuration.CurrencyServiceConfiguration;

@RestController
public class CurrencyServiceController {
  
  @Autowired
  private CurrencyServiceConfiguration config;

  @RequestMapping("/currency-config")
  public CurrencyServiceConfiguration retreiveConfig() {
    return config;
  }
}
