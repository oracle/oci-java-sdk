/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains network statistics. <br>
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
        builder = HostNetworkStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostNetworkStatistics extends HostResourceStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkReadInMBs")
        private Double networkReadInMBs;

        public Builder networkReadInMBs(Double networkReadInMBs) {
            this.networkReadInMBs = networkReadInMBs;
            this.__explicitlySet__.add("networkReadInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkWriteInMBs")
        private Double networkWriteInMBs;

        public Builder networkWriteInMBs(Double networkWriteInMBs) {
            this.networkWriteInMBs = networkWriteInMBs;
            this.__explicitlySet__.add("networkWriteInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostNetworkStatistics build() {
            HostNetworkStatistics model =
                    new HostNetworkStatistics(
                            this.usage,
                            this.capacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.networkReadInMBs,
                            this.networkWriteInMBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostNetworkStatistics model) {
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("utilizationPercent")) {
                this.utilizationPercent(model.getUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("usageChangePercent")) {
                this.usageChangePercent(model.getUsageChangePercent());
            }
            if (model.wasPropertyExplicitlySet("networkReadInMBs")) {
                this.networkReadInMBs(model.getNetworkReadInMBs());
            }
            if (model.wasPropertyExplicitlySet("networkWriteInMBs")) {
                this.networkWriteInMBs(model.getNetworkWriteInMBs());
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

    @Deprecated
    public HostNetworkStatistics(
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent,
            Double networkReadInMBs,
            Double networkWriteInMBs) {
        super(usage, capacity, utilizationPercent, usageChangePercent);
        this.networkReadInMBs = networkReadInMBs;
        this.networkWriteInMBs = networkWriteInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkReadInMBs")
    private final Double networkReadInMBs;

    public Double getNetworkReadInMBs() {
        return networkReadInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkWriteInMBs")
    private final Double networkWriteInMBs;

    public Double getNetworkWriteInMBs() {
        return networkWriteInMBs;
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
        sb.append("HostNetworkStatistics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", networkReadInMBs=").append(String.valueOf(this.networkReadInMBs));
        sb.append(", networkWriteInMBs=").append(String.valueOf(this.networkWriteInMBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostNetworkStatistics)) {
            return false;
        }

        HostNetworkStatistics other = (HostNetworkStatistics) o;
        return java.util.Objects.equals(this.networkReadInMBs, other.networkReadInMBs)
                && java.util.Objects.equals(this.networkWriteInMBs, other.networkWriteInMBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkReadInMBs == null ? 43 : this.networkReadInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.networkWriteInMBs == null ? 43 : this.networkWriteInMBs.hashCode());
        return result;
    }
}
