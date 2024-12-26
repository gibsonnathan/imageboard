@import com.ndg.imageboard.entity.Board
@import com.ndg.imageboard.entity.Post
@import com.ndg.imageboard.entity.Thread
@import java.util.LinkedHashMap
@import java.util.List

@param Board board
@param LinkedHashMap<Thread, List<Post>> threadsToPosts

<div>${board.getName()}</div>
<div>${board.getDescription()}</div>
@for(var thread: threadsToPosts.keySet().stream().toList())
    <div class="thread" id="thread-${thread.getId()}">
        id:${thread.getId()}
        created: ${thread.getCreatedAt().toString()}
        <div>
            ${thread.getTitle()}
        </div>
        <div>
            ${thread.getContent()}
        </div>
        @for(var post : threadsToPosts.get(thread))
            <div class="post" id="post-${post.getId()}">
                id:${post.getId()}
                created: ${post.getCreatedAt().toString()}
                <div>${post.getContent()}</div>
            </div>
        @endfor
    </div>
@endfor