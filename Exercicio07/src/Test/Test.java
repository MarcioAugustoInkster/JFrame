package Test;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Double> salario = new ArrayList<>();
		
		salario.add(1600.0);
		salario.add(1300.0);
		salario.add(1500.0);
		salario.add(1000.0);
		salario.add(1100.0);
		salario.add(1800.0);
		salario.add(1700.0);
		salario.add(2000.0);
		salario.add(1900.0);
		salario.add(1400.0);
		
		for (int i = 0; i < salario.size(); i++) {
			if (i % 2 == 0) {
				System.out.println("[" + i + "] " + salario.get(i));
			}
		}
	}
}
