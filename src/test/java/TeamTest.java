import org.junit.*;
import static org.junit.Assert.*;




public class TeamTest {

  @After
  public void tearDown() {
    Team.clearTeamArray();
  }

  @Test
  public void newTeam_instantiatesCorrectly_true() {
    Team newTeam = new Team("Home");
    assertEquals(true, newTeam instanceof Team);
  }

  @Test
  public void newTeam_instantiatesCorrectlyWithName() {
    Team newTeam = new Team("Home");
    assertEquals("Home", newTeam.getTeamName());
  }

  @Test
  public void newTeam_addedToListOfAllTeams() {
    Team newTeam = new Team("Home");
    Team newTeam2 = new Team("Work");
    assertEquals(newTeam, Team.getAllTeams().get(0));
  }

  @Test
  public void newTeam_assignedIdNumberCorrectly() {
    Team newTeam = new Team("Home");
    Team newTeam2 = new Team("Work");
    assertEquals(newTeam.getId(), 1);
  }
}
