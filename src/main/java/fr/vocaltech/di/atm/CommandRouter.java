package fr.vocaltech.di.atm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.vocaltech.di.atm.Command.*;

public class CommandRouter {
    private final Map<String, Command> commands = Collections.emptyMap();

    public Result route(String input) {
        System.out.println("[CommandRouter.route()] Handling cmd: " + input);

        List<String> splitInput = split(input);

        String commandKey = splitInput.get(0);
        System.out.println("[CommandRouter.route()] commandKey: " + commandKey);

        List<String> commandArgs = splitInput.subList(1, splitInput.size());
        System.out.println("[CommandRouter.route()] commandArgs: " + commandArgs);

        return Result.handled();
    }

    public Result invalidCommand(String input) {
        return Result.invalid();
    }

    // split on whitespace
    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}
