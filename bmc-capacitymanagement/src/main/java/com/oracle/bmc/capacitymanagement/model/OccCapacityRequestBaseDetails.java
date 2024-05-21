/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details of the create capacity request. This model serves as a base for different namespaces.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "resourceType",
    defaultImpl = OccCapacityRequestBaseDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OccCapacityRequestComputeDetails.class,
        name = "SERVER_HW"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class OccCapacityRequestBaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "workloadType",
        "expectedHandoverQuantity",
        "dateExpectedHandover",
        "actualHandoverQuantity",
        "dateActualHandover"
    })
    protected OccCapacityRequestBaseDetails(
            OccAvailabilitySummary.WorkloadType workloadType,
            Long expectedHandoverQuantity,
            java.util.Date dateExpectedHandover,
            Long actualHandoverQuantity,
            java.util.Date dateActualHandover) {
        super();
        this.workloadType = workloadType;
        this.expectedHandoverQuantity = expectedHandoverQuantity;
        this.dateExpectedHandover = dateExpectedHandover;
        this.actualHandoverQuantity = actualHandoverQuantity;
        this.dateActualHandover = dateActualHandover;
    }

    /**
     * The type of the workload (Generic/ROW).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final OccAvailabilitySummary.WorkloadType workloadType;

    /**
     * The type of the workload (Generic/ROW).
     * @return the value
     **/
    public OccAvailabilitySummary.WorkloadType getWorkloadType() {
        return workloadType;
    }

    /**
     * The incremental quantity of resources supplied as the provisioning is underway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedHandoverQuantity")
    private final Long expectedHandoverQuantity;

    /**
     * The incremental quantity of resources supplied as the provisioning is underway.
     * @return the value
     **/
    public Long getExpectedHandoverQuantity() {
        return expectedHandoverQuantity;
    }

    /**
     * The date on which the latest increment to supplied quantity of resources was delivered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedHandover")
    private final java.util.Date dateExpectedHandover;

    /**
     * The date on which the latest increment to supplied quantity of resources was delivered.
     * @return the value
     **/
    public java.util.Date getDateExpectedHandover() {
        return dateExpectedHandover;
    }

    /**
     * The actual handed over quantity of resources at the time of request resolution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualHandoverQuantity")
    private final Long actualHandoverQuantity;

    /**
     * The actual handed over quantity of resources at the time of request resolution.
     * @return the value
     **/
    public Long getActualHandoverQuantity() {
        return actualHandoverQuantity;
    }

    /**
     * The date on which the actual handover quantity of resources is delivered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateActualHandover")
    private final java.util.Date dateActualHandover;

    /**
     * The date on which the actual handover quantity of resources is delivered.
     * @return the value
     **/
    public java.util.Date getDateActualHandover() {
        return dateActualHandover;
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
        sb.append("OccCapacityRequestBaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", expectedHandoverQuantity=")
                .append(String.valueOf(this.expectedHandoverQuantity));
        sb.append(", dateExpectedHandover=").append(String.valueOf(this.dateExpectedHandover));
        sb.append(", actualHandoverQuantity=").append(String.valueOf(this.actualHandoverQuantity));
        sb.append(", dateActualHandover=").append(String.valueOf(this.dateActualHandover));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccCapacityRequestBaseDetails)) {
            return false;
        }

        OccCapacityRequestBaseDetails other = (OccCapacityRequestBaseDetails) o;
        return java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(
                        this.expectedHandoverQuantity, other.expectedHandoverQuantity)
                && java.util.Objects.equals(this.dateExpectedHandover, other.dateExpectedHandover)
                && java.util.Objects.equals(
                        this.actualHandoverQuantity, other.actualHandoverQuantity)
                && java.util.Objects.equals(this.dateActualHandover, other.dateActualHandover)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedHandoverQuantity == null
                                ? 43
                                : this.expectedHandoverQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.dateExpectedHandover == null
                                ? 43
                                : this.dateExpectedHandover.hashCode());
        result =
                (result * PRIME)
                        + (this.actualHandoverQuantity == null
                                ? 43
                                : this.actualHandoverQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.dateActualHandover == null
                                ? 43
                                : this.dateActualHandover.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the resource against which the user wants to place a capacity request.
     **/
    public enum ResourceType {
        ServerHw("SERVER_HW"),

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
}
