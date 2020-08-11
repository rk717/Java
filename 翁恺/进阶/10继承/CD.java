package dome;

public class CD extends Item{
	
	private String artist; 
	private int numofTracks; 
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		
		setTitle("b");
		this.artist = artist;
		this.numofTracks = numofTracks;
	
	} 

	public static void main(String[] args) {
		CD cd = new CD("a", "b", 2, 2, "...");
		cd.print();
	}

//	public void print() {
//		System.out.println("CD: "+title+":"+artist);
//		
//	}

}
