package TCS_IPA;
import java.util.Arrays;
import java.util.Scanner;
public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] mov = new Movie[4];
        System.out.println(mov.length);
        for(int i = 0;i <mov.length;i++){
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();sc.nextLine();

            mov[i] = new Movie(movieName, company, genre, budget);
        }
        String rating = sc.nextLine();
        String[] res = BasedOnBudget(mov , rating);
        if(res!= null){
            for(int i = 0 ; i<res.length;i++){
                System.out.println(res[i]);
            }
        }
    }

    public static String[] BasedOnBudget(Movie[] mov,String rating){
        String[] temp = new String[0];
        for(int i = 0 ; i<mov.length; i++){
            if(mov[i].getGenre().equalsIgnoreCase(rating)){
                if(mov[i].getBudget() > 80000000){
                    temp = Arrays.copyOf(temp, temp.length+1);
                    temp[temp.length-1] = "high budget Flim";
                }
            }
        }
        return temp;
    }
}

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    
    public Movie(String movieName, String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public void setMoviename(String movieName){
        this.movieName = movieName;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setBudget(int budget){
        this.budget= budget;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getCompany(){
        return company;
    }
    public String getGenre(){
        return genre;
    }

    public int getBudget(){
        return budget;
    }
}
