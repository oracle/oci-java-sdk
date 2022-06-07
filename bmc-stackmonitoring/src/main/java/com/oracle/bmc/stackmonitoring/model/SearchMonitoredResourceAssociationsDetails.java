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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchMonitoredResourceAssociationsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchMonitoredResourceAssociationsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "sourceResourceId",
        "sourceResourceName",
        "sourceResourceType",
        "destinationResourceId",
        "destinationResourceName",
        "destinationResourceType",
        "associationType",
        "sortBy",
        "sortOrder"
    })
    public SearchMonitoredResourceAssociationsDetails(
            String compartmentId,
            String sourceResourceId,
            String sourceResourceName,
            String sourceResourceType,
            String destinationResourceId,
            String destinationResourceName,
            String destinationResourceType,
            String associationType,
            SortBy sortBy,
            SortOrder sortOrder) {
        super();
        this.compartmentId = compartmentId;
        this.sourceResourceId = sourceResourceId;
        this.sourceResourceName = sourceResourceName;
        this.sourceResourceType = sourceResourceType;
        this.destinationResourceId = destinationResourceId;
        this.destinationResourceName = destinationResourceName;
        this.destinationResourceType = destinationResourceType;
        this.associationType = associationType;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
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
     * Source Monitored Resource Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    private final String sourceResourceId;

    public String getSourceResourceId() {
        return sourceResourceId;
    }

    /**
     * Source Monitored Resource Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceName")
    private final String sourceResourceName;

    public String getSourceResourceName() {
        return sourceResourceName;
    }

    /**
     * Source Monitored Resource Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceType")
    private final String sourceResourceType;

    public String getSourceResourceType() {
        return sourceResourceType;
    }

    /**
     * Destination Monitored Resource Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    private final String destinationResourceId;

    public String getDestinationResourceId() {
        return destinationResourceId;
    }

    /**
     * Source Monitored Resource Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceName")
    private final String destinationResourceName;

    public String getDestinationResourceName() {
        return destinationResourceName;
    }

    /**
     * Source Monitored Resource Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceType")
    private final String destinationResourceType;

    public String getDestinationResourceType() {
        return destinationResourceType;
    }

    /**
     * Association type to be created between source and destination resources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final String associationType;

    public String getAssociationType() {
        return associationType;
    }

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
    private final SortBy sortBy;

    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchMonitoredResourceAssociationsDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceResourceId=").append(String.valueOf(this.sourceResourceId));
        sb.append(", sourceResourceName=").append(String.valueOf(this.sourceResourceName));
        sb.append(", sourceResourceType=").append(String.valueOf(this.sourceResourceType));
        sb.append(", destinationResourceId=").append(String.valueOf(this.destinationResourceId));
        sb.append(", destinationResourceName=")
                .append(String.valueOf(this.destinationResourceName));
        sb.append(", destinationResourceType=")
                .append(String.valueOf(this.destinationResourceType));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchMonitoredResourceAssociationsDetails)) {
            return false;
        }

        SearchMonitoredResourceAssociationsDetails other =
                (SearchMonitoredResourceAssociationsDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceResourceId, other.sourceResourceId)
                && java.util.Objects.equals(this.sourceResourceName, other.sourceResourceName)
                && java.util.Objects.equals(this.sourceResourceType, other.sourceResourceType)
                && java.util.Objects.equals(this.destinationResourceId, other.destinationResourceId)
                && java.util.Objects.equals(
                        this.destinationResourceName, other.destinationResourceName)
                && java.util.Objects.equals(
                        this.destinationResourceType, other.destinationResourceType)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceId == null ? 43 : this.sourceResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceName == null
                                ? 43
                                : this.sourceResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceType == null
                                ? 43
                                : this.sourceResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceId == null
                                ? 43
                                : this.destinationResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceName == null
                                ? 43
                                : this.destinationResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceType == null
                                ? 43
                                : this.destinationResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
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
