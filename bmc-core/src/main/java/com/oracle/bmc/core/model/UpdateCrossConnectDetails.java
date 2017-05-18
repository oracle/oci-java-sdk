/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * Update a CrossConnect
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UpdateCrossConnectDetails.Builder.class)
public class UpdateCrossConnectDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("isActive")
        private Boolean isActive;

        public UpdateCrossConnectDetails build() {
            return new UpdateCrossConnectDetails(displayName, isActive);
        }

        @JsonIgnore
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
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Set to true to activate the cross-connect. You activate it after the physical cabling
     * is complete, and you've confirmed the cross-connect's light levels are good and your side
     * of the interface is up. Activation indicates to Oracle that the physical connection is ready.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("isActive")
    Boolean isActive;
}
