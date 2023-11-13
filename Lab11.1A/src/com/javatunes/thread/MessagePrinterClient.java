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

    MessagePrinter printer = new MessagePrinter("Roses are red");
    printer.start();
    MessagePrinter printer1 = new MessagePrinter("violets are blue");
    printer1.start();
    MessagePrinter printer2 = new MessagePrinter("sugar is sweet");
    printer2.start();
    MessagePrinter printer3 = new MessagePrinter("and so are you");
    printer3.start();
  }
}
