package za.ac.cput.Projects;

public class Man implements Human{
    @Override
    public String canWalk(String move) {
        return "I can walk " + move;
    }
    @Override
    public String canTalk(String sound){
        return null;
    }
}
