package me.hwanghyejin.springbootdeveloper.repository;

import me.hwanghyejin.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
