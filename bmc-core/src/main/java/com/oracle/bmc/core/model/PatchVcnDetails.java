/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The request to patch the VCN.
 * Example:
 *       {
 *         "patchVcnInstructions": [
 *           {
 *             "operation": "REPLACE",
 *             "selection": "ipv6CidrBlock",
 *             "value": {"cidr": "2001::/56"}
 *           },
 *           {
 *             "operation": "REPLACE",
 *             "selection": "ipv6PublicCidrBlock",
 *             "value": {"cidr": "2001:0db8:0123::/48"}
 *           },
 *           {
 *             "operation": "REPLACE",
 *             "selection": "byoipv6CidrDetails",
 *             "value": {
 *               "cidrs": [
 *                 {
 *                   "byoipv6RangeId": "ocid1.byoiprange.oc1.<unique_ID_1>",
 *                   "ipv6CidrBlock": "2001:0db8:0123::/48"
 *                 },
 *                 {
 *                   "byoipv6RangeId": "ocid1.byoiprange.oc1.<unique_ID_2>",
 *                   "ipv6CidrBlock": "2001:0db8:0456::/48"
 *                 }
 *               ]
 *             }
 *           },
 *           {
 *             "operation": "REPLACE",
 *             "selection": "ipv6PrivateCidrBlocks",
 *             "value": { "cidrs": ["fd00:1000:0:1::/64", "fd00:1000:0:2::/64"] }
 *           }
 *         ]
 *       }
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchVcnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchVcnDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"patchVcnInstructions"})
    public PatchVcnDetails(java.util.List<PatchVcnInstruction> patchVcnInstructions) {
        super();
        this.patchVcnInstructions = patchVcnInstructions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of patch instructions for VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchVcnInstructions")
        private java.util.List<PatchVcnInstruction> patchVcnInstructions;

        /**
         * List of patch instructions for VCN.
         * @param patchVcnInstructions the value to set
         * @return this builder
         **/
        public Builder patchVcnInstructions(
                java.util.List<PatchVcnInstruction> patchVcnInstructions) {
            this.patchVcnInstructions = patchVcnInstructions;
            this.__explicitlySet__.add("patchVcnInstructions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchVcnDetails build() {
            PatchVcnDetails model = new PatchVcnDetails(this.patchVcnInstructions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchVcnDetails model) {
            if (model.wasPropertyExplicitlySet("patchVcnInstructions")) {
                this.patchVcnInstructions(model.getPatchVcnInstructions());
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
     * List of patch instructions for VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchVcnInstructions")
    private final java.util.List<PatchVcnInstruction> patchVcnInstructions;

    /**
     * List of patch instructions for VCN.
     * @return the value
     **/
    public java.util.List<PatchVcnInstruction> getPatchVcnInstructions() {
        return patchVcnInstructions;
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
        sb.append("PatchVcnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("patchVcnInstructions=").append(String.valueOf(this.patchVcnInstructions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchVcnDetails)) {
            return false;
        }

        PatchVcnDetails other = (PatchVcnDetails) o;
        return java.util.Objects.equals(this.patchVcnInstructions, other.patchVcnInstructions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.patchVcnInstructions == null
                                ? 43
                                : this.patchVcnInstructions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
