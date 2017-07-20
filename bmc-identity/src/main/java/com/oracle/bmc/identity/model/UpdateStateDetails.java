/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateStateDetails.Builder.class
)
public class UpdateStateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("blocked")
        private Boolean blocked;

        public UpdateStateDetails build() {
            return new UpdateStateDetails(blocked);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateStateDetails o) {
            return blocked(o.getBlocked());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Update state to blocked or unblocked. Only \"false\" is supported (for changing the state to unblocked).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blocked")
    Boolean blocked;
}
