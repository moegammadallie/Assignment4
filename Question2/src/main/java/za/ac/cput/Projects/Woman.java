package za.ac.cput.Projects;

public class Woman implements Human{
    @Override
    public String canWalk(String move) {
        return null;
    }
    @Override
    public String canTalk(String sound){
        return "I love to Talk, " +sound;
    }
}