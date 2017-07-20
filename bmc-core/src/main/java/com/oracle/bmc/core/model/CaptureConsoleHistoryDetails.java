/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CaptureConsoleHistoryDetails.Builder.class
)
public class CaptureConsoleHistoryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public CaptureConsoleHistoryDetails build() {
            return new CaptureConsoleHistoryDetails(instanceId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String instanceId;
}
