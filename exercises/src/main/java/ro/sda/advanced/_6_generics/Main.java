package ro.sda.advanced._6_generics;

public class Main {
    public static void main(String[] args) {


        League<FootballTeam> premierLeague = new League<>("Premier league");

        FootballTeam arsenal = new FootballTeam("Arsenal");
        FootballTeam chelsea = new FootballTeam("Chelsea");
        FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam manUnited = new FootballTeam("Manchester United");

        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(manUnited);

        arsenal.matchResult(chelsea, 2, 1);
        arsenal.matchResult(liverpool, 3, 6);
        arsenal.matchResult(manUnited, 1, 1);

        chelsea.matchResult(arsenal, 3, 2);
        chelsea.matchResult(liverpool, 1, 1);
        chelsea.matchResult(manUnited, 1, 2);

        liverpool.matchResult(arsenal, 5, 0);
        liverpool.matchResult(chelsea, 2, 2);
        liverpool.matchResult(manUnited, 7, 1);

        manUnited.matchResult(arsenal, 2, 2);
        manUnited.matchResult(chelsea, 1, 2);
        manUnited.matchResult(chelsea, 1, 3);

        premierLeague.showLeagueTable();
    }
}
