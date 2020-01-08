/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for identity attributes.
 * <p>
 * Example:
 * <p>
 * -----
 *     {
 *       \"principalName\": \"ExampleName\",
 *       \"principalId\": \"ocid1.user.oc1..<unique_ID>\",
 *       \"authType\": \"natv\",
 *       \"callerName\": null,
 *       \"callerId\": null,
 *       \"tenantId\": \"ocid1.tenancy.oc1..<unique_ID>\",
 *       \"ipAddress\": \"172.24.80.88\",
 *       \"credentials\": null,
 *       \"userAgent\": \"Jersey/2.23 (HttpUrlConnection 1.8.0_212)\",
 *       \"consoleSessionId\": null
 *     }
 *   -----
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Identity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Identity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("principalName")
        private String principalName;

        public Builder principalName(String principalName) {
            this.principalName = principalName;
            this.__explicitlySet__.add("principalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        public Builder principalId(String principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authType")
        private String authType;

        public Builder authType(String authType) {
            this.authType = authType;
            this.__explicitlySet__.add("authType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("callerName")
        private String callerName;

        public Builder callerName(String callerName) {
            this.callerName = callerName;
            this.__explicitlySet__.add("callerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("callerId")
        private String callerId;

        public Builder callerId(String callerId) {
            this.callerId = callerId;
            this.__explicitlySet__.add("callerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private String credentials;

        public Builder credentials(String credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
        private String userAgent;

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            this.__explicitlySet__.add("userAgent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consoleSessionId")
        private String consoleSessionId;

        public Builder consoleSessionId(String consoleSessionId) {
            this.consoleSessionId = consoleSessionId;
            this.__explicitlySet__.add("consoleSessionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Identity build() {
            Identity __instance__ =
                    new Identity(
                            principalName,
                            principalId,
                            authType,
                            callerName,
                            callerId,
                            tenantId,
                            ipAddress,
                            credentials,
                            userAgent,
                            consoleSessionId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Identity o) {
            Builder copiedBuilder =
                    principalName(o.getPrincipalName())
                            .principalId(o.getPrincipalId())
                            .authType(o.getAuthType())
                            .callerName(o.getCallerName())
                            .callerId(o.getCallerId())
                            .tenantId(o.getTenantId())
                            .ipAddress(o.getIpAddress())
                            .credentials(o.getCredentials())
                            .userAgent(o.getUserAgent())
                            .consoleSessionId(o.getConsoleSessionId());

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

    /**
     * The name of the user or service. This value is the friendly name associated with `principalId`.
     * <p>
     * Example: `ExampleName`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalName")
    String principalName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the principal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    String principalId;

    /**
     * The type of authentication used.
     * <p>
     * Example: `natv`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    String authType;

    /**
     * The name of the user or service. This value is the friendly name associated with `callerId`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("callerName")
    String callerName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the caller. The caller that made a
     * request on behalf of the prinicpal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("callerId")
    String callerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tenant.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The IP address of the source of the request.
     * <p>
     * Example: `172.24.80.88`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * The credential ID of the user. This value is extracted from the HTTP 'Authorization' request
     * header. It consists of the tenantId, userId, and user fingerprint, all delimited by a slash (/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    String credentials;

    /**
     * The user agent of the client that made the request.
     * <p>
     * Example: `Jersey/2.23 (HttpUrlConnection 1.8.0_212)`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    String userAgent;

    /**
     * This value identifies any Console session associated with this request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleSessionId")
    String consoleSessionId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
