package tech.soft.blog_demo.repo;

import org.springframework.data.repository.CrudRepository;
import tech.soft.blog_demo.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
