package kr.hs.dgsw.webclass01;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor // default 생성자 생성
@AllArgsConstructor // 모든 인자를 가지는 생성자 생성
@ToString // ToString 메소드 생성
public class User {
    private String id;
    private String name;
    private String email;
}