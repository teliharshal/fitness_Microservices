package com.fitness.ActivityService.controller;

import com.fitness.ActivityService.dto.ActivityRequest;
import com.fitness.ActivityService.dto.ActiviyResponse;
import com.fitness.ActivityService.services.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping("/{userId}")
    public List<ActiviyResponse> getUserActivities(@PathVariable  String userId){
        return activityService.getUserActivities(userId);
    }

    @PostMapping
    public ActiviyResponse trackActivity(@RequestBody ActivityRequest request){
       return activityService.trackActivity(request);
    }

}
