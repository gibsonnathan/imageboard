@import com.ndg.imageboard.entity.Board
@import com.ndg.imageboard.entity.Thread
@import java.util.List

@param Board board
@param List<Thread> threads

<div>${board.getName()}</div>
<div>${board.getDescription()}</div>
@for(var thread: threads)
    <div class="thread" id="thread-${thread.getId()}">
        id:${thread.getId()}
        created: ${thread.getCreatedAt().toString()}
        <div>
            ${thread.getTitle()}
        </div>
        <div>
            ${thread.getContent()}
        </div>
    </div>
@endfor