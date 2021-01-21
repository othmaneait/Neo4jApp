package com.techprimers.springbootneo4jexample1.repository;

import com.techprimers.springbootneo4jexample1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User) RETURN u")
    Collection<User> getAllUsers();
    @Query("CREATE (n:User $r) return n")
    User adduser(@Param("r") User r);
@Query("match(n:User{nom:$a})  \n" +
        "match(m:Transport{nom:'bus'}) \n" +
        "create (n)-[r:Rated{Rated:'$b'}]->(m) \n"+
           "return n")
    User changebus(@Param("a") String a,@Param("b") int b  );
    @Query("match(n:User{nom:$a})  \n" +
            "match(m:Transport{nom:'tram'}) \n" +
            "create (n)-[r:Rated{Rated:'$b'}]->(m) \n"+
            "return n")
    User changetram(@Param("a") String a,@Param("b") int b  );
    @Query("match(n:User{nom:$a})  \n" +
            "match(m:Transport{nom:'taxi'}) \n" +
            "create (n)-[r:Rated{Rated:'$b'}]->(m) \n"+
            "return n")
    User changetaxi(@Param("a") String a,@Param("b") int b  );
   /* @Query("match(n:User) where ID(n)= $a match(m:Transport{name:'tram'})  CREATE (n)-[r:Rated { Rated: $b}]->(m)  ")
    void changetram(@Param("a") int a,@Param("b") int b  );
    @Query("match(n:User) where ID(n)= $a match(m:Transport{name:'taxi'})  CREATE (n)-[r:Rated { Rated: $b}]->(m)   ")
    void changetaxi(@Param("a") int a,@Param("b") int b  );*/
}
