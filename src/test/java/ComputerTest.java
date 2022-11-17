import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void shouldReturnWhenComputerIsGaming() {
        Computer computer = new Computer(16, 4, "Lenovo", Computer.OperatingSystem.Windows, 2.8);
        assertThat(computer.isGaming()).isFalse();
    }

    @Test
    void shouldReturnIfComputerIsOn() {
    Computer computer = new Computer(16, 4, "Lenovo", Computer.OperatingSystem.Windows, 2.8);
    computer.setOn(true);
    assertThat(computer.isOn()).isTrue();
    }

    @Test
    void shouldReturnWhenComputerIsOffice() {
        Computer computer = new Computer(16, 4, "Lenovo", Computer.OperatingSystem.Windows, 2.8);
        assertThat(computer.isOffice()).isTrue();
    }

    @Test
    void boostProcTest() {
        Computer computer = new Computer(16, 4, "Lenovo", Computer.OperatingSystem.Windows, 2.8);
        computer.boostProc(2);
        assertThat(computer.getProcFreq()).isEqualTo(4.8);
    }
}