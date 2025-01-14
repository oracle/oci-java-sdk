/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Session Configuration on AgentEndpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SessionConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SessionConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"idleTimeoutInSeconds"})
    public SessionConfig(Integer idleTimeoutInSeconds) {
        super();
        this.idleTimeoutInSeconds = idleTimeoutInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The session will become inactive after this timeout. */
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInSeconds")
        private Integer idleTimeoutInSeconds;

        /**
         * The session will become inactive after this timeout.
         *
         * @param idleTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder idleTimeoutInSeconds(Integer idleTimeoutInSeconds) {
            this.idleTimeoutInSeconds = idleTimeoutInSeconds;
            this.__explicitlySet__.add("idleTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SessionConfig build() {
            SessionConfig model = new SessionConfig(this.idleTimeoutInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionConfig model) {
            if (model.wasPropertyExplicitlySet("idleTimeoutInSeconds")) {
                this.idleTimeoutInSeconds(model.getIdleTimeoutInSeconds());
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

    /** The session will become inactive after this timeout. */
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInSeconds")
    private final Integer idleTimeoutInSeconds;

    /**
     * The session will become inactive after this timeout.
     *
     * @return the value
     */
    public Integer getIdleTimeoutInSeconds() {
        return idleTimeoutInSeconds;
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
        sb.append("SessionConfig(");
        sb.append("super=").append(super.toString());
        sb.append("idleTimeoutInSeconds=").append(String.valueOf(this.idleTimeoutInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionConfig)) {
            return false;
        }

        SessionConfig other = (SessionConfig) o;
        return java.util.Objects.equals(this.idleTimeoutInSeconds, other.idleTimeoutInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.idleTimeoutInSeconds == null
                                ? 43
                                : this.idleTimeoutInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
