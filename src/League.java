import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class League<T extends Team> {
    private ArrayList<T> list = new ArrayList<>();

    public void addTeam(T team){
        list.add(team);
    }

    public void showRanking(){
        Collections.sort(list, new LeagueComparator());
        System.out.println("Ranking:");
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ": " + list.get(i).getName() + " " + list.get(i).ranking());
        }
    }

    private class LeagueComparator implements Comparator<T>{
        @Override
        public int compare(T a, T b){
            if(a.ranking() > b.ranking()){
                return -1;
            }
            if(a.ranking() < b.ranking()){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
