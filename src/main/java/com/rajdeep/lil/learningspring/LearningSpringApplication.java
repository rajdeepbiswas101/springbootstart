package com.rajdeep.lil.learningspring;

import com.rajdeep.lil.learningspring.data.entity.Room;
import com.rajdeep.lil.learningspring.data.repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		private RoomRepo roomRepository;

		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}
	}
}
