/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Current state of management appliance connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementApplianceConnectionStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementApplianceConnectionStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "state", "details"})
    public ManagementApplianceConnectionStatus(
            ManagementApplianceHeartbeatConnectionType type,
            ManagementApplianceConnectionState state,
            String details) {
        super();
        this.type = type;
        this.state = state;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ManagementApplianceHeartbeatConnectionType type;

        /**
         * Type of connection.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(ManagementApplianceHeartbeatConnectionType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Current connection status. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private ManagementApplianceConnectionState state;

        /**
         * Current connection status.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(ManagementApplianceConnectionState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** Information about current connection status. */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * Information about current connection status.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementApplianceConnectionStatus build() {
            ManagementApplianceConnectionStatus model =
                    new ManagementApplianceConnectionStatus(this.type, this.state, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementApplianceConnectionStatus model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Type of connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ManagementApplianceHeartbeatConnectionType type;

    /**
     * Type of connection.
     *
     * @return the value
     */
    public ManagementApplianceHeartbeatConnectionType getType() {
        return type;
    }

    /** Current connection status. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final ManagementApplianceConnectionState state;

    /**
     * Current connection status.
     *
     * @return the value
     */
    public ManagementApplianceConnectionState getState() {
        return state;
    }

    /** Information about current connection status. */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * Information about current connection status.
     *
     * @return the value
     */
    public String getDetails() {
        return details;
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
        sb.append("ManagementApplianceConnectionStatus(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementApplianceConnectionStatus)) {
            return false;
        }

        ManagementApplianceConnectionStatus other = (ManagementApplianceConnectionStatus) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
