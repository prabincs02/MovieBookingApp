package com.example.prabin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prabin.entity.Show;

@Repository
public interface ShowRepo extends JpaRepository<Show, Long>{
	
	Optional<List<Show>> findByMovieId(long movieid);
	
	Optional<List<Show>> findByTheaterId(long theaterid);

}
