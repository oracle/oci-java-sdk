/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Request configuration details for the DNS Server monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DnsServerMonitorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DnsServerMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /**
         * DNS record type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordType")
        private DnsRecordType recordType;

        /**
         * DNS record type.
         * @param recordType the value to set
         * @return this builder
         **/
        public Builder recordType(DnsRecordType recordType) {
            this.recordType = recordType;
            this.__explicitlySet__.add("recordType");
            return this;
        }
        /**
         * Name of the server that will be used to perform DNS lookup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nameServer")
        private String nameServer;

        /**
         * Name of the server that will be used to perform DNS lookup.
         * @param nameServer the value to set
         * @return this builder
         **/
        public Builder nameServer(String nameServer) {
            this.nameServer = nameServer;
            this.__explicitlySet__.add("nameServer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }
        /**
         * Type of protocol.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private DnsTransportProtocol protocol;

        /**
         * Type of protocol.
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(DnsTransportProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
        private String verifyResponseContent;

        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         * @param verifyResponseContent the value to set
         * @return this builder
         **/
        public Builder verifyResponseContent(String verifyResponseContent) {
            this.verifyResponseContent = verifyResponseContent;
            this.__explicitlySet__.add("verifyResponseContent");
            return this;
        }
        /**
         * If isQueryRecursive is enabled, then queries will be sent recursively to the target server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isQueryRecursive")
        private Boolean isQueryRecursive;

        /**
         * If isQueryRecursive is enabled, then queries will be sent recursively to the target server.
         * @param isQueryRecursive the value to set
         * @return this builder
         **/
        public Builder isQueryRecursive(Boolean isQueryRecursive) {
            this.isQueryRecursive = isQueryRecursive;
            this.__explicitlySet__.add("isQueryRecursive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DnsServerMonitorConfiguration build() {
            DnsServerMonitorConfiguration model =
                    new DnsServerMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.recordType,
                            this.nameServer,
                            this.networkConfiguration,
                            this.protocol,
                            this.verifyResponseContent,
                            this.isQueryRecursive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DnsServerMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("recordType")) {
                this.recordType(model.getRecordType());
            }
            if (model.wasPropertyExplicitlySet("nameServer")) {
                this.nameServer(model.getNameServer());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseContent")) {
                this.verifyResponseContent(model.getVerifyResponseContent());
            }
            if (model.wasPropertyExplicitlySet("isQueryRecursive")) {
                this.isQueryRecursive(model.getIsQueryRecursive());
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
    public DnsServerMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            DnsRecordType recordType,
            String nameServer,
            NetworkConfiguration networkConfiguration,
            DnsTransportProtocol protocol,
            String verifyResponseContent,
            Boolean isQueryRecursive) {
        super(isFailureRetried, dnsConfiguration);
        this.recordType = recordType;
        this.nameServer = nameServer;
        this.networkConfiguration = networkConfiguration;
        this.protocol = protocol;
        this.verifyResponseContent = verifyResponseContent;
        this.isQueryRecursive = isQueryRecursive;
    }

    /**
     * DNS record type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordType")
    private final DnsRecordType recordType;

    /**
     * DNS record type.
     * @return the value
     **/
    public DnsRecordType getRecordType() {
        return recordType;
    }

    /**
     * Name of the server that will be used to perform DNS lookup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameServer")
    private final String nameServer;

    /**
     * Name of the server that will be used to perform DNS lookup.
     * @return the value
     **/
    public String getNameServer() {
        return nameServer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * Type of protocol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final DnsTransportProtocol protocol;

    /**
     * Type of protocol.
     * @return the value
     **/
    public DnsTransportProtocol getProtocol() {
        return protocol;
    }

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
    private final String verifyResponseContent;

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     * @return the value
     **/
    public String getVerifyResponseContent() {
        return verifyResponseContent;
    }

    /**
     * If isQueryRecursive is enabled, then queries will be sent recursively to the target server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQueryRecursive")
    private final Boolean isQueryRecursive;

    /**
     * If isQueryRecursive is enabled, then queries will be sent recursively to the target server.
     * @return the value
     **/
    public Boolean getIsQueryRecursive() {
        return isQueryRecursive;
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
        sb.append("DnsServerMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recordType=").append(String.valueOf(this.recordType));
        sb.append(", nameServer=").append(String.valueOf(this.nameServer));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", verifyResponseContent=").append(String.valueOf(this.verifyResponseContent));
        sb.append(", isQueryRecursive=").append(String.valueOf(this.isQueryRecursive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DnsServerMonitorConfiguration)) {
            return false;
        }

        DnsServerMonitorConfiguration other = (DnsServerMonitorConfiguration) o;
        return java.util.Objects.equals(this.recordType, other.recordType)
                && java.util.Objects.equals(this.nameServer, other.nameServer)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.verifyResponseContent, other.verifyResponseContent)
                && java.util.Objects.equals(this.isQueryRecursive, other.isQueryRecursive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.recordType == null ? 43 : this.recordType.hashCode());
        result = (result * PRIME) + (this.nameServer == null ? 43 : this.nameServer.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseContent == null
                                ? 43
                                : this.verifyResponseContent.hashCode());
        result =
                (result * PRIME)
                        + (this.isQueryRecursive == null ? 43 : this.isQueryRecursive.hashCode());
        return result;
    }
}
