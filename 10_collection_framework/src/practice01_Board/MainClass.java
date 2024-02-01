package practice01_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {

    BoardService boardService = new BoardService();
    
    List<BoardVo> boardList = boardService.getBoardList();
     
    for(int i = 0, size = boardList.size(); i < size; i++) {
      System.out.println(boardList.get(i));
    }
    
       
  }

}
