package com.nasaroverproject.marsroverproject;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.nasaroverproject.marsroverproject.response.MarsRoverAPIResponse;

public class MarsRoverAPITest {
    
    //Can test without firing up a webserver.
    @Test
    public void marsRoverAPITest() {
        System.out.println("Running API test for MARS Rover");
        RestTemplate rt = new RestTemplate();
        ResponseEntity<MarsRoverAPIResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=3&api_key=MIfrQgUEdTg9EvvZ57udoe4wOKBRl6NW6DKOc4zR", MarsRoverAPIResponse.class);
        System.out.println(response.getBody());
    }

}
