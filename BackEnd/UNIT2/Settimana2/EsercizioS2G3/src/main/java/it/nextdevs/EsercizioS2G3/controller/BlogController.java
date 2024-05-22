package it.nextdevs.EsercizioS2G3.controller;


import it.nextdevs.EsercizioS2G3.DTO.BlogDTO;
import it.nextdevs.EsercizioS2G3.exception.BlogNonTrovatoException;
import it.nextdevs.EsercizioS2G3.model.Autore;
import it.nextdevs.EsercizioS2G3.model.Blog;
import it.nextdevs.EsercizioS2G3.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/blogList")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveBlog(@RequestBody BlogDTO blogDTO){
        return blogService.saveBlog(blogDTO);
    }

    @GetMapping("/blogposts")
    public Page<Blog> getAllBlogs(@RequestParam (defaultValue = "0") int page,
                                  @RequestParam (defaultValue = "15") int size,
                                  @RequestParam (defaultValue = "id") String sortBy) {
        return blogService.getAllBlogs( page, size, sortBy);
    }

    @GetMapping("/blogList/{id}")
    public Blog getBlogById(@PathVariable int id) throws BlogNonTrovatoException {
        Optional<Blog> blogOpt = blogService.getBlogById(id);
        if (blogOpt.isPresent()) {
            return blogOpt.get();
        } else {
            throw new BlogNonTrovatoException("Studente con id " + id + " non trovato");
        }
    }
    @PutMapping("/blogList/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Blog updateBlog(@PathVariable int id,@RequestBody BlogDTO blogDTO) throws BlogNonTrovatoException{
        return blogService.updateBlog(id,blogDTO);
    }

    @DeleteMapping("/blogList/{id}")
    public String deleteBlog(@PathVariable int id) throws BlogNonTrovatoException {
        return blogService.deleteBlog(id);
    }

}
