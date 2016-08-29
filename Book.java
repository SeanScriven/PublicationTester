public class Book extends Publication{
	
	private String publisher;
	
	public Book(String author, String title, int yearOfPub, String publisher){
		super(author, title, yearOfPub);
		this.publisher = publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public String getJournalName(){
		return publisher;
	}
	
	@Override
	public String toString(){
		return super.toString() + " publisher: " + publisher;
	}

}
