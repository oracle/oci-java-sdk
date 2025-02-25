/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public final class SearchMonitoredResourceAssociationsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Source Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
        private String sourceResourceId;

        /**
         * Source Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param sourceResourceId the value to set
         * @return this builder
         **/
        public Builder sourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            this.__explicitlySet__.add("sourceResourceId");
            return this;
        }
        /**
         * Source Monitored Resource Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceName")
        private String sourceResourceName;

        /**
         * Source Monitored Resource Name.
         *
         * @param sourceResourceName the value to set
         * @return this builder
         **/
        public Builder sourceResourceName(String sourceResourceName) {
            this.sourceResourceName = sourceResourceName;
            this.__explicitlySet__.add("sourceResourceName");
            return this;
        }
        /**
         * Source Monitored Resource Type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceType")
        private String sourceResourceType;

        /**
         * Source Monitored Resource Type.
         *
         * @param sourceResourceType the value to set
         * @return this builder
         **/
        public Builder sourceResourceType(String sourceResourceType) {
            this.sourceResourceType = sourceResourceType;
            this.__explicitlySet__.add("sourceResourceType");
            return this;
        }
        /**
         * Destination Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
        private String destinationResourceId;

        /**
         * Destination Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param destinationResourceId the value to set
         * @return this builder
         **/
        public Builder destinationResourceId(String destinationResourceId) {
            this.destinationResourceId = destinationResourceId;
            this.__explicitlySet__.add("destinationResourceId");
            return this;
        }
        /**
         * Source Monitored Resource Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceName")
        private String destinationResourceName;

        /**
         * Source Monitored Resource Name.
         *
         * @param destinationResourceName the value to set
         * @return this builder
         **/
        public Builder destinationResourceName(String destinationResourceName) {
            this.destinationResourceName = destinationResourceName;
            this.__explicitlySet__.add("destinationResourceName");
            return this;
        }
        /**
         * Source Monitored Resource Type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceType")
        private String destinationResourceType;

        /**
         * Source Monitored Resource Type.
         *
         * @param destinationResourceType the value to set
         * @return this builder
         **/
        public Builder destinationResourceType(String destinationResourceType) {
            this.destinationResourceType = destinationResourceType;
            this.__explicitlySet__.add("destinationResourceType");
            return this;
        }
        /**
         * Association type filter to search associated resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private String associationType;

        /**
         * Association type filter to search associated resources.
         *
         * @param associationType the value to set
         * @return this builder
         **/
        public Builder associationType(String associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }
        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending. Default order for assocType is descending.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending. Default order for assocType is descending.
         *
         * @param sortBy the value to set
         * @return this builder
         **/
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchMonitoredResourceAssociationsDetails build() {
            SearchMonitoredResourceAssociationsDetails model =
                    new SearchMonitoredResourceAssociationsDetails(
                            this.compartmentId,
                            this.sourceResourceId,
                            this.sourceResourceName,
                            this.sourceResourceType,
                            this.destinationResourceId,
                            this.destinationResourceName,
                            this.destinationResourceType,
                            this.associationType,
                            this.sortBy,
                            this.sortOrder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchMonitoredResourceAssociationsDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceId")) {
                this.sourceResourceId(model.getSourceResourceId());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceName")) {
                this.sourceResourceName(model.getSourceResourceName());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceType")) {
                this.sourceResourceType(model.getSourceResourceType());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceId")) {
                this.destinationResourceId(model.getDestinationResourceId());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceName")) {
                this.destinationResourceName(model.getDestinationResourceName());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceType")) {
                this.destinationResourceType(model.getDestinationResourceType());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
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
     * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Source Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    private final String sourceResourceId;

    /**
     * Source Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    /**
     * Source Monitored Resource Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceName")
    private final String sourceResourceName;

    /**
     * Source Monitored Resource Name.
     *
     * @return the value
     **/
    public String getSourceResourceName() {
        return sourceResourceName;
    }

    /**
     * Source Monitored Resource Type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceType")
    private final String sourceResourceType;

    /**
     * Source Monitored Resource Type.
     *
     * @return the value
     **/
    public String getSourceResourceType() {
        return sourceResourceType;
    }

    /**
     * Destination Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    private final String destinationResourceId;

    /**
     * Destination Monitored Resource Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getDestinationResourceId() {
        return destinationResourceId;
    }

    /**
     * Source Monitored Resource Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceName")
    private final String destinationResourceName;

    /**
     * Source Monitored Resource Name.
     *
     * @return the value
     **/
    public String getDestinationResourceName() {
        return destinationResourceName;
    }

    /**
     * Source Monitored Resource Type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceType")
    private final String destinationResourceType;

    /**
     * Source Monitored Resource Type.
     *
     * @return the value
     **/
    public String getDestinationResourceType() {
        return destinationResourceType;
    }

    /**
     * Association type filter to search associated resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final String associationType;

    /**
     * Association type filter to search associated resources.
     *
     * @return the value
     **/
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

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for assocType is descending.
     *
     * @return the value
     **/
    public SortBy getSortBy() {
        return sortBy;
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
        sb.append("SearchMonitoredResourceAssociationsDetails(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
