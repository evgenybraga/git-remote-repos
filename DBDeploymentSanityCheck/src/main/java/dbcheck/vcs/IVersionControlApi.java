package dbcheck.vcs;

import java.io.Serializable;

public interface IVersionControlApi extends Serializable {

    public boolean pingVCS(String name);
    public String[] getResponse();
    public Integer sendCommand(String command);


}
