package com.example.fragment_recycle.countries;

public class CountryModel {
    public CountryModel(Integer continentsId, String name, String description,
                        String flagUrl) {
        this.name = name;
        this.description = description;
        this.flagUrl = flagUrl;
        this.continentsId = continentsId;
    }

    private String name, description, flagUrl;
    private Integer continentsId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public Integer getContinentsId() {
        return continentsId;
    }

    public void setContinentsId(Integer continentsId) {
        this.continentsId = continentsId;
    }
}
