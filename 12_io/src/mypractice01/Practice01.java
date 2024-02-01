package mypractice01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice01 {

  public static void method1() {
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.html");
    
    BufferedReader in = null;
    
    try {
      in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      
      String line = null;
      StringBuilder builder = new StringBuilder();
      
      while( (line = in.readLine()) != null) {
        builder.append(line).append("\n");
        
        
        
      }
      System.out.println(builder.toString());
      in.close();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void method2() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.dat");
    
    FileReader in = null;
    try {
      in = new FileReader(file);
      char[] cbuf = new char[10];
      StringBuilder builder = new StringBuilder();
      int readChar = 0;
      
      while(true) {
        readChar = in.read(cbuf);
        if(readChar == -1) {
          break;
        }
        builder.append(cbuf, 0, readChar);
        
        System.out.println(builder.toString());
        
      }
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void method3() {
    
    
    
  }
  public static void main(String[] args) {
    method2();
    
  }
}
