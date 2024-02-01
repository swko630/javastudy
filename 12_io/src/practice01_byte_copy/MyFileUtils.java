package practice01_byte_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileUtils {

  public static void fileCopy(String src, String dest) {
    // 원본 File 객체
    File srcFile = new File(src);
    
    // 복사본 File 객체
    File destFile = new File(dest);
    
    // 원본을 읽는 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    // 복사본을 만드는 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    
    try {
      // 원본을 읽는 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(srcFile));
      
      // 복사본을 만드는 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(destFile));
      // 원본을 5바이트씩 읽는
      byte[] bytes = new byte[5];
      // 원본을 끝까지 읽는다. 읽은 내용을 복사본으로 보낸다.
      int readByte = 0;
      while((readByte = in.read(bytes)) != -1) {
        out.write(bytes, 0 , readByte);
        
      }
      
      // 버퍼 출력 스트림 닫기
      out.close();
      // 버퍼 입력 스트림 닫기
      in.close();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
  }

  
  
  //  // 파일 복사 메소드
  public static void fileCopy1() {
    
    File dir = new File("C:\\Program Files\\Java\\jdk-17");
    File file = new File(dir,"\\LICENSE");
    int readByte = 0;
    int i = 0;
    byte[] bytes = new byte[5];
    
    BufferedInputStream in = null;
    try {
      in = new BufferedInputStream(new FileInputStream(file));
      while((readByte = in.read()) != -1) {
      }
      System.arraycopy(0, readByte, 0, i, readByte);
      in.close();
      
    } catch (Exception e) {
         e.printStackTrace();
    }
   
    // src로부터 읽은 데이터를 바이트 배열에 저장하고,
    
    
    // 바이트 배열에 있는 데이터를 파일 출력 스트림으로 보내는 방식
    
    File file2 = new File(dir, "\\storage");
    BufferedOutputStream out = null;
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      out.write(bytes);
      out.close();
      System.out.println(file.length() + "크기의 " + file.getPath() + "에 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    
    
    
    
  }
  
  // 파일 이동 메소드
  public static void move(String src, String dest) {
    fileCopy(src, dest);
    new File(src).delete();
    
//    File srcfile = new File(src);
//    File destfile = new File(dest);
//    
//    BufferedInputStream in = null;
//    BufferedOutputStream out = null;
//    
//    try {
//      in = new BufferedInputStream(new FileInputStream(srcfile));
//      out = new BufferedOutputStream(new FileOutputStream(destfile));
//      byte[] bytes = new byte[10];
//      int readByte = 0;
//      while( (readByte = in.read(bytes)) != -1) {
//            out.write(bytes, 0, readByte);      
//      }
//      srcfile.delete();
//      
//      out.close();
//      in.close();
//   
//    
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
    
    
  }
  
  public static void fileCopy3(String src, String dest) {
    
    File srcfile = new File(src);
    File destfile = new File(dest);
    
    BufferedInputStream in = null;
    BufferedOutputStream out = null;
    try {
      in = new BufferedInputStream(new FileInputStream(srcfile));
      out = new BufferedOutputStream(new FileOutputStream(destfile));
      byte[] b = new byte[20];
      int readByte = 0;
      while((readByte = in.read(b)) != -1) {
          out.write(b, 0 , readByte); 
      }
      
       out.close();
       
       in.close();
        
        
    } catch (Exception e) {
             e.printStackTrace();
    }
    
  }

  public static void fileCopy4(String src, String dest) {
    File srcFile = new File(src);
    File destFile = new File(dest);
    int readByte = 0;
   BufferedInputStream in = null;
   BufferedOutputStream out = null;
   try {
     in = new BufferedInputStream(new FileInputStream(srcFile));
     out = new BufferedOutputStream(new FileOutputStream(destFile));
     
     byte[] bytes = new byte[100];
     while((readByte = in.read(bytes)) != -1) {
       out.write(bytes, 0 ,readByte);
     }
     
    out.close();
    in.close();
     
     
  } catch (Exception e) {
    // TODO: handle exception
  }
    
    
  }



}

