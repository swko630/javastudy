package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
    
    // BufferedReader : File src 읽는 역할
    
    // BufferedWriter : FIle dest 만드는 역할
    
    try(BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
      
      char[] cbuf = new char[256];
      int readChar = 0;
      
      // in.read(cbuf) -> out.write(cbuf)
      while((readChar = in.read(cbuf)) != -1) {
        out.write(cbuf, 0, readChar);
      }
            
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
  
  
//  public static void fileCopy(String src, String dest) {
//  BufferedReader in = null;
//  BufferedWriter out = null;
//  
//  try {
//    in = new BufferedReader(new InputStreamReader(new FileInputStream(src)));
//    out= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest)));
//    
//   String line = null;
//   StringBuilder builder = new StringBuilder();
//   while(true) {
//     line = in.readLine();
//     
//     if(line == null) {
//       break;
//    } builder.append(line).append("\n");
//     
//   }
//   System.out.println(builder.toString());
//   out.close();
//
//  } catch (IOException e) {
//    e.printStackTrace();
//  }
//    
//    
//  }
  
  
  public static void fileMove(File src, File dest) {
    
    fileCopy(src, dest);
    src.delete();
    
  }
  
  
}
