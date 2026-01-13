/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update source-to-destination mapping for a vault. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOkeClusterVaultMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOkeClusterVaultMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceVaultId", "destinationVaultId"})
    public UpdateOkeClusterVaultMappingDetails(String sourceVaultId, String destinationVaultId) {
        super();
        this.sourceVaultId = sourceVaultId;
        this.destinationVaultId = destinationVaultId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the source Vault.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVaultId")
        private String sourceVaultId;

        /**
         * The OCID of the source Vault.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
         *
         * @param sourceVaultId the value to set
         * @return this builder
         */
        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = sourceVaultId;
            this.__explicitlySet__.add("sourceVaultId");
            return this;
        }
        /**
         * The OCID of the destination Vault.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationVaultId")
        private String destinationVaultId;

        /**
         * The OCID of the destination Vault.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
         *
         * @param destinationVaultId the value to set
         * @return this builder
         */
        public Builder destinationVaultId(String destinationVaultId) {
            this.destinationVaultId = destinationVaultId;
            this.__explicitlySet__.add("destinationVaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOkeClusterVaultMappingDetails build() {
            UpdateOkeClusterVaultMappingDetails model =
                    new UpdateOkeClusterVaultMappingDetails(
                            this.sourceVaultId, this.destinationVaultId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOkeClusterVaultMappingDetails model) {
            if (model.wasPropertyExplicitlySet("sourceVaultId")) {
                this.sourceVaultId(model.getSourceVaultId());
            }
            if (model.wasPropertyExplicitlySet("destinationVaultId")) {
                this.destinationVaultId(model.getDestinationVaultId());
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
     * The OCID of the source Vault.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVaultId")
    private final String sourceVaultId;

    /**
     * The OCID of the source Vault.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     *
     * @return the value
     */
    public String getSourceVaultId() {
        return sourceVaultId;
    }

    /**
     * The OCID of the destination Vault.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationVaultId")
    private final String destinationVaultId;

    /**
     * The OCID of the destination Vault.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
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
        sb.append("UpdateOkeClusterVaultMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceVaultId=").append(String.valueOf(this.sourceVaultId));
        sb.append(", destinationVaultId=").append(String.valueOf(this.destinationVaultId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOkeClusterVaultMappingDetails)) {
            return false;
        }

        UpdateOkeClusterVaultMappingDetails other = (UpdateOkeClusterVaultMappingDetails) o;
        return java.util.Objects.equals(this.sourceVaultId, other.sourceVaultId)
                && java.util.Objects.equals(this.destinationVaultId, other.destinationVaultId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceVaultId == null ? 43 : this.sourceVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationVaultId == null
                                ? 43
                                : this.destinationVaultId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
