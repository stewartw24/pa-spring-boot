/**
 * 
 */
package uk.ac.belfastmet;

/**
 * @author ste19171854
 *
 */
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Dwarf> dwarf = new ArrayList<Dwarf>();
		

		dwarf.add(new Dwarf("Sleepy", "Disney"));
		dwarf.add(new Dwarf("Happy", "Disney"));
		dwarf.add(new Dwarf("Grumpy", "Disney"));
		dwarf.add(new Dwarf("Sneezy", "Disney"));
		dwarf.add(new Dwarf("Doc", "Disney"));
		dwarf.add(new Dwarf("Bashful", "Disney"));
		dwarf.add(new Dwarf("Dopey", "Disney"));
		dwarf.add(new Dwarf("Thorin", "Tolken"));
		dwarf.add(new Dwarf("Oin", "Tolken"));
		dwarf.add(new Dwarf("Bombur", "Tolken"));
		dwarf.add(new Dwarf("4", "Tolken"));
		dwarf.add(new Dwarf("5", "Tolken"));
		dwarf.add(new Dwarf("6", "Tolken"));
		dwarf.add(new Dwarf("7", "Tolken"));
		dwarf.add(new Dwarf("8", "Tolken"));
		dwarf.add(new Dwarf("9", "Tolken"));
		dwarf.add(new Dwarf("10", "Tolken"));
		dwarf.add(new Dwarf("11", "Tolken"));
		dwarf.add(new Dwarf("12", "Tolken"));
		dwarf.add(new Dwarf("13", "Tolken"));
		
		
		for(Dwarf dwarfs: dwarf) {
			if(dwarfs.getAuthor() =="Tolken") {
				System.out.println(dwarfs.getName());
			}
			
			}
		}
		
	}

