/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachDevicesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachDevicesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"deviceLabels"})
    public AttachDevicesDetails(java.util.List<String> deviceLabels) {
        super();
        this.deviceLabels = deviceLabels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of TransferDeviceLabel's
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deviceLabels")
        private java.util.List<String> deviceLabels;

        /**
         * List of TransferDeviceLabel's
         * @param deviceLabels the value to set
         * @return this builder
         **/
        public Builder deviceLabels(java.util.List<String> deviceLabels) {
            this.deviceLabels = deviceLabels;
            this.__explicitlySet__.add("deviceLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachDevicesDetails build() {
            AttachDevicesDetails __instance__ = new AttachDevicesDetails(deviceLabels);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachDevicesDetails o) {
            Builder copiedBuilder = deviceLabels(o.getDeviceLabels());

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
     * List of TransferDeviceLabel's
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deviceLabels")
    private final java.util.List<String> deviceLabels;

    /**
     * List of TransferDeviceLabel's
     * @return the value
     **/
    public java.util.List<String> getDeviceLabels() {
        return deviceLabels;
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
        sb.append("AttachDevicesDetails(");
        sb.append("deviceLabels=").append(String.valueOf(this.deviceLabels));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachDevicesDetails)) {
            return false;
        }

        AttachDevicesDetails other = (AttachDevicesDetails) o;
        return java.util.Objects.equals(this.deviceLabels, other.deviceLabels)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deviceLabels == null ? 43 : this.deviceLabels.hashCode());
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
