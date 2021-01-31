package com.example.springdata;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface Repo extends Repository<FakeEntity, Long> {

    @Query(value = "select * from func(?1, ?2)", nativeQuery = true)
    List<Looser> getLosersBetween(int from, int to);
}
