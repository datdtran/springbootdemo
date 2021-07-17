insert into student (id, dob, email, name) VALUES (nextval('student_sequence'), '2011-06-06', 'yewon@gmail.com', 'YuYewon');
insert into student (id, dob, email, name) values (nextval('student_sequence'), '2008-09-22', 'cristine@gmail.com', 'Cristina');

insert into course (id, name) values (1, 'Data Structure and Algorithm');
insert into course (id, name) values (2, 'Object Oriented Programming');

insert into course_registration (course_id, student_id, registered_at, grade) values (1, 1, '2021-05-06', 5);
insert into course_registration (course_id, student_id, registered_at, grade) values (1, 2, '2021-05-06', 7);
insert into course_registration (course_id, student_id, registered_at, grade) values (2, 1, '2021-05-06', 9);
insert into course_registration (course_id, student_id, registered_at, grade) values (2, 2, '2021-05-06', 10);
