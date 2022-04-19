/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The property search criteria for listing monitored resources.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchMonitoredResourcesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SearchMonitoredResourcesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
        private String nameContains;

        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            this.__explicitlySet__.add("nameContains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostNameContains")
        private String hostNameContains;

        public Builder hostNameContains(String hostNameContains) {
            this.hostNameContains = hostNameContains;
            this.__explicitlySet__.add("hostNameContains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceLifecycleState lifecycleState;

        public Builder lifecycleState(ResourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
        private java.util.Date timeCreatedGreaterThanOrEqualTo;

        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeCreatedGreaterThanOrEqualTo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
        private java.util.Date timeCreatedLessThan;

        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            this.__explicitlySet__.add("timeCreatedLessThan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
        private java.util.Date timeUpdatedGreaterThanOrEqualTo;

        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeUpdatedGreaterThanOrEqualTo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
        private java.util.Date timeUpdatedLessThan;

        public Builder timeUpdatedLessThan(java.util.Date timeUpdatedLessThan) {
            this.timeUpdatedLessThan = timeUpdatedLessThan;
            this.__explicitlySet__.add("timeUpdatedLessThan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
        private String resourceTimeZone;

        public Builder resourceTimeZone(String resourceTimeZone) {
            this.resourceTimeZone = resourceTimeZone;
            this.__explicitlySet__.add("resourceTimeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyEquals")
        private java.util.Map<String, String> propertyEquals;

        public Builder propertyEquals(java.util.Map<String, String> propertyEquals) {
            this.propertyEquals = propertyEquals;
            this.__explicitlySet__.add("propertyEquals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchMonitoredResourcesDetails build() {
            SearchMonitoredResourcesDetails __instance__ =
                    new SearchMonitoredResourcesDetails(
                            compartmentId,
                            name,
                            nameContains,
                            type,
                            hostName,
                            hostNameContains,
                            managementAgentId,
                            lifecycleState,
                            timeCreatedGreaterThanOrEqualTo,
                            timeCreatedLessThan,
                            timeUpdatedGreaterThanOrEqualTo,
                            timeUpdatedLessThan,
                            resourceTimeZone,
                            sortOrder,
                            sortBy,
                            propertyEquals);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchMonitoredResourcesDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .nameContains(o.getNameContains())
                            .type(o.getType())
                            .hostName(o.getHostName())
                            .hostNameContains(o.getHostNameContains())
                            .managementAgentId(o.getManagementAgentId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo())
                            .timeCreatedLessThan(o.getTimeCreatedLessThan())
                            .timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo())
                            .timeUpdatedLessThan(o.getTimeUpdatedLessThan())
                            .resourceTimeZone(o.getResourceTimeZone())
                            .sortOrder(o.getSortOrder())
                            .sortBy(o.getSortBy())
                            .propertyEquals(o.getPropertyEquals());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A filter to return resources that match exact resource name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A filter to return resources that match resource name pattern given. The match is not case sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
    String nameContains;

    /**
     * A filter to return resources that match resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * A filter to return resources with host name match
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    String hostName;

    /**
     * A filter to return resources with host name pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostNameContains")
    String hostNameContains;

    /**
     * A filter to return resources with matching management agent id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    String managementAgentId;

    /**
     * A filter to return resources with matching lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ResourceLifecycleState lifecycleState;

    /**
     * Search for resources that were created within a specific date range,
     * using this parameter to specify the earliest creation date for the
     * returned list (inclusive). Specifying this parameter without the
     * corresponding {@code timeCreatedLessThan} parameter will retrieve resources created from the
     * given {@code timeCreatedGreaterThanOrEqualTo} to the current time, in "YYYY-MM-ddThh:mmZ" format with a
     * Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
    java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were created within a specific date range,
     * using this parameter to specify the latest creation date for the returned
     * list (exclusive). Specifying this parameter without the corresponding
     * {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all resources created before the
     * specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
    java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were updated within a specific date range,
     * using this parameter to specify the earliest update date for the
     * returned list (inclusive). Specifying this parameter without the
     * corresponding {@code timeUpdatedLessThan} parameter will retrieve resources updated from the
     * given {@code timeUpdatedGreaterThanOrEqualTo} to the current time, in "YYYY-MM-ddThh:mmZ" format with a
     * Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
    java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were updated within a specific date range,
     * using this parameter to specify the latest creation date for the returned
     * list (exclusive). Specifying this parameter without the corresponding
     * {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all resources updated before the
     * specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
    java.util.Date timeUpdatedLessThan;

    /**
     * Time zone in the form of tz database canonical zone ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    String resourceTimeZone;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    SortOrder sortOrder;
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for resources is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("TIME_CREATED"),
        ResourceName("RESOURCE_NAME"),
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
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for resources is ascending.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    SortBy sortBy;

    /**
     * Criteria based on resource property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyEquals")
    java.util.Map<String, String> propertyEquals;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
