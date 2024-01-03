package org.tolga.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tolga.repository.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {



}
