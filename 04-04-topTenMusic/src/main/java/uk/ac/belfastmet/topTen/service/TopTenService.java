package uk.ac.belfastmet.topTen.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.topTen.domain.TopTen;

@Service
public class TopTenService {

	private ArrayList<TopTen> topTenSingles;
	private ArrayList<TopTen> topTenAlbums;
	
	public ArrayList<TopTen> gettopTenSingles(){
		
		this.topTenSingles = new ArrayList<TopTen>();
		
		this.topTenSingles.add(new TopTen("1.", "Single", "Take me back to London", "Grime", "takeMeBackToLondon.jpg" , null));
		this.topTenSingles.add(new TopTen("2.", "Single", "Taste", "Hip-Hop","taste.jpg" , null));
		this.topTenSingles.add(new TopTen("3.", "Single", "Higher Love", "Pop", "higherLove.jpg", null));
		this.topTenSingles.add(new TopTen("4.", "Single", "Ladbroke Grove", "Hip-Hop", "ladbrokeGrove.jpg", null));
		this.topTenSingles.add(new TopTen("5.", "Single", "Circles", "Hip-Hop", "circles.jpg", null));
		this.topTenSingles.add(new TopTen("6.", "Single", "Sorry", "Dance", "sorry.jpg", null));
		this.topTenSingles.add(new TopTen("7.", "Single", "3 Nights", "Indie", "3Nights.jpg", null));
		this.topTenSingles.add(new TopTen("8.", "Single", "Ransom", "Hip-Hop", "ransom.jpg", null));
		this.topTenSingles.add(new TopTen("9.", "Single", "Strike a pose", "Hip-Hop", "strikeAPose.jpg", null));
		this.topTenSingles.add(new TopTen("10.", "Single","Goodbyes", "Hip-Hope", "goodbyes.jpg", null));
		
		return this.topTenSingles;
	}
	
	public ArrayList<TopTen> gettopTenAlbums(){
			
			this.topTenAlbums = new ArrayList<TopTen>();
			
			this.topTenAlbums.add(new TopTen("1", "Album", null, null, null, "hollywoodsBleeding.jpg"));
			this.topTenAlbums.add(new TopTen("2", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("3", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("4", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("5", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("6", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("7", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("8", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("9", "Album", "Balin.png", null, null, null));
			this.topTenAlbums.add(new TopTen("10", "Album", "Balin.png", null, null, null));
			
			
			return this.topTenAlbums;
		}
}
