CREATE OR REPLACE PACKAGE pkg_core IS
  PROCEDURE get_testcase (p_code         IN VARCHAR2, 
                          p_cur_testcase OUT SYS_REFCURSOR);
  PROCEDURE add_testcase (p_code            IN VARCHAR2, 
                          p_description     IN dbtest.testcase.description%TYPE,
                          p_query           IN dbtest.testcase.query%TYPE,
                          p_expected_result IN dbtest.testcase.expected_result%TYPE,
                          p_enabled         IN dbtest.testcase.enabled%TYPE DEFAULT NULL);
END pkg_core;
/
CREATE OR REPLACE PACKAGE BODY pkg_core IS
  PROCEDURE get_testcase (p_code IN VARCHAR2, p_cur_testcase OUT SYS_REFCURSOR)
  AS
  BEGIN
    OPEN p_cur_testcase FOR
    SELECT tc.code, tc.description, tc.query, tc.expected_result.getclobval() expected_result_clob, tc.enabled 
      FROM dbtest.testcase tc 
     WHERE tc.code = p_code;
  END;
  
  PROCEDURE add_testcase (p_code            IN VARCHAR2, 
                          p_description     IN dbtest.testcase.description%TYPE,
                          p_query           IN dbtest.testcase.query%TYPE,
                          p_expected_result IN dbtest.testcase.expected_result%TYPE,
                          p_enabled         IN dbtest.testcase.enabled%TYPE DEFAULT NULL)
  AS
  BEGIN
    INSERT INTO dbtest.testcase (id, code, description, query, expected_result, enabled)
    VALUES (dbtest.sq_testcase.nextval, p_code, p_description, p_query, p_expected_result, p_enabled);
  END;
END pkg_core;
/
