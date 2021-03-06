package org.agoncal.fascicle.quarkus.core.lifecyclemainide;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

// tag::adocSnippet[]
@QuarkusMain
public class ConvenientMain {

  public static void main(String... args) {
    System.out.println("Convenient to run inside an IDE");
    Quarkus.run(args);
  }
}
// end::adocSnippet[]
