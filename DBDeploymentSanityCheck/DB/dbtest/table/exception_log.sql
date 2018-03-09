DROP TABLE dbtest.exception_log
/
CREATE TABLE dbtest.exception_log
(
   id                NUMBER(21)     not null,
   module_name       VARCHAR2(100)  not null,
   user_def_message  VARCHAR2(4000) not null,
   stack             CLOB,
   params            CLOB,
   ins_ts            TIMESTAMP(6) DEFAULT SYSTIMESTAMP NOT NULL
)
TABLESPACE small_data
LOGGING
/
ALTER TABLE dbtest.exception_log ADD CONSTRAINT pk_exception_log PRIMARY KEY (ID)
USING INDEX TABLESPACE small_idx
LOGGING
/
