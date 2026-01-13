/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to create a Read Endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateReadEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateReadEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "readEndpointIpAddress",
        "readEndpointHostnameLabel",
        "excludeIps"
    })
    public CreateReadEndpointDetails(
            Boolean isEnabled,
            String readEndpointIpAddress,
            String readEndpointHostnameLabel,
            java.util.List<String> excludeIps) {
        super();
        this.isEnabled = isEnabled;
        this.readEndpointIpAddress = readEndpointIpAddress;
        this.readEndpointHostnameLabel = readEndpointHostnameLabel;
        this.excludeIps = excludeIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies if the DB System read endpoint is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Specifies if the DB System read endpoint is enabled or not.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The IP address the DB System read endpoint is configured to listen on. A private IP
         * address of your choice to assign to the read endpoint of the DB System. Must be an
         * available IP address within the subnet's CIDR. If you don't specify a value, Oracle
         * automatically assigns a private IP address from the subnet. This should be a
         * "dotted-quad" style IPv4 address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readEndpointIpAddress")
        private String readEndpointIpAddress;

        /**
         * The IP address the DB System read endpoint is configured to listen on. A private IP
         * address of your choice to assign to the read endpoint of the DB System. Must be an
         * available IP address within the subnet's CIDR. If you don't specify a value, Oracle
         * automatically assigns a private IP address from the subnet. This should be a
         * "dotted-quad" style IPv4 address.
         *
         * @param readEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder readEndpointIpAddress(String readEndpointIpAddress) {
            this.readEndpointIpAddress = readEndpointIpAddress;
            this.__explicitlySet__.add("readEndpointIpAddress");
            return this;
        }
        /**
         * The hostname for the read endpoint of the DB System. Used for DNS.
         *
         * <p>The value is the hostname portion of the primary private IP's fully qualified domain
         * name (FQDN) (for example, "dbsystem-1" in FQDN
         * "dbsystem-1.subnet123.vcn1.oraclevcn.com").
         *
         * <p>Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readEndpointHostnameLabel")
        private String readEndpointHostnameLabel;

        /**
         * The hostname for the read endpoint of the DB System. Used for DNS.
         *
         * <p>The value is the hostname portion of the primary private IP's fully qualified domain
         * name (FQDN) (for example, "dbsystem-1" in FQDN
         * "dbsystem-1.subnet123.vcn1.oraclevcn.com").
         *
         * <p>Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         *
         * @param readEndpointHostnameLabel the value to set
         * @return this builder
         */
        public Builder readEndpointHostnameLabel(String readEndpointHostnameLabel) {
            this.readEndpointHostnameLabel = readEndpointHostnameLabel;
            this.__explicitlySet__.add("readEndpointHostnameLabel");
            return this;
        }
        /** A list of IP addresses of read replicas that are excluded from serving read requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeIps")
        private java.util.List<String> excludeIps;

        /**
         * A list of IP addresses of read replicas that are excluded from serving read requests.
         *
         * @param excludeIps the value to set
         * @return this builder
         */
        public Builder excludeIps(java.util.List<String> excludeIps) {
            this.excludeIps = excludeIps;
            this.__explicitlySet__.add("excludeIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReadEndpointDetails build() {
            CreateReadEndpointDetails model =
                    new CreateReadEndpointDetails(
                            this.isEnabled,
                            this.readEndpointIpAddress,
                            this.readEndpointHostnameLabel,
                            this.excludeIps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReadEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("readEndpointIpAddress")) {
                this.readEndpointIpAddress(model.getReadEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("readEndpointHostnameLabel")) {
                this.readEndpointHostnameLabel(model.getReadEndpointHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("excludeIps")) {
                this.excludeIps(model.getExcludeIps());
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

    /** Specifies if the DB System read endpoint is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Specifies if the DB System read endpoint is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The IP address the DB System read endpoint is configured to listen on. A private IP address
     * of your choice to assign to the read endpoint of the DB System. Must be an available IP
     * address within the subnet's CIDR. If you don't specify a value, Oracle automatically assigns
     * a private IP address from the subnet. This should be a "dotted-quad" style IPv4 address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readEndpointIpAddress")
    private final String readEndpointIpAddress;

    /**
     * The IP address the DB System read endpoint is configured to listen on. A private IP address
     * of your choice to assign to the read endpoint of the DB System. Must be an available IP
     * address within the subnet's CIDR. If you don't specify a value, Oracle automatically assigns
     * a private IP address from the subnet. This should be a "dotted-quad" style IPv4 address.
     *
     * @return the value
     */
    public String getReadEndpointIpAddress() {
        return readEndpointIpAddress;
    }

    /**
     * The hostname for the read endpoint of the DB System. Used for DNS.
     *
     * <p>The value is the hostname portion of the primary private IP's fully qualified domain name
     * (FQDN) (for example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com").
     *
     * <p>Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readEndpointHostnameLabel")
    private final String readEndpointHostnameLabel;

    /**
     * The hostname for the read endpoint of the DB System. Used for DNS.
     *
     * <p>The value is the hostname portion of the primary private IP's fully qualified domain name
     * (FQDN) (for example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com").
     *
     * <p>Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     *
     * @return the value
     */
    public String getReadEndpointHostnameLabel() {
        return readEndpointHostnameLabel;
    }

    /** A list of IP addresses of read replicas that are excluded from serving read requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeIps")
    private final java.util.List<String> excludeIps;

    /**
     * A list of IP addresses of read replicas that are excluded from serving read requests.
     *
     * @return the value
     */
    public java.util.List<String> getExcludeIps() {
        return excludeIps;
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
        sb.append("CreateReadEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", readEndpointIpAddress=").append(String.valueOf(this.readEndpointIpAddress));
        sb.append(", readEndpointHostnameLabel=")
                .append(String.valueOf(this.readEndpointHostnameLabel));
        sb.append(", excludeIps=").append(String.valueOf(this.excludeIps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReadEndpointDetails)) {
            return false;
        }

        CreateReadEndpointDetails other = (CreateReadEndpointDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.readEndpointIpAddress, other.readEndpointIpAddress)
                && java.util.Objects.equals(
                        this.readEndpointHostnameLabel, other.readEndpointHostnameLabel)
                && java.util.Objects.equals(this.excludeIps, other.excludeIps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.readEndpointIpAddress == null
                                ? 43
                                : this.readEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.readEndpointHostnameLabel == null
                                ? 43
                                : this.readEndpointHostnameLabel.hashCode());
        result = (result * PRIME) + (this.excludeIps == null ? 43 : this.excludeIps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
