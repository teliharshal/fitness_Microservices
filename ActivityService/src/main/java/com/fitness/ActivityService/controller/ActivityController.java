package com.fitness.ActivityService.controller;

import com.fitness.ActivityService.dto.ActivityRequest;
import com.fitness.ActivityService.dto.ActiviyResponse;
import com.fitness.ActivityService.services.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActiviyResponse> trackActivity(@RequestBody ActivityRequest request){
       return ResponseEntity.ok(activityService.trackActivity(request));
    }

}
