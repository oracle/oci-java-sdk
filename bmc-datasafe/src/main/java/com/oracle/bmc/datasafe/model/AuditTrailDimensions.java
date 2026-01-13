/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit trails. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditTrailDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditTrailDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"location", "lifecycleState", "status", "targetId"})
    public AuditTrailDimensions(
            String location,
            AuditTrailLifecycleState lifecycleState,
            String status,
            String targetId) {
        super();
        this.location = location;
        this.lifecycleState = lifecycleState;
        this.status = status;
        this.targetId = targetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The location represents the source of audit records that provides documentary evidence of
         * the sequence of activities in the target database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * The location represents the source of audit records that provides documentary evidence of
         * the sequence of activities in the target database.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** The current state of the audit trail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditTrailLifecycleState lifecycleState;

        /**
         * The current state of the audit trail.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AuditTrailLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The current sub-state of the audit trail.. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The current sub-state of the audit trail..
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The OCID of the Data Safe target for which the audit trail is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the Data Safe target for which the audit trail is created.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditTrailDimensions build() {
            AuditTrailDimensions model =
                    new AuditTrailDimensions(
                            this.location, this.lifecycleState, this.status, this.targetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditTrailDimensions model) {
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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
     * The location represents the source of audit records that provides documentary evidence of the
     * sequence of activities in the target database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * The location represents the source of audit records that provides documentary evidence of the
     * sequence of activities in the target database.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The current state of the audit trail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditTrailLifecycleState lifecycleState;

    /**
     * The current state of the audit trail.
     *
     * @return the value
     */
    public AuditTrailLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current sub-state of the audit trail.. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The current sub-state of the audit trail..
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The OCID of the Data Safe target for which the audit trail is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the Data Safe target for which the audit trail is created.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
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
        sb.append("AuditTrailDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("location=").append(String.valueOf(this.location));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditTrailDimensions)) {
            return false;
        }

        AuditTrailDimensions other = (AuditTrailDimensions) o;
        return java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
