/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Replicate Oracle GCP Keyring resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicateOracleDbGcpKeyRingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicateOracleDbGcpKeyRingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetRegion", "action"})
    public ReplicateOracleDbGcpKeyRingDetails(String targetRegion, ReplicationActions action) {
        super();
        this.targetRegion = targetRegion;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Destination region where Oracle GCP Keyring resource will replicate. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
        private String targetRegion;

        /**
         * The Destination region where Oracle GCP Keyring resource will replicate.
         *
         * @param targetRegion the value to set
         * @return this builder
         */
        public Builder targetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            this.__explicitlySet__.add("targetRegion");
            return this;
        }
        /** Action for replicate Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private ReplicationActions action;

        /**
         * Action for replicate Resource.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(ReplicationActions action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicateOracleDbGcpKeyRingDetails build() {
            ReplicateOracleDbGcpKeyRingDetails model =
                    new ReplicateOracleDbGcpKeyRingDetails(this.targetRegion, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicateOracleDbGcpKeyRingDetails model) {
            if (model.wasPropertyExplicitlySet("targetRegion")) {
                this.targetRegion(model.getTargetRegion());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    /** The Destination region where Oracle GCP Keyring resource will replicate. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRegion")
    private final String targetRegion;

    /**
     * The Destination region where Oracle GCP Keyring resource will replicate.
     *
     * @return the value
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    /** Action for replicate Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final ReplicationActions action;

    /**
     * Action for replicate Resource.
     *
     * @return the value
     */
    public ReplicationActions getAction() {
        return action;
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
        sb.append("ReplicateOracleDbGcpKeyRingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetRegion=").append(String.valueOf(this.targetRegion));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicateOracleDbGcpKeyRingDetails)) {
            return false;
        }

        ReplicateOracleDbGcpKeyRingDetails other = (ReplicateOracleDbGcpKeyRingDetails) o;
        return java.util.Objects.equals(this.targetRegion, other.targetRegion)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetRegion == null ? 43 : this.targetRegion.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
