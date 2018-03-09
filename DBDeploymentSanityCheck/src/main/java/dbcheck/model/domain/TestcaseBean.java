package dbcheck.model.domain;

import dbcheck.model.enums.ETestcaseStatus;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

public class TestcaseBean implements Serializable {

    private static final long serialVersionUID = -6902409548307163952L;
    private String code;
    private String description;
    private String query;
    private Boolean enabled;
    private ETestcaseStatus status;
    private Document expectedResult;
    private Document actualResult;
    private Document comparisonResult;

    public TestcaseBean() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = (enabled == "Y")? true:false;
    }

    public ETestcaseStatus getStatus() {
        return status;
    }

    public void setStatus(ETestcaseStatus status) {
        this.status = status;
    }

    public Document getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new ByteArrayInputStream(expectedResult.getBytes(StandardCharsets.UTF_8)));
        this.expectedResult = doc;
    }

/*
    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
*/
    public Document getActualResult() {
        return actualResult;
    }

    public void setActualResult(Document actualResult) {
        this.actualResult = actualResult;
    }

    public Document getComparisonResult() {
        return comparisonResult;
    }

    public void setComparisonResult(Document comparisonResult) {
        this.comparisonResult = comparisonResult;
    }
}
