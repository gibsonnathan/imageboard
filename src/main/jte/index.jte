@import com.ndg.imageboard.entity.Board
@import java.util.List

@param List<Board> boards

<!DOCTYPE html>
<html>

<head>
    <title>Image Board</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://unpkg.com/htmx.org@2.0.4"
            integrity="sha384-HGfztofotfshcF7+8n44JQL2oJmowVChPTg48S+jvZoztPfvwD79OC/LTtG6dMp+" crossorigin="anonymous">
    </script>
</head>
<body>
<header id="header">
    <nav>
        <ul>
            @for(var board : boards)
                <a hx-get="${"/boards/" + board.getId()}" hx-target="#content">${board.getName()}</a>
            @endfor
        </ul>
    </nav>
</header>
<div id="content"></div>
</body>
</html>