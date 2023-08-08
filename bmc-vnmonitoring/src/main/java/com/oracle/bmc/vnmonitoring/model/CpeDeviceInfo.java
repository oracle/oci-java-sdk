/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Basic information about a particular CPE device type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CpeDeviceInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CpeDeviceInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vendor", "platformSoftwareVersion"})
    public CpeDeviceInfo(String vendor, String platformSoftwareVersion) {
        super();
        this.vendor = vendor;
        this.platformSoftwareVersion = platformSoftwareVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The vendor that makes the CPE device. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * The vendor that makes the CPE device.
         *
         * @param vendor the value to set
         * @return this builder
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /** The platform or software version of the CPE device. */
        @com.fasterxml.jackson.annotation.JsonProperty("platformSoftwareVersion")
        private String platformSoftwareVersion;

        /**
         * The platform or software version of the CPE device.
         *
         * @param platformSoftwareVersion the value to set
         * @return this builder
         */
        public Builder platformSoftwareVersion(String platformSoftwareVersion) {
            this.platformSoftwareVersion = platformSoftwareVersion;
            this.__explicitlySet__.add("platformSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpeDeviceInfo build() {
            CpeDeviceInfo model = new CpeDeviceInfo(this.vendor, this.platformSoftwareVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpeDeviceInfo model) {
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("platformSoftwareVersion")) {
                this.platformSoftwareVersion(model.getPlatformSoftwareVersion());
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

    /** The vendor that makes the CPE device. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * The vendor that makes the CPE device.
     *
     * @return the value
     */
    public String getVendor() {
        return vendor;
    }

    /** The platform or software version of the CPE device. */
    @com.fasterxml.jackson.annotation.JsonProperty("platformSoftwareVersion")
    private final String platformSoftwareVersion;

    /**
     * The platform or software version of the CPE device.
     *
     * @return the value
     */
    public String getPlatformSoftwareVersion() {
        return platformSoftwareVersion;
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
        sb.append("CpeDeviceInfo(");
        sb.append("super=").append(super.toString());
        sb.append("vendor=").append(String.valueOf(this.vendor));
        sb.append(", platformSoftwareVersion=")
                .append(String.valueOf(this.platformSoftwareVersion));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}