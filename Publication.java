public class Publication {
	protected String author;
	protected String title;
	protected int yearOfPub;
	
	public Publication(String author, String title, int yearOfPub){
		this.author = author;
		this.title = title;
		this.yearOfPub = yearOfPub;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setYearOfPub(int yearOfPub){
		this.yearOfPub = yearOfPub;
	}
	
	public int getYearOfPub(){
		return yearOfPub;
	}
	
	public String toString(){
		return author + "(" + yearOfPub + "): " + title;
	}
	
}
