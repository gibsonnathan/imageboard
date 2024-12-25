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
          "SELECT * FROM threads WHERE board_id = :boardId and created_at < :time order by created_at desc LIMIT 10",
      nativeQuery = true)
  List<Thread> findTenThreads(Long boardId, Instant time);
}
