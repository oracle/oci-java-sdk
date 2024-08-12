/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of creating a resource principal configuration for the cluster.
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
    builder = CreateResourcePrincipalConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateResourcePrincipalConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "clusterAdminPassword",
        "sessionTokenLifeSpanDurationInHours"
    })
    public CreateResourcePrincipalConfigurationDetails(
            String displayName,
            String clusterAdminPassword,
            Integer sessionTokenLifeSpanDurationInHours) {
        super();
        this.displayName = displayName;
        this.clusterAdminPassword = clusterAdminPassword;
        this.sessionTokenLifeSpanDurationInHours = sessionTokenLifeSpanDurationInHours;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Base-64 encoded Cluster Admin Password for cluster admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded Cluster Admin Password for cluster admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * Life span in hours for the resource principal session token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionTokenLifeSpanDurationInHours")
        private Integer sessionTokenLifeSpanDurationInHours;

        /**
         * Life span in hours for the resource principal session token.
         * @param sessionTokenLifeSpanDurationInHours the value to set
         * @return this builder
         **/
        public Builder sessionTokenLifeSpanDurationInHours(
                Integer sessionTokenLifeSpanDurationInHours) {
            this.sessionTokenLifeSpanDurationInHours = sessionTokenLifeSpanDurationInHours;
            this.__explicitlySet__.add("sessionTokenLifeSpanDurationInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateResourcePrincipalConfigurationDetails build() {
            CreateResourcePrincipalConfigurationDetails model =
                    new CreateResourcePrincipalConfigurationDetails(
                            this.displayName,
                            this.clusterAdminPassword,
                            this.sessionTokenLifeSpanDurationInHours);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateResourcePrincipalConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("sessionTokenLifeSpanDurationInHours")) {
                this.sessionTokenLifeSpanDurationInHours(
                        model.getSessionTokenLifeSpanDurationInHours());
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
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Only ASCII alphanumeric characters with no spaces allowed. The name does not have to be unique, and it may be changed. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Base-64 encoded Cluster Admin Password for cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded Cluster Admin Password for cluster admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * Life span in hours for the resource principal session token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTokenLifeSpanDurationInHours")
    private final Integer sessionTokenLifeSpanDurationInHours;

    /**
     * Life span in hours for the resource principal session token.
     * @return the value
     **/
    public Integer getSessionTokenLifeSpanDurationInHours() {
        return sessionTokenLifeSpanDurationInHours;
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
        sb.append("CreateResourcePrincipalConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", sessionTokenLifeSpanDurationInHours=")
                .append(String.valueOf(this.sessionTokenLifeSpanDurationInHours));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateResourcePrincipalConfigurationDetails)) {
            return false;
        }

        CreateResourcePrincipalConfigurationDetails other =
                (CreateResourcePrincipalConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(
                        this.sessionTokenLifeSpanDurationInHours,
                        other.sessionTokenLifeSpanDurationInHours)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionTokenLifeSpanDurationInHours == null
                                ? 43
                                : this.sessionTokenLifeSpanDurationInHours.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
