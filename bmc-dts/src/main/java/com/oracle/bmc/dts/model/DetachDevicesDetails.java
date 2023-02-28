/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetachDevicesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DetachDevicesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deviceLabels"})
    public DetachDevicesDetails(java.util.List<String> deviceLabels) {
        super();
        this.deviceLabels = deviceLabels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of TransferDeviceLabel's */
        @com.fasterxml.jackson.annotation.JsonProperty("deviceLabels")
        private java.util.List<String> deviceLabels;

        /**
         * List of TransferDeviceLabel's
         *
         * @param deviceLabels the value to set
         * @return this builder
         */
        public Builder deviceLabels(java.util.List<String> deviceLabels) {
            this.deviceLabels = deviceLabels;
            this.__explicitlySet__.add("deviceLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachDevicesDetails build() {
            DetachDevicesDetails model = new DetachDevicesDetails(this.deviceLabels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachDevicesDetails model) {
            if (model.wasPropertyExplicitlySet("deviceLabels")) {
                this.deviceLabels(model.getDeviceLabels());
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

    /** List of TransferDeviceLabel's */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceLabels")
    private final java.util.List<String> deviceLabels;

    /**
     * List of TransferDeviceLabel's
     *
     * @return the value
     */
    public java.util.List<String> getDeviceLabels() {
        return deviceLabels;
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
        sb.append("DetachDevicesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("deviceLabels=").append(String.valueOf(this.deviceLabels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachDevicesDetails)) {
            return false;
        }

        DetachDevicesDetails other = (DetachDevicesDetails) o;
        return java.util.Objects.equals(this.deviceLabels, other.deviceLabels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deviceLabels == null ? 43 : this.deviceLabels.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
