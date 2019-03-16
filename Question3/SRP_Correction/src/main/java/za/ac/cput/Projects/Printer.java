package za.ac.cput.Projects;

public class Printer {
    Text txt;

    Printer(Text t) {
        this.txt = t;
    }

    /*method for formatting output*/
    void printText() {
        System.out.println(this.txt);
    }
}
