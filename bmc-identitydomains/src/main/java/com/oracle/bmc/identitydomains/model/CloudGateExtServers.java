/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list of Server Blocks on this Cloud Gate
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloudGateExtServers.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudGateExtServers extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serverId", "hostName", "port", "ssl", "nginxSettings"})
    public CloudGateExtServers(
            String serverId, String hostName, Integer port, Boolean ssl, String nginxSettings) {
        super();
        this.serverId = serverId;
        this.hostName = hostName;
        this.port = port;
        this.ssl = ssl;
        this.nginxSettings = nginxSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Server Name for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serverId")
        private String serverId;

        /**
         * Server Name for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param serverId the value to set
         * @return this builder
         **/
        public Builder serverId(String serverId) {
            this.serverId = serverId;
            this.__explicitlySet__.add("serverId");
            return this;
        }
        /**
         * Hostname for the Server block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Hostname for the Server block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Port for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * SSL flag for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ssl")
        private Boolean ssl;

        /**
         * SSL flag for the Server Block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param ssl the value to set
         * @return this builder
         **/
        public Builder ssl(Boolean ssl) {
            this.ssl = ssl;
            this.__explicitlySet__.add("ssl");
            return this;
        }
        /**
         * More nginx Settings. JSON encoded text block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
        private String nginxSettings;

        /**
         * More nginx Settings. JSON encoded text block
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param nginxSettings the value to set
         * @return this builder
         **/
        public Builder nginxSettings(String nginxSettings) {
            this.nginxSettings = nginxSettings;
            this.__explicitlySet__.add("nginxSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudGateExtServers build() {
            CloudGateExtServers model =
                    new CloudGateExtServers(
                            this.serverId, this.hostName, this.port, this.ssl, this.nginxSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudGateExtServers model) {
            if (model.wasPropertyExplicitlySet("serverId")) {
                this.serverId(model.getServerId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("ssl")) {
                this.ssl(model.getSsl());
            }
            if (model.wasPropertyExplicitlySet("nginxSettings")) {
                this.nginxSettings(model.getNginxSettings());
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
     * Server Name for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverId")
    private final String serverId;

    /**
     * Server Name for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getServerId() {
        return serverId;
    }

    /**
     * Hostname for the Server block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Hostname for the Server block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Port for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * SSL flag for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ssl")
    private final Boolean ssl;

    /**
     * SSL flag for the Server Block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getSsl() {
        return ssl;
    }

    /**
     * More nginx Settings. JSON encoded text block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nginxSettings")
    private final String nginxSettings;

    /**
     * More nginx Settings. JSON encoded text block
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getNginxSettings() {
        return nginxSettings;
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
        sb.append("CloudGateExtServers(");
        sb.append("super=").append(super.toString());
        sb.append("serverId=").append(String.valueOf(this.serverId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", ssl=").append(String.valueOf(this.ssl));
        sb.append(", nginxSettings=").append(String.valueOf(this.nginxSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudGateExtServers)) {
            return false;
        }

        CloudGateExtServers other = (CloudGateExtServers) o;
        return java.util.Objects.equals(this.serverId, other.serverId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.ssl, other.ssl)
                && java.util.Objects.equals(this.nginxSettings, other.nginxSettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serverId == null ? 43 : this.serverId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.ssl == null ? 43 : this.ssl.hashCode());
        result =
                (result * PRIME)
                        + (this.nginxSettings == null ? 43 : this.nginxSettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
