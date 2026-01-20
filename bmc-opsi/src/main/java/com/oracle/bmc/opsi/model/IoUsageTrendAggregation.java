/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per io interface. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IoUsageTrendAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IoUsageTrendAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountPoint", "usageData"})
    public IoUsageTrendAggregation(String mountPoint, java.util.List<IoUsageTrend> usageData) {
        super();
        this.mountPoint = mountPoint;
        this.usageData = usageData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Mount point is specialized NTFS filesystem object. */
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * Mount point is specialized NTFS filesystem object.
         *
         * @param mountPoint the value to set
         * @return this builder
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /** List of usage data samples for a IO interface. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<IoUsageTrend> usageData;

        /**
         * List of usage data samples for a IO interface.
         *
         * @param usageData the value to set
         * @return this builder
         */
        public Builder usageData(java.util.List<IoUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IoUsageTrendAggregation build() {
            IoUsageTrendAggregation model =
                    new IoUsageTrendAggregation(this.mountPoint, this.usageData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IoUsageTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("usageData")) {
                this.usageData(model.getUsageData());
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

    /** Mount point is specialized NTFS filesystem object. */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * Mount point is specialized NTFS filesystem object.
     *
     * @return the value
     */
    public String getMountPoint() {
        return mountPoint;
    }

    /** List of usage data samples for a IO interface. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    private final java.util.List<IoUsageTrend> usageData;

    /**
     * List of usage data samples for a IO interface.
     *
     * @return the value
     */
    public java.util.List<IoUsageTrend> getUsageData() {
        return usageData;
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
        sb.append("IoUsageTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", usageData=").append(String.valueOf(this.usageData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IoUsageTrendAggregation)) {
            return false;
        }

        IoUsageTrendAggregation other = (IoUsageTrendAggregation) o;
        return java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.usageData, other.usageData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result = (result * PRIME) + (this.usageData == null ? 43 : this.usageData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
