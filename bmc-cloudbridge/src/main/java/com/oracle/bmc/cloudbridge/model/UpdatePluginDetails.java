/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The information to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePluginDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdatePluginDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"desiredState"})
    public UpdatePluginDetails(Plugin.DesiredState desiredState) {
        super();
        this.desiredState = desiredState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** State to which the customer wants the plugin to move to. */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredState")
        private Plugin.DesiredState desiredState;

        /**
         * State to which the customer wants the plugin to move to.
         *
         * @param desiredState the value to set
         * @return this builder
         */
        public Builder desiredState(Plugin.DesiredState desiredState) {
            this.desiredState = desiredState;
            this.__explicitlySet__.add("desiredState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePluginDetails build() {
            UpdatePluginDetails model = new UpdatePluginDetails(this.desiredState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePluginDetails model) {
            if (model.wasPropertyExplicitlySet("desiredState")) {
                this.desiredState(model.getDesiredState());
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

    /** State to which the customer wants the plugin to move to. */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredState")
    private final Plugin.DesiredState desiredState;

    /**
     * State to which the customer wants the plugin to move to.
     *
     * @return the value
     */
    public Plugin.DesiredState getDesiredState() {
        return desiredState;
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
        sb.append("UpdatePluginDetails(");
        sb.append("super=").append(super.toString());
        sb.append("desiredState=").append(String.valueOf(this.desiredState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePluginDetails)) {
            return false;
        }

        UpdatePluginDetails other = (UpdatePluginDetails) o;
        return java.util.Objects.equals(this.desiredState, other.desiredState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.desiredState == null ? 43 : this.desiredState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
