/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The details about an edge node subnet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EdgeSubnet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EdgeSubnet extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cidr", "timeModified", "region"})
    public EdgeSubnet(String cidr, java.util.Date timeModified, String region) {
        super();
        this.cidr = cidr;
        this.timeModified = timeModified;
        this.region = region;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An edge node subnet. This can include /24 or /8 addresses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidr")
        private String cidr;

        /**
         * An edge node subnet. This can include /24 or /8 addresses.
         * @param cidr the value to set
         * @return this builder
         **/
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            this.__explicitlySet__.add("cidr");
            return this;
        }
        /**
         * The date and time the last change was made to the indicated edge node subnet, expressed in RFC 3339 timestamp format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time the last change was made to the indicated edge node subnet, expressed in RFC 3339 timestamp format.
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /**
         * The name of the region containing the indicated subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region containing the indicated subnet.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EdgeSubnet build() {
            EdgeSubnet model = new EdgeSubnet(this.cidr, this.timeModified, this.region);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EdgeSubnet model) {
            if (model.wasPropertyExplicitlySet("cidr")) {
                this.cidr(model.getCidr());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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

    /**
     * An edge node subnet. This can include /24 or /8 addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidr")
    private final String cidr;

    /**
     * An edge node subnet. This can include /24 or /8 addresses.
     * @return the value
     **/
    public String getCidr() {
        return cidr;
    }

    /**
     * The date and time the last change was made to the indicated edge node subnet, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time the last change was made to the indicated edge node subnet, expressed in RFC 3339 timestamp format.
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /**
     * The name of the region containing the indicated subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region containing the indicated subnet.
     * @return the value
     **/
    public String getRegion() {
        return region;
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
        sb.append("EdgeSubnet(");
        sb.append("super=").append(super.toString());
        sb.append("cidr=").append(String.valueOf(this.cidr));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EdgeSubnet)) {
            return false;
        }

        EdgeSubnet other = (EdgeSubnet) o;
        return java.util.Objects.equals(this.cidr, other.cidr)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.region, other.region)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidr == null ? 43 : this.cidr.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
