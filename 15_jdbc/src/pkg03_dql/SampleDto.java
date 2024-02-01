package pkg03_dql;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다.
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter/Setter 를 만든다. - 생성자와 Getter/Setter 는 lombok이 해준다
 *                                                               lombok 검색 후 다운 하고 빌드패스에 추가하고 따로 또 설치를 해야한다.
 *                                                               java -jar lombok.jar : 실행 명령어 
 *                                                               cd : 폴더 바꾸기 명령
 *   lombok 을 사용하면 필드를 바꿔도 게터와 세터를 바꿀 필요가 없다.                                                            
 * 
 */


@ToString                /* toString() */
@NoArgsConstructor       /* default constructor */
@AllArgsConstructor      /* constructor using field*/
@Getter
@Setter
public class SampleDto {
  private int sample_no;
  private String sample_content;
  private String sample_editor;
  private Date sample_dt; // 오라클에 있는 타입은 자바에도 있다 임포트하기
  
  
  
  
  
}
