package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Map<String, Integer> votes =new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
           
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int quantity =Integer.parseInt(fields[1]);
	
				if(votes.containsKey(name)) {
					int voting = votes.get(name);
					votes.put(name, quantity + voting);
				}else {
					votes.put(name, quantity);
				}
				line = br.readLine();
				
			}
			for (String key : votes.keySet()) {
				System.out.println(key +":" + votes.get(key));
			}
		} catch (IOException e){
			System.out.print("Error " + e.getMessage());
		
		
	}
        sc.close();

}
}