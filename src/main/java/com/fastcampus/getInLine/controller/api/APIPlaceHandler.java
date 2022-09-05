package com.fastcampus.getInLine.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.Arrays;

import static org.springframework.web.servlet.function.ServerResponse.ok;

@Component
public class APIPlaceHandler {

    public ServerResponse getPlaces(ServerRequest serverRequest) {
        return ok().body(Arrays.asList("place4", "place2"));
    }


    public ServerResponse createPlace(ServerRequest serverRequest) {
        return ServerResponse.created(URI.create("/api/places/1")).body(true);
    }
    public ServerResponse getPlace(ServerRequest serverRequest) {
        return ok().body("placeId " + serverRequest.pathVariable("placeId"));
    }

    public ServerResponse modifyPlace(ServerRequest serverRequest) {
        return ok().body(true);
    }
    public ServerResponse removePlace(ServerRequest serverRequest) {
        return ok().body(true);
    }
}
