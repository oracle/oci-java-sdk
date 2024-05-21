/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The request body info about renew certificate service list.
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
    builder = RenewCertificateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RenewCertificateDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterAdminPassword",
        "services",
        "rootCertificate",
        "hostCertDetails",
        "serverKeyPassword"
    })
    public RenewCertificateDetails(
            String clusterAdminPassword,
            java.util.List<Service> services,
            String rootCertificate,
            java.util.List<HostCertDetails> hostCertDetails,
            String serverKeyPassword) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.services = services;
        this.rootCertificate = rootCertificate;
        this.hostCertDetails = hostCertDetails;
        this.serverKeyPassword = serverKeyPassword;
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
         * List of services for which certificate needs to be renewed. If no services provided renew will happen only for default services - AMBARI,RANGER,HUE,LIVY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Service> services;

        /**
         * List of services for which certificate needs to be renewed. If no services provided renew will happen only for default services - AMBARI,RANGER,HUE,LIVY.
         * @param services the value to set
         * @return this builder
         **/
        public Builder services(java.util.List<Service> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /**
         * Plain text certificate/s in order, separated by new line character. If not provided in request a self-signed root certificate is generated inside the cluster. In case hostCertDetails is provided, root certificate is mandatory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootCertificate")
        private String rootCertificate;

        /**
         * Plain text certificate/s in order, separated by new line character. If not provided in request a self-signed root certificate is generated inside the cluster. In case hostCertDetails is provided, root certificate is mandatory.
         * @param rootCertificate the value to set
         * @return this builder
         **/
        public Builder rootCertificate(String rootCertificate) {
            this.rootCertificate = rootCertificate;
            this.__explicitlySet__.add("rootCertificate");
            return this;
        }
        /**
         * List of leaf certificates to use for services on each host. If custom host certificate is provided the root certificate becomes required.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostCertDetails")
        private java.util.List<HostCertDetails> hostCertDetails;

        /**
         * List of leaf certificates to use for services on each host. If custom host certificate is provided the root certificate becomes required.
         * @param hostCertDetails the value to set
         * @return this builder
         **/
        public Builder hostCertDetails(java.util.List<HostCertDetails> hostCertDetails) {
            this.hostCertDetails = hostCertDetails;
            this.__explicitlySet__.add("hostCertDetails");
            return this;
        }
        /**
         * Base-64 encoded password for CA certificate's private key. This value can be empty.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serverKeyPassword")
        private String serverKeyPassword;

        /**
         * Base-64 encoded password for CA certificate's private key. This value can be empty.
         * @param serverKeyPassword the value to set
         * @return this builder
         **/
        public Builder serverKeyPassword(String serverKeyPassword) {
            this.serverKeyPassword = serverKeyPassword;
            this.__explicitlySet__.add("serverKeyPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenewCertificateDetails build() {
            RenewCertificateDetails model =
                    new RenewCertificateDetails(
                            this.clusterAdminPassword,
                            this.services,
                            this.rootCertificate,
                            this.hostCertDetails,
                            this.serverKeyPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenewCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
            }
            if (model.wasPropertyExplicitlySet("rootCertificate")) {
                this.rootCertificate(model.getRootCertificate());
            }
            if (model.wasPropertyExplicitlySet("hostCertDetails")) {
                this.hostCertDetails(model.getHostCertDetails());
            }
            if (model.wasPropertyExplicitlySet("serverKeyPassword")) {
                this.serverKeyPassword(model.getServerKeyPassword());
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
     * List of services for which certificate needs to be renewed. If no services provided renew will happen only for default services - AMBARI,RANGER,HUE,LIVY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Service> services;

    /**
     * List of services for which certificate needs to be renewed. If no services provided renew will happen only for default services - AMBARI,RANGER,HUE,LIVY.
     * @return the value
     **/
    public java.util.List<Service> getServices() {
        return services;
    }

    /**
     * Plain text certificate/s in order, separated by new line character. If not provided in request a self-signed root certificate is generated inside the cluster. In case hostCertDetails is provided, root certificate is mandatory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootCertificate")
    private final String rootCertificate;

    /**
     * Plain text certificate/s in order, separated by new line character. If not provided in request a self-signed root certificate is generated inside the cluster. In case hostCertDetails is provided, root certificate is mandatory.
     * @return the value
     **/
    public String getRootCertificate() {
        return rootCertificate;
    }

    /**
     * List of leaf certificates to use for services on each host. If custom host certificate is provided the root certificate becomes required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostCertDetails")
    private final java.util.List<HostCertDetails> hostCertDetails;

    /**
     * List of leaf certificates to use for services on each host. If custom host certificate is provided the root certificate becomes required.
     * @return the value
     **/
    public java.util.List<HostCertDetails> getHostCertDetails() {
        return hostCertDetails;
    }

    /**
     * Base-64 encoded password for CA certificate's private key. This value can be empty.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverKeyPassword")
    private final String serverKeyPassword;

    /**
     * Base-64 encoded password for CA certificate's private key. This value can be empty.
     * @return the value
     **/
    public String getServerKeyPassword() {
        return serverKeyPassword;
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
        sb.append("RenewCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", services=").append(String.valueOf(this.services));
        sb.append(", rootCertificate=").append(String.valueOf(this.rootCertificate));
        sb.append(", hostCertDetails=").append(String.valueOf(this.hostCertDetails));
        sb.append(", serverKeyPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenewCertificateDetails)) {
            return false;
        }

        RenewCertificateDetails other = (RenewCertificateDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.rootCertificate, other.rootCertificate)
                && java.util.Objects.equals(this.hostCertDetails, other.hostCertDetails)
                && java.util.Objects.equals(this.serverKeyPassword, other.serverKeyPassword)
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
        result =
                (result * PRIME)
                        + (this.rootCertificate == null ? 43 : this.rootCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.hostCertDetails == null ? 43 : this.hostCertDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.serverKeyPassword == null ? 43 : this.serverKeyPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
