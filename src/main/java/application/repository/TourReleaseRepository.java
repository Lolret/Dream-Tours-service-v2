package application.repository;

import application.domain.Tour;
import application.domain.TourRelease;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourReleaseRepository extends JpaRepository<TourRelease, Long> {
    TourRelease findOneById(Integer id);

    List<TourRelease> findAllByTour(Tour tour);
}
