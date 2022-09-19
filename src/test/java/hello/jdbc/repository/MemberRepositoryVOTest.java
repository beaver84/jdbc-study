package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

class MemberRepositoryV0Test {
    MemberRepositoryVO repository = new MemberRepositoryVO();
    @Test
    void crud() throws SQLException {
        //save
        Member member = new Member("memberV0", 10000);
        repository.save(member);
    }
}