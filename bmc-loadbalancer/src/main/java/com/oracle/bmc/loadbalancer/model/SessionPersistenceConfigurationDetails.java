/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * The configuration details for implementing session persistence. Session persistence enables the Load Balancing
 * Service to direct any number of requests that originate from a single logical client to a single backend web server.
 * <p>
 * For more information on session persistence, see [Session Persistence](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Reference/sessionpersistence.htm).
 * <p>
 * To disable session persistence on a running load balancer, use the
 * {@link #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify \"null\" for the
 * `SessionPersistenceConfigurationDetails` object.
 * <p>
 * Example: `SessionPersistenceConfigurationDetails: null`
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = SessionPersistenceConfigurationDetails.Builder.class)
public class SessionPersistenceConfigurationDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("cookieName")
        private String cookieName;

        @JsonProperty("disableFallback")
        private Boolean disableFallback;

        public SessionPersistenceConfigurationDetails build() {
            return new SessionPersistenceConfigurationDetails(cookieName, disableFallback);
        }

        @JsonIgnore
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
    @JsonProperty("cookieName")
    @Valid
    @NotNull
    String cookieName;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session client to
     * a different backend server if the original server is unavailable. Defaults to false.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("disableFallback")
    Boolean disableFallback;
}
