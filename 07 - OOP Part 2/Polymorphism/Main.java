class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }

}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }

}

class Avengers extends Movie {

    public Avengers() {
        super("Avengers");
    }

    @Override
    public String plot() {
        return "A bunch of heroes save earth from aliens";
    }

}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }

}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {

        return "Imperial Forces try to take over the galaxy";
    }
}

class Forgettable extends Movie {

    public Forgettable() {
        super("Forgettable");
    }

    // No plot method

}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Avengers();

            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();

            default:
                return null;
        }
    }
}
