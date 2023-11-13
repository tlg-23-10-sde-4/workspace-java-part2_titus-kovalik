/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

// TODO: extend the Thread class
public class MessagePrinter implements Runnable {

  private final String message;
  private final int iterations = 10;
  private final int sleepInterval = 1000;

  public MessagePrinter(String message) {
    this.message = message;
    // TODO: set the thread name [important when debugging]
    Thread violets = new Thread("violets");

  }

//  public MessagePrinter(String message, int i, int i1) {
//  }

  /**
   * TODO: implement run() as follows:
   * It should loop 10 times, printing the 'message' field to stdout,
   * then pausing for some interval (in millis) that you choose.
   * 
   * Use a try/catch to call Thread.sleep(interval) for the pause.
   * The sleep() method throws InterruptedException, which you need to catch.
   * You can either leave the catch block empty, or print the exception to stdout.
   */
  @Override
  public void run() {
    for (int i = 0; i < iterations; i++) {
      System.out.println(Thread.currentThread() + ":" + message);
      try {
        Thread.sleep(sleepInterval);
      } catch (InterruptedException e) {
        System.out.println("broked");
      }
    }
  }
}