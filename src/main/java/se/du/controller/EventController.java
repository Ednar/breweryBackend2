package se.du.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import se.du.domain.Event;
import se.du.service.EventService;

import java.util.Collection;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Event getEventWithId(@PathVariable("id") String id) {
        return eventService.getEventById(id);
    }

}
