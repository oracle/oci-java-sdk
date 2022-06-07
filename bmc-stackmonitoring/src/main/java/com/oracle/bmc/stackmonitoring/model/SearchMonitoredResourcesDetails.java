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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchMonitoredResourcesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchMonitoredResourcesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "name",
        "nameContains",
        "type",
        "hostName",
        "hostNameContains",
        "managementAgentId",
        "lifecycleState",
        "timeCreatedGreaterThanOrEqualTo",
        "timeCreatedLessThan",
        "timeUpdatedGreaterThanOrEqualTo",
        "timeUpdatedLessThan",
        "resourceTimeZone",
        "sortOrder",
        "sortBy",
        "propertyEquals"
    })
    public SearchMonitoredResourcesDetails(
            String compartmentId,
            String name,
            String nameContains,
            String type,
            String hostName,
            String hostNameContains,
            String managementAgentId,
            ResourceLifecycleState lifecycleState,
            java.util.Date timeCreatedGreaterThanOrEqualTo,
            java.util.Date timeCreatedLessThan,
            java.util.Date timeUpdatedGreaterThanOrEqualTo,
            java.util.Date timeUpdatedLessThan,
            String resourceTimeZone,
            SortOrder sortOrder,
            SortBy sortBy,
            java.util.Map<String, String> propertyEquals) {
        super();
        this.compartmentId = compartmentId;
        this.name = name;
        this.nameContains = nameContains;
        this.type = type;
        this.hostName = hostName;
        this.hostNameContains = hostNameContains;
        this.managementAgentId = managementAgentId;
        this.lifecycleState = lifecycleState;
        this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = timeCreatedLessThan;
        this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
        this.timeUpdatedLessThan = timeUpdatedLessThan;
        this.resourceTimeZone = resourceTimeZone;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
        this.propertyEquals = propertyEquals;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A filter to return resources that match exact resource name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A filter to return resources that match resource name pattern given. The match is not case sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
    private final String nameContains;

    public String getNameContains() {
        return nameContains;
    }

    /**
     * A filter to return resources that match resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    public String getType() {
        return type;
    }

    /**
     * A filter to return resources with host name match
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    public String getHostName() {
        return hostName;
    }

    /**
     * A filter to return resources with host name pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostNameContains")
    private final String hostNameContains;

    public String getHostNameContains() {
        return hostNameContains;
    }

    /**
     * A filter to return resources with matching management agent id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * A filter to return resources with matching lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourceLifecycleState lifecycleState;

    public ResourceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

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
    private final java.util.Date timeCreatedGreaterThanOrEqualTo;

    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }

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
    private final java.util.Date timeCreatedLessThan;

    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }

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
    private final java.util.Date timeUpdatedGreaterThanOrEqualTo;

    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }

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
    private final java.util.Date timeUpdatedLessThan;

    public java.util.Date getTimeUpdatedLessThan() {
        return timeUpdatedLessThan;
    }

    /**
     * Time zone in the form of tz database canonical zone ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    private final String resourceTimeZone;

    public String getResourceTimeZone() {
        return resourceTimeZone;
    }

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    public SortOrder getSortOrder() {
        return sortOrder;
    }

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
    private final SortBy sortBy;

    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Criteria based on resource property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyEquals")
    private final java.util.Map<String, String> propertyEquals;

    public java.util.Map<String, String> getPropertyEquals() {
        return propertyEquals;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchMonitoredResourcesDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", nameContains=").append(String.valueOf(this.nameContains));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", hostNameContains=").append(String.valueOf(this.hostNameContains));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(", timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(", timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(", timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(", resourceTimeZone=").append(String.valueOf(this.resourceTimeZone));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", propertyEquals=").append(String.valueOf(this.propertyEquals));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchMonitoredResourcesDetails)) {
            return false;
        }

        SearchMonitoredResourcesDetails other = (SearchMonitoredResourcesDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.hostNameContains, other.hostNameContains)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(this.resourceTimeZone, other.resourceTimeZone)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.propertyEquals, other.propertyEquals)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostNameContains == null ? 43 : this.hostNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
                        + (this.resourceTimeZone == null ? 43 : this.resourceTimeZone.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyEquals == null ? 43 : this.propertyEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
