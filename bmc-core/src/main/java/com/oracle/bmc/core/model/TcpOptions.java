/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Optional and valid only for TCP. Use to specify particular destination ports for TCP rules.
 * If you specify TCP as the protocol but omit this object, then all destination ports are allowed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TcpOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TcpOptions {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationPortRange", "sourcePortRange"})
    public TcpOptions(PortRange destinationPortRange, PortRange sourcePortRange) {
        super();
        this.destinationPortRange = destinationPortRange;
        this.sourcePortRange = sourcePortRange;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("destinationPortRange")
        private PortRange destinationPortRange;

        public Builder destinationPortRange(PortRange destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            this.__explicitlySet__.add("destinationPortRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePortRange")
        private PortRange sourcePortRange;

        public Builder sourcePortRange(PortRange sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            this.__explicitlySet__.add("sourcePortRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TcpOptions build() {
            TcpOptions __instance__ = new TcpOptions(destinationPortRange, sourcePortRange);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpOptions o) {
            Builder copiedBuilder =
                    destinationPortRange(o.getDestinationPortRange())
                            .sourcePortRange(o.getSourcePortRange());

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

    @com.fasterxml.jackson.annotation.JsonProperty("destinationPortRange")
    private final PortRange destinationPortRange;

    public PortRange getDestinationPortRange() {
        return destinationPortRange;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourcePortRange")
    private final PortRange sourcePortRange;

    public PortRange getSourcePortRange() {
        return sourcePortRange;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TcpOptions(");
        sb.append("destinationPortRange=").append(String.valueOf(this.destinationPortRange));
        sb.append(", sourcePortRange=").append(String.valueOf(this.sourcePortRange));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TcpOptions)) {
            return false;
        }

        TcpOptions other = (TcpOptions) o;
        return java.util.Objects.equals(this.destinationPortRange, other.destinationPortRange)
                && java.util.Objects.equals(this.sourcePortRange, other.sourcePortRange)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationPortRange == null
                                ? 43
                                : this.destinationPortRange.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePortRange == null ? 43 : this.sourcePortRange.hashCode());
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
