public class CricketTeam extends Team
{
  public String game="Cricket";
  public CricketTeam(String a)
  {
    super(a);
  }
  public String toString()
  {
    return "our name is " +super.name +"\n"+ "we play "+ game;
    
  }
}