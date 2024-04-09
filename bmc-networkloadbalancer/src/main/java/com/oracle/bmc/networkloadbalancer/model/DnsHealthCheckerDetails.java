/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * DNS healthcheck configurations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DnsHealthCheckerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DnsHealthCheckerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "transportProtocol",
        "domainName",
        "queryClass",
        "queryType",
        "rcodes"
    })
    public DnsHealthCheckerDetails(
            DnsHealthCheckTransportProtocols transportProtocol,
            String domainName,
            DnsHealthCheckQueryClasses queryClass,
            DnsHealthCheckQueryTypes queryType,
            java.util.List<DnsHealthCheckRCodes> rcodes) {
        super();
        this.transportProtocol = transportProtocol;
        this.domainName = domainName;
        this.queryClass = queryClass;
        this.queryType = queryType;
        this.rcodes = rcodes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DNS transport protocol; either UDP or TCP.
         *
         * <p>Example: {@code UDP}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportProtocol")
        private DnsHealthCheckTransportProtocols transportProtocol;

        /**
         * DNS transport protocol; either UDP or TCP.
         *
         * <p>Example: {@code UDP}
         *
         * @param transportProtocol the value to set
         * @return this builder
         */
        public Builder transportProtocol(DnsHealthCheckTransportProtocols transportProtocol) {
            this.transportProtocol = transportProtocol;
            this.__explicitlySet__.add("transportProtocol");
            return this;
        }
        /**
         * The absolute fully-qualified domain name to perform periodic DNS queries. If not
         * provided, an extra dot will be added at the end of a domain name during the query.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The absolute fully-qualified domain name to perform periodic DNS queries. If not
         * provided, an extra dot will be added at the end of a domain name during the query.
         *
         * @param domainName the value to set
         * @return this builder
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /**
         * The class the dns health check query to use; either IN or CH.
         *
         * <p>Example: {@code IN}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryClass")
        private DnsHealthCheckQueryClasses queryClass;

        /**
         * The class the dns health check query to use; either IN or CH.
         *
         * <p>Example: {@code IN}
         *
         * @param queryClass the value to set
         * @return this builder
         */
        public Builder queryClass(DnsHealthCheckQueryClasses queryClass) {
            this.queryClass = queryClass;
            this.__explicitlySet__.add("queryClass");
            return this;
        }
        /**
         * The type the dns health check query to use; A, AAAA, TXT.
         *
         * <p>Example: {@code A}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryType")
        private DnsHealthCheckQueryTypes queryType;

        /**
         * The type the dns health check query to use; A, AAAA, TXT.
         *
         * <p>Example: {@code A}
         *
         * @param queryType the value to set
         * @return this builder
         */
        public Builder queryType(DnsHealthCheckQueryTypes queryType) {
            this.queryType = queryType;
            this.__explicitlySet__.add("queryType");
            return this;
        }
        /**
         * An array that represents accepetable RCODE values for DNS query response. Example:
         * ["NOERROR", "NXDOMAIN"]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rcodes")
        private java.util.List<DnsHealthCheckRCodes> rcodes;

        /**
         * An array that represents accepetable RCODE values for DNS query response. Example:
         * ["NOERROR", "NXDOMAIN"]
         *
         * @param rcodes the value to set
         * @return this builder
         */
        public Builder rcodes(java.util.List<DnsHealthCheckRCodes> rcodes) {
            this.rcodes = rcodes;
            this.__explicitlySet__.add("rcodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DnsHealthCheckerDetails build() {
            DnsHealthCheckerDetails model =
                    new DnsHealthCheckerDetails(
                            this.transportProtocol,
                            this.domainName,
                            this.queryClass,
                            this.queryType,
                            this.rcodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DnsHealthCheckerDetails model) {
            if (model.wasPropertyExplicitlySet("transportProtocol")) {
                this.transportProtocol(model.getTransportProtocol());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("queryClass")) {
                this.queryClass(model.getQueryClass());
            }
            if (model.wasPropertyExplicitlySet("queryType")) {
                this.queryType(model.getQueryType());
            }
            if (model.wasPropertyExplicitlySet("rcodes")) {
                this.rcodes(model.getRcodes());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * DNS transport protocol; either UDP or TCP.
     *
     * <p>Example: {@code UDP}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportProtocol")
    private final DnsHealthCheckTransportProtocols transportProtocol;

    /**
     * DNS transport protocol; either UDP or TCP.
     *
     * <p>Example: {@code UDP}
     *
     * @return the value
     */
    public DnsHealthCheckTransportProtocols getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * The absolute fully-qualified domain name to perform periodic DNS queries. If not provided, an
     * extra dot will be added at the end of a domain name during the query.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The absolute fully-qualified domain name to perform periodic DNS queries. If not provided, an
     * extra dot will be added at the end of a domain name during the query.
     *
     * @return the value
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * The class the dns health check query to use; either IN or CH.
     *
     * <p>Example: {@code IN}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryClass")
    private final DnsHealthCheckQueryClasses queryClass;

    /**
     * The class the dns health check query to use; either IN or CH.
     *
     * <p>Example: {@code IN}
     *
     * @return the value
     */
    public DnsHealthCheckQueryClasses getQueryClass() {
        return queryClass;
    }

    /**
     * The type the dns health check query to use; A, AAAA, TXT.
     *
     * <p>Example: {@code A}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    private final DnsHealthCheckQueryTypes queryType;

    /**
     * The type the dns health check query to use; A, AAAA, TXT.
     *
     * <p>Example: {@code A}
     *
     * @return the value
     */
    public DnsHealthCheckQueryTypes getQueryType() {
        return queryType;
    }

    /**
     * An array that represents accepetable RCODE values for DNS query response. Example:
     * ["NOERROR", "NXDOMAIN"]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rcodes")
    private final java.util.List<DnsHealthCheckRCodes> rcodes;

    /**
     * An array that represents accepetable RCODE values for DNS query response. Example:
     * ["NOERROR", "NXDOMAIN"]
     *
     * @return the value
     */
    public java.util.List<DnsHealthCheckRCodes> getRcodes() {
        return rcodes;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DnsHealthCheckerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("transportProtocol=").append(String.valueOf(this.transportProtocol));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", queryClass=").append(String.valueOf(this.queryClass));
        sb.append(", queryType=").append(String.valueOf(this.queryType));
        sb.append(", rcodes=").append(String.valueOf(this.rcodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DnsHealthCheckerDetails)) {
            return false;
        }

        DnsHealthCheckerDetails other = (DnsHealthCheckerDetails) o;
        return java.util.Objects.equals(this.transportProtocol, other.transportProtocol)
                && java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.queryClass, other.queryClass)
                && java.util.Objects.equals(this.queryType, other.queryType)
                && java.util.Objects.equals(this.rcodes, other.rcodes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.transportProtocol == null ? 43 : this.transportProtocol.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.queryClass == null ? 43 : this.queryClass.hashCode());
        result = (result * PRIME) + (this.queryType == null ? 43 : this.queryType.hashCode());
        result = (result * PRIME) + (this.rcodes == null ? 43 : this.rcodes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
