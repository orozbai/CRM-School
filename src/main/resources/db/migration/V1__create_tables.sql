create table subjects
(
    id      serial primary key,
    subject varchar(100)
)

create table instructors
(
    id           serial primary key,
    first_name   varchar(50) not null,
    last_name    varchar(50) not null,
    phone_number smallint,
    subject_id   int references subjects (id)
);

create table groups
(
    id            serial primary key,
    group_name    varchar(100),
    instructor_id int references instructors (id)
);

create table students
(
    id           serial primary key,
    first_name   varchar(50) not null,
    last_name    varchar(50) not null,
    phone_number smallint,
    group_id     int references groups (id)
);

create table grades
(
    id          serial primary key,
    student_id  int references students (id),
    subject_id  int references subjects (id),
    grade       int,
    date_given  date
);
