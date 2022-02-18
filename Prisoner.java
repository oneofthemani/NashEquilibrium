import java.util.Random;

public class Prisoner {
    private String name;
    private int age;
    private Possibilities possibilities;

    public Prisoner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int response(){
        Random random = new Random();
        int randomValue = random.nextInt(2);
        return randomValue;
    }
/**
 * In this thinking process I want to implement the prisoner to come to the "Nash equilibrium"
 * */
    public void think(){
        int[][] poss = possibilities.createPossibilities(new Possibilities(1,2,3,10));

    }
    public void confess(){
        System.out.println("Fine, I committed the crime with my friend");
    }

    public void deny(){
        System.out.println("No that is impossible I didn't commit such a crime!");
    }

}
