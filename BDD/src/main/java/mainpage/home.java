package mainpage;

import Browser.browserc;
import Excel.read;
import Page.page1;
import Page.page2;
import Screenshot.capture;

import java.io.IOException;

public class home {
    public static void main(String[] args) throws IOException, InterruptedException {
        browserc.setup();
       // browserc.geturl();


        page1.searchtextbox(read.Excel(1,0));
        page1.select(read.Excel(1,1));
        page2.select2(read.Excel(1,2));
        capture.screenshort("img");

    }

}
