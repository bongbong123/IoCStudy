package dto;

import org.springframework.format.Printer;


public class Member {
    private String name;
    private String nickname;
    public Member(){}

    public Member(String name, String nickname){
        this.name =name;
        this.nickname = nickname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void print(){
        System.out.println("Hello "+name+" : "+nickname);
    }

}
