/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Optional object to specify a particular ICMP type and code. If you specify ICMP as the protocol
 * but do not provide this object, then all ICMP types and codes are allowed. If you do provide
 * this object, the type is required and the code is optional.
 * See [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml)
 * for allowed values. To enable MTU negotiation for ingress internet traffic, make sure to allow
 * type 3 (\"Destination Unreachable\") code 4 (\"Fragmentation Needed and Don't Fragment was Set\").
 * If you need to specify multiple codes for a single type, create a separate security list rule for each.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IcmpOptions.Builder.class)
public class IcmpOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Integer type;

        public IcmpOptions build() {
            return new IcmpOptions(code, type);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IcmpOptions o) {
            return code(o.getCode()).type(o.getType());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The ICMP code (optional).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    @javax.validation.constraints.Min(0)
    @javax.validation.constraints.Max(16)
    Integer code;

    /**
     * The ICMP type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Min(0)
    @javax.validation.constraints.Max(254)
    Integer type;
}
