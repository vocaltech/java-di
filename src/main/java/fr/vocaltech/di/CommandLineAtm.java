package fr.vocaltech.di;

import fr.vocaltech.di.atm.CommandRouter;

import java.util.Scanner;

public class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouter commandRouter = new CommandRouter();

        System.out.println("ATM Shell (! to quit)");
        System.out.print("# ");

        while (scanner.hasNextLine()) {
            String cmdLine = scanner.nextLine();

            if (cmdLine.startsWith("!"))
                break;

            commandRouter.route(cmdLine);

            System.out.print("# ");
        }

        scanner.close();
    }
}
