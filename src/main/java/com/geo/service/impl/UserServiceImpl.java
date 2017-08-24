package com.geo.service.impl;

import com.geo.entity.User;
import com.geo.entity.role.UserRole;
import com.geo.repository.UserRepository;
import com.geo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User getUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public ArrayList<User> getAllUsers(Pageable pageable) {
        return userRepository.findAllBy(pageable);
    }

    @Override
    @Transactional
    public ArrayList<User> getAllCustomers(Pageable pageable) {
        return userRepository.findAllByRole(UserRole.USER, pageable);
    }

    @Override
    @Transactional
    public ArrayList<User> getAllAdmins(Pageable pageable) {
        return userRepository.findAllByRole(UserRole.ADMIN, pageable);
    }

    @Override
    @Transactional
    public ArrayList<User> findUsersbyAllColumns(String searchWord, Pageable pageable) {
        String sw = "%" + searchWord + "%";
        return userRepository.findByLoginLikeOrNameLikeOrSurnameLikeOrPatronymicLikeOrPhoneLikeOrAddressLike(sw, sw,
                sw, sw, sw, sw,
                pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsByLogin(String login) {

        return userRepository.existsByLogin(login);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
    userRepository.delete(id);
    }
}
