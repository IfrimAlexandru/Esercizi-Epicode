package it.nextdevs.PraticaS2G2U2Backend.service;

import it.nextdevs.PraticaS2G2U2Backend.exception.BlogNonTrovatoException;
import it.nextdevs.PraticaS2G2U2Backend.model.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private List<Blog> blogList = new ArrayList<>();

    public Optional <Blog> getBlogById(int id) {
        return blogList.stream().filter(blog -> blog.getId() == id).findFirst();
    }

    public List<Blog> getAllBlogs() {
        return blogList;
    }

    public String saveBlog(Blog blog) {
        blogList.add(blog);
        return "Blog salvato con successo, id: " + blog.getId();
    }

    public Blog updateBlog(int id, Blog blogUpd) throws BlogNonTrovatoException{
        Optional<Blog> blogOpt = getBlogById(id);
        if (blogOpt.isPresent()) {
            Blog blog = blogOpt.get();
            blog.setTitolo(blogUpd.getTitolo());
            blog.setContenuto(blogUpd.getContenuto());
            blog.setCategoria(blogUpd.getCategoria());
            blog.setTempoDiLettura(blogUpd.getTempoDiLettura());
            return blog;
        } else {
            throw new BlogNonTrovatoException("Blog non trovato");
        }
    }

    public String deleteBlog(int id) throws BlogNonTrovatoException{
        Optional<Blog> blogOpt = getBlogById(id);
        if (blogOpt.isPresent()) {
            blogList.remove(blogOpt.get());
            return "Blog eliminato con successo";
        } else {
            throw new BlogNonTrovatoException("Blog non trovato");
        }
    }
}
