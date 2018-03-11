package dbcheck.model.service;

import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface ITestcaseService {
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException;

}
