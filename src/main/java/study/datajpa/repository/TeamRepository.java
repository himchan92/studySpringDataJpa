package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

// 컴포넌트 스캔되어있는 JpaRespository 상속받아서 별도 Repository 어노테이션 명시 생략가능
public interface TeamRepository extends JpaRepository<Team, Long> {
}
