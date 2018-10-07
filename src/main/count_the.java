package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class count_the {
	public static void main(String[] args){

	    String input = "file.txt";
	    try (Stream<String> words = Files.lines(Paths.get(input))){
	    	
	        long count = words.filter( w -> w.contains("the"))
	                .count();
	        System.out.println(count);
	    } catch (IOException e){

	    }
	}

}
