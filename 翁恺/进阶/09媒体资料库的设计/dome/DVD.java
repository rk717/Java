package dome; 

public class DVD
{
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt = false;
    private String comment; 

    public DVD(String title, String director, int playingTime, String comment)
    {
        this.title = title; 
        this.director = director; 
        this.playingTime = playingTime; 
        this.comment = comment; 
    }

    public static void main(String[] args) {
        
    }

    public void print()
    {
        System.out.println("DVD"+title+":"+director);
    }
}