package com.baton.repository;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baton.model.Level;

@Repository
@Transactional
public interface LevelRepo extends CrudRepository<Level, Integer> {
}