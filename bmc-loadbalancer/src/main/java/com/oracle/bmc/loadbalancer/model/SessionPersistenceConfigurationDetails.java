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
public class SessionPersistenceConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
        private String cookieName;

        @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
        private Boolean disableFallback;

        public SessionPersistenceConfigurationDetails build() {
            return new SessionPersistenceConfigurationDetails(cookieName, disableFallback);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionPersistenceConfigurationDetails o) {
            return cookieName(o.getCookieName()).disableFallback(o.getDisableFallback());
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 4096)
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
}
