package dbcheck.os;

import java.io.*;

public class CommandBuilder {
    public static String doExecute(String command) {
        Process proc = null;
        StringBuilder output = new StringBuilder();
        try {
            String line;
            proc = Runtime.getRuntime().exec(command);
            BufferedReader readerInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            BufferedReader readerError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            while ((line = readerInput.readLine()) != null) {
                output.append(line).append(System.getProperty("line.separator"));
            }
            readerInput.close();
            while ((line = readerError.readLine()) != null) {
                output.append(line).append(System.getProperty("line.separator"));
            }
            readerError.close();
            proc.waitFor();
        } catch (Exception err) {
            output.append(err.getMessage());
        } finally {
            return output.toString();
        }
    }
}
