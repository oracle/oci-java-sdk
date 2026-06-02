/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The response on initiating management audit logging.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditLogging.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditLogging extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workRequestId", "hsmClusterId"})
    public AuditLogging(String workRequestId, String hsmClusterId) {
        super();
        this.workRequestId = workRequestId;
        this.hsmClusterId = hsmClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The workRequestId to track the request later.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The workRequestId to track the request later.
         * @param workRequestId the value to set
         * @return this builder
         **/
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * The Hsm Cluster Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hsmClusterId")
        private String hsmClusterId;

        /**
         * The Hsm Cluster Id
         * @param hsmClusterId the value to set
         * @return this builder
         **/
        public Builder hsmClusterId(String hsmClusterId) {
            this.hsmClusterId = hsmClusterId;
            this.__explicitlySet__.add("hsmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditLogging build() {
            AuditLogging model = new AuditLogging(this.workRequestId, this.hsmClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditLogging model) {
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("hsmClusterId")) {
                this.hsmClusterId(model.getHsmClusterId());
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
     * The workRequestId to track the request later.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The workRequestId to track the request later.
     * @return the value
     **/
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * The Hsm Cluster Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hsmClusterId")
    private final String hsmClusterId;

    /**
     * The Hsm Cluster Id
     * @return the value
     **/
    public String getHsmClusterId() {
        return hsmClusterId;
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
        sb.append("AuditLogging(");
        sb.append("super=").append(super.toString());
        sb.append("workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", hsmClusterId=").append(String.valueOf(this.hsmClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditLogging)) {
            return false;
        }

        AuditLogging other = (AuditLogging) o;
        return java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.hsmClusterId, other.hsmClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.hsmClusterId == null ? 43 : this.hsmClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
