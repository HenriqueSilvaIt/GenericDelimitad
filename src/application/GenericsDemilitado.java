package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;
import services.CalculationService;

public class GenericsDemilitado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path =  "C:\\temp\\product.csv";
		
		List<Products> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String file =  br.readLine();
			while ( file != null) {
				String[] fields = file.split(",");
				list.add(new Products(fields[0], Double.parseDouble(fields[1])));
				file = br.readLine();
			}
			
			
			Products x = CalculationService.max(list);
			System.out.println("Most expansive: " + x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
