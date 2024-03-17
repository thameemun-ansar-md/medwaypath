package com.medwaypath.dal.dao.impl;

import com.medwaypath.dal.dao.UserDao;
import com.medwaypath.dal.entities.User;
import com.medwaypath.dal.jpa.UserJPARepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

  @Autowired UserJPARepository userJPARepository;

  @Override
  public User saveUsers(User user) {
    return userJPARepository.save(user);
  }

  @Override
  public Optional<User> getUsers(long id) {
    return userJPARepository.findById(id);
  }
}
