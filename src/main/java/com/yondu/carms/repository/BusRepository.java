package com.yondu.carms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yondu.carms.domain.Bus;

@CrossOrigin
@Repository
public interface BusRepository extends CrudRepository<Bus, String> {

}

