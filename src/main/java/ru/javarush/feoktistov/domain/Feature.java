package ru.javarush.feoktistov.domain;

import static java.util.Objects.isNull;

public enum Feature {

    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    public String getValue() {
        return value;
    }

    private final String value;

    Feature(String value) {
        this.value = value;
    }

    public static Feature getFeatureByValue(String value) {
        if(isNull(value) || value.isEmpty()) {
            return null;
        }

        Feature[] features = Feature.values();

        for(Feature feature: features) {
            if(feature.value.equals(value)) {
                return feature;
            }
        }

        return null;
    }
}
