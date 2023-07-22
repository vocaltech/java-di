package fr.vocaltech.di.atm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.vocaltech.di.atm.Command.*;

public class CommandRouter {
    private final Map<String, Command> commands = Collections.emptyMap();

    public Result route(String input) {
        System.out.println("[CommandRouter.route()] Handling " + input);
        return null;
    }

    private Result invalidCommand(String input) {
        return Result.invalid();
    }

    // split on whitespace
    private static List<String> split(String input) {
        return Collections.emptyList();
    }
}
