package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.FiatMoney;
import org.springframework.data.repository.CrudRepository;

public interface FiatRepository extends CrudRepository<FiatMoney, Long> {

  //this is empty but we are pulling in everything from CrudRepository
}
