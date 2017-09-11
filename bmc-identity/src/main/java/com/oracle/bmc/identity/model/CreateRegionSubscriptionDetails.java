/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRegionSubscriptionDetails.Builder.class
)
public class CreateRegionSubscriptionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
        private String regionKey;

        public CreateRegionSubscriptionDetails build() {
            return new CreateRegionSubscriptionDetails(regionKey);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRegionSubscriptionDetails o) {
            return regionKey(o.getRegionKey());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The regions's key.
     * <p>
     * Allowed values are:
     * - `PHX`
     * - `IAD`
     * - `FRA`
     * <p>
     * Example: `PHX`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 16)
    String regionKey;
}
