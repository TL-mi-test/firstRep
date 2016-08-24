package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDataRepository
        extends JpaRepository<Table2, Integer> {
//	@Query("SELECT id,table1id,value FROM Table2 WHERE id = 2")
	Iterable <Table2> findById(Integer id);

//	@Query(value = "SELECT * FROM Table2 WHERE id = :id", nativeQuery = true)
//	@Query("SELECT t FROM Table2 t WHERE t.id = :id")
	@Query("SELECT new Table2(t.id, t.table1id, t.value) FROM Table2 t WHERE t.id between :id1 and :id2")
	Iterable <Table2> findSpecifiedData(@Param("id1") Integer id1 ,@Param("id2") Integer id2);

}