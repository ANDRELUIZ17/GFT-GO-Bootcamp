package com.dio.base;

public class Order {
  private final String code;
  private int totalValue;

  private String[] itens;

  public Order (String code, int totalValue) {
    this.code = code;
    this.totalValue = totalValue;
  }

  public void printItens() {
    // int i = 0;
    // while (i < itens.length) {
    //   System.out.println(itens[i]);
    //   i++;
    // }

    // do {
    //   System.out.println(itens[i]);
    //   i++;
    // } while (i < itens.length);

    // for (int i = 0; i < itens.length; i++) {
    //   System.out.println(itens[i]);
    // }

    for (String i : itens) {
      System.out.println(i);
    }

    }
  }

  // Comentário de uma linha
  
/** Esse é um comentário em bloco para informar que esse atributo representa o codigo do pedido */

