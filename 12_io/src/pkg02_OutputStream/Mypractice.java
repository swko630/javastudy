package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Mypractice {

  public static void method1() {
    File dir = new File("\\LostArk");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "Themine");
    
    BufferedOutputStream out = null;
    
    try {
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      String str = "1등전사슬레이어";
      
      out.write(str.getBytes());
      
      out.close();
      
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 만들어졌습니다.");
    } catch (Exception e) {
      e.getStackTrace();
      
    }
    
    
    
  }
  
  public static void method2() {
    
    try {
      
      File dir = new File("\\LostArk");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      
      File file = new File(dir, "가나다");
      
      BufferedOutputStream out = null;
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      int c = 'ㅁ';
      
      out.write(c);
      
      System.out.println(file.length() +"크기의 " + dir.getPath() + "를 생성하였습니다.");
      out.close();
      
    } catch (Exception e) {

    e.printStackTrace();
    }
    
  }
  
  public static void method3() {
    File dir = new File("\\storage");
    
    if(dir.exists()) {
      dir.mkdirs();
    }
    BufferedOutputStream out = null;
    
    File file = new File(dir, "ABC");
    
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      String al = "Alphabet";
      out.write(al.getBytes());
      System.out.println(file.length() + "크기의 " + file.getPath() + "파일이 만들어졌습니다.");
      
      out.close();
      
    } catch (Exception e) {
      System.out.println(file.getPath() + "파일이 존재하지 않습니다.");
     e.printStackTrace();
    }
    
    
  }
 
  public static void main(String[] args) {
    method3();
    
    

  }

}
