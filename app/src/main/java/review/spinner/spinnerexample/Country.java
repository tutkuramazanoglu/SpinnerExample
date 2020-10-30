package review.spinner.spinnerexample;

public class Country {
    private String name;
    private int population;
    private String flag;

    public Country(String name, int population, String flag) {
        this.name = name;
        this.population = population;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
