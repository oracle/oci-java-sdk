/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details about the compute servers required for creating a capacity request. <br>
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
        builder = OccCapacityRequestComputeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccCapacityRequestComputeDetails extends OccCapacityRequestBaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private OccAvailabilitySummary.WorkloadType workloadType;

        public Builder workloadType(OccAvailabilitySummary.WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedHandoverQuantity")
        private Long expectedHandoverQuantity;

        public Builder expectedHandoverQuantity(Long expectedHandoverQuantity) {
            this.expectedHandoverQuantity = expectedHandoverQuantity;
            this.__explicitlySet__.add("expectedHandoverQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedHandover")
        private java.util.Date dateExpectedHandover;

        public Builder dateExpectedHandover(java.util.Date dateExpectedHandover) {
            this.dateExpectedHandover = dateExpectedHandover;
            this.__explicitlySet__.add("dateExpectedHandover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actualHandoverQuantity")
        private Long actualHandoverQuantity;

        public Builder actualHandoverQuantity(Long actualHandoverQuantity) {
            this.actualHandoverQuantity = actualHandoverQuantity;
            this.__explicitlySet__.add("actualHandoverQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dateActualHandover")
        private java.util.Date dateActualHandover;

        public Builder dateActualHandover(java.util.Date dateActualHandover) {
            this.dateActualHandover = dateActualHandover;
            this.__explicitlySet__.add("dateActualHandover");
            return this;
        }
        /**
         * The name of the COMPUTE server shape for which the request is made. Do not use
         * CAPACITY_CONSTRAINT as the resource name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the COMPUTE server shape for which the request is made. Do not use
         * CAPACITY_CONSTRAINT as the resource name.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The number of compute server's with name <resourceName> required by the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
        private Long demandQuantity;

        /**
         * The number of compute server's with name <resourceName> required by the user.
         *
         * @param demandQuantity the value to set
         * @return this builder
         */
        public Builder demandQuantity(Long demandQuantity) {
            this.demandQuantity = demandQuantity;
            this.__explicitlySet__.add("demandQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccCapacityRequestComputeDetails build() {
            OccCapacityRequestComputeDetails model =
                    new OccCapacityRequestComputeDetails(
                            this.workloadType,
                            this.expectedHandoverQuantity,
                            this.dateExpectedHandover,
                            this.actualHandoverQuantity,
                            this.dateActualHandover,
                            this.resourceName,
                            this.demandQuantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccCapacityRequestComputeDetails model) {
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("expectedHandoverQuantity")) {
                this.expectedHandoverQuantity(model.getExpectedHandoverQuantity());
            }
            if (model.wasPropertyExplicitlySet("dateExpectedHandover")) {
                this.dateExpectedHandover(model.getDateExpectedHandover());
            }
            if (model.wasPropertyExplicitlySet("actualHandoverQuantity")) {
                this.actualHandoverQuantity(model.getActualHandoverQuantity());
            }
            if (model.wasPropertyExplicitlySet("dateActualHandover")) {
                this.dateActualHandover(model.getDateActualHandover());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("demandQuantity")) {
                this.demandQuantity(model.getDemandQuantity());
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

    @Deprecated
    public OccCapacityRequestComputeDetails(
            OccAvailabilitySummary.WorkloadType workloadType,
            Long expectedHandoverQuantity,
            java.util.Date dateExpectedHandover,
            Long actualHandoverQuantity,
            java.util.Date dateActualHandover,
            String resourceName,
            Long demandQuantity) {
        super(
                workloadType,
                expectedHandoverQuantity,
                dateExpectedHandover,
                actualHandoverQuantity,
                dateActualHandover);
        this.resourceName = resourceName;
        this.demandQuantity = demandQuantity;
    }

    /**
     * The name of the COMPUTE server shape for which the request is made. Do not use
     * CAPACITY_CONSTRAINT as the resource name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the COMPUTE server shape for which the request is made. Do not use
     * CAPACITY_CONSTRAINT as the resource name.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The number of compute server's with name <resourceName> required by the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
    private final Long demandQuantity;

    /**
     * The number of compute server's with name <resourceName> required by the user.
     *
     * @return the value
     */
    public Long getDemandQuantity() {
        return demandQuantity;
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
        sb.append("OccCapacityRequestComputeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", demandQuantity=").append(String.valueOf(this.demandQuantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccCapacityRequestComputeDetails)) {
            return false;
        }

        OccCapacityRequestComputeDetails other = (OccCapacityRequestComputeDetails) o;
        return java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.demandQuantity, other.demandQuantity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.demandQuantity == null ? 43 : this.demandQuantity.hashCode());
        return result;
    }
}
