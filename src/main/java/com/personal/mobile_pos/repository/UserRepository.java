package com.personal.mobile_pos.repository;

import com.personal.mobile_pos.entity.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<DAOUser, Integer> {

    DAOUser findByUsername(String username);

}
