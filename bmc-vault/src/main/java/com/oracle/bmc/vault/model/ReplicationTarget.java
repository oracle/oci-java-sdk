/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Details for the target that the source secret will be replicated to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicationTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicationTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetKeyId", "targetRegion", "targetVaultId"})
    public ReplicationTarget(String targetKeyId, String targetRegion, String targetVaultId) {
        super();
        this.targetKeyId = targetKeyId;
        this.targetRegion = targetRegion;
        this.targetVaultId = targetVaultId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target region KMS key. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetKeyId")
        private String targetKeyId;

        /**
         * The OCID of the target region KMS key.
         *
         * @param targetKeyId the value to set
         * @return this builder
         */
        public Builder targetKeyId(String targetKeyId) {
            this.targetKeyId = targetKeyId;
            this.__explicitlySet__.add("targetKeyId");
            return this;
        }
        /** The name of the target's region. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
        private String targetRegion;

        /**
         * The name of the target's region.
         *
         * @param targetRegion the value to set
         * @return this builder
         */
        public Builder targetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            this.__explicitlySet__.add("targetRegion");
            return this;
        }
        /** The OCID of the target region's Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetVaultId")
        private String targetVaultId;

        /**
         * The OCID of the target region's Vault.
         *
         * @param targetVaultId the value to set
         * @return this builder
         */
        public Builder targetVaultId(String targetVaultId) {
            this.targetVaultId = targetVaultId;
            this.__explicitlySet__.add("targetVaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationTarget build() {
            ReplicationTarget model =
                    new ReplicationTarget(this.targetKeyId, this.targetRegion, this.targetVaultId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationTarget model) {
            if (model.wasPropertyExplicitlySet("targetKeyId")) {
                this.targetKeyId(model.getTargetKeyId());
            }
            if (model.wasPropertyExplicitlySet("targetRegion")) {
                this.targetRegion(model.getTargetRegion());
            }
            if (model.wasPropertyExplicitlySet("targetVaultId")) {
                this.targetVaultId(model.getTargetVaultId());
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

    /** The OCID of the target region KMS key. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetKeyId")
    private final String targetKeyId;

    /**
     * The OCID of the target region KMS key.
     *
     * @return the value
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /** The name of the target's region. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
    private final String targetRegion;

    /**
     * The name of the target's region.
     *
     * @return the value
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    /** The OCID of the target region's Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVaultId")
    private final String targetVaultId;

    /**
     * The OCID of the target region's Vault.
     *
     * @return the value
     */
    public String getTargetVaultId() {
        return targetVaultId;
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
        sb.append("ReplicationTarget(");
        sb.append("super=").append(super.toString());
        sb.append("targetKeyId=").append(String.valueOf(this.targetKeyId));
        sb.append(", targetRegion=").append(String.valueOf(this.targetRegion));
        sb.append(", targetVaultId=").append(String.valueOf(this.targetVaultId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationTarget)) {
            return false;
        }

        ReplicationTarget other = (ReplicationTarget) o;
        return java.util.Objects.equals(this.targetKeyId, other.targetKeyId)
                && java.util.Objects.equals(this.targetRegion, other.targetRegion)
                && java.util.Objects.equals(this.targetVaultId, other.targetVaultId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetKeyId == null ? 43 : this.targetKeyId.hashCode());
        result = (result * PRIME) + (this.targetRegion == null ? 43 : this.targetRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVaultId == null ? 43 : this.targetVaultId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
