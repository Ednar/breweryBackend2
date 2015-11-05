package se.du.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String title;
    @Column(length = 1000)
    private String description;
    private String date;
    private String imageUrl;

    //Bra med tom construktor
    public Event() {
    }

    public Event(String id, final String title, final String description, final LocalDateTime start, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = start.toString();
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getStart() {
        return date;
    }

    public void setStart(final LocalDateTime start) {
        this.date = start.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
