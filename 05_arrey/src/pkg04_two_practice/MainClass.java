package pkg04_two_practice;

public class MainClass {
  
  public static void method1() {
    
    // 구구단 결과를 2차원 배열에 저장하기
    int[][] arr = new int[8][9];
    
    /*
     * arr[0][0] <- 2 * 1
     * arr[0][1] <- 2 * 2
     * ...
     * arr[1][0] <- 3 * 1
     * arr[1][1] <- 3 * 2
     */
    for(int i = 2; i < 9; i++) {
      for(int j = 1; j < 10; j++) {
        System.out.print(String.format("%3d", i*j));
      } System.out.println();
    }
    
    
  }
  
  public static void method2() {
    
    // apt 출력하기
    // 1층 : 11명
    // 2층 : 10명
    // 3층 : 9명
    int [][] apt = new int [][] {
      {2, 3, 2, 4},
      {1, 1, 5, 3},
      {4, 2, 2, 1} 
    };
      for(int i = 0; i < apt.length; i++) {
        int total = 0;
        System.out.print((i + 1) + "층 : " + total + "명");
        for(int j = 0; j < apt[i].length; j++) {
            total += apt[i][j] ;
               System.out.println(String.format("%3d", total));
        
      } 
    };
  }
  
 public static void method3() {
    
    // 배열 t 시계 방향으로 90도 회전하기
    
    /*
     * 1 1 1 1 1          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0   --->   1 1 1 1 1
     * 0 0 1 0 0          0 0 0 0 1
     * 0 0 1 0 0          0 0 0 0 1
     */
    
    /*
     * 90도 회전하기
     * 1. t 배열의 90도 회전 상태를 rotate 배열에 저장한다.
     * 2. t 배열이 참조하는 값을 rotate 배열로 바꾼다.
     */
    
    int[][] t = {
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}
    };
    
    int[][] rotate = new int[5][5];
    
    
  }
  

  public static void main(String[] args) {
 method1();
 method2();
 
  }

}
