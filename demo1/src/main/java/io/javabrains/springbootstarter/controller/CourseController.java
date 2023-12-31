package io.javabrains.springbootstarter.controller;

import io.javabrains.springbootstarter.entity.Course;
import io.javabrains.springbootstarter.service.CourseService;
import io.javabrains.springbootstarter.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    // @PathVariable("id")
    public Optional<Course> getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourses(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    // @PathVariable("id")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
