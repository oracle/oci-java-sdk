/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides information about a connection to a desktop, including connect and disconnect time, and client properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DesktopConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DesktopConnection extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeConnected",
        "timeDisconnected",
        "nextAction",
        "lastAction",
        "clientType",
        "clientVersion",
        "clientPlatform"
    })
    public DesktopConnection(
            java.util.Date timeConnected,
            java.util.Date timeDisconnected,
            DesktopAction nextAction,
            DesktopAction lastAction,
            String clientType,
            String clientVersion,
            String clientPlatform) {
        super();
        this.timeConnected = timeConnected;
        this.timeDisconnected = timeDisconnected;
        this.nextAction = nextAction;
        this.lastAction = lastAction;
        this.clientType = clientType;
        this.clientVersion = clientVersion;
        this.clientPlatform = clientPlatform;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time when the last connection to a desktop started.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeConnected")
        private java.util.Date timeConnected;

        /**
         * The time when the last connection to a desktop started.
         * @param timeConnected the value to set
         * @return this builder
         **/
        public Builder timeConnected(java.util.Date timeConnected) {
            this.timeConnected = timeConnected;
            this.__explicitlySet__.add("timeConnected");
            return this;
        }
        /**
         * The time when the last connection to a desktop ended.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDisconnected")
        private java.util.Date timeDisconnected;

        /**
         * The time when the last connection to a desktop ended.
         * @param timeDisconnected the value to set
         * @return this builder
         **/
        public Builder timeDisconnected(java.util.Date timeDisconnected) {
            this.timeDisconnected = timeDisconnected;
            this.__explicitlySet__.add("timeDisconnected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextAction")
        private DesktopAction nextAction;

        public Builder nextAction(DesktopAction nextAction) {
            this.nextAction = nextAction;
            this.__explicitlySet__.add("nextAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
        private DesktopAction lastAction;

        public Builder lastAction(DesktopAction lastAction) {
            this.lastAction = lastAction;
            this.__explicitlySet__.add("lastAction");
            return this;
        }
        /**
         * The type of Secure Desktops client connected to a desktop.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientType")
        private String clientType;

        /**
         * The type of Secure Desktops client connected to a desktop.
         * @param clientType the value to set
         * @return this builder
         **/
        public Builder clientType(String clientType) {
            this.clientType = clientType;
            this.__explicitlySet__.add("clientType");
            return this;
        }
        /**
         * The version of the Secure Desktops client connected to a desktop, applicable only to the installed client type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientVersion")
        private String clientVersion;

        /**
         * The version of the Secure Desktops client connected to a desktop, applicable only to the installed client type.
         * @param clientVersion the value to set
         * @return this builder
         **/
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            this.__explicitlySet__.add("clientVersion");
            return this;
        }
        /**
         * The platform on which the Secure Desktops client runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientPlatform")
        private String clientPlatform;

        /**
         * The platform on which the Secure Desktops client runs.
         * @param clientPlatform the value to set
         * @return this builder
         **/
        public Builder clientPlatform(String clientPlatform) {
            this.clientPlatform = clientPlatform;
            this.__explicitlySet__.add("clientPlatform");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopConnection build() {
            DesktopConnection model =
                    new DesktopConnection(
                            this.timeConnected,
                            this.timeDisconnected,
                            this.nextAction,
                            this.lastAction,
                            this.clientType,
                            this.clientVersion,
                            this.clientPlatform);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopConnection model) {
            if (model.wasPropertyExplicitlySet("timeConnected")) {
                this.timeConnected(model.getTimeConnected());
            }
            if (model.wasPropertyExplicitlySet("timeDisconnected")) {
                this.timeDisconnected(model.getTimeDisconnected());
            }
            if (model.wasPropertyExplicitlySet("nextAction")) {
                this.nextAction(model.getNextAction());
            }
            if (model.wasPropertyExplicitlySet("lastAction")) {
                this.lastAction(model.getLastAction());
            }
            if (model.wasPropertyExplicitlySet("clientType")) {
                this.clientType(model.getClientType());
            }
            if (model.wasPropertyExplicitlySet("clientVersion")) {
                this.clientVersion(model.getClientVersion());
            }
            if (model.wasPropertyExplicitlySet("clientPlatform")) {
                this.clientPlatform(model.getClientPlatform());
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
     * The time when the last connection to a desktop started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeConnected")
    private final java.util.Date timeConnected;

    /**
     * The time when the last connection to a desktop started.
     * @return the value
     **/
    public java.util.Date getTimeConnected() {
        return timeConnected;
    }

    /**
     * The time when the last connection to a desktop ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDisconnected")
    private final java.util.Date timeDisconnected;

    /**
     * The time when the last connection to a desktop ended.
     * @return the value
     **/
    public java.util.Date getTimeDisconnected() {
        return timeDisconnected;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nextAction")
    private final DesktopAction nextAction;

    public DesktopAction getNextAction() {
        return nextAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
    private final DesktopAction lastAction;

    public DesktopAction getLastAction() {
        return lastAction;
    }

    /**
     * The type of Secure Desktops client connected to a desktop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientType")
    private final String clientType;

    /**
     * The type of Secure Desktops client connected to a desktop.
     * @return the value
     **/
    public String getClientType() {
        return clientType;
    }

    /**
     * The version of the Secure Desktops client connected to a desktop, applicable only to the installed client type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientVersion")
    private final String clientVersion;

    /**
     * The version of the Secure Desktops client connected to a desktop, applicable only to the installed client type.
     * @return the value
     **/
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * The platform on which the Secure Desktops client runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientPlatform")
    private final String clientPlatform;

    /**
     * The platform on which the Secure Desktops client runs.
     * @return the value
     **/
    public String getClientPlatform() {
        return clientPlatform;
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
        sb.append("DesktopConnection(");
        sb.append("super=").append(super.toString());
        sb.append("timeConnected=").append(String.valueOf(this.timeConnected));
        sb.append(", timeDisconnected=").append(String.valueOf(this.timeDisconnected));
        sb.append(", nextAction=").append(String.valueOf(this.nextAction));
        sb.append(", lastAction=").append(String.valueOf(this.lastAction));
        sb.append(", clientType=").append(String.valueOf(this.clientType));
        sb.append(", clientVersion=").append(String.valueOf(this.clientVersion));
        sb.append(", clientPlatform=").append(String.valueOf(this.clientPlatform));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopConnection)) {
            return false;
        }

        DesktopConnection other = (DesktopConnection) o;
        return java.util.Objects.equals(this.timeConnected, other.timeConnected)
                && java.util.Objects.equals(this.timeDisconnected, other.timeDisconnected)
                && java.util.Objects.equals(this.nextAction, other.nextAction)
                && java.util.Objects.equals(this.lastAction, other.lastAction)
                && java.util.Objects.equals(this.clientType, other.clientType)
                && java.util.Objects.equals(this.clientVersion, other.clientVersion)
                && java.util.Objects.equals(this.clientPlatform, other.clientPlatform)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeConnected == null ? 43 : this.timeConnected.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDisconnected == null ? 43 : this.timeDisconnected.hashCode());
        result = (result * PRIME) + (this.nextAction == null ? 43 : this.nextAction.hashCode());
        result = (result * PRIME) + (this.lastAction == null ? 43 : this.lastAction.hashCode());
        result = (result * PRIME) + (this.clientType == null ? 43 : this.clientType.hashCode());
        result =
                (result * PRIME)
                        + (this.clientVersion == null ? 43 : this.clientVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.clientPlatform == null ? 43 : this.clientPlatform.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
