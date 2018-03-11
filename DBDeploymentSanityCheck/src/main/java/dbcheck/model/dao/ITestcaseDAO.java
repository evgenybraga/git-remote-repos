package dbcheck.model.dao;

import dbcheck.model.domain.TestcaseBean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface ITestcaseDAO {

    /**
     * @param code
     * @return
     */
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException;



}
