package homework1234.travelagency_v3;

import homework1234.travelagency_v3.city.City;
import homework1234.travelagency_v3.city.service.CityMemoryService;
import homework1234.travelagency_v3.common.Pair;
import homework1234.travelagency_v3.country.Country;
import homework1234.travelagency_v3.country.service.CountryMemoryService;
import homework1234.travelagency_v3.order.service.OrderMemoryService;
import homework1234.travelagency_v3.storage.Storage;
import homework1234.travelagency_v3.user.User;
import homework1234.travelagency_v3.user.service.UserMemoryService;

public class TravelAgencyDemo {

    private static class Application {
        private UserMemoryService userService = new UserMemoryService();
        private CountryMemoryService countryService = new CountryMemoryService();
        private CityMemoryService cityService = new CityMemoryService();
        private OrderMemoryService orderService = new OrderMemoryService();

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
                userService.addUser(user);
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

            countryService.addCountry(country);
        }

        public void fillStorage() {
            addUsers();
            addCountriesWithCities();
        }

        public void printUsers() {
            userService.printUsers();
        }

        public void printCountries() {
            countryService.printCountries();
        }

        public void deleteUsers(){

            userService.deleteUser(1L);
            userService.deleteUser(2L);
            userService.deleteUser(3L);
            userService.deleteUser(4L);
            userService.deleteUser(5L);
            userService.deleteUser(6L);
            userService.deleteUser(7L);

            userService.addUser(new User(33L, "SSSS","AAAA"));
            userService.deleteUser(33L);
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
