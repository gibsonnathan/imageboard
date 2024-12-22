INSERT INTO users (id, username, email, password) VALUES
  (1, 'johnDoe', 'john@example.com', 'password123'),
  (2, 'janeDoe', 'jane@example.com', 'password456'),
  (3, 'admin', 'admin@example.com', 'adminpassword');

INSERT INTO boards (id, name, description) VALUES
  (1, 'General', 'General discussion board'),
  (2, 'Technology', 'Technology-related discussion board');

INSERT INTO threads (id, board_id, title, content) VALUES
  (1, 1, 'Hello World!', 'This is my first post!'),
  (2, 2, 'New Smartphone Release', 'Just heard about the new smartphone release...'),
  (4, 1, 'Weekend Plans', 'Anyone have any fun plans for the weekend?'),
  (5, 2, 'AI Technology', 'What do you think about the latest advancements in AI technology?');

INSERT INTO posts (id, thread_id, user_id, content) VALUES
  (1, 1, 1, 'This is my first post!'),
  (2, 1, 2, 'Welcome to the community!'),
  (3, 2, 3, 'I heard the new smartphone has an amazing camera...'),
  (5, 4, 2, 'I\'m planning a hike this weekend!'),
  (6, 5, 3, 'AI technology has the potential to revolutionize many industries...'),
  (7, 1, 3, 'Thanks for the welcome!'),
  (8, 2, 1, 'Yeah, the camera is supposed to be amazing...'),
  (10, 4, 3, 'Hiking is a great way to get some exercise...');

INSERT INTO images (id, post_id, image_url) VALUES
  (1, 3, 'https://example.com/image1.jpg'),
  (2, 6, 'https://example.com/image2.png');
