package com.uek223.firstgraphqlapp.domainmodels.apprentice;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ApprenticeRepository extends CrudRepository<Apprentice, Integer> {
}
