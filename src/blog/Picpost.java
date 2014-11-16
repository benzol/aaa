package blog;



class Picpost extends Post {

    static String picadd;

    public static void newpicmethod() {

    	Picpost picp1 = new Picpost();
    	picp1.newpost();
        picadd = blog.Randomizer.Pic();
        System.out.println(picp1.date + " " + picp1.newtext + " " + picadd);

    }
}
