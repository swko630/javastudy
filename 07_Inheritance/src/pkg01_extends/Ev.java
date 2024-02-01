package pkg01_extends;
/*상속 : 공통된 메소드를 이용하고싶은 클래스가 여러 개일때 상속을 쓴다.
 * sub is a super 
 * ex) Ev is a Car
 * sub has a super 라고 해석이 되면 상속이 가능하다.
 * 
 */



// class 자식 entends 부모{ } -- 부모는 하나만(다중 상속 x)
// class 서브 extends 슈퍼{ } -- 서브는 자식, 부모는 슈퍼를 의미함

public class Ev extends Car{
  
 public void charge() {
  // System.out.println(model); //-- 부모의 private은 자식이 사용할 수 없다.
   System.out.println(maker);  // 부모의 protected는 자식이 사용할 수 있다.
   System.out.println("충전");
   
   
   
 }

}
