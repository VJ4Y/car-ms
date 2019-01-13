package com.yondu.carms.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yondu.carms.domain.Car;

@CrossOrigin
@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

	Optional<Car> findOneById(int id);
}
