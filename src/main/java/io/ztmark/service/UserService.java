package io.ztmark.service;

import io.ztmark.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Mark
 * Date  : 16/3/25
 */
@Service
public class UserService {

    private final User user;

    @Autowired
    public UserService(User user) {
        this.user = user;
    }
}
