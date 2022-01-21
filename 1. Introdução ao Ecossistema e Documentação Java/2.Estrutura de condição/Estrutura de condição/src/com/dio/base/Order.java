package com.dio.base;

public class Order {
  private final String code;
  private final int totalValue;

  public Order (String code, int totalValue) {
    this.code = code;
    this.totalValue = totalValue;
  }

  public double calculateFree () {
    switch (totalValue) {
      case 100:
      return totalValue * 0.99;

      case 200: 
        return totalValue * 1.99;
    }
    return totalValue;
  }

}
