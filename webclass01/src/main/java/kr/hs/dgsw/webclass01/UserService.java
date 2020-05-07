package kr.hs.dgsw.webclass01;

import kr.hs.dgsw.webclass01.User;

import java.util.List;

public interface UserService {
    List<User> list();
    User view(String id);
    boolean add(User user);
    User update(User user);
    boolean delete(String id);
}