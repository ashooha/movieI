package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import web.service.movieService;

@Controller
@RequestMapping("movie")
public class movieController {

    @Autowired
    private movieService movieService;

    @RequestMapping(value = "index")
    public ModelAndView getAllMovies(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping(value = "listMovies")
    public  ModelAndView listMovies(){
        ModelAndView mav = new ModelAndView("layout/center");
        mav.addObject(movieService.getAllMovies());
        return mav;
    }

    @RequestMapping(value = "id={movieId}")
    public ModelAndView movieDetails(@PathVariable int movieId){
        ModelAndView mav = new ModelAndView("movieDetail");
        mav.addObject(movieService.getMovieById(movieId));
        mav.addObject(movieService.getMovieShows(movieId));
        return mav;
    }


}
