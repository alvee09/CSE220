public class FootBallTeam extends Team
{
  public String game="Football";
  public FootBallTeam(String a)
  {
    super(a);
  }
  public String toString()
  {
    return "our name is " +super.name +"\n"+ "we play "+ game;
    
  }
}