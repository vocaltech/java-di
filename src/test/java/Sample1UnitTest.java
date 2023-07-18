import fr.vocaltech.di.sample1.Car;
import fr.vocaltech.di.sample1.CarComponent;
import fr.vocaltech.di.sample1.DaggerCarComponent;

import fr.vocaltech.di.sample1.EngineState;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Sample1UnitTest {
    @Test
    public void givenCarComponent_whenBuildingCar_thenDependenciesInjected() {
        CarComponent carComponent = DaggerCarComponent.create();

        Car carOne = carComponent.buildCar();

        assertThat(carOne).isNotNull();
        assertThat(carOne.getBrand().getName())
                .isEqualTo("BMW");

        assertThat(carOne.getEngine()).isNotNull();

        carOne.getEngine().start();
        assertThat(carOne.getEngine().getState())
                .isEqualTo(EngineState.STARTED);

        carOne.getEngine().stop();
        assertThat(carOne.getEngine().getState())
                .isEqualTo(EngineState.STOPPED);
    }
}
