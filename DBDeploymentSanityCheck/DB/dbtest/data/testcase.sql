BEGIN
  -- Call the procedure
  pkg_core.add_testcase(p_code => 'TESTCASE_01',
                        p_testcase_body => XMLTYPE(q'[<?xml version="1.0"?>
<TESTCASE>
    <QUERY>SELECT dummy FROM dual</QUERY>
    <RESULT>
        <ROWSET>
            <ROW>
                <DUMMY>X</DUMMY>
            </ROW>
        </ROWSET>
    </RESULT>
</TESTCASE>]'),
                        p_desc => 'Sample testcase 01');
END;
/
