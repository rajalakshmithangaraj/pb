package com.parambara.domain.user.repository;

import org.springframework.data.repository.CrudRepository;
import com.parambara.domain.user.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
