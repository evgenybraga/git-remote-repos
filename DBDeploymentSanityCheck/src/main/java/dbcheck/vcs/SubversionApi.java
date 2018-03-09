package dbcheck.vcs;


public class SubversionApi implements IVersionControlApi {

    private final static String VCS_NAME = "svn";

    public boolean pingVCS(String name) {
        return false;
    }

    public String[] getResponse() {
        return new String[0];
    }

    public Integer sendCommand(String command) {
        return null;
    }
}
