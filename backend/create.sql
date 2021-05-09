create sequence hibernate_sequence start with 1 increment by  1;
create table tb_sales (id number(19,0) not null, amount double precision, date date, deals number(10,0), visited number(10,0), seller_id number(19,0), primary key (id));
create table tb_sellers (id number(19,0) not null, name varchar2(255 char), primary key (id));
alter table tb_sales add constraint FKp0nn0oixeiw2fq3jivj6vnsu foreign key (seller_id) references tb_sellers;

