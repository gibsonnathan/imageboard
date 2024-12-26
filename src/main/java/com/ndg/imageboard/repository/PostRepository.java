package com.ndg.imageboard.repository;

import com.ndg.imageboard.entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

  @Query(
      value =
          """
            SELECT *
            FROM posts
            WHERE thread_id = :threadId
            ORDER BY created_at DESC
            LIMIT 3""",
      nativeQuery = true)
  List<Post> getMostRecentPosts(Long threadId);
}
