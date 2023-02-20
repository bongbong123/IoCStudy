package assembler;

import dao.MemberDao;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import service.ChangePasswordService;
import service.MemberRegistrerService;

@Getter
@RequiredArgsConstructor
public class Assembler {

    private MemberDao memberDao;
    private MemberRegistrerService regSvc;
    private ChangePasswordService pwdSvc;

//    public Assembler(){
//        memberDao = new MemberDao();
//        regSvc = new MemberRegistrerService(memberDao);
//        pwdSvc = new ChangePasswordService();
//        pwdSvc.setMemberDao(memberDao);
//    }
}
