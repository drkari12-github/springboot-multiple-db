package merveozer.multipledb.primary.repository;

import merveozer.multipledb.primary.model.AgeAverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeAverageRepository extends JpaRepository<AgeAverage, Integer> {
}
