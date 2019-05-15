package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class Checkpoint {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String,String>(); 
	map.put("Eat", "Comer");
	map.put("After", "Despues");
	map.put("Run", "Correr");
	map.put("Drink", "Beber");
	map.put("Need to", "Necesitar");
	for(int i =0; i<map.size();i++) {
		System.out.print(map.keySet().toArray()[i]+ " is ");
		System.out.println(map.values().toArray()[i]+ " in spanish");
	}
}
}
