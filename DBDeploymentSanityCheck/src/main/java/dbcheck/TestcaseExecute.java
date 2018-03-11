package dbcheck;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import dbcheck.model.dao.ITestcaseDAO;
import dbcheck.model.service.ITestcaseService;
import dbcheck.model.service.TestcaseService;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;


import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestcaseExecute {
    public static void main(String[] args)
            throws IOException, SQLException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITestcaseDAO service = (ITestcaseDAO) ctx.getBean("testcaseDao");
        System.out.println("BEFORE: " + service.getTestcase("TESTCASE_01").get(0).getQuery());

    }

}
