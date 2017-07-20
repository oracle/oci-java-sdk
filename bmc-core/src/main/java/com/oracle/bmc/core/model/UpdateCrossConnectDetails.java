/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Update a CrossConnect
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCrossConnectDetails.Builder.class
)
public class UpdateCrossConnectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        public UpdateCrossConnectDetails build() {
            return new UpdateCrossConnectDetails(displayName, isActive);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCrossConnectDetails o) {
            return displayName(o.getDisplayName()).isActive(o.getIsActive());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * Set to true to activate the cross-connect. You activate it after the physical cabling
     * is complete, and you've confirmed the cross-connect's light levels are good and your side
     * of the interface is up. Activation indicates to Oracle that the physical connection is ready.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    Boolean isActive;
}
