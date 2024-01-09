/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The execution output from a command when saved to an Object Storage URL. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "outputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails
        extends InstanceAgentCommandExecutionOutputContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private Integer exitCode;

        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The Object Storage URL or pre-authenticated request (PAR) for the command output. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputUri")
        private String outputUri;

        /**
         * The Object Storage URL or pre-authenticated request (PAR) for the command output.
         *
         * @param outputUri the value to set
         * @return this builder
         */
        public Builder outputUri(String outputUri) {
            this.outputUri = outputUri;
            this.__explicitlySet__.add("outputUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails build() {
            InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails model =
                    new InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails(
                            this.exitCode, this.message, this.outputUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails model) {
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("outputUri")) {
                this.outputUri(model.getOutputUri());
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

    @Deprecated
    public InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails(
            Integer exitCode, String message, String outputUri) {
        super(exitCode, message);
        this.outputUri = outputUri;
    }

    /** The Object Storage URL or pre-authenticated request (PAR) for the command output. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputUri")
    private final String outputUri;

    /**
     * The Object Storage URL or pre-authenticated request (PAR) for the command output.
     *
     * @return the value
     */
    public String getOutputUri() {
        return outputUri;
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
        sb.append("InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", outputUri=").append(String.valueOf(this.outputUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails)) {
            return false;
        }

        InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails other =
                (InstanceAgentCommandExecutionOutputViaObjectStorageUriDetails) o;
        return java.util.Objects.equals(this.outputUri, other.outputUri) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.outputUri == null ? 43 : this.outputUri.hashCode());
        return result;
    }
}
