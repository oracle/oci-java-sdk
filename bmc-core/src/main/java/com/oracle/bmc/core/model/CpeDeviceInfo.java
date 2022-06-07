/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Basic information about a particular CPE device type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CpeDeviceInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CpeDeviceInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"vendor", "platformSoftwareVersion"})
    public CpeDeviceInfo(String vendor, String platformSoftwareVersion) {
        super();
        this.vendor = vendor;
        this.platformSoftwareVersion = platformSoftwareVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformSoftwareVersion")
        private String platformSoftwareVersion;

        public Builder platformSoftwareVersion(String platformSoftwareVersion) {
            this.platformSoftwareVersion = platformSoftwareVersion;
            this.__explicitlySet__.add("platformSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpeDeviceInfo build() {
            CpeDeviceInfo __instance__ = new CpeDeviceInfo(vendor, platformSoftwareVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpeDeviceInfo o) {
            Builder copiedBuilder =
                    vendor(o.getVendor()).platformSoftwareVersion(o.getPlatformSoftwareVersion());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The vendor that makes the CPE device.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    public String getVendor() {
        return vendor;
    }

    /**
     * The platform or software version of the CPE device.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformSoftwareVersion")
    private final String platformSoftwareVersion;

    public String getPlatformSoftwareVersion() {
        return platformSoftwareVersion;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CpeDeviceInfo(");
        sb.append("vendor=").append(String.valueOf(this.vendor));
        sb.append(", platformSoftwareVersion=")
                .append(String.valueOf(this.platformSoftwareVersion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpeDeviceInfo)) {
            return false;
        }

        CpeDeviceInfo other = (CpeDeviceInfo) o;
        return java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(
                        this.platformSoftwareVersion, other.platformSoftwareVersion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result =
                (result * PRIME)
                        + (this.platformSoftwareVersion == null
                                ? 43
                                : this.platformSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
