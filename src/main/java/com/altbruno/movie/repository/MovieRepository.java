package com.altbruno.movie.repository;

import com.altbruno.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	List<Movie> findByGenre(String genre);
}
