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
		
		this.topTenSingles.add(new TopTen("1. Take me back to London", "Single", null, null, "takeMeBackToLondon.jpg" , null));
		this.topTenSingles.add(new TopTen("2. Taste", "Single", null, null,"taste.jpg" , null));
		this.topTenSingles.add(new TopTen("3. Higher Love", "Single", null, null, "higherLove.jpg", null));
		this.topTenSingles.add(new TopTen("4. Ladbroke Grove", "Single", null, null, "ladbrokeGrove.jpg", null));
		this.topTenSingles.add(new TopTen("5. Circles", "Single", null, null, "circles.jpg", null));
		this.topTenSingles.add(new TopTen("6. Sorry", "Single", null, null, "sorry.jpg", null));
		this.topTenSingles.add(new TopTen("7. 3 Nights", "Single", null, null, "3Nights.jpg", null));
		this.topTenSingles.add(new TopTen("8. Ransom", "Single", null, null, "ransom.jpg", null));
		this.topTenSingles.add(new TopTen("9. Strike a pose", "Single", null, null, "strikeAPose.jpg", null));
		this.topTenSingles.add(new TopTen("10. Goodbyes", "Single",null, null, "goodbyes.jpg", null));
		
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
