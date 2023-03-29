package com.spotify;

import com.ibm.icu.text.Transliterator;

public class Main {
  public static void main(String[] args) {

    Transliterator transliterator = Transliterator.getInstance("Any-Latin");
    System.out.println(transliterator.transliterate("दिल बेचारा"));
  }
}
