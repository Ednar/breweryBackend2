package se.du.service;

import org.springframework.stereotype.Service;
import se.du.domain.Event;

import java.util.Collection;

@Service
public interface EventService {

    Collection<Event> getAllEvents();

    Event getEventById(String id);
}
