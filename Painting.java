package p2;

public class Painting {
	private String title;
	private String painter;
	private int year;
	
	public Painting(String title, String painter, int year) {
		this.title=title;
		this.painter=painter;
		this.year=year;
	}



	
	public String getTitle(){
		return this.title;
	}//end getTitle
	
	public String getPainter(){
		return this.painter;
	}//end getPainter
	
	public int getYear(){
		return this.year;
	}//end getYear
	
		public String toString(){
			Painting str = new Painting();
		return 
		str.getTitle("Mona Lisa av") +
		str.getPainter(" Leonardo Da Vinci, år")+
		str.getYear(1507);*/
		
	//}//end toString
		
		
}
