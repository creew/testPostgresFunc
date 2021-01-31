create table losers
(
    id   bigserial primary key,
    name varchar(256),
    age  int4
);

insert into losers (name, age)
values ('jonny', 10),
       ('tommy', 5),
       ('henry', 12),
       ('li', 20);

create or replace function func(from1 int4, to1 int4)
    returns table
            (
                name varchar(256),
                age  int4
            )
as
$$
select name, age
from losers
where age between from1 and to1;
$$
    LANGUAGE sql;