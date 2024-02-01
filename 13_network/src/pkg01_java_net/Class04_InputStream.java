package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputStream {

  public static void method1() {
    
    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec +"에 접속이 불가합니다.");
      }
      
     in = new BufferedReader(new InputStreamReader(con.getInputStream())) ; 
      
      String line = null;
      StringBuilder builder = new StringBuilder();
      while((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      System.out.println(builder.toString());
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null) {
        con.disconnect();
      }
    }
    
    

  }

  public static void method2() {
    String spec = "https://ssl.pstatic.net/melona/libs/1482/1482826/922ce77392d1bb3bbbcb_20240112131242682.png";
    
    // \\storage\\banner.png
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream in = null;
    
    
    try {
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      if(con.getResponseCode() != 200) {
        System.out.println(spec + "에 접속이 불가합니다.");
      }
      in = new BufferedInputStream(con.getInputStream());
     
      
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null) {
        con.disconnect();
      }
    }
    
    
  }
  
  
  public static void main(String[] args) {
    method2();
  }
}
