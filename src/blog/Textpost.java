package blog;

class Textpost extends Post {

	static String[] textarr = new String[5];
	static String picnull;
    static String[] newtextmethod() {
        
Textpost text1 = new Textpost();
    text1.newpost();
    picnull = null;
    textarr[0] = text1.date;
    textarr[1] = text1.head;
    textarr[2] = text1.newtext;
    textarr[3] = text1.tag;
    textarr[4] = Textpost.picnull;
    
    System.out.println(text1.date + " " + text1.newtext);
    return textarr;
    		
    		
    }
}
