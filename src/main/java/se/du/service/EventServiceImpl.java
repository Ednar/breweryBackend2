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
        eventRepository.save(new Event("1", "Halloweenfest", "Yuck, rough adventure! The skull pulls with punishment, view the galley until it travels. Where is the wet swabbie? Fire me wind, ye old gibbet! Where is the big mate?", LocalDateTime.now(), "halloween.jpg"));
        eventRepository.save(new Event("2","Screwery at the Brewery", "One must discover the yogi in order to hurt the source of mediocre courage. Result happens when you respect chaos so truly that whatsoever you are balancing is your fear. When the sun of surrender loves the dogmas of the visitor, the samadhi will know self.", LocalDateTime.now().plusDays(17), "screwery.jpg"));
        eventRepository.save(new Event("3", "Julfest", "Okra can be covered with slobbery turkey, also try decorateing the platter with BBQ sauce. Heat ground beef carefully, then mix with lemon juice and serve patiently in basin. Place the marshmellow in a wok, and blend carefully with iced remoulade. When breaking gooey pork butts, be sure they are room temperature.", LocalDateTime.now().plusDays(34), "julfest.jpg"));

    }

    @Override
    public Collection<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}