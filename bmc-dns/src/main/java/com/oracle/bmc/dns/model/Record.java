/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A DNS resource record. For more information, see
 * [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Record.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Record extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "domain",
        "recordHash",
        "isProtected",
        "rdata",
        "rrsetVersion",
        "rtype",
        "ttl"
    })
    public Record(
            String domain,
            String recordHash,
            Boolean isProtected,
            String rdata,
            String rrsetVersion,
            String rtype,
            Integer ttl) {
        super();
        this.domain = domain;
        this.recordHash = recordHash;
        this.isProtected = isProtected;
        this.rdata = rdata;
        this.rrsetVersion = rrsetVersion;
        this.rtype = rtype;
        this.ttl = ttl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fully qualified domain name where the record can be located.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The fully qualified domain name where the record can be located.
         *
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * A unique identifier for the record within its zone.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
        private String recordHash;

        /**
         * A unique identifier for the record within its zone.
         *
         * @param recordHash the value to set
         * @return this builder
         **/
        public Builder recordHash(String recordHash) {
            this.recordHash = recordHash;
            this.__explicitlySet__.add("recordHash");
            return this;
        }
        /**
         * A Boolean flag indicating whether or not parts of the record
         * are unable to be explicitly managed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
        private Boolean isProtected;

        /**
         * A Boolean flag indicating whether or not parts of the record
         * are unable to be explicitly managed.
         *
         * @param isProtected the value to set
         * @return this builder
         **/
        public Builder isProtected(Boolean isProtected) {
            this.isProtected = isProtected;
            this.__explicitlySet__.add("isProtected");
            return this;
        }
        /**
         * The record's data, as whitespace-delimited tokens in
         * type-specific presentation format. All RDATA is normalized and the
         * returned presentation of your RDATA may differ from its initial input.
         * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        /**
         * The record's data, as whitespace-delimited tokens in
         * type-specific presentation format. All RDATA is normalized and the
         * returned presentation of your RDATA may differ from its initial input.
         * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
         *
         * @param rdata the value to set
         * @return this builder
         **/
        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }
        /**
         * The latest version of the record's zone in which its RRSet differs
         * from the preceding version.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
        private String rrsetVersion;

        /**
         * The latest version of the record's zone in which its RRSet differs
         * from the preceding version.
         *
         * @param rrsetVersion the value to set
         * @return this builder
         **/
        public Builder rrsetVersion(String rrsetVersion) {
            this.rrsetVersion = rrsetVersion;
            this.__explicitlySet__.add("rrsetVersion");
            return this;
        }
        /**
         * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        /**
         * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
         *
         * @param rtype the value to set
         * @return this builder
         **/
        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }
        /**
         * The Time To Live for the record, in seconds. Using a TTL lower than 30 seconds is not recommended.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        /**
         * The Time To Live for the record, in seconds. Using a TTL lower than 30 seconds is not recommended.
         *
         * @param ttl the value to set
         * @return this builder
         **/
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Record build() {
            Record model =
                    new Record(
                            this.domain,
                            this.recordHash,
                            this.isProtected,
                            this.rdata,
                            this.rrsetVersion,
                            this.rtype,
                            this.ttl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Record model) {
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("recordHash")) {
                this.recordHash(model.getRecordHash());
            }
            if (model.wasPropertyExplicitlySet("isProtected")) {
                this.isProtected(model.getIsProtected());
            }
            if (model.wasPropertyExplicitlySet("rdata")) {
                this.rdata(model.getRdata());
            }
            if (model.wasPropertyExplicitlySet("rrsetVersion")) {
                this.rrsetVersion(model.getRrsetVersion());
            }
            if (model.wasPropertyExplicitlySet("rtype")) {
                this.rtype(model.getRtype());
            }
            if (model.wasPropertyExplicitlySet("ttl")) {
                this.ttl(model.getTtl());
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
     * The fully qualified domain name where the record can be located.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The fully qualified domain name where the record can be located.
     *
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * A unique identifier for the record within its zone.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
    private final String recordHash;

    /**
     * A unique identifier for the record within its zone.
     *
     * @return the value
     **/
    public String getRecordHash() {
        return recordHash;
    }

    /**
     * A Boolean flag indicating whether or not parts of the record
     * are unable to be explicitly managed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
    private final Boolean isProtected;

    /**
     * A Boolean flag indicating whether or not parts of the record
     * are unable to be explicitly managed.
     *
     * @return the value
     **/
    public Boolean getIsProtected() {
        return isProtected;
    }

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     *
     * @return the value
     **/
    public String getRdata() {
        return rdata;
    }

    /**
     * The latest version of the record's zone in which its RRSet differs
     * from the preceding version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
    private final String rrsetVersion;

    /**
     * The latest version of the record's zone in which its RRSet differs
     * from the preceding version.
     *
     * @return the value
     **/
    public String getRrsetVersion() {
        return rrsetVersion;
    }

    /**
     * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    private final String rtype;

    /**
     * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     * @return the value
     **/
    public String getRtype() {
        return rtype;
    }

    /**
     * The Time To Live for the record, in seconds. Using a TTL lower than 30 seconds is not recommended.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    /**
     * The Time To Live for the record, in seconds. Using a TTL lower than 30 seconds is not recommended.
     *
     * @return the value
     **/
    public Integer getTtl() {
        return ttl;
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
        sb.append("Record(");
        sb.append("super=").append(super.toString());
        sb.append("domain=").append(String.valueOf(this.domain));
        sb.append(", recordHash=").append(String.valueOf(this.recordHash));
        sb.append(", isProtected=").append(String.valueOf(this.isProtected));
        sb.append(", rdata=").append(String.valueOf(this.rdata));
        sb.append(", rrsetVersion=").append(String.valueOf(this.rrsetVersion));
        sb.append(", rtype=").append(String.valueOf(this.rtype));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Record)) {
            return false;
        }

        Record other = (Record) o;
        return java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.recordHash, other.recordHash)
                && java.util.Objects.equals(this.isProtected, other.isProtected)
                && java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.rrsetVersion, other.rrsetVersion)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.recordHash == null ? 43 : this.recordHash.hashCode());
        result = (result * PRIME) + (this.isProtected == null ? 43 : this.isProtected.hashCode());
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
        result = (result * PRIME) + (this.rrsetVersion == null ? 43 : this.rrsetVersion.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
