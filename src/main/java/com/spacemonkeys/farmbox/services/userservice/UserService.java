package com.spacemonkeys.farmbox.services.userservice;

import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    void delete(Long id);
    User update(User user, Long id);
    List findAll();
    Optional<User> findById(Long id);

}
