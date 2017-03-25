import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/newTeamForm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teams", Team.getAllTeams());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      Team newTeam = new Team(name);
      model.put("teams", Team.getAllTeams());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team thisTeam = Team.findTeamIndex(Integer.parseInt(request.params(":id")));
      model.put("team", thisTeam);
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id/members/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team thisTeam = Team.findTeamIndex(Integer.parseInt(request.params(":id")));
      model.put("team", thisTeam);
      model.put("template", "templates/newMemberForm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team thisTeam = Team.findTeamIndex(Integer.parseInt(request.queryParams("teamId")));
      String memberName = request.queryParams("memberName");
      Member newMember = new Member(memberName);

      thisTeam.addNewMember(newMember);
      model.put("team", thisTeam);
      model.put("member", newMember);
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/teams/:id/members", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("members", Team.getTeamMembers());
        model.put("template", "templates/members.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/members/:id", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        Member thisMember = Member.findMemberIndex(Integer.parseInt(request.params(":id")));
        model.put("member", thisMember);
        model.put("template", "templates/member.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

  }
}
