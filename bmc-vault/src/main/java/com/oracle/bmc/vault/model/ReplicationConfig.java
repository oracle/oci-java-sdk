/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Defines the configuration that enables cross-region secret replication. <br>
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
        builder = ReplicationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicationTargets", "isWriteForwardEnabled"})
    public ReplicationConfig(
            java.util.List<ReplicationTarget> replicationTargets, Boolean isWriteForwardEnabled) {
        super();
        this.replicationTargets = replicationTargets;
        this.isWriteForwardEnabled = isWriteForwardEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of the secret replication targets. By default, a maximum of 3 targets is allowed. To
         * configure more than 3 targets, an override is required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationTargets")
        private java.util.List<ReplicationTarget> replicationTargets;

        /**
         * List of the secret replication targets. By default, a maximum of 3 targets is allowed. To
         * configure more than 3 targets, an override is required.
         *
         * @param replicationTargets the value to set
         * @return this builder
         */
        public Builder replicationTargets(java.util.List<ReplicationTarget> replicationTargets) {
            this.replicationTargets = replicationTargets;
            this.__explicitlySet__.add("replicationTargets");
            return this;
        }
        /**
         * (Optional) A Boolean value to enable forwarding of write requests from replicated secrets
         * to the source secrets. The default value of false disables this option.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isWriteForwardEnabled")
        private Boolean isWriteForwardEnabled;

        /**
         * (Optional) A Boolean value to enable forwarding of write requests from replicated secrets
         * to the source secrets. The default value of false disables this option.
         *
         * @param isWriteForwardEnabled the value to set
         * @return this builder
         */
        public Builder isWriteForwardEnabled(Boolean isWriteForwardEnabled) {
            this.isWriteForwardEnabled = isWriteForwardEnabled;
            this.__explicitlySet__.add("isWriteForwardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationConfig build() {
            ReplicationConfig model =
                    new ReplicationConfig(this.replicationTargets, this.isWriteForwardEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationConfig model) {
            if (model.wasPropertyExplicitlySet("replicationTargets")) {
                this.replicationTargets(model.getReplicationTargets());
            }
            if (model.wasPropertyExplicitlySet("isWriteForwardEnabled")) {
                this.isWriteForwardEnabled(model.getIsWriteForwardEnabled());
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
     * List of the secret replication targets. By default, a maximum of 3 targets is allowed. To
     * configure more than 3 targets, an override is required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationTargets")
    private final java.util.List<ReplicationTarget> replicationTargets;

    /**
     * List of the secret replication targets. By default, a maximum of 3 targets is allowed. To
     * configure more than 3 targets, an override is required.
     *
     * @return the value
     */
    public java.util.List<ReplicationTarget> getReplicationTargets() {
        return replicationTargets;
    }

    /**
     * (Optional) A Boolean value to enable forwarding of write requests from replicated secrets to
     * the source secrets. The default value of false disables this option.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isWriteForwardEnabled")
    private final Boolean isWriteForwardEnabled;

    /**
     * (Optional) A Boolean value to enable forwarding of write requests from replicated secrets to
     * the source secrets. The default value of false disables this option.
     *
     * @return the value
     */
    public Boolean getIsWriteForwardEnabled() {
        return isWriteForwardEnabled;
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
        sb.append("ReplicationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("replicationTargets=").append(String.valueOf(this.replicationTargets));
        sb.append(", isWriteForwardEnabled=").append(String.valueOf(this.isWriteForwardEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationConfig)) {
            return false;
        }

        ReplicationConfig other = (ReplicationConfig) o;
        return java.util.Objects.equals(this.replicationTargets, other.replicationTargets)
                && java.util.Objects.equals(this.isWriteForwardEnabled, other.isWriteForwardEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicationTargets == null
                                ? 43
                                : this.replicationTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.isWriteForwardEnabled == null
                                ? 43
                                : this.isWriteForwardEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
