package homework6collectionlist.travelagency_v5.country.search;

import homework6collectionlist.travelagency_v5.common.business.search.BaseSearchCondition;

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
