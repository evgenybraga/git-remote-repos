package dbcheck.model.service;

import dbcheck.model.dao.ITestcaseDAO;
import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class TestcaseService implements ITestcaseService {
    private ITestcaseDAO testcaseDao = null;

    public void setTestcaseDao(ITestcaseDAO testcaseDao) {
        this.testcaseDao = testcaseDao;
    }

    @Override
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException {
        System.out.println("123");
        return  testcaseDao.getTestcase(code);
    }
}
