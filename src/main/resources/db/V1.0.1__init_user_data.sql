
CREATE TABLE tbl_user (
  id bigint(20) NOT NULL,
  username varchar(25) NOT NULL,
  password varchar(75) NOT NULL,
  salary bigint(10) NOT NULL,
  age int(2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tbl_user (id, username, password, salary, age) VALUES (1, 'nurvadli', '$2a$10$HfUIgQzT8vcUGvKvUMgpjeGUbNCA07opp06hYE9t3apL/Us3qm5VG', 3456, 33);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (2, 'molebila', '$2a$10$HfUIgQzT8vcUGvKvUMgpjeGUbNCA07opp06hYE9t3apL/Us3qm5VG', 7823, 23);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (3, 'jagus', '$2a$10$HfUIgQzT8vcUGvKvUMgpjeGUbNCA07opp06hYE9t3apL/Us3qm5VG', 4234, 45);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (4, 'sudar', '$2a$10$HfUIgQzT8vcUGvKvUMgpjeGUbNCA07opp06hYE9t3apL/Us3qm5VG', 4234, 40);


-- nurvadli / password
-- molebila / password
-- jagus / password
-- sudar / password