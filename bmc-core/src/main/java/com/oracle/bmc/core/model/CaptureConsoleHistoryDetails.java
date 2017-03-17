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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CaptureConsoleHistoryDetails.Builder.class)
public class CaptureConsoleHistoryDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("instanceId")
        private String instanceId;

        public CaptureConsoleHistoryDetails build() {
            return new CaptureConsoleHistoryDetails(instanceId);
        }

        @JsonIgnore
        public Builder copy(CaptureConsoleHistoryDetails o) {
            return instanceId(o.getInstanceId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the instance to get the console history from.
     **/
    @JsonProperty("instanceId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String instanceId;
}
