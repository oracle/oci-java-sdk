/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The request of the generated usage carbon emissions report. <br>
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
        builder = UsageCarbonEmissionsReportQuery.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageCarbonEmissionsReportQuery
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "timeUsageStarted",
        "timeUsageEnded",
        "isAggregateByTime",
        "groupBy",
        "groupByTag",
        "compartmentDepth",
        "filter",
        "dateRangeName"
    })
    public UsageCarbonEmissionsReportQuery(
            String tenantId,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            Boolean isAggregateByTime,
            java.util.List<String> groupBy,
            java.util.List<Tag> groupByTag,
            Integer compartmentDepth,
            Filter filter,
            DateRangeName dateRangeName) {
        super();
        this.tenantId = tenantId;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.isAggregateByTime = isAggregateByTime;
        this.groupBy = groupBy;
        this.groupByTag = groupByTag;
        this.compartmentDepth = compartmentDepth;
        this.filter = filter;
        this.dateRangeName = dateRangeName;
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
         * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost
         * over the query time period will be added up.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        /**
         * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost
         * over the query time period will be added up.
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
         * Specifies what to aggregate the result by. For example: {@code ["tagNamespace", "tagKey",
         * "tagValue", "service", "skuName", "skuPartNumber", "unit", "compartmentName",
         * "compartmentPath", "compartmentId", "platform", "region", "logicalAd", "resourceId",
         * "tenantId", "tenantName"]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Specifies what to aggregate the result by. For example: {@code ["tagNamespace", "tagKey",
         * "tagValue", "service", "skuName", "skuPartNumber", "unit", "compartmentName",
         * "compartmentPath", "compartmentId", "platform", "region", "logicalAd", "resourceId",
         * "tenantId", "tenantName"]}
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
        /**
         * The UI date range, for example, LAST_THREE_MONTHS. It will override timeUsageStarted and
         * timeUsageEnded properties.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateRangeName")
        private DateRangeName dateRangeName;

        /**
         * The UI date range, for example, LAST_THREE_MONTHS. It will override timeUsageStarted and
         * timeUsageEnded properties.
         *
         * @param dateRangeName the value to set
         * @return this builder
         */
        public Builder dateRangeName(DateRangeName dateRangeName) {
            this.dateRangeName = dateRangeName;
            this.__explicitlySet__.add("dateRangeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageCarbonEmissionsReportQuery build() {
            UsageCarbonEmissionsReportQuery model =
                    new UsageCarbonEmissionsReportQuery(
                            this.tenantId,
                            this.timeUsageStarted,
                            this.timeUsageEnded,
                            this.isAggregateByTime,
                            this.groupBy,
                            this.groupByTag,
                            this.compartmentDepth,
                            this.filter,
                            this.dateRangeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageCarbonEmissionsReportQuery model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
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
            if (model.wasPropertyExplicitlySet("dateRangeName")) {
                this.dateRangeName(model.getDateRangeName());
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

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost over
     * the query time period will be added up.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    private final Boolean isAggregateByTime;

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost over
     * the query time period will be added up.
     *
     * @return the value
     */
    public Boolean getIsAggregateByTime() {
        return isAggregateByTime;
    }

    /**
     * Specifies what to aggregate the result by. For example: {@code ["tagNamespace", "tagKey",
     * "tagValue", "service", "skuName", "skuPartNumber", "unit", "compartmentName",
     * "compartmentPath", "compartmentId", "platform", "region", "logicalAd", "resourceId",
     * "tenantId", "tenantName"]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Specifies what to aggregate the result by. For example: {@code ["tagNamespace", "tagKey",
     * "tagValue", "service", "skuName", "skuPartNumber", "unit", "compartmentName",
     * "compartmentPath", "compartmentId", "platform", "region", "logicalAd", "resourceId",
     * "tenantId", "tenantName"]}
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

    /**
     * The UI date range, for example, LAST_THREE_MONTHS. It will override timeUsageStarted and
     * timeUsageEnded properties.
     */
    public enum DateRangeName implements com.oracle.bmc.http.internal.BmcEnum {
        LastTwoMonths("LAST_TWO_MONTHS"),
        LastThreeMonths("LAST_THREE_MONTHS"),
        LastSixMonths("LAST_SIX_MONTHS"),
        LastOneYear("LAST_ONE_YEAR"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DateRangeName.class);

        private final String value;
        private static java.util.Map<String, DateRangeName> map;

        static {
            map = new java.util.HashMap<>();
            for (DateRangeName v : DateRangeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DateRangeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DateRangeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DateRangeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The UI date range, for example, LAST_THREE_MONTHS. It will override timeUsageStarted and
     * timeUsageEnded properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateRangeName")
    private final DateRangeName dateRangeName;

    /**
     * The UI date range, for example, LAST_THREE_MONTHS. It will override timeUsageStarted and
     * timeUsageEnded properties.
     *
     * @return the value
     */
    public DateRangeName getDateRangeName() {
        return dateRangeName;
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
        sb.append("UsageCarbonEmissionsReportQuery(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", isAggregateByTime=").append(String.valueOf(this.isAggregateByTime));
        sb.append(", groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", dateRangeName=").append(String.valueOf(this.dateRangeName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageCarbonEmissionsReportQuery)) {
            return false;
        }

        UsageCarbonEmissionsReportQuery other = (UsageCarbonEmissionsReportQuery) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(this.isAggregateByTime, other.isAggregateByTime)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.dateRangeName, other.dateRangeName)
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
                        + (this.isAggregateByTime == null ? 43 : this.isAggregateByTime.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result =
                (result * PRIME)
                        + (this.dateRangeName == null ? 43 : this.dateRangeName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
