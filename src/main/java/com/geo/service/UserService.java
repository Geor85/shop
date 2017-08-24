package com.geo.service;

import com.geo.entity.User;
import com.geo.entity.role.UserRole;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    User getUserByLogin(String login);
    User getUserById(Long id);
    ArrayList<User> getAllUsers(Pageable pageable);
    ArrayList<User> getAllCustomers(Pageable pageable);
    ArrayList<User> getAllAdmins(Pageable pageable);
    ArrayList<User> findUsersbyAllColumns(String searchWord, Pageable pageable);
    boolean existsByLogin(String login);
    void addUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
}
