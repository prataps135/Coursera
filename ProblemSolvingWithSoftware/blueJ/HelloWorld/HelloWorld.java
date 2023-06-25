

import edu.duke.*;
public class HelloWorld {
    FileResource res = new FileResource("hello_unicode.txt");
    public void runHello(){
        for(String line:res.lines()){
            System.out.println(line);
        }
    }
}
