package config;

import dto.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean //리턴값은 빈 객체로 사용됨을 의미
    public Member member1(){
        //Setter Injection (Setter 메서드를 이용한 의존성 주입)
        Member member1 = new Member();
        member1.setName("홍길동");
        member1.setNickname("도사");
        return member1;
    }

    @Bean(name = "hello") //이런식으로 어노테이션에 이름을 주면 해당 클래스를 빈으로 등록할 때 입력한 이름으로 빈의 이름을 변경할 수 있음.
    public Member member2(){
        //Constructor Injection (생성자를 이용한 의존성 주입)
        return new Member("전우치", "도사");
    }
}
