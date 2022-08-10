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
public final class TcpOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
            TcpOptions model = new TcpOptions(this.destinationPortRange, this.sourcePortRange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpOptions model) {
            if (model.wasPropertyExplicitlySet("destinationPortRange")) {
                this.destinationPortRange(model.getDestinationPortRange());
            }
            if (model.wasPropertyExplicitlySet("sourcePortRange")) {
                this.sourcePortRange(model.getSourcePortRange());
            }
            return this;
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TcpOptions(");
        sb.append("super=").append(super.toString());
        sb.append("destinationPortRange=").append(String.valueOf(this.destinationPortRange));
        sb.append(", sourcePortRange=").append(String.valueOf(this.sourcePortRange));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
