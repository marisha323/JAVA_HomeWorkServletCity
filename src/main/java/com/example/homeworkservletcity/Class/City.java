package com.example.homeworkservletcity.Class;

public class City {
    private String cityName;
    private String countryName;
    private String coatOfArmsUrl;
    private long population;
    private String description;

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", coatOfArmsUrl='" + coatOfArmsUrl + '\'' +
                ", population=" + population +
                ", description='" + description + '\'' +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCoatOfArmsUrl() {
        return coatOfArmsUrl;
    }

    public void setCoatOfArmsUrl(String coatOfArmsUrl) {
        this.coatOfArmsUrl = coatOfArmsUrl;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public City() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City(String назваМіста, String назваКраїни, String s, int i, String s1) {
    }
}
