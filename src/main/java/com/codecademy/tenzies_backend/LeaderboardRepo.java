package com.codecademy.tenzies_backend;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LeaderboardRepo extends MongoRepository<LeaderBoard,String> {
    List<LeaderBoard> findAllByOrderByTimeAsc();
}
