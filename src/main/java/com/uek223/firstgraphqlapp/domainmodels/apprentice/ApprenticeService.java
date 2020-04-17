package com.uek223.firstgraphqlapp.domainmodels.apprentice;

import java.util.List;

public interface ApprenticeService {

    Apprentice create(Apprentice apprentice);

    List<Apprentice> findAll();

    Apprentice findById(int id);

    Apprentice updateById(int id, Apprentice apprentice);

    void deleteById(int id);
}
