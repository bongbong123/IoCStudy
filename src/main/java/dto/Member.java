package dto;

import lombok.Setter;
import org.springframework.format.Printer;

@Setter
public class Member {
    private String name;
    private String nickname;
    public Member(){}

    public Member(String name, String nickname){
        this.name =name;
        this.nickname = nickname;
    }

    public void print(){
        System.out.println("Hello "+name+" : "+nickname);
    }

}
