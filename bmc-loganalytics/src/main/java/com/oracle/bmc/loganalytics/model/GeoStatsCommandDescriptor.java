/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage GEOSTATS command. This is similiar to STATS with some built
 * in functions for City, State and Country by Coordinates. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GeoStatsCommandDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GeoStatsCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /**
         * Indicates which coordinates to show. Either client, server, client and server or custom.
         * If custom is specified at least one of coordinatesField, regionField or countryField is
         * required. Defaults to client.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("include")
        private Include include;

        /**
         * Indicates which coordinates to show. Either client, server, client and server or custom.
         * If custom is specified at least one of coordinatesField, regionField or countryField is
         * required. Defaults to client.
         *
         * @param include the value to set
         * @return this builder
         */
        public Builder include(Include include) {
            this.include = include;
            this.__explicitlySet__.add("include");
            return this;
        }
        /** The city field to use. Only applicable when include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("cityField")
        private AbstractField cityField;

        /**
         * The city field to use. Only applicable when include = CUSTOM.
         *
         * @param cityField the value to set
         * @return this builder
         */
        public Builder cityField(AbstractField cityField) {
            this.cityField = cityField;
            this.__explicitlySet__.add("cityField");
            return this;
        }
        /** The region field to use. Only applicable when include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionField")
        private AbstractField regionField;

        /**
         * The region field to use. Only applicable when include = CUSTOM.
         *
         * @param regionField the value to set
         * @return this builder
         */
        public Builder regionField(AbstractField regionField) {
            this.regionField = regionField;
            this.__explicitlySet__.add("regionField");
            return this;
        }
        /** The country field to use. Only applicable when include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("countryField")
        private AbstractField countryField;

        /**
         * The country field to use. Only applicable when include = CUSTOM.
         *
         * @param countryField the value to set
         * @return this builder
         */
        public Builder countryField(AbstractField countryField) {
            this.countryField = countryField;
            this.__explicitlySet__.add("countryField");
            return this;
        }
        /** The continent field to use. Only applicable when include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("continentField")
        private AbstractField continentField;

        /**
         * The continent field to use. Only applicable when include = CUSTOM.
         *
         * @param continentField the value to set
         * @return this builder
         */
        public Builder continentField(AbstractField continentField) {
            this.continentField = continentField;
            this.__explicitlySet__.add("continentField");
            return this;
        }
        /** The coordinates field to use. Only applicable when include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinatesField")
        private AbstractField coordinatesField;

        /**
         * The coordinates field to use. Only applicable when include = CUSTOM.
         *
         * @param coordinatesField the value to set
         * @return this builder
         */
        public Builder coordinatesField(AbstractField coordinatesField) {
            this.coordinatesField = coordinatesField;
            this.__explicitlySet__.add("coordinatesField");
            return this;
        }
        /** Group by fields if specified in the query string. Required if include = CUSTOM. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
        private java.util.List<AbstractField> groupByFields;

        /**
         * Group by fields if specified in the query string. Required if include = CUSTOM.
         *
         * @param groupByFields the value to set
         * @return this builder
         */
        public Builder groupByFields(java.util.List<AbstractField> groupByFields) {
            this.groupByFields = groupByFields;
            this.__explicitlySet__.add("groupByFields");
            return this;
        }
        /**
         * Statistical functions specified in the query string. At least 1 is required for a
         * GEOSTATS command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<FunctionField> functions;

        /**
         * Statistical functions specified in the query string. At least 1 is required for a
         * GEOSTATS command.
         *
         * @param functions the value to set
         * @return this builder
         */
        public Builder functions(java.util.List<FunctionField> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeoStatsCommandDescriptor build() {
            GeoStatsCommandDescriptor model =
                    new GeoStatsCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.include,
                            this.cityField,
                            this.regionField,
                            this.countryField,
                            this.continentField,
                            this.coordinatesField,
                            this.groupByFields,
                            this.functions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeoStatsCommandDescriptor model) {
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("referencedFields")) {
                this.referencedFields(model.getReferencedFields());
            }
            if (model.wasPropertyExplicitlySet("declaredFields")) {
                this.declaredFields(model.getDeclaredFields());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("include")) {
                this.include(model.getInclude());
            }
            if (model.wasPropertyExplicitlySet("cityField")) {
                this.cityField(model.getCityField());
            }
            if (model.wasPropertyExplicitlySet("regionField")) {
                this.regionField(model.getRegionField());
            }
            if (model.wasPropertyExplicitlySet("countryField")) {
                this.countryField(model.getCountryField());
            }
            if (model.wasPropertyExplicitlySet("continentField")) {
                this.continentField(model.getContinentField());
            }
            if (model.wasPropertyExplicitlySet("coordinatesField")) {
                this.coordinatesField(model.getCoordinatesField());
            }
            if (model.wasPropertyExplicitlySet("groupByFields")) {
                this.groupByFields(model.getGroupByFields());
            }
            if (model.wasPropertyExplicitlySet("functions")) {
                this.functions(model.getFunctions());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public GeoStatsCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            Include include,
            AbstractField cityField,
            AbstractField regionField,
            AbstractField countryField,
            AbstractField continentField,
            AbstractField coordinatesField,
            java.util.List<AbstractField> groupByFields,
            java.util.List<FunctionField> functions) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.include = include;
        this.cityField = cityField;
        this.regionField = regionField;
        this.countryField = countryField;
        this.continentField = continentField;
        this.coordinatesField = coordinatesField;
        this.groupByFields = groupByFields;
        this.functions = functions;
    }

    /**
     * Indicates which coordinates to show. Either client, server, client and server or custom. If
     * custom is specified at least one of coordinatesField, regionField or countryField is
     * required. Defaults to client.
     */
    public enum Include implements com.oracle.bmc.http.internal.BmcEnum {
        Client("CLIENT"),
        Server("SERVER"),
        ClientAndServer("CLIENT_AND_SERVER"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Include.class);

        private final String value;
        private static java.util.Map<String, Include> map;

        static {
            map = new java.util.HashMap<>();
            for (Include v : Include.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Include(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Include create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Include', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates which coordinates to show. Either client, server, client and server or custom. If
     * custom is specified at least one of coordinatesField, regionField or countryField is
     * required. Defaults to client.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    private final Include include;

    /**
     * Indicates which coordinates to show. Either client, server, client and server or custom. If
     * custom is specified at least one of coordinatesField, regionField or countryField is
     * required. Defaults to client.
     *
     * @return the value
     */
    public Include getInclude() {
        return include;
    }

    /** The city field to use. Only applicable when include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("cityField")
    private final AbstractField cityField;

    /**
     * The city field to use. Only applicable when include = CUSTOM.
     *
     * @return the value
     */
    public AbstractField getCityField() {
        return cityField;
    }

    /** The region field to use. Only applicable when include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionField")
    private final AbstractField regionField;

    /**
     * The region field to use. Only applicable when include = CUSTOM.
     *
     * @return the value
     */
    public AbstractField getRegionField() {
        return regionField;
    }

    /** The country field to use. Only applicable when include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("countryField")
    private final AbstractField countryField;

    /**
     * The country field to use. Only applicable when include = CUSTOM.
     *
     * @return the value
     */
    public AbstractField getCountryField() {
        return countryField;
    }

    /** The continent field to use. Only applicable when include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("continentField")
    private final AbstractField continentField;

    /**
     * The continent field to use. Only applicable when include = CUSTOM.
     *
     * @return the value
     */
    public AbstractField getContinentField() {
        return continentField;
    }

    /** The coordinates field to use. Only applicable when include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinatesField")
    private final AbstractField coordinatesField;

    /**
     * The coordinates field to use. Only applicable when include = CUSTOM.
     *
     * @return the value
     */
    public AbstractField getCoordinatesField() {
        return coordinatesField;
    }

    /** Group by fields if specified in the query string. Required if include = CUSTOM. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupByFields")
    private final java.util.List<AbstractField> groupByFields;

    /**
     * Group by fields if specified in the query string. Required if include = CUSTOM.
     *
     * @return the value
     */
    public java.util.List<AbstractField> getGroupByFields() {
        return groupByFields;
    }

    /**
     * Statistical functions specified in the query string. At least 1 is required for a GEOSTATS
     * command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<FunctionField> functions;

    /**
     * Statistical functions specified in the query string. At least 1 is required for a GEOSTATS
     * command.
     *
     * @return the value
     */
    public java.util.List<FunctionField> getFunctions() {
        return functions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GeoStatsCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", include=").append(String.valueOf(this.include));
        sb.append(", cityField=").append(String.valueOf(this.cityField));
        sb.append(", regionField=").append(String.valueOf(this.regionField));
        sb.append(", countryField=").append(String.valueOf(this.countryField));
        sb.append(", continentField=").append(String.valueOf(this.continentField));
        sb.append(", coordinatesField=").append(String.valueOf(this.coordinatesField));
        sb.append(", groupByFields=").append(String.valueOf(this.groupByFields));
        sb.append(", functions=").append(String.valueOf(this.functions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeoStatsCommandDescriptor)) {
            return false;
        }

        GeoStatsCommandDescriptor other = (GeoStatsCommandDescriptor) o;
        return java.util.Objects.equals(this.include, other.include)
                && java.util.Objects.equals(this.cityField, other.cityField)
                && java.util.Objects.equals(this.regionField, other.regionField)
                && java.util.Objects.equals(this.countryField, other.countryField)
                && java.util.Objects.equals(this.continentField, other.continentField)
                && java.util.Objects.equals(this.coordinatesField, other.coordinatesField)
                && java.util.Objects.equals(this.groupByFields, other.groupByFields)
                && java.util.Objects.equals(this.functions, other.functions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.include == null ? 43 : this.include.hashCode());
        result = (result * PRIME) + (this.cityField == null ? 43 : this.cityField.hashCode());
        result = (result * PRIME) + (this.regionField == null ? 43 : this.regionField.hashCode());
        result = (result * PRIME) + (this.countryField == null ? 43 : this.countryField.hashCode());
        result =
                (result * PRIME)
                        + (this.continentField == null ? 43 : this.continentField.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinatesField == null ? 43 : this.coordinatesField.hashCode());
        result =
                (result * PRIME)
                        + (this.groupByFields == null ? 43 : this.groupByFields.hashCode());
        result = (result * PRIME) + (this.functions == null ? 43 : this.functions.hashCode());
        return result;
    }
}
