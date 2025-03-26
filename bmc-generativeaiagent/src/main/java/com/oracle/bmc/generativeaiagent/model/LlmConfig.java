/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Configuration to Agent LLM.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LlmConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LlmConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"routingLlmCustomization"})
    public LlmConfig(LlmCustomization routingLlmCustomization) {
        super();
        this.routingLlmCustomization = routingLlmCustomization;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LlmConfig build() {
            LlmConfig model = new LlmConfig(this.routingLlmCustomization);
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
            return this;
        }
    }

    /**
     * Create a new builder.
     */
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

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LlmConfig(");
        sb.append("super=").append(super.toString());
        sb.append("routingLlmCustomization=").append(String.valueOf(this.routingLlmCustomization));
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
