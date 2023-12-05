package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.entity.Course;
import io.javabrains.springbootstarter.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course> courses = new ArrayList<>(Arrays.asList(
//            new Course("Spring", "Spring Framework", "Spring Framework Description"),
//            new Course("React", "React Framework", "React Framework Description"),
//            new Course("Java", "Java Framework", "Java Framework Description")
//    ));

    public List<Course> getAllCourses(String topicId){
//        return topics;

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses :: add);

        return courses;
    }

    public Optional<Course> getCourse(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
//        topics.add(topic);

        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
//        for(int i = 0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }

        courseRepository.deleteById(id);

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
//        topics.removeIf(t -> t.getId().equals(id));

        courseRepository.deleteById(id);
    }
}
