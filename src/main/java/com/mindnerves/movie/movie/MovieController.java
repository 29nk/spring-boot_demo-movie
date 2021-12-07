package com.mindnerves.movie.movie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String welcomePage(){
        return "<h1>Welcome to MovieFlix</h1><h2>Grab your popcorn and start reading, please :)</h2>";
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.handleGetAllMovies();
    }

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable String id){
        return movieService.handleGetMovie(id);
    }

    @PostMapping("/movie/{id}")
    public void postMovie(@PathVariable String id, @RequestBody Movie movie){
       movieService.handlePostMovie(id, movie);
    }

    @PutMapping("/movie/{id}")
    public void putMovie(@PathVariable String id, @RequestBody Movie movie){
        movieService.handlePutMovie(id, movie);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovie(@PathVariable String id){
        movieService.handleDeleteMovie(id);
    }
}

