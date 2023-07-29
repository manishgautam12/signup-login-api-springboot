package com.userform.userform.dao;

import org.springframework.data.repository.CrudRepository;

import com.userform.userform.entities.UserModel;

public interface UserRepository extends CrudRepository<UserModel,Integer> {
    public UserModel findById(int id);
    
}
