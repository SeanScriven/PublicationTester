public class PublicationTester {

	public static void main(String[] args) {
		Publication pub1 = new Publication("james", "how bout that", 1945);
		System.out.println(pub1.getAuthor());
		pub1.setAuthor("brian");
		System.out.println(pub1.getAuthor());
		System.out.println(pub1);
		
		ConferencePapers conf1 = new ConferencePapers("bob", "what now", 2001, "conference", 2, 195);
		System.out.println(conf1.getStartPage());
		System.out.println(conf1.getAuthor());
		conf1.setAuthor("chris");
		System.out.println(conf1.getAuthor());
		System.out.println(conf1);
		
 }
