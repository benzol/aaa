package blog;


public abstract class Post {

    private String date;
    private String newtext;
    private String tag;
    private String head;
    
    public void newpost() {

        date = Randomizer.Date();
        newtext = Randomizer.TextGen();
        tag = Randomizer.Tag();
        head = Randomizer.Head();
                    
}
    
    public String getdate() {
            return date;
        }
    
    public String getnewtext() {
            return newtext;
    	    }
    
    public String gettag() {
    	        return tag;
    	    }
    
    public String gethead() {
    	        return head;
    	    }
}


