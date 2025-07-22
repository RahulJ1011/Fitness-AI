package com.fitness.activityService.controller;


import com.fitness.activityService.dto.ActivityRequest;
import com.fitness.activityService.dto.ActivityResponse;
import com.fitness.activityService.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController
{

    private ActivityService activityservice;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request)
    {
        return ResponseEntity.ok(activityservice.trackActivity(request));
    }


    @GetMapping
    public ResponseEntity <List<ActivityResponse>> getUserActivity(@RequestHeader("X-User-ID") String UserID)
    {
        return ResponseEntity.ok(activityservice.getUseractivities(UserID));
    }

    @GetMapping("/{activityId}")
    public ResponseEntity <ActivityResponse> getActivity(@PathVariable String activityId)
    {
        return ResponseEntity.ok(activityservice.getActivityById(activityId));
    }

}
