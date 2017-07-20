/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateInternetGatewayDetails.Builder.class
)
public class UpdateInternetGatewayDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public UpdateInternetGatewayDetails build() {
            return new UpdateInternetGatewayDetails(displayName, isEnabled);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInternetGatewayDetails o) {
            return displayName(o.getDisplayName()).isEnabled(o.getIsEnabled());
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
     * Whether the gateway is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;
}
