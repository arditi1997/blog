package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

	public User findByName(String name);

	public User findByResetToken(String reset);

}
