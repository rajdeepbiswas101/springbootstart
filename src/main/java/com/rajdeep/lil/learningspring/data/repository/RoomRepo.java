package com.rajdeep.lil.learningspring.data.repository;

import com.rajdeep.lil.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends CrudRepository<Room,Long> {

}
