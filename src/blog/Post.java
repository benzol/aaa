package blog;


public abstract class Post {

    String date;
    String newtext;


    public void newpost() {

        date = blog.Randomizer.Date();
        newtext = blog.Randomizer.TextGen();

        
        
    }
}
