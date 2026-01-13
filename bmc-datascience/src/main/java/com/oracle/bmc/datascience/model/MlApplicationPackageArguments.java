/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * List of ML Application package arguments provided during ML Application package upload. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MlApplicationPackageArguments.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MlApplicationPackageArguments
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"arguments"})
    public MlApplicationPackageArguments(
            java.util.List<MlApplicationPackageArgumentDetails> arguments) {
        super();
        this.arguments = arguments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Array of the ML Application package arguments */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<MlApplicationPackageArgumentDetails> arguments;

        /**
         * Array of the ML Application package arguments
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<MlApplicationPackageArgumentDetails> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MlApplicationPackageArguments build() {
            MlApplicationPackageArguments model = new MlApplicationPackageArguments(this.arguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MlApplicationPackageArguments model) {
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
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

    /** Array of the ML Application package arguments */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<MlApplicationPackageArgumentDetails> arguments;

    /**
     * Array of the ML Application package arguments
     *
     * @return the value
     */
    public java.util.List<MlApplicationPackageArgumentDetails> getArguments() {
        return arguments;
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
        sb.append("MlApplicationPackageArguments(");
        sb.append("super=").append(super.toString());
        sb.append("arguments=").append(String.valueOf(this.arguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MlApplicationPackageArguments)) {
            return false;
        }

        MlApplicationPackageArguments other = (MlApplicationPackageArguments) o;
        return java.util.Objects.equals(this.arguments, other.arguments) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
