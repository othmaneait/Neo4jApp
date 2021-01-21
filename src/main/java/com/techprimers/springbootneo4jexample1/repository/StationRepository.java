package com.techprimers.springbootneo4jexample1.repository;

import com.techprimers.springbootneo4jexample1.model.Station;
import com.techprimers.springbootneo4jexample1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface StationRepository extends Neo4jRepository<Station, Long> {

    @Query("MATCH (u:Station) RETURN u")
    Collection<Station> getAllStations();
}
