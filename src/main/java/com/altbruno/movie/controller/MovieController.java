package com.altbruno.movie.controller;

import com.altbruno.movie.dto.MovieDTO;
import com.altbruno.movie.model.Movie;
import com.altbruno.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping
	public ResponseEntity<Movie> salvar(@RequestBody MovieDTO movieDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(movieService.salvar(movieDTO));
	}

	@GetMapping("/{genre}")
	public ResponseEntity<List<Movie>> listarPorGenero(@PathVariable String genre) {
		return ResponseEntity.status(HttpStatus.OK).body(movieService.listarPorGenero(genre));
	}
}
