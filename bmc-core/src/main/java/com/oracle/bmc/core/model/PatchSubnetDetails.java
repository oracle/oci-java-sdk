/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The request to patch the subnet. Example: { "patchSubnetInstructions": [ { "operation":
 * "REPLACE", "selection": "ipv6CidrBlock", "value": {"cidr": "2001::/56"} }, { "operation":
 * "REPLACE", "selection": "ipv6CidrBlocks", "value": { "cidrs": [ "2001:db8:1234:1111::/64",
 * "2001:db8:1234:2121::/64" ] } } ] } <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchSubnetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchSubnetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"patchSubnetInstructions"})
    public PatchSubnetDetails(java.util.List<PatchSubnetInstruction> patchSubnetInstructions) {
        super();
        this.patchSubnetInstructions = patchSubnetInstructions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of patch instructions for Subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchSubnetInstructions")
        private java.util.List<PatchSubnetInstruction> patchSubnetInstructions;

        /**
         * List of patch instructions for Subnet.
         *
         * @param patchSubnetInstructions the value to set
         * @return this builder
         */
        public Builder patchSubnetInstructions(
                java.util.List<PatchSubnetInstruction> patchSubnetInstructions) {
            this.patchSubnetInstructions = patchSubnetInstructions;
            this.__explicitlySet__.add("patchSubnetInstructions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchSubnetDetails build() {
            PatchSubnetDetails model = new PatchSubnetDetails(this.patchSubnetInstructions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchSubnetDetails model) {
            if (model.wasPropertyExplicitlySet("patchSubnetInstructions")) {
                this.patchSubnetInstructions(model.getPatchSubnetInstructions());
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

    /** List of patch instructions for Subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchSubnetInstructions")
    private final java.util.List<PatchSubnetInstruction> patchSubnetInstructions;

    /**
     * List of patch instructions for Subnet.
     *
     * @return the value
     */
    public java.util.List<PatchSubnetInstruction> getPatchSubnetInstructions() {
        return patchSubnetInstructions;
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
        sb.append("PatchSubnetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("patchSubnetInstructions=").append(String.valueOf(this.patchSubnetInstructions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchSubnetDetails)) {
            return false;
        }

        PatchSubnetDetails other = (PatchSubnetDetails) o;
        return java.util.Objects.equals(this.patchSubnetInstructions, other.patchSubnetInstructions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.patchSubnetInstructions == null
                                ? 43
                                : this.patchSubnetInstructions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
