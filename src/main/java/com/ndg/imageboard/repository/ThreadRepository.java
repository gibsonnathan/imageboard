package com.ndg.imageboard.repository;

import com.ndg.imageboard.entity.Thread;
import java.time.Instant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepository extends JpaRepository<Thread, Long> {

  @Query(
      value =
          """
              SELECT t.*
              FROM threads t
              LEFT JOIN (
                SELECT thread_id, MAX(created_at) AS latest_post
                FROM posts
                GROUP BY thread_id
              ) p ON t.id = p.thread_id
              WHERE t.board_id = :boardId AND latest_post < :before
              ORDER BY COALESCE(p.latest_post, t.created_at) DESC
              LIMIT 10;
              """,
      nativeQuery = true)
  List<Thread> findTenThreadsOrderedByLatestPost(Long boardId, Instant before);
}
