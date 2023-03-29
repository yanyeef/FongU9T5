import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret (String name){
        this.name =name;
        performers = new ArrayList<Performer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public void setName (String newName){
        name = newName;
    }

    public boolean addPerformer(Performer p){
        if(performers.indexOf(p) == -1){
            performers.add(p);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer remove){
        if(performers.indexOf(remove) != -1){
            performers.remove(remove);
            return true;
        }
        return false;
    }


}
