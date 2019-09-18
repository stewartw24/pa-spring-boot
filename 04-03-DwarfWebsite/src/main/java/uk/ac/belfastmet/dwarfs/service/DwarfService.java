package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Service
public class DwarfService {

	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkenDwarfs;
	
	public ArrayList<Dwarf> getDisneyDwarfs(){
		
		this.disneyDwarfs = new ArrayList<Dwarf>();
		
		this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));
		
		return this.disneyDwarfs;
	}
	
	public ArrayList<Dwarf> getTolkenDwarfs(){
			
			this.tolkenDwarfs = new ArrayList<Dwarf>();
			
			this.tolkenDwarfs.add(new Dwarf("Balin", "Tolken", "Balin.png"));
			this.tolkenDwarfs.add(new Dwarf("Bifur", "Tolken", "Bifur.png"));
			this.tolkenDwarfs.add(new Dwarf("Bofur", "Tolken", "Bofur.png"));
			this.tolkenDwarfs.add(new Dwarf("Bombur", "Tolken", "Bombur.png"));
			this.tolkenDwarfs.add(new Dwarf("Dori", "Tolken", "Dori.png"));
			this.tolkenDwarfs.add(new Dwarf("Dwalin", "Tolken", "Dwalin.png"));
			this.tolkenDwarfs.add(new Dwarf("Fili", "Tolken", "Fili.png"));
			this.tolkenDwarfs.add(new Dwarf("Gloin", "Tolken", "Gloin.png"));
			this.tolkenDwarfs.add(new Dwarf("Kili", "Tolken", "Kili.png"));
			this.tolkenDwarfs.add(new Dwarf("Nori", "Tolken", "Nori.png"));
			this.tolkenDwarfs.add(new Dwarf("Oin", "Tolken", "Oin.png"));
			this.tolkenDwarfs.add(new Dwarf("Ori", "Tolken", "Ori.png"));
			this.tolkenDwarfs.add(new Dwarf("Thorin", "Tolken", "Thorin.png"));
			
			return this.tolkenDwarfs;
		}
}
