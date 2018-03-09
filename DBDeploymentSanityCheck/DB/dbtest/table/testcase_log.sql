DROP TABLE dbtest.testcase_log
/
CREATE TABLE dbtest.testcase_log
(
  id                 NUMBER(21) NOT NULL,
  id_testcase        NUMBER(21) NOT NULL,
  query              CLOB,
  expected_result    XMLTYPE,
  actual_result      XMLTYPE,
  comparison_result  XMLTYPE,
  execution_status   VARCHAR2(40),
  execution_time     TIMESTAMP(6)  DEFAULT SYSTIMESTAMP NOT NULL,
  ins_ts             TIMESTAMP(6)  DEFAULT SYSTIMESTAMP NOT NULL
)
/
ALTER TABLE dbtest.testcase_log ADD CONSTRAINT pk_testcase_log PRIMARY KEY (id)
USING INDEX TABLESPACE small_idx
LOGGING
/
