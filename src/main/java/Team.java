import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mTeamName;
  private static List<Team> teamInstances = new ArrayList<Team>();
  private int mTeamId;
  private List<Member> mTeamMembers;


  public Team(String name) {
    mTeamName = name;
    teamInstances.add(this);
    mTeamId = teamInstances.size();
    mTeamMembers = new ArrayList<Member>();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static void clearTeamArray() {
    teamInstances.clear();
  }

  public static List<Team> getAllTeams() {
    return teamInstances;
  }

  public int getTeamId() {
    return mTeamId;
  }

  public static Team findTeamIndex(int id) {
   return teamInstances.get(id - 1);
  }

  public List<Member> getTeamMembers()  {
    return mTeamMembers;
  }

  public void addNewMember(Member member)  {
    mTeamMembers.add(member);
  }




}
