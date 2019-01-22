package isgaze.repository;

import isgaze.entity.PupilLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PupilLocationRepository extends JpaRepository<PupilLocation, Long> {
     PupilLocation findFirstByIdEquals(Long id);
}
