package blog;

class Textpost extends Post {

//	private static String[] textarr = new String[5];
    
	
	static String[] newtextmethod() {
        
Textpost text1 = new Textpost();
    text1.newpost();
    
    String[] textarr = new String[5];
    textarr[0] = text1.getdate();
    textarr[1] = text1.gethead();
    textarr[2] = text1.getnewtext();
    textarr[3] = text1.gettag();
    textarr[4] = null;
    
    //System.out.println(text1.date + " " + text1.newtext);
    return textarr;
    		
    		
    }
}
