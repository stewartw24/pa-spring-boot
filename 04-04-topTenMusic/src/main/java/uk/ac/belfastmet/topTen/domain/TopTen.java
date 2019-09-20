/**
 * 
 */
package uk.ac.belfastmet.topTen.domain;

/**
 * @author ste19171854
 *
 */
public class TopTen {
	
	private String position;
	private String single;
	private String album;
	private String genre;
	private String singleImage;
	private String albumImage;

	
	public TopTen() {
		super();
	}

	public TopTen(String position, String single, String album, String genre, String singleImage, String albumImage) {
		super();
		this.position = position;
		this.single = single;
		this.album = album;
		this.genre = genre;
		this.singleImage = singleImage;
		this.albumImage = albumImage;
	}

	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.setPosition(position);
	}

	public String getSingle() {
		return single;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getSingleImage() {
		return singleImage;
	}

	public void setSingleImage(String singleImage) {
		this.singleImage = singleImage;
	}

	public String getAlbumImage() {
		return albumImage;
	}

	public void setAlbumImage(String albumImage) {
		this.albumImage = albumImage;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
	
	
	
	
