package pkg02_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Practice {

  public static void method1() {
    Connection con = null;
    PreparedStatement ps = null;
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO SAMPLE_T(SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT) VALUES(SAMPLE_SEQ.NEXTVAL, ?, ?, CURRENT_DATE)";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("내용을 입력하세요>>>");
      String content = sc.next();
      System.out.println("편집자를 입력하세요>>>");
      String editor = sc.next();
      sc.close();
      
      ps.setString(1, content);
      ps.setString(2, editor);
      
      int result = ps.executeUpdate();
      System.out.println(result + "행이 삽입되었습니다.");
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
        
      } catch (Exception e2) {
        e2.printStackTrace();
      }
      
      
      
    }
    
    
    
    
  }
  
  public static void method2() {
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "UPDATE SAMPLE_T SET SAMPLE_EDITOR = SAMPLE_EDITOR || '님', SAMPLE_DT = CURRENT_DATE WHERE SAMPLE_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      Scanner sc = new Scanner(System.in);
      System.out.println("수정할 샘플 번호를 입력하세요>>>");
      int sampleNo = sc.nextInt();
      sc.close();
      
      ps.setInt(1, sampleNo);
      
      int result = ps.executeUpdate();
      System.out.println(result + "행 이(가) 수정되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
        
      } catch (Exception e2) {
        e2.printStackTrace();
      }
      
    }
    
    
    
  }
  
  
  
  
  
  public static void main(String[] args) {
    method2();
  }

}
