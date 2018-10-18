package com.yondu.carms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yondu.carms.domain.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
