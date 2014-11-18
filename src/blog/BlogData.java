package blog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BlogData {

private ArrayList<PostTemplate> postarrlist = new ArrayList<PostTemplate>(0);
	

	public void insert(PostTemplate ptlocal) throws IOException {

	postarrlist.add(ptlocal);
}
	
	public PostTemplate extract(int num) {
	
//		PostTemplate pt = new PostTemplate();
//		pt = postarrlist.get(num);
	
		return postarrlist.get(num);
		
	}
		
	public int length() {
		
		int lng = postarrlist.size();
		return lng;
		
	}
	
	public List<PostTemplate> getList() {
		return postarrlist;
	}
	
	
}
