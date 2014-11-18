package blog;



class Picpost extends Post {

//    private static String picadd;
//    private static String[] picarr = new String[5];
    
    static String[] newpicmethod() {

    	Picpost picp1 = new Picpost();
    	picp1.newpost();
    	String picadd = blog.Randomizer.Pic();
        
        String[] picarr = new String[5];
        picarr[0] = picp1.getdate();
        picarr[1] = picp1.gethead();
        picarr[2] = picp1.getnewtext();
        picarr[3] = picp1.gettag();
        picarr[4] = picadd;

        return picarr;
        
    }
}
