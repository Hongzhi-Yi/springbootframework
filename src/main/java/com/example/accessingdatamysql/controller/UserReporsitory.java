package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.User;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

interface UserRepository extends CrudRepository<User, Integer> {

}