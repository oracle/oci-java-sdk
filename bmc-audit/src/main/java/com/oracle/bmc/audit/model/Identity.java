/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for identity attributes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Identity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Identity extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "principalName",
        "principalId",
        "authType",
        "callerName",
        "callerId",
        "tenantId",
        "ipAddress",
        "credentials",
        "userAgent",
        "consoleSessionId"
    })
    public Identity(
            String principalName,
            String principalId,
            String authType,
            String callerName,
            String callerId,
            String tenantId,
            String ipAddress,
            String credentials,
            String userAgent,
            String consoleSessionId) {
        super();
        this.principalName = principalName;
        this.principalId = principalId;
        this.authType = authType;
        this.callerName = callerName;
        this.callerId = callerId;
        this.tenantId = tenantId;
        this.ipAddress = ipAddress;
        this.credentials = credentials;
        this.userAgent = userAgent;
        this.consoleSessionId = consoleSessionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the user or service. This value is the friendly name associated with {@code principalId}.
         * <p>
         * Example: {@code ExampleName}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalName")
        private String principalName;

        /**
         * The name of the user or service. This value is the friendly name associated with {@code principalId}.
         * <p>
         * Example: {@code ExampleName}
         *
         * @param principalName the value to set
         * @return this builder
         **/
        public Builder principalName(String principalName) {
            this.principalName = principalName;
            this.__explicitlySet__.add("principalName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the principal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the principal.
         *
         * @param principalId the value to set
         * @return this builder
         **/
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }
        /**
         * The type of authentication used.
         * <p>
         * Example: {@code natv}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authType")
        private String authType;

        /**
         * The type of authentication used.
         * <p>
         * Example: {@code natv}
         *
         * @param authType the value to set
         * @return this builder
         **/
        public Builder authType(String authType) {
            this.authType = authType;
            this.__explicitlySet__.add("authType");
            return this;
        }
        /**
         * The name of the user or service. This value is the friendly name associated with {@code callerId}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("callerName")
        private String callerName;

        /**
         * The name of the user or service. This value is the friendly name associated with {@code callerId}.
         *
         * @param callerName the value to set
         * @return this builder
         **/
        public Builder callerName(String callerName) {
            this.callerName = callerName;
            this.__explicitlySet__.add("callerName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the caller. The caller that made a
         * request on behalf of the prinicpal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("callerId")
        private String callerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the caller. The caller that made a
         * request on behalf of the prinicpal.
         *
         * @param callerId the value to set
         * @return this builder
         **/
        public Builder callerId(String callerId) {
            this.callerId = callerId;
            this.__explicitlySet__.add("callerId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant.
         *
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The IP address of the source of the request.
         * <p>
         * Example: {@code 172.24.80.88}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the source of the request.
         * <p>
         * Example: {@code 172.24.80.88}
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request
         * header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private String credentials;

        /**
         * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request
         * header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
         *
         * @param credentials the value to set
         * @return this builder
         **/
        public Builder credentials(String credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }
        /**
         * The user agent of the client that made the request.
         * <p>
         * Example: {@code Jersey/2.23 (HttpUrlConnection 1.8.0_212)}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
        private String userAgent;

        /**
         * The user agent of the client that made the request.
         * <p>
         * Example: {@code Jersey/2.23 (HttpUrlConnection 1.8.0_212)}
         *
         * @param userAgent the value to set
         * @return this builder
         **/
        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            this.__explicitlySet__.add("userAgent");
            return this;
        }
        /**
         * This value identifies any Console session associated with this request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consoleSessionId")
        private String consoleSessionId;

        /**
         * This value identifies any Console session associated with this request.
         *
         * @param consoleSessionId the value to set
         * @return this builder
         **/
        public Builder consoleSessionId(String consoleSessionId) {
            this.consoleSessionId = consoleSessionId;
            this.__explicitlySet__.add("consoleSessionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Identity build() {
            Identity model =
                    new Identity(
                            this.principalName,
                            this.principalId,
                            this.authType,
                            this.callerName,
                            this.callerId,
                            this.tenantId,
                            this.ipAddress,
                            this.credentials,
                            this.userAgent,
                            this.consoleSessionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Identity model) {
            if (model.wasPropertyExplicitlySet("principalName")) {
                this.principalName(model.getPrincipalName());
            }
            if (model.wasPropertyExplicitlySet("principalId")) {
                this.principalId(model.getPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("authType")) {
                this.authType(model.getAuthType());
            }
            if (model.wasPropertyExplicitlySet("callerName")) {
                this.callerName(model.getCallerName());
            }
            if (model.wasPropertyExplicitlySet("callerId")) {
                this.callerId(model.getCallerId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("userAgent")) {
                this.userAgent(model.getUserAgent());
            }
            if (model.wasPropertyExplicitlySet("consoleSessionId")) {
                this.consoleSessionId(model.getConsoleSessionId());
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
     * The name of the user or service. This value is the friendly name associated with {@code principalId}.
     * <p>
     * Example: {@code ExampleName}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalName")
    private final String principalName;

    /**
     * The name of the user or service. This value is the friendly name associated with {@code principalId}.
     * <p>
     * Example: {@code ExampleName}
     *
     * @return the value
     **/
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the principal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    private final String principalId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the principal.
     *
     * @return the value
     **/
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * The type of authentication used.
     * <p>
     * Example: {@code natv}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    private final String authType;

    /**
     * The type of authentication used.
     * <p>
     * Example: {@code natv}
     *
     * @return the value
     **/
    public String getAuthType() {
        return authType;
    }

    /**
     * The name of the user or service. This value is the friendly name associated with {@code callerId}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("callerName")
    private final String callerName;

    /**
     * The name of the user or service. This value is the friendly name associated with {@code callerId}.
     *
     * @return the value
     **/
    public String getCallerName() {
        return callerName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the caller. The caller that made a
     * request on behalf of the prinicpal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("callerId")
    private final String callerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the caller. The caller that made a
     * request on behalf of the prinicpal.
     *
     * @return the value
     **/
    public String getCallerId() {
        return callerId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant.
     *
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The IP address of the source of the request.
     * <p>
     * Example: {@code 172.24.80.88}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the source of the request.
     * <p>
     * Example: {@code 172.24.80.88}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request
     * header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final String credentials;

    /**
     * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request
     * header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
     *
     * @return the value
     **/
    public String getCredentials() {
        return credentials;
    }

    /**
     * The user agent of the client that made the request.
     * <p>
     * Example: {@code Jersey/2.23 (HttpUrlConnection 1.8.0_212)}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    private final String userAgent;

    /**
     * The user agent of the client that made the request.
     * <p>
     * Example: {@code Jersey/2.23 (HttpUrlConnection 1.8.0_212)}
     *
     * @return the value
     **/
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This value identifies any Console session associated with this request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleSessionId")
    private final String consoleSessionId;

    /**
     * This value identifies any Console session associated with this request.
     *
     * @return the value
     **/
    public String getConsoleSessionId() {
        return consoleSessionId;
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
        sb.append("Identity(");
        sb.append("super=").append(super.toString());
        sb.append("principalName=").append(String.valueOf(this.principalName));
        sb.append(", principalId=").append(String.valueOf(this.principalId));
        sb.append(", authType=").append(String.valueOf(this.authType));
        sb.append(", callerName=").append(String.valueOf(this.callerName));
        sb.append(", callerId=").append(String.valueOf(this.callerId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", userAgent=").append(String.valueOf(this.userAgent));
        sb.append(", consoleSessionId=").append(String.valueOf(this.consoleSessionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Identity)) {
            return false;
        }

        Identity other = (Identity) o;
        return java.util.Objects.equals(this.principalName, other.principalName)
                && java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.authType, other.authType)
                && java.util.Objects.equals(this.callerName, other.callerName)
                && java.util.Objects.equals(this.callerId, other.callerId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.userAgent, other.userAgent)
                && java.util.Objects.equals(this.consoleSessionId, other.consoleSessionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.principalName == null ? 43 : this.principalName.hashCode());
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result = (result * PRIME) + (this.authType == null ? 43 : this.authType.hashCode());
        result = (result * PRIME) + (this.callerName == null ? 43 : this.callerName.hashCode());
        result = (result * PRIME) + (this.callerId == null ? 43 : this.callerId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.userAgent == null ? 43 : this.userAgent.hashCode());
        result =
                (result * PRIME)
                        + (this.consoleSessionId == null ? 43 : this.consoleSessionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
