package services;

import java.util.ArrayList;
import java.util.List;

public class CalculationService {
	
	public static <Teste extends Comparable<Teste>> Teste max(List<Teste> list) {
		if ( list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		else {
		Teste max = list.get(0);
		for (Teste item: list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
		}
		
		
	}
}
