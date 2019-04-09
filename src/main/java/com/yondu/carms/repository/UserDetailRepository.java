package com.yondu.carms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yondu.carms.domain.UserDetail;

@CrossOrigin
@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, String> {

}
