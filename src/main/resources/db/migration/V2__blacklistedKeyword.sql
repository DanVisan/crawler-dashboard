create table blacklisted_keyword
(
    id int not null,
    keyword varchar(255) not null,
    constraint blacklisted_keyword_pk
        primary key (id)
);
