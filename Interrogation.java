public class Interrogation {

    private Prisoner prisoner1;
    private Prisoner prisoner2;
    private final int[] time = new int[]{1,2,3,10};


    public Interrogation(Prisoner prisoner1, Prisoner prisoner2) {
        this.prisoner1 = prisoner1;
        this.prisoner2 = prisoner2;
    }

    /**
     *   Now, we need to define an interrogation system in which every prisoner is stuck
     *   in a different room, communication between these two prisoners are impossible
     */
    public void commencePrisoner1(){
        System.out.println("Now, interrogation starts. Please sit down");
        System.out.println("Now we need to ask you a few questions, are you ready?");
        while (prisoner1.response() == 0){
            System.out.println("We need to start!");
        }
        System.out.println("There is a burglary in your case with one of your friends. If you confess this case, then you" +
                " are only going to spend " + time[0] + " year . If you are denying then you are only going to spend " + time[2] + " years." +
                " Be careful though as your friend confesses and you are not in this case, then you are going to spend " + time[3] + " years" +
                " in jail! So what is your decision?");


    }

}
