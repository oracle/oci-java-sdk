/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Action to be triggered on inactivity or disconnect <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DesktopSessionLifecycleActions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DesktopSessionLifecycleActions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inactivity", "disconnect"})
    public DesktopSessionLifecycleActions(
            InactivityConfig inactivity, DisconnectConfig disconnect) {
        super();
        this.inactivity = inactivity;
        this.disconnect = disconnect;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("inactivity")
        private InactivityConfig inactivity;

        public Builder inactivity(InactivityConfig inactivity) {
            this.inactivity = inactivity;
            this.__explicitlySet__.add("inactivity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disconnect")
        private DisconnectConfig disconnect;

        public Builder disconnect(DisconnectConfig disconnect) {
            this.disconnect = disconnect;
            this.__explicitlySet__.add("disconnect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopSessionLifecycleActions build() {
            DesktopSessionLifecycleActions model =
                    new DesktopSessionLifecycleActions(this.inactivity, this.disconnect);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopSessionLifecycleActions model) {
            if (model.wasPropertyExplicitlySet("inactivity")) {
                this.inactivity(model.getInactivity());
            }
            if (model.wasPropertyExplicitlySet("disconnect")) {
                this.disconnect(model.getDisconnect());
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

    @com.fasterxml.jackson.annotation.JsonProperty("inactivity")
    private final InactivityConfig inactivity;

    public InactivityConfig getInactivity() {
        return inactivity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("disconnect")
    private final DisconnectConfig disconnect;

    public DisconnectConfig getDisconnect() {
        return disconnect;
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
        sb.append("DesktopSessionLifecycleActions(");
        sb.append("super=").append(super.toString());
        sb.append("inactivity=").append(String.valueOf(this.inactivity));
        sb.append(", disconnect=").append(String.valueOf(this.disconnect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopSessionLifecycleActions)) {
            return false;
        }

        DesktopSessionLifecycleActions other = (DesktopSessionLifecycleActions) o;
        return java.util.Objects.equals(this.inactivity, other.inactivity)
                && java.util.Objects.equals(this.disconnect, other.disconnect)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inactivity == null ? 43 : this.inactivity.hashCode());
        result = (result * PRIME) + (this.disconnect == null ? 43 : this.disconnect.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
