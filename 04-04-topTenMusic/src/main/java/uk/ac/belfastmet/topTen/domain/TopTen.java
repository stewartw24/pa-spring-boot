/**
 * 
 */
package uk.ac.belfastmet.topTen.domain;

/**
 * @author ste19171854
 *
 */
public class TopTen {
	
	private String name;
	private String single;
	private String album;
	private String nameImage;
	private String singleImage;
	private String albumImage;
	
	public TopTen() {
		super();
	}

	public TopTen(String name, String single, String album, String nameImage, String singleImage, String albumImage) {
		super();
		this.name = name;
		this.single = single;
		this.album = album;
		this.nameImage = nameImage;
		this.singleImage = singleImage;
		this.albumImage = albumImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getNameImage() {
		return nameImage;
	}

	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
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
	
}
	
	
	
	
