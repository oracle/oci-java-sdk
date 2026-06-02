/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * DNS record for vanity domain
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VanityDnsRecord.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VanityDnsRecord extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domain", "rdata", "type", "ttlInSeconds"})
    public VanityDnsRecord(String domain, String rdata, String type, Integer ttlInSeconds) {
        super();
        this.domain = domain;
        this.rdata = rdata;
        this.type = type;
        this.ttlInSeconds = ttlInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * domain name for dns record
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * domain name for dns record
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * dns server hostname is pointed to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        /**
         * dns server hostname is pointed to
         * @param rdata the value to set
         * @return this builder
         **/
        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }
        /**
         * record data for record type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * record data for record type
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * time to live for dns record
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttlInSeconds")
        private Integer ttlInSeconds;

        /**
         * time to live for dns record
         * @param ttlInSeconds the value to set
         * @return this builder
         **/
        public Builder ttlInSeconds(Integer ttlInSeconds) {
            this.ttlInSeconds = ttlInSeconds;
            this.__explicitlySet__.add("ttlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanityDnsRecord build() {
            VanityDnsRecord model =
                    new VanityDnsRecord(this.domain, this.rdata, this.type, this.ttlInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityDnsRecord model) {
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("rdata")) {
                this.rdata(model.getRdata());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("ttlInSeconds")) {
                this.ttlInSeconds(model.getTtlInSeconds());
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
     * domain name for dns record
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * domain name for dns record
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * dns server hostname is pointed to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    /**
     * dns server hostname is pointed to
     * @return the value
     **/
    public String getRdata() {
        return rdata;
    }

    /**
     * record data for record type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * record data for record type
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * time to live for dns record
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttlInSeconds")
    private final Integer ttlInSeconds;

    /**
     * time to live for dns record
     * @return the value
     **/
    public Integer getTtlInSeconds() {
        return ttlInSeconds;
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
        sb.append("VanityDnsRecord(");
        sb.append("super=").append(super.toString());
        sb.append("domain=").append(String.valueOf(this.domain));
        sb.append(", rdata=").append(String.valueOf(this.rdata));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", ttlInSeconds=").append(String.valueOf(this.ttlInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VanityDnsRecord)) {
            return false;
        }

        VanityDnsRecord other = (VanityDnsRecord) o;
        return java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.ttlInSeconds, other.ttlInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.ttlInSeconds == null ? 43 : this.ttlInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
