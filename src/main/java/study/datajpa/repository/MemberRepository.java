package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.util.List;

//커스텀 인터페이스 상속받아서 사용자정의 JPA 처리도 가능
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

    //별도 작성없이 findBy필드명 규칙으로 JPA에서 제공
    //List<Member> findByUsername(String username);

}
