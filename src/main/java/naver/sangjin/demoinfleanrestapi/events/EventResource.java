package naver.sangjin.demoinfleanrestapi.events;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class EventResource extends Resource<Event> {

    public EventResource(Event event, Link... links) {
        super(event, links);

        // add(new Link("http://localhost:8080/api/events/" + event.getId(); 이거랑 같은거지만 아래 방법을 사용하는게 좋다
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
