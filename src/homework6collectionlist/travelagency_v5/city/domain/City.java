package homework6collectionlist.travelagency_v5.city.domain;

import homework6collectionlist.travelagency_v5.common.business.domain.BaseDomain;

public class City extends BaseDomain {
    private Long id;
    private String name;
    private int population;
    private boolean isCapital;
    private ClimateType climateType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public ClimateType getClimateType() {
        return climateType;
    }

    public void setClimateType(ClimateType climateType) {
        this.climateType = climateType;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                ", climateType=" + climateType +
                '}';
    }
}
