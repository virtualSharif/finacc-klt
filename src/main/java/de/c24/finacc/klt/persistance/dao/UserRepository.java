package de.c24.finacc.klt.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.c24.finacc.klt.persistance.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}