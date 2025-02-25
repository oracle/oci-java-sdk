/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for activating IAM user sync configuration
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActivateIamUserSyncConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActivateIamUserSyncConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterAdminPassword", "isPosixAttributesAdditionRequired"})
    public ActivateIamUserSyncConfigurationDetails(
            String clusterAdminPassword, Boolean isPosixAttributesAdditionRequired) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.isPosixAttributesAdditionRequired = isPosixAttributesAdditionRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded password for the cluster admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * whether posix attribute needs to be appended to users
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPosixAttributesAdditionRequired")
        private Boolean isPosixAttributesAdditionRequired;

        /**
         * whether posix attribute needs to be appended to users
         * @param isPosixAttributesAdditionRequired the value to set
         * @return this builder
         **/
        public Builder isPosixAttributesAdditionRequired(
                Boolean isPosixAttributesAdditionRequired) {
            this.isPosixAttributesAdditionRequired = isPosixAttributesAdditionRequired;
            this.__explicitlySet__.add("isPosixAttributesAdditionRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateIamUserSyncConfigurationDetails build() {
            ActivateIamUserSyncConfigurationDetails model =
                    new ActivateIamUserSyncConfigurationDetails(
                            this.clusterAdminPassword, this.isPosixAttributesAdditionRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateIamUserSyncConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("isPosixAttributesAdditionRequired")) {
                this.isPosixAttributesAdditionRequired(
                        model.getIsPosixAttributesAdditionRequired());
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
     * Base-64 encoded password for the cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * whether posix attribute needs to be appended to users
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPosixAttributesAdditionRequired")
    private final Boolean isPosixAttributesAdditionRequired;

    /**
     * whether posix attribute needs to be appended to users
     * @return the value
     **/
    public Boolean getIsPosixAttributesAdditionRequired() {
        return isPosixAttributesAdditionRequired;
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
        sb.append("ActivateIamUserSyncConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", isPosixAttributesAdditionRequired=")
                .append(String.valueOf(this.isPosixAttributesAdditionRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateIamUserSyncConfigurationDetails)) {
            return false;
        }

        ActivateIamUserSyncConfigurationDetails other = (ActivateIamUserSyncConfigurationDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(
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
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.isPosixAttributesAdditionRequired == null
                                ? 43
                                : this.isPosixAttributesAdditionRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
