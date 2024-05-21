/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details about the available capacity and constraints for different resource types present in the availability catalog.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OccAvailabilitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OccAvailabilitySummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "unit"
    })
    public OccAvailabilitySummary(
            String catalogId,
            Namespace namespace,
            java.util.Date dateFinalCustomerOrder,
            java.util.Date dateExpectedCapacityHandover,
            ResourceType resourceType,
            WorkloadType workloadType,
            String resourceName,
            Long availableQuantity,
            String unit) {
        super();
        this.catalogId = catalogId;
        this.namespace = namespace;
        this.dateFinalCustomerOrder = dateFinalCustomerOrder;
        this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
        this.resourceType = resourceType;
        this.workloadType = workloadType;
        this.resourceName = resourceName;
        this.availableQuantity = availableQuantity;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the availability catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The OCID of the availability catalog.
         * @param catalogId the value to set
         * @return this builder
         **/
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         *
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The date by which the customer must place the order to have their capacity requirements met by the customer handover date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dateFinalCustomerOrder")
        private java.util.Date dateFinalCustomerOrder;

        /**
         * The date by which the customer must place the order to have their capacity requirements met by the customer handover date.
         * @param dateFinalCustomerOrder the value to set
         * @return this builder
         **/
        public Builder dateFinalCustomerOrder(java.util.Date dateFinalCustomerOrder) {
            this.dateFinalCustomerOrder = dateFinalCustomerOrder;
            this.__explicitlySet__.add("dateFinalCustomerOrder");
            return this;
        }
        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
        private java.util.Date dateExpectedCapacityHandover;

        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
         * @param dateExpectedCapacityHandover the value to set
         * @return this builder
         **/
        public Builder dateExpectedCapacityHandover(java.util.Date dateExpectedCapacityHandover) {
            this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            this.__explicitlySet__.add("dateExpectedCapacityHandover");
            return this;
        }
        /**
         * The different types of resources against which customers can place capacity requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * The different types of resources against which customers can place capacity requests.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The type of workload (Generic/ROW).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private WorkloadType workloadType;

        /**
         * The type of workload (Generic/ROW).
         * @param workloadType the value to set
         * @return this builder
         **/
        public Builder workloadType(WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /**
         * The name of the resource that the customer can request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource that the customer can request.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The quantity of available resource that the customer can request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableQuantity")
        private Long availableQuantity;

        /**
         * The quantity of available resource that the customer can request.
         * @param availableQuantity the value to set
         * @return this builder
         **/
        public Builder availableQuantity(Long availableQuantity) {
            this.availableQuantity = availableQuantity;
            this.__explicitlySet__.add("availableQuantity");
            return this;
        }
        /**
         * The unit in which the resource available is measured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit in which the resource available is measured.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
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
                            this.unit);
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
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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
     * The OCID of the availability catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The OCID of the availability catalog.
     * @return the value
     **/
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     *
     * @return the value
     **/
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * The date by which the customer must place the order to have their capacity requirements met by the customer handover date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateFinalCustomerOrder")
    private final java.util.Date dateFinalCustomerOrder;

    /**
     * The date by which the customer must place the order to have their capacity requirements met by the customer handover date.
     * @return the value
     **/
    public java.util.Date getDateFinalCustomerOrder() {
        return dateFinalCustomerOrder;
    }

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
    private final java.util.Date dateExpectedCapacityHandover;

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
     * @return the value
     **/
    public java.util.Date getDateExpectedCapacityHandover() {
        return dateExpectedCapacityHandover;
    }

    /**
     * The different types of resources against which customers can place capacity requests.
     **/
    public enum ResourceType {
        ServerHw("SERVER_HW"),
        CapacityConstraint("CAPACITY_CONSTRAINT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The different types of resources against which customers can place capacity requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * The different types of resources against which customers can place capacity requests.
     * @return the value
     **/
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * The type of workload (Generic/ROW).
     **/
    public enum WorkloadType {
        Generic("GENERIC"),
        Row("ROW"),
        UsProd("US_PROD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(WorkloadType.class);

        private final String value;
        private static java.util.Map<String, WorkloadType> map;

        static {
            map = new java.util.HashMap<>();
            for (WorkloadType v : WorkloadType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WorkloadType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WorkloadType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WorkloadType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of workload (Generic/ROW).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final WorkloadType workloadType;

    /**
     * The type of workload (Generic/ROW).
     * @return the value
     **/
    public WorkloadType getWorkloadType() {
        return workloadType;
    }

    /**
     * The name of the resource that the customer can request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource that the customer can request.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The quantity of available resource that the customer can request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableQuantity")
    private final Long availableQuantity;

    /**
     * The quantity of available resource that the customer can request.
     * @return the value
     **/
    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * The unit in which the resource available is measured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit in which the resource available is measured.
     * @return the value
     **/
    public String getUnit() {
        return unit;
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
        sb.append(", unit=").append(String.valueOf(this.unit));
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
                && java.util.Objects.equals(this.unit, other.unit)
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
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
