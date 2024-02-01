package db.service;

import java.util.List;

import db.dto.UserDto;

public interface UserService {

  List<UserDto> getUsers();
  UserDto getUser(int user_no);
  int saveUser(UserDto userDto);
  int modifyUser(UserDto userDto);
  int deleteUser(int user_no);
  // 이 인터페이스를 구현하는 클래스 이름은 인터페이스이름 뒤에 Impl을 붙인다.
  
  
}
