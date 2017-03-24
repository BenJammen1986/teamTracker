
import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> memberInstances = new ArrayList<Member>();
  private int mMemberId;

  public Member(String name) {
    mMemberName = name;
    memberInstances.add(this);
    mMemberId = memberInstances.size();

  }

  public String getMemberName() {
    return mMemberName;
  }

  public static void clearMemberArray() {
    memberInstances.clear();
  }

  public static List<Member> getAllMembers() {
    return memberInstances;
  }

  public int getMemberId() {
    return mMemberId;
  }

  public static Member findMemberIndex(int id) {
    return memberInstances.get(id - 1);
  }
}
