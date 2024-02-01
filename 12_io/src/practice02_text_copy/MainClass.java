package practice02_text_copy;

import java.io.File;

public class MainClass {

  public static void main(String[] args) {
    
    File src = new File("\\storage\\sample1.dat");
    File dest = new File("\\toy\\sample1.dat");
    
    MyFileUtils.fileCopy(src, dest);

  }

}
