package com.learnings.junit;

//Java program to demonstrate Tagging and Filtering
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggedTests {

  @Test
  @Tag("dev")
  void method1() {
      System.out.println("Needs to be executed on dev only");
  }

  @Test
  @Tag("prod")
  void method2() {
      System.out.println("Needs to be executed on prod only");
  }

  @Test
  @Tag("dev")
  @Tag("prod")
  void method3() {
      System.out.println("Needs to be executed on both dev and prod");
  }
}
