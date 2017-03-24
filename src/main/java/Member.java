
import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();

  }

  public String getMemberName() {
    return mName;
  }

  public static void clearMemberArray() {
    instances.clear();
  }

  public static List<Member> getAllMembers() {
    return instances;
  }

  public int getMemberId() {
    return mId;
  }
}
