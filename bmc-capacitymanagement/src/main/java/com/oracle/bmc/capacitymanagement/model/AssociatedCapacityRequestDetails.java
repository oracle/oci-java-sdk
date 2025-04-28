/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about the associated capacity requests against which the resources were provisioned by
 * oracle. <br>
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
        builder = AssociatedCapacityRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedCapacityRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"occCapacityRequestId", "handoverQuantity"})
    public AssociatedCapacityRequestDetails(String occCapacityRequestId, Long handoverQuantity) {
        super();
        this.occCapacityRequestId = occCapacityRequestId;
        this.handoverQuantity = handoverQuantity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the capacity request against which the resources were provisioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("occCapacityRequestId")
        private String occCapacityRequestId;

        /**
         * The OCID of the capacity request against which the resources were provisioned.
         *
         * @param occCapacityRequestId the value to set
         * @return this builder
         */
        public Builder occCapacityRequestId(String occCapacityRequestId) {
            this.occCapacityRequestId = occCapacityRequestId;
            this.__explicitlySet__.add("occCapacityRequestId");
            return this;
        }
        /**
         * The total quantity of the bare metal hardware that was made available corresponding to
         * the capacity request ocid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("handoverQuantity")
        private Long handoverQuantity;

        /**
         * The total quantity of the bare metal hardware that was made available corresponding to
         * the capacity request ocid.
         *
         * @param handoverQuantity the value to set
         * @return this builder
         */
        public Builder handoverQuantity(Long handoverQuantity) {
            this.handoverQuantity = handoverQuantity;
            this.__explicitlySet__.add("handoverQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedCapacityRequestDetails build() {
            AssociatedCapacityRequestDetails model =
                    new AssociatedCapacityRequestDetails(
                            this.occCapacityRequestId, this.handoverQuantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedCapacityRequestDetails model) {
            if (model.wasPropertyExplicitlySet("occCapacityRequestId")) {
                this.occCapacityRequestId(model.getOccCapacityRequestId());
            }
            if (model.wasPropertyExplicitlySet("handoverQuantity")) {
                this.handoverQuantity(model.getHandoverQuantity());
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

    /** The OCID of the capacity request against which the resources were provisioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("occCapacityRequestId")
    private final String occCapacityRequestId;

    /**
     * The OCID of the capacity request against which the resources were provisioned.
     *
     * @return the value
     */
    public String getOccCapacityRequestId() {
        return occCapacityRequestId;
    }

    /**
     * The total quantity of the bare metal hardware that was made available corresponding to the
     * capacity request ocid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("handoverQuantity")
    private final Long handoverQuantity;

    /**
     * The total quantity of the bare metal hardware that was made available corresponding to the
     * capacity request ocid.
     *
     * @return the value
     */
    public Long getHandoverQuantity() {
        return handoverQuantity;
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
        sb.append("AssociatedCapacityRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("occCapacityRequestId=").append(String.valueOf(this.occCapacityRequestId));
        sb.append(", handoverQuantity=").append(String.valueOf(this.handoverQuantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedCapacityRequestDetails)) {
            return false;
        }

        AssociatedCapacityRequestDetails other = (AssociatedCapacityRequestDetails) o;
        return java.util.Objects.equals(this.occCapacityRequestId, other.occCapacityRequestId)
                && java.util.Objects.equals(this.handoverQuantity, other.handoverQuantity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.occCapacityRequestId == null
                                ? 43
                                : this.occCapacityRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.handoverQuantity == null ? 43 : this.handoverQuantity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
