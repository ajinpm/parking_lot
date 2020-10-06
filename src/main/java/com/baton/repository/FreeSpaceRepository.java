package com.baton.repository;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baton.model.FreeSpace;

@Repository
@Transactional
public interface FreeSpaceRepository extends CrudRepository<FreeSpace, Integer> {
}