import dbcheck.os.CommandBuilder;

public class TestAPI {
    public static void main(String[] args) {
        CommandBuilder cmd = new CommandBuilder();
        //cmd.doExecute(args[0]);
        System.out.println(cmd.doExecute("svn log --search braga https://subversion.homecredit.net/repos/releases/homer/cn/"));
    }
}
