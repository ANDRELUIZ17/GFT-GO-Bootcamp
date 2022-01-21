package com.dio.base;

import java.math.BigDecimal;
/**
 * @author André luiz Silva
 * @version 1.0
 * @see 
 * @since Release 1.0.0
 */
public class Order {
  // Representa o código do pedido
  private final String code;
  private final BigDecimal totalValue;

  
  /**
   * Construtor da classe Order
   * 
   * @param code   código do pedido
   * @param totalValue  valor total do pedido
   */
  public Order (String code, BigDecimal totalValue) {
    this.code = code;
    this.totalValue = totalValue;
  }
  /**
   * Calcula as taxas de acordo com o valor total do pedido. Se o valor total for menor que R$ 100,00,
   * 
   * @return código do pedido
   * @trhows RuntimeException se o código do pedido for nulo
   */
  public BigDecimal calculateFree() throws Exception {
    if (totalValue.compareTo(BigDecimal.ZERO) < 0) {
      throw new Exception("Total value cannot be negative");
    }
    return totalValue.multiply(BigDecimal.valueOf(0.1));
  }
}
