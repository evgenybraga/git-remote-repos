package dbcheck.model.dao;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import dbcheck.model.domain.TestcaseBean;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.dao.DataAccessException;



import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestcaseSqlMapDao extends SqlMapClientDaoSupport implements ITestcaseDAO {

    private static final String MAP_CONFIG = "SqlMapConfig.xml";
    private static final String NAMESPACE = "Testcase.";
    private static final String GET_TESTCASE = NAMESPACE + "getTestcase";

    @Override
    public List<TestcaseBean> getTestcase(String code) throws IOException, SQLException {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("testcaseCode", code);
        getSqlMapClientTemplate().queryForList(GET_TESTCASE, params);
        return (List<TestcaseBean>) params.get("testcaseBody");
    }
}
