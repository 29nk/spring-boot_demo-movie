package com.mindnerves.movie.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.*;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> handleGetAllMovies(){
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }
    public Movie handleGetMovie(String id){
        return movieRepository.findById(id).get();
    }

    public void handlePostMovie(String id, Movie movie){
        movieRepository.save(movie);
    }

    public void handlePutMovie(String id, Movie movie){
        movieRepository.save(movie);
    }

    public void handleDeleteMovie(String id){
        movieRepository.deleteById(id);
    }
}
