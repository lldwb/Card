create
    database CardDB;

use
    CardDB;

create table BookCard
(
    cid         int         not null auto_increment primary key,
    name        varchar(20) not null,
    sex         char(1)     not null,
    create_date datetime    not null,
    deposit     decimal     not null
) AUTO_INCREMENT = 1001;

insert into BookCard(name, sex, create_date, deposit)
values ('张三', '男', '2023-1-1', 100);
insert into BookCard(name, sex, create_date, deposit)
values ('李四', '男', '2020-4-1', 300);
insert into BookCard(name, sex, create_date, deposit)
values ('潍坊', '女', '2023-8-1', 500);

select *
from BookCard;