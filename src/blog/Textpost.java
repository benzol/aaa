package blog;

class Textpost extends Post {

	public static String[] textarr = new String[4];
	
    public static String[] newtextmethod() {
        
Textpost text1 = new Textpost();
    text1.newpost();
    
    textarr[0] = text1.date;
    textarr[1] = text1.head;
    textarr[2] = text1.newtext;
    textarr[3] = text1.tag;
    
    System.out.println(text1.date + " " + text1.newtext);
    return textarr;
    		
    		
    }
}
