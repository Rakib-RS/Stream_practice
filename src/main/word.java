package main;
import java.util.Scanner;
import java.io.*;
 
public class word {
  public static void main(String[] args) throws IOException {
 
    File file = new File("/home/cseru/Desktop/Rakib/Java/Excersice/words.txt");
    Scanner input = new Scanner(file); 
 
    int count = 0;
    String s1="the"; 
    while (input.hasNext()) {
      String word  = input.next();
      //System.out.println(word);
      if(s1.equals(word)) {
      count = count + 1;
      	//System.out.println(word);
      }
    }
    System.out.println("Word count: " + count);
  }
}
