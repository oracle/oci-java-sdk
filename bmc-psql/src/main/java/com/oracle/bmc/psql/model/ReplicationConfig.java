/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Replication configuration that is applicable on database systems with the PRIMARY_DB_SYSTEM role.
 *
 * <p>This configuration does not have any effect on database systems with other roles. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRpoEnforced", "rpoInSeconds"})
    public ReplicationConfig(Boolean isRpoEnforced, Long rpoInSeconds) {
        super();
        this.isRpoEnforced = isRpoEnforced;
        this.rpoInSeconds = rpoInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies if Recovery point objective (RPO) enforcement is enabled on the database
         * system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRpoEnforced")
        private Boolean isRpoEnforced;

        /**
         * Specifies if Recovery point objective (RPO) enforcement is enabled on the database
         * system.
         *
         * @param isRpoEnforced the value to set
         * @return this builder
         */
        public Builder isRpoEnforced(Boolean isRpoEnforced) {
            this.isRpoEnforced = isRpoEnforced;
            this.__explicitlySet__.add("isRpoEnforced");
            return this;
        }
        /**
         * Specifies the Recovery point objective (RPO) in seconds that will be enforced, if the
         * {@code isRpoEnforced} flag is true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rpoInSeconds")
        private Long rpoInSeconds;

        /**
         * Specifies the Recovery point objective (RPO) in seconds that will be enforced, if the
         * {@code isRpoEnforced} flag is true.
         *
         * @param rpoInSeconds the value to set
         * @return this builder
         */
        public Builder rpoInSeconds(Long rpoInSeconds) {
            this.rpoInSeconds = rpoInSeconds;
            this.__explicitlySet__.add("rpoInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationConfig build() {
            ReplicationConfig model = new ReplicationConfig(this.isRpoEnforced, this.rpoInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationConfig model) {
            if (model.wasPropertyExplicitlySet("isRpoEnforced")) {
                this.isRpoEnforced(model.getIsRpoEnforced());
            }
            if (model.wasPropertyExplicitlySet("rpoInSeconds")) {
                this.rpoInSeconds(model.getRpoInSeconds());
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
     * Specifies if Recovery point objective (RPO) enforcement is enabled on the database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRpoEnforced")
    private final Boolean isRpoEnforced;

    /**
     * Specifies if Recovery point objective (RPO) enforcement is enabled on the database system.
     *
     * @return the value
     */
    public Boolean getIsRpoEnforced() {
        return isRpoEnforced;
    }

    /**
     * Specifies the Recovery point objective (RPO) in seconds that will be enforced, if the {@code
     * isRpoEnforced} flag is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rpoInSeconds")
    private final Long rpoInSeconds;

    /**
     * Specifies the Recovery point objective (RPO) in seconds that will be enforced, if the {@code
     * isRpoEnforced} flag is true.
     *
     * @return the value
     */
    public Long getRpoInSeconds() {
        return rpoInSeconds;
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
        sb.append("isRpoEnforced=").append(String.valueOf(this.isRpoEnforced));
        sb.append(", rpoInSeconds=").append(String.valueOf(this.rpoInSeconds));
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
        return java.util.Objects.equals(this.isRpoEnforced, other.isRpoEnforced)
                && java.util.Objects.equals(this.rpoInSeconds, other.rpoInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRpoEnforced == null ? 43 : this.isRpoEnforced.hashCode());
        result = (result * PRIME) + (this.rpoInSeconds == null ? 43 : this.rpoInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
