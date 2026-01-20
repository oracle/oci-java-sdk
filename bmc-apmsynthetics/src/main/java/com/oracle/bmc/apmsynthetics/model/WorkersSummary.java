/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the workers in a specific On-premise vantage point. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkersSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkersSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "total",
        "available",
        "used",
        "disabled",
        "minVersion",
        "availableCapabilities"
    })
    public WorkersSummary(
            Integer total,
            Integer available,
            Integer used,
            Integer disabled,
            String minVersion,
            java.util.List<AvailableCapability> availableCapabilities) {
        super();
        this.total = total;
        this.available = available;
        this.used = used;
        this.disabled = disabled;
        this.minVersion = minVersion;
        this.availableCapabilities = availableCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of workers in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * Total number of workers in a specific On-premise vantage point.
         *
         * @param total the value to set
         * @return this builder
         */
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }
        /** Number of available workers in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("available")
        private Integer available;

        /**
         * Number of available workers in a specific On-premise vantage point.
         *
         * @param available the value to set
         * @return this builder
         */
        public Builder available(Integer available) {
            this.available = available;
            this.__explicitlySet__.add("available");
            return this;
        }
        /** Number of occupied workers in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("used")
        private Integer used;

        /**
         * Number of occupied workers in a specific On-premise vantage point.
         *
         * @param used the value to set
         * @return this builder
         */
        public Builder used(Integer used) {
            this.used = used;
            this.__explicitlySet__.add("used");
            return this;
        }
        /** Number of disabled workers in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("disabled")
        private Integer disabled;

        /**
         * Number of disabled workers in a specific On-premise vantage point.
         *
         * @param disabled the value to set
         * @return this builder
         */
        public Builder disabled(Integer disabled) {
            this.disabled = disabled;
            this.__explicitlySet__.add("disabled");
            return this;
        }
        /** Minimum version among the workers in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("minVersion")
        private String minVersion;

        /**
         * Minimum version among the workers in a specific On-premise vantage point.
         *
         * @param minVersion the value to set
         * @return this builder
         */
        public Builder minVersion(String minVersion) {
            this.minVersion = minVersion;
            this.__explicitlySet__.add("minVersion");
            return this;
        }
        /** List of available capabilities in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCapabilities")
        private java.util.List<AvailableCapability> availableCapabilities;

        /**
         * List of available capabilities in a specific On-premise vantage point.
         *
         * @param availableCapabilities the value to set
         * @return this builder
         */
        public Builder availableCapabilities(
                java.util.List<AvailableCapability> availableCapabilities) {
            this.availableCapabilities = availableCapabilities;
            this.__explicitlySet__.add("availableCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkersSummary build() {
            WorkersSummary model =
                    new WorkersSummary(
                            this.total,
                            this.available,
                            this.used,
                            this.disabled,
                            this.minVersion,
                            this.availableCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkersSummary model) {
            if (model.wasPropertyExplicitlySet("total")) {
                this.total(model.getTotal());
            }
            if (model.wasPropertyExplicitlySet("available")) {
                this.available(model.getAvailable());
            }
            if (model.wasPropertyExplicitlySet("used")) {
                this.used(model.getUsed());
            }
            if (model.wasPropertyExplicitlySet("disabled")) {
                this.disabled(model.getDisabled());
            }
            if (model.wasPropertyExplicitlySet("minVersion")) {
                this.minVersion(model.getMinVersion());
            }
            if (model.wasPropertyExplicitlySet("availableCapabilities")) {
                this.availableCapabilities(model.getAvailableCapabilities());
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

    /** Total number of workers in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * Total number of workers in a specific On-premise vantage point.
     *
     * @return the value
     */
    public Integer getTotal() {
        return total;
    }

    /** Number of available workers in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("available")
    private final Integer available;

    /**
     * Number of available workers in a specific On-premise vantage point.
     *
     * @return the value
     */
    public Integer getAvailable() {
        return available;
    }

    /** Number of occupied workers in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    private final Integer used;

    /**
     * Number of occupied workers in a specific On-premise vantage point.
     *
     * @return the value
     */
    public Integer getUsed() {
        return used;
    }

    /** Number of disabled workers in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    private final Integer disabled;

    /**
     * Number of disabled workers in a specific On-premise vantage point.
     *
     * @return the value
     */
    public Integer getDisabled() {
        return disabled;
    }

    /** Minimum version among the workers in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("minVersion")
    private final String minVersion;

    /**
     * Minimum version among the workers in a specific On-premise vantage point.
     *
     * @return the value
     */
    public String getMinVersion() {
        return minVersion;
    }

    /** List of available capabilities in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCapabilities")
    private final java.util.List<AvailableCapability> availableCapabilities;

    /**
     * List of available capabilities in a specific On-premise vantage point.
     *
     * @return the value
     */
    public java.util.List<AvailableCapability> getAvailableCapabilities() {
        return availableCapabilities;
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
        sb.append("WorkersSummary(");
        sb.append("super=").append(super.toString());
        sb.append("total=").append(String.valueOf(this.total));
        sb.append(", available=").append(String.valueOf(this.available));
        sb.append(", used=").append(String.valueOf(this.used));
        sb.append(", disabled=").append(String.valueOf(this.disabled));
        sb.append(", minVersion=").append(String.valueOf(this.minVersion));
        sb.append(", availableCapabilities=").append(String.valueOf(this.availableCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkersSummary)) {
            return false;
        }

        WorkersSummary other = (WorkersSummary) o;
        return java.util.Objects.equals(this.total, other.total)
                && java.util.Objects.equals(this.available, other.available)
                && java.util.Objects.equals(this.used, other.used)
                && java.util.Objects.equals(this.disabled, other.disabled)
                && java.util.Objects.equals(this.minVersion, other.minVersion)
                && java.util.Objects.equals(this.availableCapabilities, other.availableCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + (this.available == null ? 43 : this.available.hashCode());
        result = (result * PRIME) + (this.used == null ? 43 : this.used.hashCode());
        result = (result * PRIME) + (this.disabled == null ? 43 : this.disabled.hashCode());
        result = (result * PRIME) + (this.minVersion == null ? 43 : this.minVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCapabilities == null
                                ? 43
                                : this.availableCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
