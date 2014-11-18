package blog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Html {

	public static void output(PostTemplate pt) throws IOException {

		String[] arrout = new String[5];
		arrout = pt.get();
		
File file = new File("c:\\post.html");
if (!file.exists()){
    file.createNewFile();
}
FileWriter fw = new FileWriter(file, true);
fw.write("<html>\r\n" +
        "<head>\r\n" +
        "<meta HTTP-EQUIV=\"Content-type\" CONTENT=\"text/html; charset=UTF-8\">\r\n" +
        "<title>" + arrout[1] + "</title>\r\n" +
        "<style>\r\n" +
        "p {\r\n" +
        "margin-top: 1em;\r\n" +
        "margin-bottom: 5em;\r\n" +
        "text-indent: 50px;\r\n" +
        "}\r\n" +
        "</style>\r\n" +
        "</head>");
fw.write("<data>\r\n" +
        "<div align=\"center\">\r\n" +
        "<b> <font size=\"8\"><p>" + arrout[1] + "</font></b\r\n" +
        "<br /\r\n");

fw.write("</div>\r\n" +
        "<div align=\"justify\"> <font size=\"8\"><p>" + arrout[2] + "</font>\r\n" +
        "<br/>\r\n");

fw.write("<font size=\"6\">#" + arrout[3] + "</font>\r\n" +
        "<br/>\r\n");

fw.write("<img src=\"" + arrout[4] + "\">\r\n");
fw.close();

	}
}