package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;

public class MainClass {

  /*
   * java.io.FileOutputStream
   * 1. 바이트 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *    1) int (int는 4바이트지만 1바이트도 int를 사용)
   *    2) byte[]
   * 
   */
  
 
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다. (필수)
   *    2) long seriaclVersionUID 필드 값을 임의로 생성한다. - 자바가 알아서 만듬 (선택)
   */
  
  /*
   * java.io.DataInputStream
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다. 
   * 3. 타입 별로 전용 메소드가 존재한다.
   * 
   * 
   */
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    // 디렉터리
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
      
    }
    
    // 파일 
    File file = new File(dir , "sample1.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    try {
      
      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(c);
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      // 확인
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
      
    } catch (Exception e) {
       e.printStackTrace();
    } finally {
      try {
        // 파일 출력 스트림 닫기 (종료) -- 예외처리는 try 블록 안에 들어가있어야 예외처리가 된 것
        if(out != null)
        out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
     }
    }
    
  }
  
  public static void method2() {
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
      
    }
    
   
    // 안녕하세요 반갑습니다 -> sample2.dat 파일로 보내기
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    
    File file = new File(dir , "sample2.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    try {
      
      out = new FileOutputStream(file,true);
      
      // 출력할 데이터
    
      String str = "안녕하세요 반갑습니다\n";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      // 확인
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
      
    } catch (Exception e) {
       e.printStackTrace();
    } finally {
      try {
        // 파일 출력 스트림 닫기 (종료) -- 예외처리는 try 블록 안에 들어가있어야 예외처리가 된 것
        if(out != null)
        out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
     }
    }
    
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String str = "How do you do? nice to meet you\n";
      String str2 = "i'm fine thank you";
      
      //출력 
      out.write(str.getBytes());
      out.write(str2.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
    } catch (Exception e) {
      e.printStackTrace();
    } {
    } 
    
    
  }

  public static void method4() {
  File dir = new File("\\storage");
  if(!dir.exists()) {
    dir.mkdirs();
    
  }
  File file = new File(dir , "sample4.dat");
  
  DataOutputStream out = null;
  
  try {
    
    // 버퍼 출력 스트림 생성
    out = new DataOutputStream(new FileOutputStream(file));
    
    
    // 출력할 데이터
    String name = "홍길동";
    int age = 10;
    double height = 140.5;
    boolean isAdult = ( age >= 20);
    char gender = '남';
    
    
    //출력 
    out.writeUTF(name);
    out.writeInt(age);
    out.writeDouble(height);
    out.writeBoolean(isAdult);
    out.writeChar(gender);
    
    // 버퍼 출력 스트림 닫기
    out.close();
    System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
    
  } catch (Exception e) {
    e.printStackTrace();
  } 
    
    
  }
  
  public static void method5() {
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
      
    }
    
    File file = new File(dir, "sample5.dat");
    
    ObjectOutputStream out = null;
    try {
      
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      Employee employee = new Employee(1, "홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2, "홍길순"), new Employee(3, "홍순자")) ;    
      
      out.writeObject(employee);
      out.writeObject(employees);
      
      out.close();
      
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    
  
    
  }
  
  public static void practice1() {
    
    // FileOutputStream 으로 애국가 1절 파일로 보내기 : 시간재기(System.nanoTime())
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "애국가1");
    
    FileOutputStream out = null;
    try {
      
      out = new FileOutputStream(file);
      String song = "이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세";
      
      long start = System.nanoTime();
      out.write(song.getBytes());
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
      long end = System.nanoTime();
      
      System.out.println((end - start) + "NS 걸렸습니다.");
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
   
    
    
    
  }
  
  public static void practice2() {
    
    // BufferedOutputStream 으로 애국가 1절 파일로 보내기 : 시간재기
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "애국가2");
    
    BufferedOutputStream out = null;
    try {
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      String song = "이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세";
      
      long start = System.nanoTime();
      
      out.write(song.getBytes());
      System.out.println(file.length()+ "바이트 크기의" + file.getPath() + "파일이 생성되었습니다.");
      long end = System.nanoTime();
      System.out.println((end - start) + "NS 걸렸습니다.");
      
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
   }
    
  }
  public static void main(String[] args) {

     method5();
    
  }

}
