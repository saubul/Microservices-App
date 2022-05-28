package ru.saubulprojects.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.saubulprojects.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
