create table GAUGEDEMO_KPI (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INDICATOR_ varchar(255),
    BASELINE integer,
    TARGET integer,
    ACTUAL integer,
    --
    primary key (ID)
);
