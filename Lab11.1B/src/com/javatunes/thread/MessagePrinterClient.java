/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {

    //MessagePrinter printer = new MessagePrinter("Roses are red");
    Thread messagePrinter = new Thread(new MessagePrinter("Roses are red"));
    messagePrinter.start();
    MessagePrinter printer1 = new MessagePrinter("violets are blue"); //, 100, 300
    Thread messagePrinter2 = new Thread(printer1);
    messagePrinter2.start();
    MessagePrinter printer2 = new MessagePrinter("sugar is sweet");
    Thread messagePrinter3 = new Thread(printer2);
    messagePrinter3.start();
    MessagePrinter printer3 = new MessagePrinter("and so are you");
    Thread messagePrinter4 = new Thread(printer3);
    messagePrinter4.start();
  }
}
