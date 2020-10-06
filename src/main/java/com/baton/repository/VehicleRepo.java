package com.baton.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baton.model.*;

@Repository
@Transactional
public interface VehicleRepo extends CrudRepository<Vehicle, Integer>  
{  
}  