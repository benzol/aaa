package blog;

public class PostTemplate {

	private String[] blogdb;
	
	public PostTemplate() {
		blogdb = new String[5];
	}
	
	public void set (String[] ololo) {
	
			blogdb = ololo;
	}

	public String[] get() {
	
		return blogdb;
		
	}

}
