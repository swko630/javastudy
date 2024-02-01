package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Practice {

  public static void main(String[] args) {
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("serviceKey").append("Qf5QJxWLb78ICvg%2FUdZltZWddwFSwzpc0NJempIA5FBYDohJ%2BCb%2FZ03TiCGNOCDKbFATg8HH%2Fx9%2BL1%2FUbn92%2Bg%3D%3D");
    builder.append("searchYear").append(2020);
    builder.append("siDo").append(1100);
    builder.append("guGun").append(1109);
    builder.append("type").append("json");
    builder.append("numOfRows").append(10);
    builder.append("pageNo").append(1);

    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader in = null;
    
    try {
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != 200) {
        throw new RuntimeException("API 호출 실패");
      }
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = in.readLine()) != null) {
        sb.append(line);
      }
      System.out.println(sb.toString());
      
      in.close();
      con.disconnect();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
    
  }

}
