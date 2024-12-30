DELETE FROM user;

INSERT INTO
    user (id, name, email, phone, address, remark, role, status, create_time, update_time, deleted)
VALUES
    (1, 'Dale', 'dale@example.com', 123456789, 'Beijing', 'For Test', 1, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0),
    (2, 'Alice', 'alice@example.com', 987654321, 'Shanghai', 'Sample User', 2, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0),
    (3, 'Bob', 'bob@example.com', 555555555, 'New York', 'Another User', 3, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0),
    (4, 'Charlie', 'charlie@example.com', 444444444, 'London', 'Test User', 1, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0),
    (5, 'Eve', 'eve@example.com', 333333333, 'Berlin', 'Example User', 2, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 0)