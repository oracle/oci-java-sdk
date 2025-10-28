/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Status details for an identity type <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidationIdentityStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidationIdentityStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "status", "statusDetails"})
    public ValidationIdentityStatus(
            IdentityType type, DatabaseToolsIdentityStatus status, String statusDetails) {
        super();
        this.type = type;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Database Tools identity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private IdentityType type;

        /**
         * The Database Tools identity type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(IdentityType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The status of the identity. AVAILABLE if the identity type can be used with this
         * connection. UNAVAILABLE if not.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DatabaseToolsIdentityStatus status;

        /**
         * The status of the identity. AVAILABLE if the identity type can be used with this
         * connection. UNAVAILABLE if not.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(DatabaseToolsIdentityStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** If the status is UNAVAILABLE this displays the cause. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        /**
         * If the status is UNAVAILABLE this displays the cause.
         *
         * @param statusDetails the value to set
         * @return this builder
         */
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidationIdentityStatus build() {
            ValidationIdentityStatus model =
                    new ValidationIdentityStatus(this.type, this.status, this.statusDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidationIdentityStatus model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetails")) {
                this.statusDetails(model.getStatusDetails());
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

    /** The Database Tools identity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final IdentityType type;

    /**
     * The Database Tools identity type.
     *
     * @return the value
     */
    public IdentityType getType() {
        return type;
    }

    /**
     * The status of the identity. AVAILABLE if the identity type can be used with this connection.
     * UNAVAILABLE if not.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DatabaseToolsIdentityStatus status;

    /**
     * The status of the identity. AVAILABLE if the identity type can be used with this connection.
     * UNAVAILABLE if not.
     *
     * @return the value
     */
    public DatabaseToolsIdentityStatus getStatus() {
        return status;
    }

    /** If the status is UNAVAILABLE this displays the cause. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

    /**
     * If the status is UNAVAILABLE this displays the cause.
     *
     * @return the value
     */
    public String getStatusDetails() {
        return statusDetails;
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
        sb.append("ValidationIdentityStatus(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationIdentityStatus)) {
            return false;
        }

        ValidationIdentityStatus other = (ValidationIdentityStatus) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
