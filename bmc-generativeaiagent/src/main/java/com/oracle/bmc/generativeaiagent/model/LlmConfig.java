/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Configuration to Agent LLM. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LlmConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LlmConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"routingLlmCustomization", "runtimeVersion"})
    public LlmConfig(LlmCustomization routingLlmCustomization, String runtimeVersion) {
        super();
        this.routingLlmCustomization = routingLlmCustomization;
        this.runtimeVersion = runtimeVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("routingLlmCustomization")
        private LlmCustomization routingLlmCustomization;

        public Builder routingLlmCustomization(LlmCustomization routingLlmCustomization) {
            this.routingLlmCustomization = routingLlmCustomization;
            this.__explicitlySet__.add("routingLlmCustomization");
            return this;
        }
        /** The runtimeVersion of the system prompt. */
        @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
        private String runtimeVersion;

        /**
         * The runtimeVersion of the system prompt.
         *
         * @param runtimeVersion the value to set
         * @return this builder
         */
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            this.__explicitlySet__.add("runtimeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LlmConfig build() {
            LlmConfig model = new LlmConfig(this.routingLlmCustomization, this.runtimeVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmConfig model) {
            if (model.wasPropertyExplicitlySet("routingLlmCustomization")) {
                this.routingLlmCustomization(model.getRoutingLlmCustomization());
            }
            if (model.wasPropertyExplicitlySet("runtimeVersion")) {
                this.runtimeVersion(model.getRuntimeVersion());
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

    @com.fasterxml.jackson.annotation.JsonProperty("routingLlmCustomization")
    private final LlmCustomization routingLlmCustomization;

    public LlmCustomization getRoutingLlmCustomization() {
        return routingLlmCustomization;
    }

    /** The runtimeVersion of the system prompt. */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    private final String runtimeVersion;

    /**
     * The runtimeVersion of the system prompt.
     *
     * @return the value
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
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
        sb.append("LlmConfig(");
        sb.append("super=").append(super.toString());
        sb.append("routingLlmCustomization=").append(String.valueOf(this.routingLlmCustomization));
        sb.append(", runtimeVersion=").append(String.valueOf(this.runtimeVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LlmConfig)) {
            return false;
        }

        LlmConfig other = (LlmConfig) o;
        return java.util.Objects.equals(this.routingLlmCustomization, other.routingLlmCustomization)
                && java.util.Objects.equals(this.runtimeVersion, other.runtimeVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.routingLlmCustomization == null
                                ? 43
                                : this.routingLlmCustomization.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeVersion == null ? 43 : this.runtimeVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
