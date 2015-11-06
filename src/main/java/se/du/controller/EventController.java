package se.du.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.du.domain.Event;
import se.du.service.EventService;

import java.util.Collection;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/events")
    public Collection<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/events/{id}")
    public Event getEventWithId(@PathVariable("id") String id) {
        return eventService.getEventById(id);
    }

}
