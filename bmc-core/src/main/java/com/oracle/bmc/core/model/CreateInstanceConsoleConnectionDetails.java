/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Properties used to create an instance console connection.  The instance console connection is created
 * in the same compartment as the instance.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateInstanceConsoleConnectionDetails.Builder.class
)
public class CreateInstanceConsoleConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        public CreateInstanceConsoleConnectionDetails build() {
            return new CreateInstanceConsoleConnectionDetails(instanceId, publicKey);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInstanceConsoleConnectionDetails o) {
            return instanceId(o.getInstanceId()).publicKey(o.getPublicKey());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The host instance OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;

    /**
     * An ssh public key that will be used to authenticate the console connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    String publicKey;
}
