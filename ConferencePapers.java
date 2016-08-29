public class ConferencePapers extends Publication{
	
	private String conferenceName;
	private int startPage;
	private int endPage;
	
	public ConferencePapers(String author, String title, int yearOfPub, String conferenceName,
							int startPage, int endPage){
		super(author, title, yearOfPub);
		this.conferenceName = conferenceName;
		this.startPage = startPage;
		this.endPage = endPage;
	}
	
	public void setConferenceName(String conferenceName){
		this.conferenceName = conferenceName;
	}
	
	public String getConferenceName(){
		return conferenceName;
	}
	
	public void setStartPage(int startPage){
		this.startPage = startPage;
	}
	
	public int getStartPage(){
	return startPage;
	}
	
	public void setEndPage(int endPage){
		this.endPage = endPage;
	}
	
	public int getEndPage(){
	return endPage;
	}
	
	@Override
	public String toString(){
		return super.toString() + " conference Name: " + conferenceName + " pages " + startPage + " - " + endPage;
	}
}
