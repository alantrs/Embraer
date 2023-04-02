package com.carcaratec.embraer.repository;

import com.carcaratec.embraer.model.Item;
import com.carcaratec.embraer.model.Logica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogicaRepository extends JpaRepository<Logica, Integer> {

    @Query(value = "SELECT * FROM LOGICA_BOLETIM WHERE ID_ITEM = ?1", nativeQuery = true)
    List<Logica> findByItem (Integer item);
}
