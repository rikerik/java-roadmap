package Networking;

import java.net.URL;

public class URLExample {
    public static void main(String[] args){
        try {
            URL url = new URL("https://www.google.com/search?q=elden+ring&sxsrf=APwXEdd2fQOX0z6MwrSgCzogHsOqQXYMFg%3A1685523014996&source=hp&ei=Rgp3ZLebOsKL9u8P-9O3iAI&iflsig=AOEireoAAAAAZHcYVvThqLq6gkL1EQbOXE3Y1Hqs2Iha&ved=0ahUKEwi31sTElp__AhXChf0HHfvpDSEQ4dUDCAg&uact=5&oq=elden+ring&gs_lcp=Cgdnd3Mtd2l6EAMyBwgjEIoFECcyBwgjEIoFECcyBAgjECcyCgguELEDEIoFEEMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQ6BwgjEOoCECc6EQguEIAEELEDEIMBEMcBENEDOgsILhCKBRCxAxCDAToHCAAQigUQQzoOCC4QigUQsQMQgwEQ1AI6CwguEIAEELEDENQCOg4ILhCABBCxAxCDARDUAjoRCC4QigUQsQMQgwEQxwEQrwE6CwguEIAEELEDEIMBOgsILhCDARCxAxCKBVCbAViUDGCRDWgBcAB4AIABdYgBwQeSAQM2LjSYAQCgAQGwAQo&sclient=gws-wiz");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host name: "+url.getHost());
            System.out.println("Port number: "+url.getPort()); //we get -1 because it is not specified
            System.out.println("Default port number: "+url.getDefaultPort());
            System.out.println("Query String: "+url.getQuery());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
