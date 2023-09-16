package com.example.modeltodo.repository;

import com.example.modeltodo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Long, User> {
}
