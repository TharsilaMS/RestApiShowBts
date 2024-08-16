package showBts.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import showBts.demo.model.Show;
import showBts.demo.repository.ShowRepository;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show savedShow = showRepository.save(show);
        return ResponseEntity.ok(savedShow);
    }

    @GetMapping
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}

