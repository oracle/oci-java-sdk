/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * A load balancer IP address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IpAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IpAddress extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipAddress", "isPublic", "ipVersion", "reservedIp"})
    public IpAddress(
            String ipAddress, Boolean isPublic, IpVersion ipVersion, ReservedIP reservedIp) {
        super();
        this.ipAddress = ipAddress;
        this.isPublic = isPublic;
        this.ipVersion = ipVersion;
        this.reservedIp = reservedIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An IP address.
         *
         * <p>Example: {@code 192.168.0.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * An IP address.
         *
         * <p>Example: {@code 192.168.0.3}
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Whether the IP address is public or private.
         *
         * <p>If "true", then the IP address is public and accessible from the internet.
         *
         * <p>If "false", then the IP address is private and accessible only from within the
         * associated virtual cloud network.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the IP address is public or private.
         *
         * <p>If "true", then the IP address is public and accessible from the internet.
         *
         * <p>If "false", then the IP address is private and accessible only from within the
         * associated virtual cloud network.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }
        /** IP version associated with this IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
        private IpVersion ipVersion;

        /**
         * IP version associated with this IP address.
         *
         * @param ipVersion the value to set
         * @return this builder
         */
        public Builder ipVersion(IpVersion ipVersion) {
            this.ipVersion = ipVersion;
            this.__explicitlySet__.add("ipVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservedIp")
        private ReservedIP reservedIp;

        public Builder reservedIp(ReservedIP reservedIp) {
            this.reservedIp = reservedIp;
            this.__explicitlySet__.add("reservedIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpAddress build() {
            IpAddress model =
                    new IpAddress(this.ipAddress, this.isPublic, this.ipVersion, this.reservedIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpAddress model) {
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("ipVersion")) {
                this.ipVersion(model.getIpVersion());
            }
            if (model.wasPropertyExplicitlySet("reservedIp")) {
                this.reservedIp(model.getReservedIp());
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
     * An IP address.
     *
     * <p>Example: {@code 192.168.0.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * An IP address.
     *
     * <p>Example: {@code 192.168.0.3}
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Whether the IP address is public or private.
     *
     * <p>If "true", then the IP address is public and accessible from the internet.
     *
     * <p>If "false", then the IP address is private and accessible only from within the associated
     * virtual cloud network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the IP address is public or private.
     *
     * <p>If "true", then the IP address is public and accessible from the internet.
     *
     * <p>If "false", then the IP address is private and accessible only from within the associated
     * virtual cloud network.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /** IP version associated with this IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
    private final IpVersion ipVersion;

    /**
     * IP version associated with this IP address.
     *
     * @return the value
     */
    public IpVersion getIpVersion() {
        return ipVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reservedIp")
    private final ReservedIP reservedIp;

    public ReservedIP getReservedIp() {
        return reservedIp;
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
        sb.append("IpAddress(");
        sb.append("super=").append(super.toString());
        sb.append("ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", ipVersion=").append(String.valueOf(this.ipVersion));
        sb.append(", reservedIp=").append(String.valueOf(this.reservedIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpAddress)) {
            return false;
        }

        IpAddress other = (IpAddress) o;
        return java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.ipVersion, other.ipVersion)
                && java.util.Objects.equals(this.reservedIp, other.reservedIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + (this.reservedIp == null ? 43 : this.reservedIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
