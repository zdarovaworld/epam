package homework5interface.travelagency_v4.country.search;

import homework5interface.travelagency_v4.common.business.search.BaseSearchCondition;

public class CountrySearchCondition extends BaseSearchCondition {

    private String name;
    private String language;

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

    public boolean needSearchByName(){
        return true;
    }

    public boolean isNameLengthGeThan6Chars(){
        return true;
    }

}
