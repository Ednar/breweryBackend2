package se.du.service;

import org.springframework.stereotype.Service;
import se.du.domain.Event;
import se.du.repositories.EventRepository;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class EventServiceImpl implements EventService {


    private EventRepository eventRepository;

    @Inject
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
        eventRepository.save(new Event("Halloween fäst", "Beskrivning om fest", LocalDateTime.now(), "halloween.jpg"));

    }

    @Override
    public Collection<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}