package com.undead4j;

import com.undead4j.template.PageTemplate;
import com.undead4j.template.WrapperTemplate;
import com.undead4j.view.RouteMatcher;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Config {
  public PageTemplate pageTemplate;
  public WrapperTemplate wrapperTemplate;
  public RouteMatcher routeMatcher;
  private final Map<String, Class> viewRegistry = new ConcurrentHashMap<>();

}