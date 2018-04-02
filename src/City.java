public class City {
    private String name;
    private long nrOfPeople;
    private long nrOfCrimes;

    public City(String name, long nrOfPeople, long nrOfCrimes) {
        this.name = name;
        this.nrOfPeople = nrOfPeople;
        this.nrOfCrimes = nrOfCrimes;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNrOfPeople() {
        return nrOfPeople;
    }

    public void setNrOfPeople(long nrOfPeople) {
        this.nrOfPeople = nrOfPeople;
    }

    public long getNrOfCrimes() {
        return nrOfCrimes;
    }

    public void setNrOfCrimes(long nrOfCrimes) {
        this.nrOfCrimes = nrOfCrimes;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", nrOfPeople=" + nrOfPeople +
                ", nrOfCrimes=" + nrOfCrimes +
                '}';
    }
}
