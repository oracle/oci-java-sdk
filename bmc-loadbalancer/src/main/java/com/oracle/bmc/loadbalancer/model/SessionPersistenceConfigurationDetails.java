/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for implementing session persistence based on a user-specified cookie
 * name (application cookie stickiness).
 *
 * <p>Session persistence enables the Load Balancing service to direct any number of requests that
 * originate from a single logical client to a single backend web server. For more information, see
 * [Session
 * Persistence](https://docs.cloud.oracle.com/Content/Balance/Reference/sessionpersistence.htm).
 *
 * <p>With application cookie stickiness, the load balancer enables session persistence only when
 * the response from a backend application server includes a {@code Set-cookie} header with the
 * user-specified cookie name.
 *
 * <p>To disable application cookie stickiness on a running load balancer, use the {@link
 * #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify {@code null}
 * for the {@code SessionPersistenceConfigurationDetails} object.
 *
 * <p>Example: {@code SessionPersistenceConfigurationDetails: null}
 *
 * <p>*Note:** {@code SessionPersistenceConfigurationDetails} (application cookie stickiness) and
 * {@code LBCookieSessionPersistenceConfigurationDetails} (LB cookie stickiness) are mutually
 * exclusive. An error results if you try to enable both types of session persistence.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SessionPersistenceConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SessionPersistenceConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cookieName", "disableFallback"})
    public SessionPersistenceConfigurationDetails(String cookieName, Boolean disableFallback) {
        super();
        this.cookieName = cookieName;
        this.disableFallback = disableFallback;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the cookie used to detect a session initiated by the backend server. Use '*'
         * to specify that any cookie set by the backend causes the session to persist.
         *
         * <p>Example: {@code example_cookie}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
        private String cookieName;

        /**
         * The name of the cookie used to detect a session initiated by the backend server. Use '*'
         * to specify that any cookie set by the backend causes the session to persist.
         *
         * <p>Example: {@code example_cookie}
         *
         * @param cookieName the value to set
         * @return this builder
         */
        public Builder cookieName(String cookieName) {
            this.cookieName = cookieName;
            this.__explicitlySet__.add("cookieName");
            return this;
        }
        /**
         * Whether the load balancer is prevented from directing traffic from a persistent session
         * client to a different backend server if the original server is unavailable. Defaults to
         * false.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
        private Boolean disableFallback;

        /**
         * Whether the load balancer is prevented from directing traffic from a persistent session
         * client to a different backend server if the original server is unavailable. Defaults to
         * false.
         *
         * <p>Example: {@code false}
         *
         * @param disableFallback the value to set
         * @return this builder
         */
        public Builder disableFallback(Boolean disableFallback) {
            this.disableFallback = disableFallback;
            this.__explicitlySet__.add("disableFallback");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SessionPersistenceConfigurationDetails build() {
            SessionPersistenceConfigurationDetails model =
                    new SessionPersistenceConfigurationDetails(
                            this.cookieName, this.disableFallback);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionPersistenceConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("cookieName")) {
                this.cookieName(model.getCookieName());
            }
            if (model.wasPropertyExplicitlySet("disableFallback")) {
                this.disableFallback(model.getDisableFallback());
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
     * The name of the cookie used to detect a session initiated by the backend server. Use '*' to
     * specify that any cookie set by the backend causes the session to persist.
     *
     * <p>Example: {@code example_cookie}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
    private final String cookieName;

    /**
     * The name of the cookie used to detect a session initiated by the backend server. Use '*' to
     * specify that any cookie set by the backend causes the session to persist.
     *
     * <p>Example: {@code example_cookie}
     *
     * @return the value
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session
     * client to a different backend server if the original server is unavailable. Defaults to
     * false.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
    private final Boolean disableFallback;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session
     * client to a different backend server if the original server is unavailable. Defaults to
     * false.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getDisableFallback() {
        return disableFallback;
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
        sb.append("SessionPersistenceConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cookieName=").append(String.valueOf(this.cookieName));
        sb.append(", disableFallback=").append(String.valueOf(this.disableFallback));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionPersistenceConfigurationDetails)) {
            return false;
        }

        SessionPersistenceConfigurationDetails other = (SessionPersistenceConfigurationDetails) o;
        return java.util.Objects.equals(this.cookieName, other.cookieName)
                && java.util.Objects.equals(this.disableFallback, other.disableFallback)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cookieName == null ? 43 : this.cookieName.hashCode());
        result =
                (result * PRIME)
                        + (this.disableFallback == null ? 43 : this.disableFallback.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
