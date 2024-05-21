/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the {@code ProtocolParameters} configuration for the [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) protocol.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IcmpTrafficProtocolParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IcmpTrafficProtocolParameters extends TrafficProtocolParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) code.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
        private Integer icmpCode;

        /**
         * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) code.
         * @param icmpCode the value to set
         * @return this builder
         **/
        public Builder icmpCode(Integer icmpCode) {
            this.icmpCode = icmpCode;
            this.__explicitlySet__.add("icmpCode");
            return this;
        }
        /**
         * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("icmpType")
        private Integer icmpType;

        /**
         * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) type.
         * @param icmpType the value to set
         * @return this builder
         **/
        public Builder icmpType(Integer icmpType) {
            this.icmpType = icmpType;
            this.__explicitlySet__.add("icmpType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IcmpTrafficProtocolParameters build() {
            IcmpTrafficProtocolParameters model =
                    new IcmpTrafficProtocolParameters(this.icmpCode, this.icmpType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IcmpTrafficProtocolParameters model) {
            if (model.wasPropertyExplicitlySet("icmpCode")) {
                this.icmpCode(model.getIcmpCode());
            }
            if (model.wasPropertyExplicitlySet("icmpType")) {
                this.icmpType(model.getIcmpType());
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

    @Deprecated
    public IcmpTrafficProtocolParameters(Integer icmpCode, Integer icmpType) {
        super();
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
    }

    /**
     * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
    private final Integer icmpCode;

    /**
     * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) code.
     * @return the value
     **/
    public Integer getIcmpCode() {
        return icmpCode;
    }

    /**
     * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icmpType")
    private final Integer icmpType;

    /**
     * The [ICMP](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml) type.
     * @return the value
     **/
    public Integer getIcmpType() {
        return icmpType;
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
        sb.append("IcmpTrafficProtocolParameters(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", icmpCode=").append(String.valueOf(this.icmpCode));
        sb.append(", icmpType=").append(String.valueOf(this.icmpType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IcmpTrafficProtocolParameters)) {
            return false;
        }

        IcmpTrafficProtocolParameters other = (IcmpTrafficProtocolParameters) o;
        return java.util.Objects.equals(this.icmpCode, other.icmpCode)
                && java.util.Objects.equals(this.icmpType, other.icmpType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.icmpCode == null ? 43 : this.icmpCode.hashCode());
        result = (result * PRIME) + (this.icmpType == null ? 43 : this.icmpType.hashCode());
        return result;
    }
}
