package it.nextdevs.PraticaS2G2U2Backend.controller;

import it.nextdevs.PraticaS2G2U2Backend.exception.BlogNonTrovatoException;
import it.nextdevs.PraticaS2G2U2Backend.model.Blog;
import it.nextdevs.PraticaS2G2U2Backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/api/blogList")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @GetMapping("/api/blogList")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/api/blogList/{id}")
    public Blog getBlogById(@PathVariable int id) throws BlogNonTrovatoException {
        Optional<Blog> blogOpt = blogService.getBlogById(id);
        if (blogOpt.isPresent()) {
            return blogOpt.get();
        } else {
            throw new BlogNonTrovatoException("Studente con id " + id + " non trovato");
        }
    }
    @PutMapping("/api/blogList/{id}")
    public Blog updateBlog(@PathVariable int id,@RequestBody Blog blog) throws BlogNonTrovatoException{
        return blogService.updateBlog(id,blog);
    }

    @DeleteMapping("/api/blogList/{id}")
    public String deleteBlog(@PathVariable int id) throws BlogNonTrovatoException {
        return blogService.deleteBlog(id);
    }

}
