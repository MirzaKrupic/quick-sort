package ds.quicksort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IPAddress[] ipAddresses = new IPAddress[10000];
		int counter=0;
		Scanner scanner = new Scanner(new File("C:\\Users\\krupi\\Desktop\\hw\\IP-COUNTRY-REGION-CITY-SHUFFLED.csv"));
		while(counter < 10000) {
			String[] words = scanner.nextLine().split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");						
			ipAddresses[counter] = new IPAddress(Long.parseLong(words[0].substring(1, words[0].length()-1)), Long.parseLong(words[1].substring(1, words[1].length()-1)), words[2].substring(1, words[2].length()-1), words[3].substring(1, words[3].length()-1), words[4].substring(1, words[4].length()-1), words[5].substring(1, words[5].length()-1));
			counter++;
		}
		
	    QuickSort.sort(ipAddresses);
		
		File file = new File("C:\\Users\\krupi\\Desktop\\hw\\IP-COUNTRY-REGION-CITY-QS.csv");
		FileWriter fw = new FileWriter(file);
		counter=0;

		while(counter < 10000) {
			String s = "\"" + ipAddresses[counter].getIpFrom() + "\",\"" + ipAddresses[counter].getIpTo() + "\",\"" +ipAddresses[counter].getCountryCode() + "\",\"" + ipAddresses[counter].getCountryName() +"\",\"" +ipAddresses[counter].getRegionName() +"\",\"" + ipAddresses[counter].getCityName()+ "\"\n";
			fw.write(s);
			counter++;
		}fw.close();


		System.out.println("Operation done!");
		

	}

}
