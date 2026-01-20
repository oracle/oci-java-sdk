/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Details for the '/usageCarbonEmissions' query. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestUsageCarbonEmissionsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestUsageCarbonEmissionsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "timeUsageStarted",
        "timeUsageEnded",
        "emissionCalculationMethod",
        "emissionType",
        "granularity",
        "isAggregateByTime",
        "groupBy",
        "groupByTag",
        "compartmentDepth",
        "filter"
    })
    public RequestUsageCarbonEmissionsDetails(
            String tenantId,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            EmissionCalculationMethod emissionCalculationMethod,
            EmissionType emissionType,
            Granularity granularity,
            Boolean isAggregateByTime,
            java.util.List<String> groupBy,
            java.util.List<Tag> groupByTag,
            Integer compartmentDepth,
            Filter filter) {
        super();
        this.tenantId = tenantId;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.emissionCalculationMethod = emissionCalculationMethod;
        this.emissionType = emissionType;
        this.granularity = granularity;
        this.isAggregateByTime = isAggregateByTime;
        this.groupBy = groupBy;
        this.groupByTag = groupByTag;
        this.compartmentDepth = compartmentDepth;
        this.filter = filter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tenant ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant ID.
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** The usage start time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The usage start time.
         *
         * @param timeUsageStarted the value to set
         * @return this builder
         */
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /** The usage end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The usage end time.
         *
         * @param timeUsageEnded the value to set
         * @return this builder
         */
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }
        /**
         * Specifies the method used for emission calculation, such as POWER_BASED or SPEND_BASED
         */
        @com.fasterxml.jackson.annotation.JsonProperty("emissionCalculationMethod")
        private EmissionCalculationMethod emissionCalculationMethod;

        /**
         * Specifies the method used for emission calculation, such as POWER_BASED or SPEND_BASED
         *
         * @param emissionCalculationMethod the value to set
         * @return this builder
         */
        public Builder emissionCalculationMethod(
                EmissionCalculationMethod emissionCalculationMethod) {
            this.emissionCalculationMethod = emissionCalculationMethod;
            this.__explicitlySet__.add("emissionCalculationMethod");
            return this;
        }
        /** Specifies the type of emission, such as MARKET_BASED or LOCATION_BASED. */
        @com.fasterxml.jackson.annotation.JsonProperty("emissionType")
        private EmissionType emissionType;

        /**
         * Specifies the type of emission, such as MARKET_BASED or LOCATION_BASED.
         *
         * @param emissionType the value to set
         * @return this builder
         */
        public Builder emissionType(EmissionType emissionType) {
            this.emissionType = emissionType;
            this.__explicitlySet__.add("emissionType");
            return this;
        }
        /**
         * The carbon emission granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
         * aggregation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        /**
         * The carbon emission granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
         * aggregation.
         *
         * @param granularity the value to set
         * @return this builder
         */
        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }
        /**
         * Specifies whether aggregated by time. If isAggregateByTime is true, all carbon emissions
         * usage over the query time period are summed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        /**
         * Specifies whether aggregated by time. If isAggregateByTime is true, all carbon emissions
         * usage over the query time period are summed.
         *
         * @param isAggregateByTime the value to set
         * @return this builder
         */
        public Builder isAggregateByTime(Boolean isAggregateByTime) {
            this.isAggregateByTime = isAggregateByTime;
            this.__explicitlySet__.add("isAggregateByTime");
            return this;
        }
        /**
         * Aggregate the result by. For example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "resourceName",
         * "tenantId", "tenantName", "subscriptionId"]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Aggregate the result by. For example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "resourceName",
         * "tenantId", "tenantName", "subscriptionId"]}
         *
         * @param groupBy the value to set
         * @return this builder
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         * @param groupByTag the value to set
         * @return this builder
         **/
        public Builder groupByTag(java.util.List<Tag> groupByTag) {
            this.groupByTag = groupByTag;
            this.__explicitlySet__.add("groupByTag");
            return this;
        }
        /** The compartment depth level. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private Integer compartmentDepth;

        /**
         * The compartment depth level.
         *
         * @param compartmentDepth the value to set
         * @return this builder
         */
        public Builder compartmentDepth(Integer compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private Filter filter;

        public Builder filter(Filter filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestUsageCarbonEmissionsDetails build() {
            RequestUsageCarbonEmissionsDetails model =
                    new RequestUsageCarbonEmissionsDetails(
                            this.tenantId,
                            this.timeUsageStarted,
                            this.timeUsageEnded,
                            this.emissionCalculationMethod,
                            this.emissionType,
                            this.granularity,
                            this.isAggregateByTime,
                            this.groupBy,
                            this.groupByTag,
                            this.compartmentDepth,
                            this.filter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestUsageCarbonEmissionsDetails model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
            }
            if (model.wasPropertyExplicitlySet("emissionCalculationMethod")) {
                this.emissionCalculationMethod(model.getEmissionCalculationMethod());
            }
            if (model.wasPropertyExplicitlySet("emissionType")) {
                this.emissionType(model.getEmissionType());
            }
            if (model.wasPropertyExplicitlySet("granularity")) {
                this.granularity(model.getGranularity());
            }
            if (model.wasPropertyExplicitlySet("isAggregateByTime")) {
                this.isAggregateByTime(model.getIsAggregateByTime());
            }
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
            }
            if (model.wasPropertyExplicitlySet("groupByTag")) {
                this.groupByTag(model.getGroupByTag());
            }
            if (model.wasPropertyExplicitlySet("compartmentDepth")) {
                this.compartmentDepth(model.getCompartmentDepth());
            }
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
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

    /** Tenant ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant ID.
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** The usage start time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The usage start time.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /** The usage end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The usage end time.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /** Specifies the method used for emission calculation, such as POWER_BASED or SPEND_BASED */
    public enum EmissionCalculationMethod implements com.oracle.bmc.http.internal.BmcEnum {
        SpendBased("SPEND_BASED"),
        PowerBased("POWER_BASED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EmissionCalculationMethod.class);

        private final String value;
        private static java.util.Map<String, EmissionCalculationMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (EmissionCalculationMethod v : EmissionCalculationMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EmissionCalculationMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EmissionCalculationMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EmissionCalculationMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the method used for emission calculation, such as POWER_BASED or SPEND_BASED */
    @com.fasterxml.jackson.annotation.JsonProperty("emissionCalculationMethod")
    private final EmissionCalculationMethod emissionCalculationMethod;

    /**
     * Specifies the method used for emission calculation, such as POWER_BASED or SPEND_BASED
     *
     * @return the value
     */
    public EmissionCalculationMethod getEmissionCalculationMethod() {
        return emissionCalculationMethod;
    }

    /** Specifies the type of emission, such as MARKET_BASED or LOCATION_BASED. */
    public enum EmissionType implements com.oracle.bmc.http.internal.BmcEnum {
        MarketBased("MARKET_BASED"),
        LocationBased("LOCATION_BASED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EmissionType.class);

        private final String value;
        private static java.util.Map<String, EmissionType> map;

        static {
            map = new java.util.HashMap<>();
            for (EmissionType v : EmissionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EmissionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EmissionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EmissionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the type of emission, such as MARKET_BASED or LOCATION_BASED. */
    @com.fasterxml.jackson.annotation.JsonProperty("emissionType")
    private final EmissionType emissionType;

    /**
     * Specifies the type of emission, such as MARKET_BASED or LOCATION_BASED.
     *
     * @return the value
     */
    public EmissionType getEmissionType() {
        return emissionType;
    }

    /**
     * The carbon emission granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
     * aggregation.
     */
    public enum Granularity implements com.oracle.bmc.http.internal.BmcEnum {
        Daily("DAILY"),
        Monthly("MONTHLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Granularity.class);

        private final String value;
        private static java.util.Map<String, Granularity> map;

        static {
            map = new java.util.HashMap<>();
            for (Granularity v : Granularity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Granularity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Granularity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Granularity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The carbon emission granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
     * aggregation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    private final Granularity granularity;

    /**
     * The carbon emission granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
     * aggregation.
     *
     * @return the value
     */
    public Granularity getGranularity() {
        return granularity;
    }

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all carbon emissions
     * usage over the query time period are summed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    private final Boolean isAggregateByTime;

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all carbon emissions
     * usage over the query time period are summed.
     *
     * @return the value
     */
    public Boolean getIsAggregateByTime() {
        return isAggregateByTime;
    }

    /**
     * Aggregate the result by. For example: {@code ["tagNamespace", "tagKey", "tagValue",
     * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
     * "compartmentId", "platform", "region", "logicalAd", "resourceId", "resourceName", "tenantId",
     * "tenantName", "subscriptionId"]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Aggregate the result by. For example: {@code ["tagNamespace", "tagKey", "tagValue",
     * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
     * "compartmentId", "platform", "region", "logicalAd", "resourceId", "resourceName", "tenantId",
     * "tenantName", "subscriptionId"]}
     *
     * @return the value
     */
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    private final java.util.List<Tag> groupByTag;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     * @return the value
     **/
    public java.util.List<Tag> getGroupByTag() {
        return groupByTag;
    }

    /** The compartment depth level. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    private final Integer compartmentDepth;

    /**
     * The compartment depth level.
     *
     * @return the value
     */
    public Integer getCompartmentDepth() {
        return compartmentDepth;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final Filter filter;

    public Filter getFilter() {
        return filter;
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
        sb.append("RequestUsageCarbonEmissionsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", emissionCalculationMethod=")
                .append(String.valueOf(this.emissionCalculationMethod));
        sb.append(", emissionType=").append(String.valueOf(this.emissionType));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", isAggregateByTime=").append(String.valueOf(this.isAggregateByTime));
        sb.append(", groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestUsageCarbonEmissionsDetails)) {
            return false;
        }

        RequestUsageCarbonEmissionsDetails other = (RequestUsageCarbonEmissionsDetails) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(
                        this.emissionCalculationMethod, other.emissionCalculationMethod)
                && java.util.Objects.equals(this.emissionType, other.emissionType)
                && java.util.Objects.equals(this.granularity, other.granularity)
                && java.util.Objects.equals(this.isAggregateByTime, other.isAggregateByTime)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.filter, other.filter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.emissionCalculationMethod == null
                                ? 43
                                : this.emissionCalculationMethod.hashCode());
        result = (result * PRIME) + (this.emissionType == null ? 43 : this.emissionType.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAggregateByTime == null ? 43 : this.isAggregateByTime.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
