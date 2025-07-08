package com.codecademy.tenzies_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
@CrossOrigin(origins = "*")
public class LeaderBoardController {
    @Autowired
    private LeaderboardRepo Repo;

    @GetMapping("top")
    public List<LeaderBoard> findAllByOrderByTimeAsc() {
        return Repo.findAllByOrderByTimeAsc();
    }
    @PostMapping
    public LeaderBoard create(@RequestBody LeaderBoard leaderBoard) {
        return Repo.save(leaderBoard);
    }

}
