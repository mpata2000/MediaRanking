package ar.com.mediaranking.models.repository;

import ar.com.mediaranking.models.entity.MovieEntity;
import ar.com.mediaranking.models.entity.SeasonEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonRepository extends JpaRepository<SeasonEntity,Long> {

    List<SeasonEntity> findAll(Specification<SeasonEntity> spec);

}
