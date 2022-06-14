/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * References to the sections of STIG, CIS, and/or GDPR relevant to the current finding.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = References.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class References {
    @Deprecated
    @java.beans.ConstructorProperties({"stig", "cis", "gdpr"})
    public References(String stig, String cis, String gdpr) {
        super();
        this.stig = stig;
        this.cis = cis;
        this.gdpr = gdpr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Relevant section from STIG.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stig")
        private String stig;

        /**
         * Relevant section from STIG.
         * @param stig the value to set
         * @return this builder
         **/
        public Builder stig(String stig) {
            this.stig = stig;
            this.__explicitlySet__.add("stig");
            return this;
        }
        /**
         * Relevant section from CIS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cis")
        private String cis;

        /**
         * Relevant section from CIS.
         * @param cis the value to set
         * @return this builder
         **/
        public Builder cis(String cis) {
            this.cis = cis;
            this.__explicitlySet__.add("cis");
            return this;
        }
        /**
         * Relevant section from GDPR.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
        private String gdpr;

        /**
         * Relevant section from GDPR.
         * @param gdpr the value to set
         * @return this builder
         **/
        public Builder gdpr(String gdpr) {
            this.gdpr = gdpr;
            this.__explicitlySet__.add("gdpr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public References build() {
            References __instance__ = new References(stig, cis, gdpr);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(References o) {
            Builder copiedBuilder = stig(o.getStig()).cis(o.getCis()).gdpr(o.getGdpr());

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

    /**
     * Relevant section from STIG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stig")
    private final String stig;

    /**
     * Relevant section from STIG.
     * @return the value
     **/
    public String getStig() {
        return stig;
    }

    /**
     * Relevant section from CIS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cis")
    private final String cis;

    /**
     * Relevant section from CIS.
     * @return the value
     **/
    public String getCis() {
        return cis;
    }

    /**
     * Relevant section from GDPR.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
    private final String gdpr;

    /**
     * Relevant section from GDPR.
     * @return the value
     **/
    public String getGdpr() {
        return gdpr;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("References(");
        sb.append("stig=").append(String.valueOf(this.stig));
        sb.append(", cis=").append(String.valueOf(this.cis));
        sb.append(", gdpr=").append(String.valueOf(this.gdpr));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof References)) {
            return false;
        }

        References other = (References) o;
        return java.util.Objects.equals(this.stig, other.stig)
                && java.util.Objects.equals(this.cis, other.cis)
                && java.util.Objects.equals(this.gdpr, other.gdpr)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stig == null ? 43 : this.stig.hashCode());
        result = (result * PRIME) + (this.cis == null ? 43 : this.cis.hashCode());
        result = (result * PRIME) + (this.gdpr == null ? 43 : this.gdpr.hashCode());
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
