package main;
import java.io.*;

public class SearchThe {
     public static void main(String args[]) {
             try {
                String s1= "the";

                BufferedReader bf = new BufferedReader(new FileReader("/home/cseru/Desktop/Rakib/Java/Excersice/test.txt"));

                int linecount = 0;
                String line;

                	while (( line = bf.readLine()) != null){
                			linecount++;
                			int indexfound = line.indexOf(s1);

                			if (indexfound > -1) 
                			{
                				System.out.println(line);
                			}
                	}
                	bf.close();
             }
             catch (IOException e) {
            	 	System.out.println("IO Error Occurred: " + e.toString());
             }
     }
}
