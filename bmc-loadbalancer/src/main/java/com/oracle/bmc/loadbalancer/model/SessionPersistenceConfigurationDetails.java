/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for implementing session persistence based on a user-specified cookie name (application
 * cookie stickiness).
 * <p>
 * Session persistence enables the Load Balancing service to direct any number of requests that originate from a single
 * logical client to a single backend web server. For more information, see
 * [Session Persistence](https://docs.cloud.oracle.com/Content/Balance/Reference/sessionpersistence.htm).
 * <p>
 * With application cookie stickiness, the load balancer enables session persistence only when the response from a backend
 * application server includes a `Set-cookie` header with the user-specified cookie name.
 * <p>
 * To disable application cookie stickiness on a running load balancer, use the
 * {@link #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify `null` for the
 * `SessionPersistenceConfigurationDetails` object.
 * <p>
 * Example: `SessionPersistenceConfigurationDetails: null`
 * <p>
 **Note:** `SessionPersistenceConfigurationDetails` (application cookie stickiness) and `LBCookieSessionPersistenceConfigurationDetails`
 * (LB cookie stickiness) are mutually exclusive. An error results if you try to enable both types of session persistence.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
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
     * Example: `example_cookie`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
    String cookieName;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session client to
     * a different backend server if the original server is unavailable. Defaults to false.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
    Boolean disableFallback;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
