package blog;



class Picpost extends Post {

    static String picadd;
    static String[] picarr = new String[5];
    
    public static String[] newpicmethod() {

    	Picpost picp1 = new Picpost();
    	picp1.newpost();
        picadd = blog.Randomizer.Pic();
        picarr[0] = picp1.date;
        picarr[1] = picp1.head;
        picarr[2] = picp1.newtext;
        picarr[3] = picp1.head;
        picarr[4] = picadd;
        
        System.out.println(picp1.date + " " + picp1.newtext + " " + picadd);

        return picarr;
        
    }
}
