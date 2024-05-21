/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * Query parameters to filter indicators
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeIndicatorsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeIndicatorsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "indicatorType",
        "indicatorValue",
        "threatTypes",
        "confidenceGreaterThanOrEqualTo",
        "timeUpdatedGreaterThanOrEqualTo",
        "timeUpdatedLessThan",
        "timeLastSeenGreaterThanOrEqualTo",
        "timeLastSeenLessThan",
        "timeCreatedGreaterThanOrEqualTo",
        "timeCreatedLessThan",
        "indicatorSeenBy",
        "malware",
        "threatActor",
        "sortOrder",
        "sortBy"
    })
    public SummarizeIndicatorsDetails(
            IndicatorType indicatorType,
            String indicatorValue,
            java.util.List<String> threatTypes,
            Integer confidenceGreaterThanOrEqualTo,
            java.util.Date timeUpdatedGreaterThanOrEqualTo,
            java.util.Date timeUpdatedLessThan,
            java.util.Date timeLastSeenGreaterThanOrEqualTo,
            java.util.Date timeLastSeenLessThan,
            java.util.Date timeCreatedGreaterThanOrEqualTo,
            java.util.Date timeCreatedLessThan,
            String indicatorSeenBy,
            String malware,
            String threatActor,
            SortOrder sortOrder,
            SortBy sortBy) {
        super();
        this.indicatorType = indicatorType;
        this.indicatorValue = indicatorValue;
        this.threatTypes = threatTypes;
        this.confidenceGreaterThanOrEqualTo = confidenceGreaterThanOrEqualTo;
        this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
        this.timeUpdatedLessThan = timeUpdatedLessThan;
        this.timeLastSeenGreaterThanOrEqualTo = timeLastSeenGreaterThanOrEqualTo;
        this.timeLastSeenLessThan = timeLastSeenLessThan;
        this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = timeCreatedLessThan;
        this.indicatorSeenBy = indicatorSeenBy;
        this.malware = malware;
        this.threatActor = threatActor;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of indicator this is
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indicatorType")
        private IndicatorType indicatorType;

        /**
         * The type of indicator this is
         * @param indicatorType the value to set
         * @return this builder
         **/
        public Builder indicatorType(IndicatorType indicatorType) {
            this.indicatorType = indicatorType;
            this.__explicitlySet__.add("indicatorType");
            return this;
        }
        /**
         * The value for the type of indicator this is
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indicatorValue")
        private String indicatorValue;

        /**
         * The value for the type of indicator this is
         * @param indicatorValue the value to set
         * @return this builder
         **/
        public Builder indicatorValue(String indicatorValue) {
            this.indicatorValue = indicatorValue;
            this.__explicitlySet__.add("indicatorValue");
            return this;
        }
        /**
         * The threat type of entites to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
        private java.util.List<String> threatTypes;

        /**
         * The threat type of entites to be returned.
         * @param threatTypes the value to set
         * @return this builder
         **/
        public Builder threatTypes(java.util.List<String> threatTypes) {
            this.threatTypes = threatTypes;
            this.__explicitlySet__.add("threatTypes");
            return this;
        }
        /**
         * The minimum level of confidence to return
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidenceGreaterThanOrEqualTo")
        private Integer confidenceGreaterThanOrEqualTo;

        /**
         * The minimum level of confidence to return
         * @param confidenceGreaterThanOrEqualTo the value to set
         * @return this builder
         **/
        public Builder confidenceGreaterThanOrEqualTo(Integer confidenceGreaterThanOrEqualTo) {
            this.confidenceGreaterThanOrEqualTo = confidenceGreaterThanOrEqualTo;
            this.__explicitlySet__.add("confidenceGreaterThanOrEqualTo");
            return this;
        }
        /**
         * The oldest update time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
        private java.util.Date timeUpdatedGreaterThanOrEqualTo;

        /**
         * The oldest update time of entities to be returned.
         * @param timeUpdatedGreaterThanOrEqualTo the value to set
         * @return this builder
         **/
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeUpdatedGreaterThanOrEqualTo");
            return this;
        }
        /**
         * The newest update time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
        private java.util.Date timeUpdatedLessThan;

        /**
         * The newest update time of entities to be returned.
         * @param timeUpdatedLessThan the value to set
         * @return this builder
         **/
        public Builder timeUpdatedLessThan(java.util.Date timeUpdatedLessThan) {
            this.timeUpdatedLessThan = timeUpdatedLessThan;
            this.__explicitlySet__.add("timeUpdatedLessThan");
            return this;
        }
        /**
         * The oldest last seen time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeenGreaterThanOrEqualTo")
        private java.util.Date timeLastSeenGreaterThanOrEqualTo;

        /**
         * The oldest last seen time of entities to be returned.
         * @param timeLastSeenGreaterThanOrEqualTo the value to set
         * @return this builder
         **/
        public Builder timeLastSeenGreaterThanOrEqualTo(
                java.util.Date timeLastSeenGreaterThanOrEqualTo) {
            this.timeLastSeenGreaterThanOrEqualTo = timeLastSeenGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeLastSeenGreaterThanOrEqualTo");
            return this;
        }
        /**
         * The newest last seen time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeenLessThan")
        private java.util.Date timeLastSeenLessThan;

        /**
         * The newest last seen time of entities to be returned.
         * @param timeLastSeenLessThan the value to set
         * @return this builder
         **/
        public Builder timeLastSeenLessThan(java.util.Date timeLastSeenLessThan) {
            this.timeLastSeenLessThan = timeLastSeenLessThan;
            this.__explicitlySet__.add("timeLastSeenLessThan");
            return this;
        }
        /**
         * The oldest creation time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
        private java.util.Date timeCreatedGreaterThanOrEqualTo;

        /**
         * The oldest creation time of entities to be returned.
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder
         **/
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeCreatedGreaterThanOrEqualTo");
            return this;
        }
        /**
         * The newest creation time of entities to be returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
        private java.util.Date timeCreatedLessThan;

        /**
         * The newest creation time of entities to be returned.
         * @param timeCreatedLessThan the value to set
         * @return this builder
         **/
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            this.__explicitlySet__.add("timeCreatedLessThan");
            return this;
        }
        /**
         * Filter to include indicators that have been seen by the provided source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indicatorSeenBy")
        private String indicatorSeenBy;

        /**
         * Filter to include indicators that have been seen by the provided source.
         * @param indicatorSeenBy the value to set
         * @return this builder
         **/
        public Builder indicatorSeenBy(String indicatorSeenBy) {
            this.indicatorSeenBy = indicatorSeenBy;
            this.__explicitlySet__.add("indicatorSeenBy");
            return this;
        }
        /**
         * Filter to include indicators associated with the provided malware.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("malware")
        private String malware;

        /**
         * Filter to include indicators associated with the provided malware.
         * @param malware the value to set
         * @return this builder
         **/
        public Builder malware(String malware) {
            this.malware = malware;
            this.__explicitlySet__.add("malware");
            return this;
        }
        /**
         * Filter to included indicators associated with the provided threat actor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threatActor")
        private String threatActor;

        /**
         * Filter to included indicators associated with the provided threat actor.
         * @param threatActor the value to set
         * @return this builder
         **/
        public Builder threatActor(String threatActor) {
            this.threatActor = threatActor;
            this.__explicitlySet__.add("threatActor");
            return this;
        }
        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder
         **/
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * The field to sort by. Only one field to sort by may be provided
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * The field to sort by. Only one field to sort by may be provided
         * @param sortBy the value to set
         * @return this builder
         **/
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeIndicatorsDetails build() {
            SummarizeIndicatorsDetails model =
                    new SummarizeIndicatorsDetails(
                            this.indicatorType,
                            this.indicatorValue,
                            this.threatTypes,
                            this.confidenceGreaterThanOrEqualTo,
                            this.timeUpdatedGreaterThanOrEqualTo,
                            this.timeUpdatedLessThan,
                            this.timeLastSeenGreaterThanOrEqualTo,
                            this.timeLastSeenLessThan,
                            this.timeCreatedGreaterThanOrEqualTo,
                            this.timeCreatedLessThan,
                            this.indicatorSeenBy,
                            this.malware,
                            this.threatActor,
                            this.sortOrder,
                            this.sortBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeIndicatorsDetails model) {
            if (model.wasPropertyExplicitlySet("indicatorType")) {
                this.indicatorType(model.getIndicatorType());
            }
            if (model.wasPropertyExplicitlySet("indicatorValue")) {
                this.indicatorValue(model.getIndicatorValue());
            }
            if (model.wasPropertyExplicitlySet("threatTypes")) {
                this.threatTypes(model.getThreatTypes());
            }
            if (model.wasPropertyExplicitlySet("confidenceGreaterThanOrEqualTo")) {
                this.confidenceGreaterThanOrEqualTo(model.getConfidenceGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeUpdatedGreaterThanOrEqualTo")) {
                this.timeUpdatedGreaterThanOrEqualTo(model.getTimeUpdatedGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeUpdatedLessThan")) {
                this.timeUpdatedLessThan(model.getTimeUpdatedLessThan());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeenGreaterThanOrEqualTo")) {
                this.timeLastSeenGreaterThanOrEqualTo(model.getTimeLastSeenGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeenLessThan")) {
                this.timeLastSeenLessThan(model.getTimeLastSeenLessThan());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedGreaterThanOrEqualTo")) {
                this.timeCreatedGreaterThanOrEqualTo(model.getTimeCreatedGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedLessThan")) {
                this.timeCreatedLessThan(model.getTimeCreatedLessThan());
            }
            if (model.wasPropertyExplicitlySet("indicatorSeenBy")) {
                this.indicatorSeenBy(model.getIndicatorSeenBy());
            }
            if (model.wasPropertyExplicitlySet("malware")) {
                this.malware(model.getMalware());
            }
            if (model.wasPropertyExplicitlySet("threatActor")) {
                this.threatActor(model.getThreatActor());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The type of indicator this is
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indicatorType")
    private final IndicatorType indicatorType;

    /**
     * The type of indicator this is
     * @return the value
     **/
    public IndicatorType getIndicatorType() {
        return indicatorType;
    }

    /**
     * The value for the type of indicator this is
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indicatorValue")
    private final String indicatorValue;

    /**
     * The value for the type of indicator this is
     * @return the value
     **/
    public String getIndicatorValue() {
        return indicatorValue;
    }

    /**
     * The threat type of entites to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
    private final java.util.List<String> threatTypes;

    /**
     * The threat type of entites to be returned.
     * @return the value
     **/
    public java.util.List<String> getThreatTypes() {
        return threatTypes;
    }

    /**
     * The minimum level of confidence to return
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidenceGreaterThanOrEqualTo")
    private final Integer confidenceGreaterThanOrEqualTo;

    /**
     * The minimum level of confidence to return
     * @return the value
     **/
    public Integer getConfidenceGreaterThanOrEqualTo() {
        return confidenceGreaterThanOrEqualTo;
    }

    /**
     * The oldest update time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
    private final java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * The oldest update time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }

    /**
     * The newest update time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
    private final java.util.Date timeUpdatedLessThan;

    /**
     * The newest update time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeUpdatedLessThan() {
        return timeUpdatedLessThan;
    }

    /**
     * The oldest last seen time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeenGreaterThanOrEqualTo")
    private final java.util.Date timeLastSeenGreaterThanOrEqualTo;

    /**
     * The oldest last seen time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeLastSeenGreaterThanOrEqualTo() {
        return timeLastSeenGreaterThanOrEqualTo;
    }

    /**
     * The newest last seen time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeenLessThan")
    private final java.util.Date timeLastSeenLessThan;

    /**
     * The newest last seen time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeLastSeenLessThan() {
        return timeLastSeenLessThan;
    }

    /**
     * The oldest creation time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
    private final java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * The oldest creation time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }

    /**
     * The newest creation time of entities to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
    private final java.util.Date timeCreatedLessThan;

    /**
     * The newest creation time of entities to be returned.
     * @return the value
     **/
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }

    /**
     * Filter to include indicators that have been seen by the provided source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indicatorSeenBy")
    private final String indicatorSeenBy;

    /**
     * Filter to include indicators that have been seen by the provided source.
     * @return the value
     **/
    public String getIndicatorSeenBy() {
        return indicatorSeenBy;
    }

    /**
     * Filter to include indicators associated with the provided malware.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("malware")
    private final String malware;

    /**
     * Filter to include indicators associated with the provided malware.
     * @return the value
     **/
    public String getMalware() {
        return malware;
    }

    /**
     * Filter to included indicators associated with the provided threat actor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatActor")
    private final String threatActor;

    /**
     * Filter to included indicators associated with the provided threat actor.
     * @return the value
     **/
    public String getThreatActor() {
        return threatActor;
    }

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     * @return the value
     **/
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * The field to sort by. Only one field to sort by may be provided
     **/
    public enum SortBy {
        Confidence("CONFIDENCE"),
        Timecreated("TIMECREATED"),
        Timeupdated("TIMEUPDATED"),
        Timelastseen("TIMELASTSEEN"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The field to sort by. Only one field to sort by may be provided
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * The field to sort by. Only one field to sort by may be provided
     * @return the value
     **/
    public SortBy getSortBy() {
        return sortBy;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SummarizeIndicatorsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("indicatorType=").append(String.valueOf(this.indicatorType));
        sb.append(", indicatorValue=").append(String.valueOf(this.indicatorValue));
        sb.append(", threatTypes=").append(String.valueOf(this.threatTypes));
        sb.append(", confidenceGreaterThanOrEqualTo=")
                .append(String.valueOf(this.confidenceGreaterThanOrEqualTo));
        sb.append(", timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(", timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(", timeLastSeenGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLastSeenGreaterThanOrEqualTo));
        sb.append(", timeLastSeenLessThan=").append(String.valueOf(this.timeLastSeenLessThan));
        sb.append(", timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(", timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(", indicatorSeenBy=").append(String.valueOf(this.indicatorSeenBy));
        sb.append(", malware=").append(String.valueOf(this.malware));
        sb.append(", threatActor=").append(String.valueOf(this.threatActor));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeIndicatorsDetails)) {
            return false;
        }

        SummarizeIndicatorsDetails other = (SummarizeIndicatorsDetails) o;
        return java.util.Objects.equals(this.indicatorType, other.indicatorType)
                && java.util.Objects.equals(this.indicatorValue, other.indicatorValue)
                && java.util.Objects.equals(this.threatTypes, other.threatTypes)
                && java.util.Objects.equals(
                        this.confidenceGreaterThanOrEqualTo, other.confidenceGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(
                        this.timeLastSeenGreaterThanOrEqualTo,
                        other.timeLastSeenGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLastSeenLessThan, other.timeLastSeenLessThan)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(this.indicatorSeenBy, other.indicatorSeenBy)
                && java.util.Objects.equals(this.malware, other.malware)
                && java.util.Objects.equals(this.threatActor, other.threatActor)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.indicatorType == null ? 43 : this.indicatorType.hashCode());
        result =
                (result * PRIME)
                        + (this.indicatorValue == null ? 43 : this.indicatorValue.hashCode());
        result = (result * PRIME) + (this.threatTypes == null ? 43 : this.threatTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.confidenceGreaterThanOrEqualTo == null
                                ? 43
                                : this.confidenceGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedLessThan == null
                                ? 43
                                : this.timeUpdatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSeenGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeLastSeenGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSeenLessThan == null
                                ? 43
                                : this.timeLastSeenLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.indicatorSeenBy == null ? 43 : this.indicatorSeenBy.hashCode());
        result = (result * PRIME) + (this.malware == null ? 43 : this.malware.hashCode());
        result = (result * PRIME) + (this.threatActor == null ? 43 : this.threatActor.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
