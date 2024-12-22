CREATE TABLE boards (
  id INT AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (id)
);

CREATE TABLE users (
  id INT AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password_hash VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE threads (
  id INT AUTO_INCREMENT,
  board_id INT NOT NULL,
  title VARCHAR(255) NOT NULL,
  content TEXT,
  PRIMARY KEY (id),
  FOREIGN KEY (board_id) REFERENCES boards(id)
);

CREATE TABLE posts (
  id INT AUTO_INCREMENT,
  thread_id INT NOT NULL,
  user_id INT NOT NULL,
  content TEXT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (thread_id) REFERENCES threads(id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE images (
  id INT AUTO_INCREMENT,
  post_id INT NOT NULL,
  image_url VARCHAR(255) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (post_id) REFERENCES posts(id)
);