DROP TABLE IF EXISTS user;
CREATE TABLE
    user (
        id BIGINT NOT NULL COMMENT 'ID',
        name VARCHAR(30) NULL DEFAULT NULL COMMENT 'Name',
        email VARCHAR(50) NULL DEFAULT NULL COMMENT 'Email',
        phone INTEGER NULL DEFAULT NULL COMMENT 'Phone',
        address VARCHAR(100) NULL DEFAULT NULL COMMENT 'Address',
        remark VARCHAR(200) NULL DEFAULT NULL COMMENT 'Remark',
        role TINYINT (1) NULL DEFAULT NULL COMMENT 'Role',
        status TINYINT (1) NULL DEFAULT NULL COMMENT 'Status',
        create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Creation Time',
        update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Update Time',
        deleted TINYINT (1) NOT NULL DEFAULT 0 COMMENT 'Logical Deletion',
        PRIMARY KEY (id)
    );

DROP TABLE IF EXISTS role;

CREATE TABLE
    role (
        id BIGINT NOT NULL COMMENT 'ID',
        name VARCHAR(30) NULL DEFAULT NULL COMMENT 'Name',
        remark VARCHAR(200) NULL DEFAULT NULL COMMENT 'Remark',
        create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Creation Time',
        update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Update Time',
        deleted TINYINT (1) NOT NULL DEFAULT 0 COMMENT 'Logical Deletion',
        PRIMARY KEY (id)
    )