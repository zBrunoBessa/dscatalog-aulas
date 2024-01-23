package com.brunobessa.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunobessa.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}