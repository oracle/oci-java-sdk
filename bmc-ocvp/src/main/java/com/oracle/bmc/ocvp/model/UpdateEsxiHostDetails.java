/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The ESXi host information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateEsxiHostDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateEsxiHostDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "nextCommitment",
        "billingDonorHostId",
        "freeformTags",
        "definedTags"
    })
    public UpdateEsxiHostDetails(
            String displayName,
            Commitment nextCommitment,
            String billingDonorHostId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.nextCommitment = nextCommitment;
        this.billingDonorHostId = billingDonorHostId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A descriptive name for the ESXi host. It's changeable.
         * Esxi Host name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the ESXi host. It's changeable.
         * Esxi Host name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
         * <p>
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The billing option to switch to after the existing billing cycle ends.
         * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
        private Commitment nextCommitment;

        /**
         * The billing option to switch to after the existing billing cycle ends.
         * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param nextCommitment the value to set
         * @return this builder
         **/
        public Builder nextCommitment(Commitment nextCommitment) {
            this.nextCommitment = nextCommitment;
            this.__explicitlySet__.add("nextCommitment");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
        private String billingDonorHostId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
         *
         * @param billingDonorHostId the value to set
         * @return this builder
         **/
        public Builder billingDonorHostId(String billingDonorHostId) {
            this.billingDonorHostId = billingDonorHostId;
            this.__explicitlySet__.add("billingDonorHostId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateEsxiHostDetails build() {
            UpdateEsxiHostDetails model =
                    new UpdateEsxiHostDetails(
                            this.displayName,
                            this.nextCommitment,
                            this.billingDonorHostId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateEsxiHostDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nextCommitment")) {
                this.nextCommitment(model.getNextCommitment());
            }
            if (model.wasPropertyExplicitlySet("billingDonorHostId")) {
                this.billingDonorHostId(model.getBillingDonorHostId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A descriptive name for the ESXi host. It's changeable.
     * Esxi Host name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the ESXi host. It's changeable.
     * Esxi Host name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the Cluster.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The billing option to switch to after the existing billing cycle ends.
     * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextCommitment")
    private final Commitment nextCommitment;

    /**
     * The billing option to switch to after the existing billing cycle ends.
     * If {@code nextCommitment} is null or empty, {@code currentCommitment} continues to the next billing cycle.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     **/
    public Commitment getNextCommitment() {
        return nextCommitment;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingDonorHostId")
    private final String billingDonorHostId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the deleted ESXi Host with LeftOver billing cycle.
     *
     * @return the value
     **/
    public String getBillingDonorHostId() {
        return billingDonorHostId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateEsxiHostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", nextCommitment=").append(String.valueOf(this.nextCommitment));
        sb.append(", billingDonorHostId=").append(String.valueOf(this.billingDonorHostId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateEsxiHostDetails)) {
            return false;
        }

        UpdateEsxiHostDetails other = (UpdateEsxiHostDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nextCommitment, other.nextCommitment)
                && java.util.Objects.equals(this.billingDonorHostId, other.billingDonorHostId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.nextCommitment == null ? 43 : this.nextCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.billingDonorHostId == null
                                ? 43
                                : this.billingDonorHostId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
