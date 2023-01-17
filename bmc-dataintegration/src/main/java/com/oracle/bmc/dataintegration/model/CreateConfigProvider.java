/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type to create a config provider. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateConfigProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateConfigProvider
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bindings"})
    public CreateConfigProvider(java.util.Map<String, ParameterValue> bindings) {
        super();
        this.bindings = bindings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** bindings */
        @com.fasterxml.jackson.annotation.JsonProperty("bindings")
        private java.util.Map<String, ParameterValue> bindings;

        /**
         * bindings
         *
         * @param bindings the value to set
         * @return this builder
         */
        public Builder bindings(java.util.Map<String, ParameterValue> bindings) {
            this.bindings = bindings;
            this.__explicitlySet__.add("bindings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConfigProvider build() {
            CreateConfigProvider model = new CreateConfigProvider(this.bindings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConfigProvider model) {
            if (model.wasPropertyExplicitlySet("bindings")) {
                this.bindings(model.getBindings());
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

    /** bindings */
    @com.fasterxml.jackson.annotation.JsonProperty("bindings")
    private final java.util.Map<String, ParameterValue> bindings;

    /**
     * bindings
     *
     * @return the value
     */
    public java.util.Map<String, ParameterValue> getBindings() {
        return bindings;
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
        sb.append("CreateConfigProvider(");
        sb.append("super=").append(super.toString());
        sb.append("bindings=").append(String.valueOf(this.bindings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConfigProvider)) {
            return false;
        }

        CreateConfigProvider other = (CreateConfigProvider) o;
        return java.util.Objects.equals(this.bindings, other.bindings) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bindings == null ? 43 : this.bindings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
