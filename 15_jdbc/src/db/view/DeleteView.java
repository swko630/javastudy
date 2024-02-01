package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DeleteView implements View {

  @Override
  public UserDto display() {
    
    String user_no = JOptionPane.showInputDialog(null, " 삭제할 명단을 가져옵니다.");
    if(JOptionPane.showConfirmDialog(null, "정말 삭제할까요?") != JOptionPane.OK_OPTION){
      return new UserDto(-1, null, null, null);
   
  }
    return new UserDto(Integer.parseInt(user_no), null, null, null);
  }
}
