package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.ContaUsuario;
import com.betha.exemplo.exemplo.model.Feed;
import com.betha.exemplo.exemplo.repository.ContaUsuarioRepository;
import com.betha.exemplo.exemplo.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/contas-usuarios-feeds")
public class FeedController {

    @Autowired
    private FeedRepository repository;

    @GetMapping
    public List<Feed> getFeeds() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Feed> create(@Valid @RequestBody Feed feed) {
        return ResponseEntity.ok(repository.save(feed));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
