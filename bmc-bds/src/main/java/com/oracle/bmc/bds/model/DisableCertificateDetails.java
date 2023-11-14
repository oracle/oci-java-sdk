/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The request body info about disable certificate service list. <br>
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
        builder = DisableCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisableCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterAdminPassword", "services"})
    public DisableCertificateDetails(
            String clusterAdminPassword, java.util.List<Service> services) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.services = services;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base-64 encoded password for the cluster admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /** List of services for which certificate needs to be disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Service> services;

        /**
         * List of services for which certificate needs to be disabled.
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<Service> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisableCertificateDetails build() {
            DisableCertificateDetails model =
                    new DisableCertificateDetails(this.clusterAdminPassword, this.services);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisableCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
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

    /** Base-64 encoded password for the cluster admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /** List of services for which certificate needs to be disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Service> services;

    /**
     * List of services for which certificate needs to be disabled.
     *
     * @return the value
     */
    public java.util.List<Service> getServices() {
        return services;
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
        sb.append("DisableCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisableCertificateDetails)) {
            return false;
        }

        DisableCertificateDetails other = (DisableCertificateDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.services, other.services)
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
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
