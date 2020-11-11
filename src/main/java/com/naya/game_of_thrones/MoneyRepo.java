package com.naya.game_of_thrones;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MoneyRepo extends PagingAndSortingRepository<Bank,Integer> {

//    @Query("select * from Bank")
    List<Bank> findByFilialNameStartsWith(String prefix);
}
