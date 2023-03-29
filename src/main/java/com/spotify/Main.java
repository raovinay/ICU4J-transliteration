package com.spotify;

import com.ibm.icu.text.Transliterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Transliterator transliterator = Transliterator.getInstance("Any-Latin");
    File input = new File("src/main/resources/hindi.txt");
    System.out.println(input.getAbsolutePath());
    File output = new File("src/main/resources/hindi-transliterated.txt");
    try (Scanner sc = new Scanner(input);
        PrintWriter printer = new PrintWriter(output)) {
      while (sc.hasNextLine()) {
        String s = sc.nextLine();
        printer.println(transliterator.transliterate(s));
      }
      printer.flush();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
