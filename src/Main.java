import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer graczWisly = new FootballPlayer("graczWisly");
        FootballPlayer graczCracovi = new FootballPlayer("graczCracovi");


        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer gracz2 = new BaseballPlayer("gracz2");
        BaseballPlayer gracz3 = new BaseballPlayer("gracz3");

        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> wisla = new Team<>("Wisla");
        Team<FootballPlayer> cracovia = new Team<>("Cracovia");

        adelaideCrows.addPlayer(joe);
        wisla.addPlayer(graczWisly);
        cracovia.addPlayer(graczCracovi);

        adelaideCrows.matchResult(wisla, 1, 2);
        adelaideCrows.matchResult(cracovia, 1, 2);
        wisla.matchResult(cracovia, 2, 1);

        Team<BaseballPlayer> basebolowaDruzyna1 = new Team<>("basebolowa1");
        Team<BaseballPlayer> basebolowaDruzyna2 = new Team<>("basebolowa2");
        Team<BaseballPlayer> basebolowaDruzyna3 = new Team<>("basebolowa3");

        basebolowaDruzyna1.addPlayer(pat);
        System.out.println(adelaideCrows.numPlayers());

        basebolowaDruzyna2.addPlayer(gracz2);
        basebolowaDruzyna3.addPlayer(gracz3);

        ArrayList<Team> teams;

        League<Team<FootballPlayer>> footballLeague = new League<>();

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(wisla);
        footballLeague.addTeam(cracovia);
        footballLeague.showRanking();

        League<Team<BaseballPlayer>> baseballLeague = new League<>();

        baseballLeague.addTeam(basebolowaDruzyna1);
        baseballLeague.addTeam(basebolowaDruzyna2);
        baseballLeague.addTeam(basebolowaDruzyna3);

       basebolowaDruzyna1.matchResult(basebolowaDruzyna2, 2, 4);
       basebolowaDruzyna2.matchResult(basebolowaDruzyna3, 4, 2);
       basebolowaDruzyna3.matchResult(basebolowaDruzyna1, 1, 3);

       baseballLeague.showRanking();


    }
}
