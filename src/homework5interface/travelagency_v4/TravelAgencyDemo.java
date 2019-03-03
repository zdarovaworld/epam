package homework5interface.travelagency_v4;

import homework5interface.travelagency_v4.city.domain.City;
import homework5interface.travelagency_v4.city.service.CityService;
import homework5interface.travelagency_v4.common.business.application.ApplicationServiceCreator;
import homework5interface.travelagency_v4.common.business.application.StorageType;
import homework5interface.travelagency_v4.common.solutions.dataclasses.Pair;
import homework5interface.travelagency_v4.country.domain.Country;
import homework5interface.travelagency_v4.country.search.CountrySearchCondition;
import homework5interface.travelagency_v4.country.service.CountryService;
import homework5interface.travelagency_v4.order.service.OrderService;
import homework5interface.travelagency_v4.storage.Storage;
import homework5interface.travelagency_v4.user.domain.User;
import homework5interface.travelagency_v4.user.service.UserService;

public class TravelAgencyDemo {

    private static class Application {

        StorageType storageType = StorageType.MEMORY_ARRAY;

        private UserService userService = ApplicationServiceCreator.getUserService(storageType);
        private CountryService countryService = ApplicationServiceCreator.getCountryService(storageType);
        private CityService cityService = ApplicationServiceCreator.getCityService(storageType);
        private OrderService orderService = ApplicationServiceCreator.getOrderService(storageType);

        private Storage storage = new Storage();

        private void addUsers() {
            String[] usersAsCsv = new String[]{
                    "Ivan        | Ivanov | 4444 | 444444",
                    "Petr        | Petrov | 3333 | 333333",
                    "Dmitry      | yuspov | 5555 | 555555",
                    "Dasha       | Jukova | 6666 | 666666",
                    "Wlad        | Belyh  | 1111 | 111111",
                    "Terminator  | T-800  | 2222 | 222222",
                    "Terminator  | T-1000  | 7777 | 777777",
            };

            Long id = 0L;
            for (String csvUser : usersAsCsv) {
                String[] userAttrs = csvUser.split("\\|");
                int attrIndex = -1;
                User user = new User(++id,
                        userAttrs[++attrIndex].trim(),
                        userAttrs[++attrIndex].trim()
                        );
                User.Passport passport = user.new Passport(Integer.parseInt(userAttrs[++attrIndex].trim()),
                        Integer.parseInt(userAttrs[++attrIndex].trim()));
                user.setPassport(passport);
                userService.add(user);
            }
        }

        private void addCountriesWithCities() {
            Pair[] marksWithCitiess = new Pair[]{
                    new Pair("Germany | German",
                            new String[]{
                                    "Berlin   | 10000000 | true",
                                    "Munhen   | 1000000  | false"
                            }
                    ),
                    new Pair("Russia | Russian",
                            new String[]{
                                    "Saint-Petersburg | 10000000 | false"
                            }
                    ),

                    new Pair("USA | AmEnglish",
                            new String[]{
                                    "San-Francisco | 5000000 | false",
                                    "Las-Vegas     | 6000000 | false",
                            }
                    ),
            };

            for (Pair countryCityData : marksWithCitiess) {
                addCountry(countryCityData.getLeft(), countryCityData.getRight());
            }
        }

        private void addCountry(String countryCsv, String[] citiesCsv) {
            String[] attrs = countryCsv.split("\\|");
            int attrIndex = -1;

            Country country = new Country(attrs[++attrIndex].trim(), attrs[++attrIndex].trim());
            country.setCities(new City[citiesCsv.length]);

            for (int i = 0; i < citiesCsv.length; i++) {
                String csvCity = citiesCsv[i];
                attrIndex = -1;
                attrs = csvCity.split("\\|");

                City city = new City();
                city.setName(attrs[++attrIndex].trim());
                city.setPopulation(Integer.parseInt(attrs[++attrIndex].trim()));
                city.setCapital(Boolean.parseBoolean(attrs[++attrIndex].trim()));

                country.getCities()[i] = city;
            }

            countryService.add(country);
        }

        public void fillStorage() {
            addUsers();
            addCountriesWithCities();
        }

        public void printUsers() {
            userService.printAll();
        }

        public void printCountries() {
            countryService.printAll();
        }

        public void deleteUsers(){

            userService.deleteById(1L);

            System.out.println("----------Search marks by country and mark name------------");
            CountrySearchCondition countrySearchCondition = new CountrySearchCondition();
            countrySearchCondition.setName("Russia");
            countrySearchCondition.setLanguage("Russian");
            Country[] searchResult = countryService.search(countrySearchCondition);
            System.out.println("-----Search result----------------------");
            for (Country country: searchResult){
                System.out.println(country);
            }
            userService.add(new User(33L, "SSSS", "AAAA"));
            userService.deleteById(33L);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.fillStorage();

        System.out.println("--------Users------------");
        application.printUsers();

        System.out.println("--------Countries------------");
        application.printCountries();

        application.deleteUsers();
        System.out.println();
    }
}
