package com.acko.newsLetter.Services;

import com.acko.newsLetter.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(User user);
}
