/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The model routing policy for the routing profile. Routing candidates are selected from the allowed models list.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModelRoutingPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelRoutingPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedModels"})
    public ModelRoutingPolicy(java.util.List<String> allowedModels) {
        super();
        this.allowedModels = allowedModels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ordered list of model names the routing candidate is selected from (for example, {@code meta.llama-3-70b-instruct}).
         * <p>
         * The order of entries is preserved. Duplicate entries are not allowed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedModels")
        private java.util.List<String> allowedModels;

        /**
         * The ordered list of model names the routing candidate is selected from (for example, {@code meta.llama-3-70b-instruct}).
         * <p>
         * The order of entries is preserved. Duplicate entries are not allowed.
         *
         * @param allowedModels the value to set
         * @return this builder
         **/
        public Builder allowedModels(java.util.List<String> allowedModels) {
            this.allowedModels = allowedModels;
            this.__explicitlySet__.add("allowedModels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelRoutingPolicy build() {
            ModelRoutingPolicy model = new ModelRoutingPolicy(this.allowedModels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelRoutingPolicy model) {
            if (model.wasPropertyExplicitlySet("allowedModels")) {
                this.allowedModels(model.getAllowedModels());
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

    /**
     * The ordered list of model names the routing candidate is selected from (for example, {@code meta.llama-3-70b-instruct}).
     * <p>
     * The order of entries is preserved. Duplicate entries are not allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedModels")
    private final java.util.List<String> allowedModels;

    /**
     * The ordered list of model names the routing candidate is selected from (for example, {@code meta.llama-3-70b-instruct}).
     * <p>
     * The order of entries is preserved. Duplicate entries are not allowed.
     *
     * @return the value
     **/
    public java.util.List<String> getAllowedModels() {
        return allowedModels;
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
        sb.append("ModelRoutingPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("allowedModels=").append(String.valueOf(this.allowedModels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelRoutingPolicy)) {
            return false;
        }

        ModelRoutingPolicy other = (ModelRoutingPolicy) o;
        return java.util.Objects.equals(this.allowedModels, other.allowedModels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedModels == null ? 43 : this.allowedModels.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
