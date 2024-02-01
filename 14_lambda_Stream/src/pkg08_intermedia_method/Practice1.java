package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice1 {

  public static void method1() {
    
    List<String> seasons = Arrays.asList("봄","여름","가을","겨울");
    Stream<String> stream = seasons.stream();
    stream .forEach((season) -> System.out.println(season));
    
  }

  public static void method2() {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    list.stream()
    .map((number) -> number * 100)
    .forEach((number) -> System.out.println(number) );
   
  }
  
  public static void method3() {
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e", "ee", 25000)
          );
    List<Book> saleList = books.stream()
                         .filter((book) -> book.getPrice() >= 10000)
                         .map((book) ->new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2))
                         .toList();
    saleList.stream()
    .forEach((book) -> System.out.println(book.getTitle()+", 저자: " + book.getAuthor() + ", 가격 : " + book.getPrice()));
  }
  
  
  
  
  public static void main(String[] args) {
    method3();

  }

}
