package com.altbruno.movie.service;

import com.altbruno.movie.dto.MovieDTO;
import com.altbruno.movie.model.Movie;
import com.altbruno.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public Movie salvar(MovieDTO movieDTO) {
		Movie movie = new Movie();
		movie.setName(movieDTO.getName());
		movie.setGenre(movieDTO.getGenre());
		movie.setUrlStream(movieDTO.getUrlStream());
		return movieRepository.save(movie);
	}

	public List<Movie> listarPorGenero(String genre){
		return movieRepository.findByGenreIgnoreCase(genre);
	}
}
