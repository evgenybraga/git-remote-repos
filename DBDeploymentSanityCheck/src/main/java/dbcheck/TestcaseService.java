package dbcheck;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.xml.sax.SAXException;


import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestcaseService {
    public static void main(String[] args)
            throws IOException, SQLException {
        Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

        Map map = new HashMap();
        map.put("testcaseCode", new String("TESTCASE_01"));

        smc.queryForList("Testcase.getTestcase", map);
        List<TestcaseBean> tc = (List<TestcaseBean>)map.get("testcaseBody");

        System.out.println(tc.get(0).getExpectedResult().getElementsByTagName("DUMMY").item(0).getTextContent());


    }

}
