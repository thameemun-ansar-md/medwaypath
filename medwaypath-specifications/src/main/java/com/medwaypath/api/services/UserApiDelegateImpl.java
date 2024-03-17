package com.medwaypath.api.services;

import com.medwaypath.dal.dao.UserDao;
import java.math.BigDecimal;
import javax.validation.Valid;
import org.openapitools.api.UserApi;
import org.openapitools.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiDelegateImpl implements UserApi {
  @Autowired UserDao userDao;

  @Override
  public ResponseEntity<User> getUser(BigDecimal userId) {
    User user = new User();
    BeanUtils.copyProperties(userDao.getUsers(userId.longValue()), user);
    return new ResponseEntity<User>(user, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<User> saveUser(@Valid User user) {
    com.medwaypath.dal.entities.User person = new com.medwaypath.dal.entities.User();
    BeanUtils.copyProperties(user, person);
    BeanUtils.copyProperties(userDao.saveUsers(person), user);
    return new ResponseEntity<User>(user, HttpStatus.OK);
  }
}
