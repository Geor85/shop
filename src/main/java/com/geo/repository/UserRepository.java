package com.geo.repository;

import com.geo.entity.User;
import com.geo.entity.role.UserRole;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
    ArrayList<User> findAllBy(Pageable pageable);
    ArrayList<User> findAllByRole(UserRole role, Pageable pageable);
    ArrayList<User> findByLoginLikeOrNameLikeOrSurnameLikeOrPatronymicLikeOrPhoneLikeOrAddressLike(String login,
                                                                                                   String name ,
                                                                                                   String surname,
                                                                                                   String Patronymic,
                                                                                                   String phone,
                                                                                                   String address,
                                                                                                   Pageable pageable);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.login = :login")
    boolean existsByLogin(@Param("login") String login);

}
