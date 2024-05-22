package it.nextdevs.EsercizioS2G3.repository;

import it.nextdevs.EsercizioS2G3.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
