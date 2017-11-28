/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for implementing session persistence. Session persistence enables the Load Balancing
 * Service to direct any number of requests that originate from a single logical client to a single backend web server.
 * For more information, see [Session Persistence](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Reference/sessionpersistence.htm).
 * <p>
 * To disable session persistence on a running load balancer, use the
 * {@link #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify \"null\" for the
 * `SessionPersistenceConfigurationDetails` object.
 * <p>
 * Example: `SessionPersistenceConfigurationDetails: null`
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SessionPersistenceConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SessionPersistenceConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
        private String cookieName;

        public Builder cookieName(String cookieName) {
            this.cookieName = cookieName;
            this.__explicitlySet__.add("cookieName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
        private Boolean disableFallback;

        public Builder disableFallback(Boolean disableFallback) {
            this.disableFallback = disableFallback;
            this.__explicitlySet__.add("disableFallback");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SessionPersistenceConfigurationDetails build() {
            SessionPersistenceConfigurationDetails __instance__ =
                    new SessionPersistenceConfigurationDetails(cookieName, disableFallback);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionPersistenceConfigurationDetails o) {
            Builder copiedBuilder =
                    cookieName(o.getCookieName()).disableFallback(o.getDisableFallback());

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
     * The name of the cookie used to detect a session initiated by the backend server. Use '*' to specify
     * that any cookie set by the backend causes the session to persist.
     * <p>
     * Example: `myCookieName`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
    String cookieName;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session client to
     * a different backend server if the original server is unavailable. Defaults to false.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
    Boolean disableFallback;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
