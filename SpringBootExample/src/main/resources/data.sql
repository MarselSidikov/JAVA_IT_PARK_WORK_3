INSERT INTO news_user
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@admin.com',
    '$2a$10$CVYX7vIc3a7nz7cWiGj0xeBUlAfcg7dVtWc2n5hQv7CNzTD4UGxeK',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM news_user
        WHERE id = 1
    );

CREATE TABLE IF NOT EXISTS persistent_logins (
  username VARCHAR(64) NOT NULL,
  series VARCHAR(64) PRIMARY KEY NOT NULL,
  token VARCHAR(64) NOT NULL,
  last_used TIMESTAMP NOT NULL
)