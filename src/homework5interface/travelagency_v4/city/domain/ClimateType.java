package homework5interface.travelagency_v4.city.domain;

public enum ClimateType {

    HUMID_CONTINENTAL_CLIMATE("Cold winter, a warm summer, and precipitation throughout the year"),
    MEDITERRANEAN_CLIMATE("Dry in the summer and wet in the winter"),
    OCEANIC_CLIMATE("The summers become hotter and the winters become colder"),
    SUBARCTIC_CLIMATE("Consists of brief, warm summers, and long and very cold winters");


    private String description;

    ClimateType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
