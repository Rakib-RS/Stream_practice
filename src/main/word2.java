package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class word2 {

	public static void main(String[] args) {
		String fileName="word3.txt";
		try {
			File inputFile = new File(fileName);
			Scanner in = new Scanner(inputFile);
			ArrayList<String> wordList = new ArrayList<>();
			while (in.hasNext()) {
				wordList.add(in.next());
			}
			Stream<String> list = wordList.stream();
			list.filter(w -> w.length()<5)
					.distinct()
					.forEach(s->System.out.println(s));;
			in.close();
			
			
		} 		

		catch (IOException e) {
			
		}
	}

}