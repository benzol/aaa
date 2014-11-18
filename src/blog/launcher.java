package blog;

import java.io.IOException;


public class launcher {

	
	
    public static void main (String[] args) throws IOException {
    	
    	
    	
    	BlogData bd = new BlogData();
    	
    	
    	int i = 1;
        while (i < 4) {
        //PostTemplate pt = new PostTemplate();
        // System.out.println(Textpost.newtextmethod()[1]);
        	PostTemplate pt = new PostTemplate();
    	pt.set(Textpost.newtextmethod());
    	// Html.output(pt);
    	bd.insert(pt);
            i++;
        }
            
        System.out.println();
        
        
        int p = 1;
        while (p < 4) {
        	PostTemplate pt = new PostTemplate();
        pt.set(Picpost.newpicmethod());
        bd.insert(pt);
        //Html.output(pt);
        	p++;
        
        } 
        
        System.out.println();
        
        int iter = bd.length();
        
      //  System.out.println(iter);
    
        
        for (int f = 0; f<iter; f++ ) {
        	
//        pt = bd.extract(f);
        Html.output(bd.extract(f));
       
        }

    }


}
