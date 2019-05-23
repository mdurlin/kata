package com.test.kata;

public class DnaStrand {
  public static String makeComplement(String dna) {
    StringBuilder complement = new StringBuilder();
    
    for(int i = 0; i < dna.length(); i++) {
      char myChar = dna.charAt(i);
      switch(myChar) {
        case 'A':
          complement.append("T");
          break;
        case 'T':
          complement.append("A");
          break;
        case 'C':
          complement.append("G");
          break;
        case 'G':
          complement.append("C");
          break;
      }
    }
    
    return complement.toString();
  }
}