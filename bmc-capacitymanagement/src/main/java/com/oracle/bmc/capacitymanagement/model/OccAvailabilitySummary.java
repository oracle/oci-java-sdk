/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details about the available capacity and constraints for different resource types present in
 * the availability catalog. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccAvailabilitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccAvailabilitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "catalogId",
        "namespace",
        "dateFinalCustomerOrder",
        "dateExpectedCapacityHandover",
        "resourceType",
        "workloadType",
        "resourceName",
        "availableQuantity",
        "totalAvailableQuantity",
        "demandedQuantity",
        "unit",
        "systemTags"
    })
    public OccAvailabilitySummary(
            String catalogId,
            Namespace namespace,
            java.util.Date dateFinalCustomerOrder,
            java.util.Date dateExpectedCapacityHandover,
            String resourceType,
            String workloadType,
            String resourceName,
            Long availableQuantity,
            Long totalAvailableQuantity,
            Long demandedQuantity,
            String unit,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.catalogId = catalogId;
        this.namespace = namespace;
        this.dateFinalCustomerOrder = dateFinalCustomerOrder;
        this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
        this.resourceType = resourceType;
        this.workloadType = workloadType;
        this.resourceName = resourceName;
        this.availableQuantity = availableQuantity;
        this.totalAvailableQuantity = totalAvailableQuantity;
        this.demandedQuantity = demandedQuantity;
        this.unit = unit;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the availability catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The OCID of the availability catalog.
         *
         * @param catalogId the value to set
         * @return this builder
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The date by which the customer must place the order to have their capacity requirements
         * met by the customer handover date.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateFinalCustomerOrder")
        private java.util.Date dateFinalCustomerOrder;

        /**
         * The date by which the customer must place the order to have their capacity requirements
         * met by the customer handover date.
         *
         * @param dateFinalCustomerOrder the value to set
         * @return this builder
         */
        public Builder dateFinalCustomerOrder(java.util.Date dateFinalCustomerOrder) {
            this.dateFinalCustomerOrder = dateFinalCustomerOrder;
            this.__explicitlySet__.add("dateFinalCustomerOrder");
            return this;
        }
        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs
         * to be fulfilled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
        private java.util.Date dateExpectedCapacityHandover;

        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs
         * to be fulfilled.
         *
         * @param dateExpectedCapacityHandover the value to set
         * @return this builder
         */
        public Builder dateExpectedCapacityHandover(java.util.Date dateExpectedCapacityHandover) {
            this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            this.__explicitlySet__.add("dateExpectedCapacityHandover");
            return this;
        }
        /** The different types of resources against which customers can place capacity requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The different types of resources against which customers can place capacity requests.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The type of workload (Generic/ROW). */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private String workloadType;

        /**
         * The type of workload (Generic/ROW).
         *
         * @param workloadType the value to set
         * @return this builder
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /** The name of the resource that the customer can request. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource that the customer can request.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The quantity of resource currently available that the customer can request. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableQuantity")
        private Long availableQuantity;

        /**
         * The quantity of resource currently available that the customer can request.
         *
         * @param availableQuantity the value to set
         * @return this builder
         */
        public Builder availableQuantity(Long availableQuantity) {
            this.availableQuantity = availableQuantity;
            this.__explicitlySet__.add("availableQuantity");
            return this;
        }
        /** The total quantity of resource that the customer can request. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalAvailableQuantity")
        private Long totalAvailableQuantity;

        /**
         * The total quantity of resource that the customer can request.
         *
         * @param totalAvailableQuantity the value to set
         * @return this builder
         */
        public Builder totalAvailableQuantity(Long totalAvailableQuantity) {
            this.totalAvailableQuantity = totalAvailableQuantity;
            this.__explicitlySet__.add("totalAvailableQuantity");
            return this;
        }
        /** The quantity of resource currently demanded by the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandedQuantity")
        private Long demandedQuantity;

        /**
         * The quantity of resource currently demanded by the customer.
         *
         * @param demandedQuantity the value to set
         * @return this builder
         */
        public Builder demandedQuantity(Long demandedQuantity) {
            this.demandedQuantity = demandedQuantity;
            this.__explicitlySet__.add("demandedQuantity");
            return this;
        }
        /** The unit in which the resource available is measured. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit in which the resource available is measured.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccAvailabilitySummary build() {
            OccAvailabilitySummary model =
                    new OccAvailabilitySummary(
                            this.catalogId,
                            this.namespace,
                            this.dateFinalCustomerOrder,
                            this.dateExpectedCapacityHandover,
                            this.resourceType,
                            this.workloadType,
                            this.resourceName,
                            this.availableQuantity,
                            this.totalAvailableQuantity,
                            this.demandedQuantity,
                            this.unit,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccAvailabilitySummary model) {
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("dateFinalCustomerOrder")) {
                this.dateFinalCustomerOrder(model.getDateFinalCustomerOrder());
            }
            if (model.wasPropertyExplicitlySet("dateExpectedCapacityHandover")) {
                this.dateExpectedCapacityHandover(model.getDateExpectedCapacityHandover());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("availableQuantity")) {
                this.availableQuantity(model.getAvailableQuantity());
            }
            if (model.wasPropertyExplicitlySet("totalAvailableQuantity")) {
                this.totalAvailableQuantity(model.getTotalAvailableQuantity());
            }
            if (model.wasPropertyExplicitlySet("demandedQuantity")) {
                this.demandedQuantity(model.getDemandedQuantity());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the availability catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The OCID of the availability catalog.
     *
     * @return the value
     */
    public String getCatalogId() {
        return catalogId;
    }

    /** The name of the OCI service in consideration. For example, Compute, Exadata, and so on. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     *
     * @return the value
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * The date by which the customer must place the order to have their capacity requirements met
     * by the customer handover date.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateFinalCustomerOrder")
    private final java.util.Date dateFinalCustomerOrder;

    /**
     * The date by which the customer must place the order to have their capacity requirements met
     * by the customer handover date.
     *
     * @return the value
     */
    public java.util.Date getDateFinalCustomerOrder() {
        return dateFinalCustomerOrder;
    }

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to
     * be fulfilled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
    private final java.util.Date dateExpectedCapacityHandover;

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to
     * be fulfilled.
     *
     * @return the value
     */
    public java.util.Date getDateExpectedCapacityHandover() {
        return dateExpectedCapacityHandover;
    }

    /** The different types of resources against which customers can place capacity requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The different types of resources against which customers can place capacity requests.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** The type of workload (Generic/ROW). */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final String workloadType;

    /**
     * The type of workload (Generic/ROW).
     *
     * @return the value
     */
    public String getWorkloadType() {
        return workloadType;
    }

    /** The name of the resource that the customer can request. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource that the customer can request.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The quantity of resource currently available that the customer can request. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableQuantity")
    private final Long availableQuantity;

    /**
     * The quantity of resource currently available that the customer can request.
     *
     * @return the value
     */
    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    /** The total quantity of resource that the customer can request. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalAvailableQuantity")
    private final Long totalAvailableQuantity;

    /**
     * The total quantity of resource that the customer can request.
     *
     * @return the value
     */
    public Long getTotalAvailableQuantity() {
        return totalAvailableQuantity;
    }

    /** The quantity of resource currently demanded by the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandedQuantity")
    private final Long demandedQuantity;

    /**
     * The quantity of resource currently demanded by the customer.
     *
     * @return the value
     */
    public Long getDemandedQuantity() {
        return demandedQuantity;
    }

    /** The unit in which the resource available is measured. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit in which the resource available is measured.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OccAvailabilitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", dateFinalCustomerOrder=").append(String.valueOf(this.dateFinalCustomerOrder));
        sb.append(", dateExpectedCapacityHandover=")
                .append(String.valueOf(this.dateExpectedCapacityHandover));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", availableQuantity=").append(String.valueOf(this.availableQuantity));
        sb.append(", totalAvailableQuantity=").append(String.valueOf(this.totalAvailableQuantity));
        sb.append(", demandedQuantity=").append(String.valueOf(this.demandedQuantity));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccAvailabilitySummary)) {
            return false;
        }

        OccAvailabilitySummary other = (OccAvailabilitySummary) o;
        return java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(
                        this.dateFinalCustomerOrder, other.dateFinalCustomerOrder)
                && java.util.Objects.equals(
                        this.dateExpectedCapacityHandover, other.dateExpectedCapacityHandover)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.availableQuantity, other.availableQuantity)
                && java.util.Objects.equals(
                        this.totalAvailableQuantity, other.totalAvailableQuantity)
                && java.util.Objects.equals(this.demandedQuantity, other.demandedQuantity)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.dateFinalCustomerOrder == null
                                ? 43
                                : this.dateFinalCustomerOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.dateExpectedCapacityHandover == null
                                ? 43
                                : this.dateExpectedCapacityHandover.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.availableQuantity == null ? 43 : this.availableQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAvailableQuantity == null
                                ? 43
                                : this.totalAvailableQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.demandedQuantity == null ? 43 : this.demandedQuantity.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
