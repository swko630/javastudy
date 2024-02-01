package pkg07_terminal_method;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

  public static void method1() {
    
    // java.util.stream.Stream 생성
    Stream<String> seasons = Stream.of("Spring","summer","autumn", "winter");
    
    // forEach() 메소드 호출
    // Stream 에 저장된 요소를 하나씩 Consumer 의 파라미터에 전달하는 메소드이다. 
    seasons.forEach( (season) -> System.out.println(season));
    
  }
  
  public static void method2() {
    
    // 배열을 Stream 으로 만들기
    
    String[] seasons = {"spring", "summer", "autumn","winter"};
    Stream<String> stream = Arrays.stream(seasons);
    
    // forEach() 메소드
    stream.forEach((season) -> {
      System.out.println(season);
    });
    
    
    
  }
  
  public static void method3() {
    // Collection(List, Set) 을 Stream 으로 만들기
    
    List<String> seasons = Arrays.asList("봄","여름","가을","겨울");
    Stream<String> stream = seasons.stream(); // seasons.stream().forEach();로 따로 생성안하고 한번에도 가능
    stream.forEach((season) -> System.out.println(season));
    
    new HashSet<String>(seasons)
              .stream()
              .forEach((season) -> System.out.println(season));
    
    
  }
  
  public static void method4() {
    Arrays.asList("봄","여름","가을","겨울").stream().forEach((season) -> System.out.println(season));
  }
  
  
  
  
  
  public static void main(String[] args) {
    method3();
    

  }

}
