/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for activating/updating an IAM user sync configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IamUserSyncConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IamUserSyncConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPosixAttributesAdditionRequired"})
    public IamUserSyncConfigurationDetails(Boolean isPosixAttributesAdditionRequired) {
        super();
        this.isPosixAttributesAdditionRequired = isPosixAttributesAdditionRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * whether posix attribute needs to be appended to users, required for updating IAM user
         * sync configuration
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPosixAttributesAdditionRequired")
        private Boolean isPosixAttributesAdditionRequired;

        /**
         * whether posix attribute needs to be appended to users, required for updating IAM user
         * sync configuration
         *
         * @param isPosixAttributesAdditionRequired the value to set
         * @return this builder
         */
        public Builder isPosixAttributesAdditionRequired(
                Boolean isPosixAttributesAdditionRequired) {
            this.isPosixAttributesAdditionRequired = isPosixAttributesAdditionRequired;
            this.__explicitlySet__.add("isPosixAttributesAdditionRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IamUserSyncConfigurationDetails build() {
            IamUserSyncConfigurationDetails model =
                    new IamUserSyncConfigurationDetails(this.isPosixAttributesAdditionRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IamUserSyncConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isPosixAttributesAdditionRequired")) {
                this.isPosixAttributesAdditionRequired(
                        model.getIsPosixAttributesAdditionRequired());
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
     * whether posix attribute needs to be appended to users, required for updating IAM user sync
     * configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPosixAttributesAdditionRequired")
    private final Boolean isPosixAttributesAdditionRequired;

    /**
     * whether posix attribute needs to be appended to users, required for updating IAM user sync
     * configuration
     *
     * @return the value
     */
    public Boolean getIsPosixAttributesAdditionRequired() {
        return isPosixAttributesAdditionRequired;
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
        sb.append("IamUserSyncConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isPosixAttributesAdditionRequired=")
                .append(String.valueOf(this.isPosixAttributesAdditionRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IamUserSyncConfigurationDetails)) {
            return false;
        }

        IamUserSyncConfigurationDetails other = (IamUserSyncConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.isPosixAttributesAdditionRequired,
                        other.isPosixAttributesAdditionRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPosixAttributesAdditionRequired == null
                                ? 43
                                : this.isPosixAttributesAdditionRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
