package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Carlos");
		list.add("Daniel");
		list.add("Jonas");
		list.add("Daniela");

		list.add(2, "Marco");
		System.out.println(list.size());

		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("-----------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String nome : list) {
			System.out.println(nome);
		}
		System.out.println("Index of: " + list.indexOf("Daniel"));
		
		List<String> result = list.stream().filter(x->x.charAt(0)=='D').collect(Collectors.toList());
		for (String nomes : result) {
			System.out.println(nomes);
		}

		System.out.println("-----------------------");
		
		String name = list.stream().filter(x-> x.charAt(0)=='D').findFirst().orElse(null);
		System.out.println(name);
		
	}
}