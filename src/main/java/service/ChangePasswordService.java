package service;

import dao.MemberDao;
import entity.Member;
import exception.MemberNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Setter
public class ChangePasswordService {
    private MemberDao memberDao;

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectaByEmail(email);
        if(member == null){
            throw new MemberNotFoundException();
        }

        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }

}
