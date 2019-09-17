/**
 * 
 */
package uk.ac.belfasmet;

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
		System.out.println("Hello");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolken");
		dwarfs.add(thorin);
		
		Dwarf balin = new Dwarf();
		balin.setName("Balin");
		balin.setAuthor("Tolken");
		dwarfs.add(balin);
		
		Dwarf dwalin = new Dwarf();
		dwalin.setName("Dwalin");
		dwalin.setAuthor("Tolken");
		dwarfs.add(dwalin);
		
		System.out.println("The Dwarfs are: ");
		
		
		System.out.println("The Disney dwarfs are");
		for(Dwarf dwarf:dwarfs) 
		{  //iterate through the Dwarf arraylist

			if(dwarf.getAuthor() == "Disney") 
			{
				System.out.println(dwarf.getName());
			}
		}
		
		System.out.println("The Tolken dwarfs are");
			for(Dwarf dwarf:dwarfs) 
			{  //iterate through the Dwarf arraylist
			
				if(dwarf.getAuthor() == "Tolken") 
				{
					System.out.println(dwarf.getName());
				}
			
			
		}
		
	}

}
