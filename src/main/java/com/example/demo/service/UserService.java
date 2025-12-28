// package com.example.demo.service;

// import com.example.demo.entity.User;
// import com.example.demo.exception.ResourceNotFoundException;

// public interface UserService {

//     User register(User user);

//     User findByEmail(String email) throws ResourceNotFoundException;

//     User findById(Long userId) throws ResourceNotFoundException;
// }
package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User register(User user);

    User findByEmail(String email);
}