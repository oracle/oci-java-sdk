/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information required to search monitored resource associations.
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
    builder = SearchMonitoredResourceAssociationsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SearchMonitoredResourceAssociationsDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
        private String sourceResourceId;

        public Builder sourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            this.__explicitlySet__.add("sourceResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceName")
        private String sourceResourceName;

        public Builder sourceResourceName(String sourceResourceName) {
            this.sourceResourceName = sourceResourceName;
            this.__explicitlySet__.add("sourceResourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceType")
        private String sourceResourceType;

        public Builder sourceResourceType(String sourceResourceType) {
            this.sourceResourceType = sourceResourceType;
            this.__explicitlySet__.add("sourceResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
        private String destinationResourceId;

        public Builder destinationResourceId(String destinationResourceId) {
            this.destinationResourceId = destinationResourceId;
            this.__explicitlySet__.add("destinationResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceName")
        private String destinationResourceName;

        public Builder destinationResourceName(String destinationResourceName) {
            this.destinationResourceName = destinationResourceName;
            this.__explicitlySet__.add("destinationResourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceType")
        private String destinationResourceType;

        public Builder destinationResourceType(String destinationResourceType) {
            this.destinationResourceType = destinationResourceType;
            this.__explicitlySet__.add("destinationResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private String associationType;

        public Builder associationType(String associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchMonitoredResourceAssociationsDetails build() {
            SearchMonitoredResourceAssociationsDetails __instance__ =
                    new SearchMonitoredResourceAssociationsDetails(
                            compartmentId,
                            sourceResourceId,
                            sourceResourceName,
                            sourceResourceType,
                            destinationResourceId,
                            destinationResourceName,
                            destinationResourceType,
                            associationType,
                            sortBy,
                            sortOrder);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchMonitoredResourceAssociationsDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .sourceResourceId(o.getSourceResourceId())
                            .sourceResourceName(o.getSourceResourceName())
                            .sourceResourceType(o.getSourceResourceType())
                            .destinationResourceId(o.getDestinationResourceId())
                            .destinationResourceName(o.getDestinationResourceName())
                            .destinationResourceType(o.getDestinationResourceType())
                            .associationType(o.getAssociationType())
                            .sortBy(o.getSortBy())
                            .sortOrder(o.getSortOrder());

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
     * Source Monitored Resource Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    String sourceResourceId;

    /**
     * Source Monitored Resource Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceName")
    String sourceResourceName;

    /**
     * Source Monitored Resource Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceType")
    String sourceResourceType;

    /**
     * Destination Monitored Resource Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    String destinationResourceId;

    /**
     * Source Monitored Resource Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceName")
    String destinationResourceName;

    /**
     * Source Monitored Resource Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceType")
    String destinationResourceType;

    /**
     * Association type to be created between source and destination resources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    String associationType;
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for assocType is descending.
     *
     **/
    public enum SortBy {
        TimeCreated("TIME_CREATED"),
        AssocType("ASSOC_TYPE"),
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
     * Default order for timeCreated is descending. Default order for assocType is descending.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    SortBy sortBy;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    SortOrder sortOrder;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
