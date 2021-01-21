package com.techprimers.springbootneo4jexample1.repository;

import com.techprimers.springbootneo4jexample1.model.Transport;
import com.techprimers.springbootneo4jexample1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface TransportRepository extends Neo4jRepository<Transport, Long> {

    @Query("MATCH (u:Transport) RETURN u")
    Collection<Transport> getAllTransports();
}
