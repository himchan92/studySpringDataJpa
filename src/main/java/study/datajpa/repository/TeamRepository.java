package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

//JpaRepository 안에 구현체 등 다들어가있어 별도 로직없이 상속만받으면 Repository DI 포함 다 자동처리
public interface TeamRepository extends JpaRepository<Team, Long> {
}