/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Dns settings.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DnsConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DnsConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isOverrideDns", "overrideDnsIp"})
    public DnsConfiguration(Boolean isOverrideDns, String overrideDnsIp) {
        super();
        this.isOverrideDns = isOverrideDns;
        this.overrideDnsIp = overrideDnsIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If isOverrideDns is true, then dns will be overridden.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideDns")
        private Boolean isOverrideDns;

        /**
         * If isOverrideDns is true, then dns will be overridden.
         * @param isOverrideDns the value to set
         * @return this builder
         **/
        public Builder isOverrideDns(Boolean isOverrideDns) {
            this.isOverrideDns = isOverrideDns;
            this.__explicitlySet__.add("isOverrideDns");
            return this;
        }
        /**
         * Override dns ip value. This value will be honored only if *ref-isOverrideDns is set to true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overrideDnsIp")
        private String overrideDnsIp;

        /**
         * Override dns ip value. This value will be honored only if *ref-isOverrideDns is set to true.
         * @param overrideDnsIp the value to set
         * @return this builder
         **/
        public Builder overrideDnsIp(String overrideDnsIp) {
            this.overrideDnsIp = overrideDnsIp;
            this.__explicitlySet__.add("overrideDnsIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DnsConfiguration build() {
            DnsConfiguration model = new DnsConfiguration(this.isOverrideDns, this.overrideDnsIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DnsConfiguration model) {
            if (model.wasPropertyExplicitlySet("isOverrideDns")) {
                this.isOverrideDns(model.getIsOverrideDns());
            }
            if (model.wasPropertyExplicitlySet("overrideDnsIp")) {
                this.overrideDnsIp(model.getOverrideDnsIp());
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
     * If isOverrideDns is true, then dns will be overridden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideDns")
    private final Boolean isOverrideDns;

    /**
     * If isOverrideDns is true, then dns will be overridden.
     * @return the value
     **/
    public Boolean getIsOverrideDns() {
        return isOverrideDns;
    }

    /**
     * Override dns ip value. This value will be honored only if *ref-isOverrideDns is set to true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overrideDnsIp")
    private final String overrideDnsIp;

    /**
     * Override dns ip value. This value will be honored only if *ref-isOverrideDns is set to true.
     * @return the value
     **/
    public String getOverrideDnsIp() {
        return overrideDnsIp;
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
        sb.append("DnsConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isOverrideDns=").append(String.valueOf(this.isOverrideDns));
        sb.append(", overrideDnsIp=").append(String.valueOf(this.overrideDnsIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DnsConfiguration)) {
            return false;
        }

        DnsConfiguration other = (DnsConfiguration) o;
        return java.util.Objects.equals(this.isOverrideDns, other.isOverrideDns)
                && java.util.Objects.equals(this.overrideDnsIp, other.overrideDnsIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isOverrideDns == null ? 43 : this.isOverrideDns.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideDnsIp == null ? 43 : this.overrideDnsIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
