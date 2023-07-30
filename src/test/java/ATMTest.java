import fr.vocaltech.di.atm.Command;
import fr.vocaltech.di.atm.CommandRouter;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import fr.vocaltech.di.atm.Command.*;

class ATMTest {
    @Test
    void givenStringInput_whenRoute_thenResultHandled() {
        CommandRouter commandRouter = new CommandRouter();

        Result result = commandRouter.route("");
        assertThat(result.status()).isEqualTo(Status.HANDLED);
    }
    @Test
    void givenStringInput_whenRoute_thenSplitOk() {
        CommandRouter commandRouter = new CommandRouter();

        commandRouter.route("deposit accountSrc accountTgt");
    }
}