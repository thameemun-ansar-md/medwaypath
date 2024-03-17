package com.medwaypath.dal.dao;

import com.medwaypath.dal.entities.User;
import java.util.Optional;

public interface UserDao {
  User saveUsers(User user);

  Optional<User> getUsers(long id);
}
