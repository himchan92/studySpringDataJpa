package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //별도 작성없이 findBy필드명 규칙으로 JPA에서 제공
    //List<Member> findByUsername(String username);

}
