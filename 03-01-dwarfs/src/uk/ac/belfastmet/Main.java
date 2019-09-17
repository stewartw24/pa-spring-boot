/**
 * 
 */
package uk.ac.belfastmet;

import java.util.ArrayList;

/**
 * @author ste19171854
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello world");
		
		ArrayList<String> dwarfs = new ArrayList<String>(); 
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Grumpy");
		dwarfs.add("Doc");
		
		System.out.println("The seven dwarfs are: ");
		
		for (String dwarf: dwarfs) {
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fill");
		dwarves.add("Kill");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Oin"); 
		dwarves.add("Ori");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		for (String dwarf: dwarves) {
			System.out.println(dwarf);
		}
		
	}

}
