package homework1234.travelagency_v1;

public class Country {
    private String name;
    private String language;
    private City city;

    public Country(String name, String language, City city) {
        this.name = name;
        this.language = language;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", city=" + city.getName() +
                '}';
    }
}
