/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * List of resource id, name , capacity insight value, pattern, historical usage and projected data.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataInsightResourceForecastTrendSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInsightResourceForecastTrendSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "daysToReachCapacity",
        "selectedForecastAlgorithm",
        "pattern",
        "historicalData",
        "projectedData"
    })
    public ExadataInsightResourceForecastTrendSummary(
            String id,
            String name,
            Integer daysToReachCapacity,
            String selectedForecastAlgorithm,
            Pattern pattern,
            java.util.List<HistoricalDataItem> historicalData,
            java.util.List<ProjectedDataItem> projectedData) {
        super();
        this.id = id;
        this.name = name;
        this.daysToReachCapacity = daysToReachCapacity;
        this.selectedForecastAlgorithm = selectedForecastAlgorithm;
        this.pattern = pattern;
        this.historicalData = historicalData;
        this.projectedData = projectedData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the resource.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Days to reach capacity for a storage server */
        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachCapacity")
        private Integer daysToReachCapacity;

        /**
         * Days to reach capacity for a storage server
         *
         * @param daysToReachCapacity the value to set
         * @return this builder
         */
        public Builder daysToReachCapacity(Integer daysToReachCapacity) {
            this.daysToReachCapacity = daysToReachCapacity;
            this.__explicitlySet__.add("daysToReachCapacity");
            return this;
        }
        /** Auto-ML algorithm leveraged for the forecast. Only applicable for Auto-ML forecast. */
        @com.fasterxml.jackson.annotation.JsonProperty("selectedForecastAlgorithm")
        private String selectedForecastAlgorithm;

        /**
         * Auto-ML algorithm leveraged for the forecast. Only applicable for Auto-ML forecast.
         *
         * @param selectedForecastAlgorithm the value to set
         * @return this builder
         */
        public Builder selectedForecastAlgorithm(String selectedForecastAlgorithm) {
            this.selectedForecastAlgorithm = selectedForecastAlgorithm;
            this.__explicitlySet__.add("selectedForecastAlgorithm");
            return this;
        }
        /** Time series patterns used in the forecasting. */
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private Pattern pattern;

        /**
         * Time series patterns used in the forecasting.
         *
         * @param pattern the value to set
         * @return this builder
         */
        public Builder pattern(Pattern pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /** Time series data used for the forecast analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
        private java.util.List<HistoricalDataItem> historicalData;

        /**
         * Time series data used for the forecast analysis.
         *
         * @param historicalData the value to set
         * @return this builder
         */
        public Builder historicalData(java.util.List<HistoricalDataItem> historicalData) {
            this.historicalData = historicalData;
            this.__explicitlySet__.add("historicalData");
            return this;
        }
        /** Time series data result of the forecasting analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
        private java.util.List<ProjectedDataItem> projectedData;

        /**
         * Time series data result of the forecasting analysis.
         *
         * @param projectedData the value to set
         * @return this builder
         */
        public Builder projectedData(java.util.List<ProjectedDataItem> projectedData) {
            this.projectedData = projectedData;
            this.__explicitlySet__.add("projectedData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceForecastTrendSummary build() {
            ExadataInsightResourceForecastTrendSummary model =
                    new ExadataInsightResourceForecastTrendSummary(
                            this.id,
                            this.name,
                            this.daysToReachCapacity,
                            this.selectedForecastAlgorithm,
                            this.pattern,
                            this.historicalData,
                            this.projectedData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceForecastTrendSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("daysToReachCapacity")) {
                this.daysToReachCapacity(model.getDaysToReachCapacity());
            }
            if (model.wasPropertyExplicitlySet("selectedForecastAlgorithm")) {
                this.selectedForecastAlgorithm(model.getSelectedForecastAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
            }
            if (model.wasPropertyExplicitlySet("historicalData")) {
                this.historicalData(model.getHistoricalData());
            }
            if (model.wasPropertyExplicitlySet("projectedData")) {
                this.projectedData(model.getProjectedData());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database insight resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database insight resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the resource.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Days to reach capacity for a storage server */
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachCapacity")
    private final Integer daysToReachCapacity;

    /**
     * Days to reach capacity for a storage server
     *
     * @return the value
     */
    public Integer getDaysToReachCapacity() {
        return daysToReachCapacity;
    }

    /** Auto-ML algorithm leveraged for the forecast. Only applicable for Auto-ML forecast. */
    @com.fasterxml.jackson.annotation.JsonProperty("selectedForecastAlgorithm")
    private final String selectedForecastAlgorithm;

    /**
     * Auto-ML algorithm leveraged for the forecast. Only applicable for Auto-ML forecast.
     *
     * @return the value
     */
    public String getSelectedForecastAlgorithm() {
        return selectedForecastAlgorithm;
    }

    /** Time series patterns used in the forecasting. */
    public enum Pattern implements com.oracle.bmc.http.internal.BmcEnum {
        Linear("LINEAR"),
        MonthlySeasons("MONTHLY_SEASONS"),
        MonthlyAndYearlySeasons("MONTHLY_AND_YEARLY_SEASONS"),
        WeeklySeasons("WEEKLY_SEASONS"),
        WeeklyAndMonthlySeasons("WEEKLY_AND_MONTHLY_SEASONS"),
        WeeklyMonthlyAndYearlySeasons("WEEKLY_MONTHLY_AND_YEARLY_SEASONS"),
        WeeklyAndYearlySeasons("WEEKLY_AND_YEARLY_SEASONS"),
        YearlySeasons("YEARLY_SEASONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Pattern.class);

        private final String value;
        private static java.util.Map<String, Pattern> map;

        static {
            map = new java.util.HashMap<>();
            for (Pattern v : Pattern.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Pattern(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Pattern create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Pattern', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Time series patterns used in the forecasting. */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final Pattern pattern;

    /**
     * Time series patterns used in the forecasting.
     *
     * @return the value
     */
    public Pattern getPattern() {
        return pattern;
    }

    /** Time series data used for the forecast analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
    private final java.util.List<HistoricalDataItem> historicalData;

    /**
     * Time series data used for the forecast analysis.
     *
     * @return the value
     */
    public java.util.List<HistoricalDataItem> getHistoricalData() {
        return historicalData;
    }

    /** Time series data result of the forecasting analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
    private final java.util.List<ProjectedDataItem> projectedData;

    /**
     * Time series data result of the forecasting analysis.
     *
     * @return the value
     */
    public java.util.List<ProjectedDataItem> getProjectedData() {
        return projectedData;
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
        sb.append("ExadataInsightResourceForecastTrendSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", daysToReachCapacity=").append(String.valueOf(this.daysToReachCapacity));
        sb.append(", selectedForecastAlgorithm=")
                .append(String.valueOf(this.selectedForecastAlgorithm));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", historicalData=").append(String.valueOf(this.historicalData));
        sb.append(", projectedData=").append(String.valueOf(this.projectedData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceForecastTrendSummary)) {
            return false;
        }

        ExadataInsightResourceForecastTrendSummary other =
                (ExadataInsightResourceForecastTrendSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.daysToReachCapacity, other.daysToReachCapacity)
                && java.util.Objects.equals(
                        this.selectedForecastAlgorithm, other.selectedForecastAlgorithm)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.historicalData, other.historicalData)
                && java.util.Objects.equals(this.projectedData, other.projectedData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.daysToReachCapacity == null
                                ? 43
                                : this.daysToReachCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.selectedForecastAlgorithm == null
                                ? 43
                                : this.selectedForecastAlgorithm.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result =
                (result * PRIME)
                        + (this.historicalData == null ? 43 : this.historicalData.hashCode());
        result =
                (result * PRIME)
                        + (this.projectedData == null ? 43 : this.projectedData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
