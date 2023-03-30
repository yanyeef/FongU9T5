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

    public double averagePerformerAge(){
        double sum = 0;
        for(Performer p : performers){
            sum+= p.getAge();
        }

        return sum/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> amount = new ArrayList<Performer>();
        for(Performer p: performers) {
            if(p.getAge() >= age) {
                amount.add(p);
            }
        }
        return amount;
    }

    public void groupRehearsal(){
        for(Performer performer : performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());

            if(performer instanceof Comedian){
                // cast the performer as a comedian
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for(Performer p : performers){
            System.out.println("Welcome to the cabaret! Next act up " + p.getName());

            if(p instanceof Dancer){
                Dancer temp = (Dancer)p;
                temp.pirouette(2);
            }
            p.perform();
        }
    }

}
