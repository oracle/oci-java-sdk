/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UpdateImageDetails.Builder.class)
public class UpdateImageDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        public UpdateImageDetails build() {
            return new UpdateImageDetails(displayName);
        }

        @JsonIgnore
        public Builder copy(UpdateImageDetails o) {
            return displayName(o.getDisplayName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The non-unique, changeable name of the image.
     * <p>
     * Example: `My custom Oracle Linux image`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;
}
