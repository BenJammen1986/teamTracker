import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void newTeam_instantiatesCorrectly_true() {
    Team newTeam = new Team("Home");
    assertEquals(true, newTeam instanceof Team);
  }

  @Test
  public void newTeam_instantiatesCorrectlyWithName() {
    Team newTeam = new Team("Home");
    assertEquals("Home", newTeam.getName());
  }
}
