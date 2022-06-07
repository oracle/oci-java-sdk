/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A record to add to a zone in replacement of contents that cannot be migrated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MigrationReplacement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MigrationReplacement {
    @Deprecated
    @java.beans.ConstructorProperties({"rtype", "substituteRtype", "ttl", "rdata"})
    public MigrationReplacement(String rtype, String substituteRtype, Integer ttl, String rdata) {
        super();
        this.rtype = rtype;
        this.substituteRtype = substituteRtype;
        this.ttl = ttl;
        this.rdata = rdata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("substituteRtype")
        private String substituteRtype;

        public Builder substituteRtype(String substituteRtype) {
            this.substituteRtype = substituteRtype;
            this.__explicitlySet__.add("substituteRtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationReplacement build() {
            MigrationReplacement __instance__ =
                    new MigrationReplacement(rtype, substituteRtype, ttl, rdata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationReplacement o) {
            Builder copiedBuilder =
                    rtype(o.getRtype())
                            .substituteRtype(o.getSubstituteRtype())
                            .ttl(o.getTtl())
                            .rdata(o.getRdata());

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
     * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    private final String rtype;

    public String getRtype() {
        return rtype;
    }

    /**
     * The canonical name for a substitute type of the replacement record to be used if the specified {@code rtype} is not allowed at the domain. The specified {@code ttl} and {@code rdata} will still apply with the substitute type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("substituteRtype")
    private final String substituteRtype;

    public String getSubstituteRtype() {
        return substituteRtype;
    }

    /**
     * The Time To Live of the replacement record, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    public Integer getTtl() {
        return ttl;
    }

    /**
     * The record data of the replacement record, as whitespace-delimited tokens in
     * type-specific presentation format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    public String getRdata() {
        return rdata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MigrationReplacement(");
        sb.append("rtype=").append(String.valueOf(this.rtype));
        sb.append(", substituteRtype=").append(String.valueOf(this.substituteRtype));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append(", rdata=").append(String.valueOf(this.rdata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationReplacement)) {
            return false;
        }

        MigrationReplacement other = (MigrationReplacement) o;
        return java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.substituteRtype, other.substituteRtype)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result =
                (result * PRIME)
                        + (this.substituteRtype == null ? 43 : this.substituteRtype.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
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
