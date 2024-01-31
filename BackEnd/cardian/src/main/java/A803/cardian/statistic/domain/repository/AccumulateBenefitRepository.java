package A803.cardian.statistic.domain.repository;

import A803.cardian.statistic.domain.AccumulateBenefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccumulateBenefitRepository extends JpaRepository<AccumulateBenefit, Integer> {
    Optional<AccumulateBenefit> findAccumulateBenefitByCardIdAndCategoryCode(int cardId, String categoryCode);
}

