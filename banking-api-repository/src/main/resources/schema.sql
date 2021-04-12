create table ACCOUNT
(
    ID int null,
    TYPE varchar(100) null,
    NUMBER varchar(100) null,
    IBAN varchar(100) null,
    CREATE_TIME datetime default CURRENT_TIMESTAMP null
);