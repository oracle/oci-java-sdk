/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A load balancer IP address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IpAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpAddress extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipAddress", "isPublic", "reservedIp"})
    public IpAddress(String ipAddress, Boolean isPublic, ReservedIP reservedIp) {
        super();
        this.ipAddress = ipAddress;
        this.isPublic = isPublic;
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
         * <p>If "true", the IP address is public and accessible from the internet.
         *
         * <p>If "false", the IP address is private and accessible only from within the associated
         * VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the IP address is public or private.
         *
         * <p>If "true", the IP address is public and accessible from the internet.
         *
         * <p>If "false", the IP address is private and accessible only from within the associated
         * VCN.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
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
            IpAddress model = new IpAddress(this.ipAddress, this.isPublic, this.reservedIp);
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
     * <p>If "true", the IP address is public and accessible from the internet.
     *
     * <p>If "false", the IP address is private and accessible only from within the associated VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the IP address is public or private.
     *
     * <p>If "true", the IP address is public and accessible from the internet.
     *
     * <p>If "false", the IP address is private and accessible only from within the associated VCN.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
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
                && java.util.Objects.equals(this.reservedIp, other.reservedIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.reservedIp == null ? 43 : this.reservedIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
