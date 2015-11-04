package se.du.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.du.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {}
