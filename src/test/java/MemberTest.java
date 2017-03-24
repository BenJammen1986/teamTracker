import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @After
  public void memberTearDown() {
    Member.clearMemberArray();
  }

  @Test
  public void newMember_instantiatesCorrectly_true() {
    Member newMember = new Member("Dan");
    assertEquals(true, newMember instanceof Member);
  }

  @Test
  public void newMember_instantiatesCorrectlyWithName() {
    Member newMember = new Member("Dan");
    assertEquals("Dan", newMember.getMemberName());
  }

  @Test
  public void newMember_allInstancesSavedToList() {
    Member newMember1 = new Member("Dan");
    Member newMember2 = new Member("Joe");
    assertEquals(newMember1, Member.getAllMembers().get(0));
  }

  @ Test
  public void newMember_allInstancesAssignedIdNumber() {
    Member newMember1 = new Member("Dan");
    Member newMember2 = new Member("Joe");
    assertEquals(newMember1.getMemberId(), 1);
  }

  @ Test
  public void findMemberIndex_returnsMembersWithSameId_newMember2() {
    Member newMember1 = new Member("Dan");
    Member newMember2 = new Member("Joe");
    assertEquals(Member.findMemberIndex(newMember2.getMemberId()), newMember2);
  }


}
