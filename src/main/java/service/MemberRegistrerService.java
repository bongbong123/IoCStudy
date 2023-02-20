package service;

import dao.MemberDao;
import entity.Member;
import exception.DuplicateMemberException;
import lombok.RequiredArgsConstructor;
import vo.RegisterRequest;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class MemberRegistrerService {

    private final MemberDao memberDao;

    public Long regist(RegisterRequest req) {
        Member member = memberDao.selectaByEmail(req.getEmail());

        if(member != null) {
            throw new DuplicateMemberException("dup email " + req.getEmail());
        }
        Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
        memberDao.insert(newMember);
        return newMember.getId();
    }
}
