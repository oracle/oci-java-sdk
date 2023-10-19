/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * A Port Range which can be used for the running service. It uses port information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PortRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PortRange extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"minimumPort", "maximumPort"})
    public PortRange(Integer minimumPort, Integer maximumPort) {
        super();
        this.minimumPort = minimumPort;
        this.maximumPort = maximumPort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The minimum port in the range (inclusive), or the sole port of a single-port range. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumPort")
        private Integer minimumPort;

        /**
         * The minimum port in the range (inclusive), or the sole port of a single-port range.
         *
         * @param minimumPort the value to set
         * @return this builder
         */
        public Builder minimumPort(Integer minimumPort) {
            this.minimumPort = minimumPort;
            this.__explicitlySet__.add("minimumPort");
            return this;
        }
        /**
         * The maximum port in the range (inclusive), which may be absent for a single-port range.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumPort")
        private Integer maximumPort;

        /**
         * The maximum port in the range (inclusive), which may be absent for a single-port range.
         *
         * @param maximumPort the value to set
         * @return this builder
         */
        public Builder maximumPort(Integer maximumPort) {
            this.maximumPort = maximumPort;
            this.__explicitlySet__.add("maximumPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PortRange build() {
            PortRange model = new PortRange(this.minimumPort, this.maximumPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PortRange model) {
            if (model.wasPropertyExplicitlySet("minimumPort")) {
                this.minimumPort(model.getMinimumPort());
            }
            if (model.wasPropertyExplicitlySet("maximumPort")) {
                this.maximumPort(model.getMaximumPort());
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

    /** The minimum port in the range (inclusive), or the sole port of a single-port range. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumPort")
    private final Integer minimumPort;

    /**
     * The minimum port in the range (inclusive), or the sole port of a single-port range.
     *
     * @return the value
     */
    public Integer getMinimumPort() {
        return minimumPort;
    }

    /** The maximum port in the range (inclusive), which may be absent for a single-port range. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumPort")
    private final Integer maximumPort;

    /**
     * The maximum port in the range (inclusive), which may be absent for a single-port range.
     *
     * @return the value
     */
    public Integer getMaximumPort() {
        return maximumPort;
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
        sb.append("PortRange(");
        sb.append("super=").append(super.toString());
        sb.append("minimumPort=").append(String.valueOf(this.minimumPort));
        sb.append(", maximumPort=").append(String.valueOf(this.maximumPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PortRange)) {
            return false;
        }

        PortRange other = (PortRange) o;
        return java.util.Objects.equals(this.minimumPort, other.minimumPort)
                && java.util.Objects.equals(this.maximumPort, other.maximumPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minimumPort == null ? 43 : this.minimumPort.hashCode());
        result = (result * PRIME) + (this.maximumPort == null ? 43 : this.maximumPort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
