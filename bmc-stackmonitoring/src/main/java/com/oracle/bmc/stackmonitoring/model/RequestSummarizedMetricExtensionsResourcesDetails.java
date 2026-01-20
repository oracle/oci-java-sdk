/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Filtering criteria data to be specified in the request. Either metricExtensionId or compartmentId
 * must be passed even when no other filter property is passed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestSummarizedMetricExtensionsResourcesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestSummarizedMetricExtensionsResourcesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricExtensionId",
        "resourceType",
        "compartmentId",
        "associationStatus",
        "resourceId",
        "groupBy",
        "sortBy",
        "sortOrder"
    })
    public RequestSummarizedMetricExtensionsResourcesDetails(
            String metricExtensionId,
            String resourceType,
            String compartmentId,
            AssociationStatus associationStatus,
            String resourceId,
            GroupBy groupBy,
            SortBy sortBy,
            SortOrder sortOrder) {
        super();
        this.metricExtensionId = metricExtensionId;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.associationStatus = associationStatus;
        this.resourceId = resourceId;
        this.groupBy = groupBy;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Metric Extension resource
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricExtensionId")
        private String metricExtensionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Metric Extension resource
         *
         * @param metricExtensionId the value to set
         * @return this builder
         */
        public Builder metricExtensionId(String metricExtensionId) {
            this.metricExtensionId = metricExtensionId;
            this.__explicitlySet__.add("metricExtensionId");
            return this;
        }
        /** Resource type to which Metric Extension applies */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Resource type to which Metric Extension applies
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Filter to return metric extensions based on input enable status i.e. Enabled/Disabled */
        @com.fasterxml.jackson.annotation.JsonProperty("associationStatus")
        private AssociationStatus associationStatus;

        /**
         * Filter to return metric extensions based on input enable status i.e. Enabled/Disabled
         *
         * @param associationStatus the value to set
         * @return this builder
         */
        public Builder associationStatus(AssociationStatus associationStatus) {
            this.associationStatus = associationStatus;
            this.__explicitlySet__.add("associationStatus");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Monitored Resource
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Monitored Resource
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The field to group by */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private GroupBy groupBy;

        /**
         * The field to group by
         *
         * @param groupBy the value to set
         * @return this builder
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /** Result will ne sorted by this parameter value */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * Result will ne sorted by this parameter value
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /** Sort orders */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * Sort orders
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedMetricExtensionsResourcesDetails build() {
            RequestSummarizedMetricExtensionsResourcesDetails model =
                    new RequestSummarizedMetricExtensionsResourcesDetails(
                            this.metricExtensionId,
                            this.resourceType,
                            this.compartmentId,
                            this.associationStatus,
                            this.resourceId,
                            this.groupBy,
                            this.sortBy,
                            this.sortOrder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedMetricExtensionsResourcesDetails model) {
            if (model.wasPropertyExplicitlySet("metricExtensionId")) {
                this.metricExtensionId(model.getMetricExtensionId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("associationStatus")) {
                this.associationStatus(model.getAssociationStatus());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Metric
     * Extension resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricExtensionId")
    private final String metricExtensionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Metric
     * Extension resource
     *
     * @return the value
     */
    public String getMetricExtensionId() {
        return metricExtensionId;
    }

    /** Resource type to which Metric Extension applies */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Resource type to which Metric Extension applies
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Filter to return metric extensions based on input enable status i.e. Enabled/Disabled */
    public enum AssociationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, AssociationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociationStatus v : AssociationStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        AssociationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AssociationStatus: " + key);
        }
    };
    /** Filter to return metric extensions based on input enable status i.e. Enabled/Disabled */
    @com.fasterxml.jackson.annotation.JsonProperty("associationStatus")
    private final AssociationStatus associationStatus;

    /**
     * Filter to return metric extensions based on input enable status i.e. Enabled/Disabled
     *
     * @return the value
     */
    public AssociationStatus getAssociationStatus() {
        return associationStatus;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * Monitored Resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * Monitored Resource
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The field to group by */
    public enum GroupBy implements com.oracle.bmc.http.internal.BmcEnum {
        MetricExtensionId("METRIC_EXTENSION_ID"),
        ;

        private final String value;
        private static java.util.Map<String, GroupBy> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupBy v : GroupBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        GroupBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GroupBy: " + key);
        }
    };
    /** The field to group by */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final GroupBy groupBy;

    /**
     * The field to group by
     *
     * @return the value
     */
    public GroupBy getGroupBy() {
        return groupBy;
    }

    /** Result will ne sorted by this parameter value */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Count("COUNT"),
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
    /** Result will ne sorted by this parameter value */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * Result will ne sorted by this parameter value
     *
     * @return the value
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /** Sort orders */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /** Sort orders */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * Sort orders
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
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
        sb.append("RequestSummarizedMetricExtensionsResourcesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("metricExtensionId=").append(String.valueOf(this.metricExtensionId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", associationStatus=").append(String.valueOf(this.associationStatus));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", groupBy=").append(String.valueOf(this.groupBy));
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
        if (!(o instanceof RequestSummarizedMetricExtensionsResourcesDetails)) {
            return false;
        }

        RequestSummarizedMetricExtensionsResourcesDetails other =
                (RequestSummarizedMetricExtensionsResourcesDetails) o;
        return java.util.Objects.equals(this.metricExtensionId, other.metricExtensionId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associationStatus, other.associationStatus)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
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
                        + (this.metricExtensionId == null ? 43 : this.metricExtensionId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associationStatus == null ? 43 : this.associationStatus.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
