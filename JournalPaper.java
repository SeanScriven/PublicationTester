public class JournalPaper extends Publication{
	
	private String journalName;
	private int startPage;
	private int endPage;
	
	public JournalPaper(String author, String title, int yearOfPub, String journalName,
							int startPage, int endPage){
			super(author, title, yearOfPub);
			this.journalName = journalName;
			this.startPage = startPage;
			this.endPage = endPage;
}
	
	public void setJournalName(String journalName){
		this.journalName = journalName;
	}
	
	public String getJournalName(){
		return journalName;
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
		return super.toString() + " journal Name: " + journalName + " pages " + startPage + " - " + endPage;
	}
}
