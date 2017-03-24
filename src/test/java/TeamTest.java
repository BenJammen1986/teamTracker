import org.junit.*;
import static org.junit.Assert.*;




public class TeamTest {

  @After
  public void teamTearDown() {
    Team.clearTeamArray();
  }

  @Test
  public void newTeam_instantiatesCorrectly_true() {
    Team newTeam = new Team("Buzzsaw");
    assertEquals(true, newTeam instanceof Team);
  }

  @Test
  public void newTeam_instantiatesCorrectlyWithName() {
    Team newTeam = new Team("Buzzsaw");
    assertEquals("Buzzsaw", newTeam.getTeamName());
  }

  @Test
  public void newTeam_addedToListOfAllTeams() {
    Team newTeam = new Team("Buzzsaw");
    Team newTeam2 = new Team("OpenSource");
    assertEquals(newTeam, Team.getAllTeams().get(0));
  }

  @Test
  public void newTeam_instantiatesWithId_1() {
    Team newTeam = new Team("Buzzsaw");
    Team newTeam2 = new Team("OpenSource");
    assertEquals(newTeam.getTeamId(), 1);
  }

  @Test
  public void findTeamIndex_returnsTeamWithSameId_secondTeam() {
    Team newTeam1 = new Team("Buzzsaw");
    Team newTeam2 = new Team("OpenSource");
    assertEquals(Team.findTeamIndex(newTeam2.getTeamId()), newTeam2);
  }

  @Test
  public void newTeam_addNewTeamMembersToTeamList_true() {
    Team newTeam =  new Team("Buzzsaw");
    Member newMember = new Member("Dan");
    newTeam.addNewMember(newMember);
    assertTrue(newTeam.getTeamMembers().contains(newMember));
  }

}
