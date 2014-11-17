package blog;


public abstract class Post {

    String date;
    String newtext;
    String tag;
    String head;
    
    public void newpost() {

        date = Randomizer.Date();
        newtext = Randomizer.TextGen();
        tag = Randomizer.Tag();
        head = Randomizer.Head();
        
    }
}
