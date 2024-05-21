/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Key replica details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyReplicaDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyReplicaDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicationId"})
    public KeyReplicaDetails(String replicationId) {
        super();
        this.replicationId = replicationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ReplicationId associated with a key operation
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationId")
        private String replicationId;

        /**
         * ReplicationId associated with a key operation
         *
         * @param replicationId the value to set
         * @return this builder
         **/
        public Builder replicationId(String replicationId) {
            this.replicationId = replicationId;
            this.__explicitlySet__.add("replicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyReplicaDetails build() {
            KeyReplicaDetails model = new KeyReplicaDetails(this.replicationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("replicationId")) {
                this.replicationId(model.getReplicationId());
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
     * ReplicationId associated with a key operation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationId")
    private final String replicationId;

    /**
     * ReplicationId associated with a key operation
     *
     * @return the value
     **/
    public String getReplicationId() {
        return replicationId;
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
        sb.append("KeyReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("replicationId=").append(String.valueOf(this.replicationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyReplicaDetails)) {
            return false;
        }

        KeyReplicaDetails other = (KeyReplicaDetails) o;
        return java.util.Objects.equals(this.replicationId, other.replicationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicationId == null ? 43 : this.replicationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
