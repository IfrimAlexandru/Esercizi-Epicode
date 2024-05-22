package it.nextdevs.EsercizioS2G3.service;


import it.nextdevs.EsercizioS2G3.DTO.BlogDTO;
import it.nextdevs.EsercizioS2G3.exception.AutoreNonTrovatoException;
import it.nextdevs.EsercizioS2G3.exception.BlogNonTrovatoException;
import it.nextdevs.EsercizioS2G3.model.Autore;
import it.nextdevs.EsercizioS2G3.model.Blog;
import it.nextdevs.EsercizioS2G3.repository.AutoreRepository;
import it.nextdevs.EsercizioS2G3.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private AutoreRepository autoreRepository;


    public String saveBlog(BlogDTO blogDTO) {
        Blog blog = new Blog();
        blog.setTitolo(blogDTO.getTitolo());
        blog.setContenuto(blogDTO.getContenuto());
        blog.setCategoria(blogDTO.getCategoria());
        blog.setTempoDiLettura(blogDTO.getTempoDiLettura());
        blogRepository.save(blog);

        Optional<Autore> autoreOpt = autoreRepository.findById(blogDTO.getAutoreId());
        if(autoreOpt.isPresent()){
            Autore autore = autoreOpt.get();
            blog.setAutore(autore);
            blogRepository.save(blog);
            return "BlogPost "+ blog.getId()+ "salvato con successo";
        }else {
            throw new AutoreNonTrovatoException("Autorecon id" + blog.getId()+"non trovata");
        }
    }


    public Page<Blog> getAllBlogs(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return blogRepository.findAll(pageable);
    }

    public Optional<Blog> getBlogById(int id) {
        return blogRepository.findById(id);

    }

    public Blog updateBlog(int id, BlogDTO blogDTO) throws BlogNonTrovatoException {
        Optional<Blog> blogOpt = getBlogById(id);

        if (blogOpt.isPresent()) {
            Blog blog = blogOpt.get();

            blog.setTitolo(blogDTO.getTitolo());
            blog.setContenuto(blogDTO.getContenuto());
            blog.setCategoria(blogDTO.getCategoria());
            blog.setTempoDiLettura(blogDTO.getTempoDiLettura());

            Optional<Autore> autoreOpt = autoreRepository.findById(blogDTO.getAutoreId());

            if(autoreOpt.isPresent()){
                Autore autore = autoreOpt.get();
                blog.setAutore(autore);
                blogRepository.save(blog);
            return blog;
        } else {
                throw new AutoreNonTrovatoException("Autore con id: " + blog.getId()+" non trovato");
            }
    }else {
            throw new BlogNonTrovatoException("BlogPost con id: " + id + " non trovato");
        }
    }



    public String deleteBlog(int id) throws BlogNonTrovatoException{
        Optional<Blog> blogOpt = getBlogById(id);
        if (blogOpt.isPresent()) {
            Blog blog = blogOpt.get();
            blogRepository.deleteById(blog.getId());
            return "Blog con id: " + id +" eliminato con successo";
        } else {
            throw new BlogNonTrovatoException("Blog non trovato");
        }
    }
}
