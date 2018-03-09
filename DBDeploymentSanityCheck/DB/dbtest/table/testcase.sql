DROP TABLE dbtest.testcase
/
CREATE TABLE dbtest.testcase
(
  id                NUMBER(21)    NOT NULL,
  code              VARCHAR2(40)  NOT NULL,
  description       VARCHAR2(200) NOT NULL,  
  query             CLOB          NOT NULL,
  expected_result   XMLTYPE       NOT NULL,
  enabled           VARCHAR2(1)   NOT NULL,
  ins_ts            TIMESTAMP(6)  DEFAULT SYSTIMESTAMP NOT NULL,
  modif_ts          TIMESTAMP(6)  
)
TABLESPACE small_data
/
ALTER TABLE dbtest.testcase ADD CONSTRAINT pk_testcase PRIMARY KEY (ID)
USING INDEX TABLESPACE small_idx
LOGGING
/
