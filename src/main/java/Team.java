import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mName;
  private static List<Team> instances = new ArrayList<Team>();
  private int mId;


  public Team(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getTeamName() {
    return mName;
  }

  public static void clearTeamArray() {
    instances.clear();
  }

  public static List<Team> getAllTeams() {
    return instances;
  }

  public int getId() {
    return mId;
  }
}
