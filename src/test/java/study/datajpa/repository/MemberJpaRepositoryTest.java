package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.entity.Member;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MemberJpaRepositoryTest {

    @Autowired
    private MemberJpaRepository memberJpaRepository;

    @Test
    public void basicCRUD() {
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        memberJpaRepository.save(member1);
        memberJpaRepository.save(member2);

        Member findMember1 = memberJpaRepository.findById(member1.getId()).get();
        Member findMember2 = memberJpaRepository.findById(member2.getId()).get();

        assertThat(findMember1).isEqualTo(member1);
        assertThat(findMember2).isEqualTo(member2);

        List<Member> all = memberJpaRepository.findAll();
        assertThat(all.size()).isEqualTo(2);

        member1.setUsername("member1!!!!"); //변경감지 UPDATE 수행

        //카운트 2건등록했으니 2맞으면 성공
        long count = memberJpaRepository.count();
        assertThat(count).isEqualTo(2);

        //삭제검증
        memberJpaRepository.delete(member1);
        memberJpaRepository.delete(member2);

        //지워서 비었으니 0이면 성공
        long deleteCount = memberJpaRepository.count();
        assertThat(deleteCount).isEqualTo(0);
    }
}