/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The configuration details for the restart WebLogic domain operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestartWlsDomainDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestartWlsDomainDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isForceServersShutdown"})
    public RestartWlsDomainDetails(Boolean isForceServersShutdown) {
        super();
        this.isForceServersShutdown = isForceServersShutdown;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Force shutdown of the servers if they have not shutdown after a period of time. The
         * timeout can be configured in the WebLogic domain configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceServersShutdown")
        private Boolean isForceServersShutdown;

        /**
         * Force shutdown of the servers if they have not shutdown after a period of time. The
         * timeout can be configured in the WebLogic domain configuration.
         *
         * @param isForceServersShutdown the value to set
         * @return this builder
         */
        public Builder isForceServersShutdown(Boolean isForceServersShutdown) {
            this.isForceServersShutdown = isForceServersShutdown;
            this.__explicitlySet__.add("isForceServersShutdown");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestartWlsDomainDetails build() {
            RestartWlsDomainDetails model =
                    new RestartWlsDomainDetails(this.isForceServersShutdown);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestartWlsDomainDetails model) {
            if (model.wasPropertyExplicitlySet("isForceServersShutdown")) {
                this.isForceServersShutdown(model.getIsForceServersShutdown());
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
     * Force shutdown of the servers if they have not shutdown after a period of time. The timeout
     * can be configured in the WebLogic domain configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceServersShutdown")
    private final Boolean isForceServersShutdown;

    /**
     * Force shutdown of the servers if they have not shutdown after a period of time. The timeout
     * can be configured in the WebLogic domain configuration.
     *
     * @return the value
     */
    public Boolean getIsForceServersShutdown() {
        return isForceServersShutdown;
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
        sb.append("RestartWlsDomainDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForceServersShutdown=").append(String.valueOf(this.isForceServersShutdown));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestartWlsDomainDetails)) {
            return false;
        }

        RestartWlsDomainDetails other = (RestartWlsDomainDetails) o;
        return java.util.Objects.equals(this.isForceServersShutdown, other.isForceServersShutdown)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isForceServersShutdown == null
                                ? 43
                                : this.isForceServersShutdown.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
