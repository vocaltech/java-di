package fr.vocaltech.di.atm;

import java.util.List;

/**
 * Logic to process the user input
 */
public interface Command {
    /**
     * String token that signifies this command should be selected.
     * (ie, "deposit", "withdraw", ...)
     * @return String token
     */
    String key();

    /**
     * Process the rest of the command's words
     * and do something
     */
    Result handleInput(List<String> input);

    final class Result {
        private final Status status;

        private Result(Status status) {
            this.status = status;
        }

        static Result invalid() {
            return new Result(Status.INVALID);
        }

        static Result handled() {
            return new Result(Status.HANDLED);
        }

        Status status() {
            return status;
        }
    }

    enum Status {
        INVALID,
        HANDLED
    }

}
