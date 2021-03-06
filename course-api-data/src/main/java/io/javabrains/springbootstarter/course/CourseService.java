package io.javabrains.springbootstarter.course;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Course> topics = new ArrayList<>(Arrays.asList(
//			new Course("spring", "Spring FrameWork", "Spring FrameWork Desc"),
//			new Course("java", "java", "java FrameWork Desc"), new Course("js", "js FrameWork", "js FrameWork Desc")));

	public List<Course> getAllCourses(String topicId) {
//		return topics;
		List<Course> courses = new ArrayList<>();
		
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(String id) {
//		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
//		topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
