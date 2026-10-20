/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Request body used to extend a sandbox's duration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtendSandboxDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtendSandboxDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"additionalDuration"})
    public ExtendSandboxDetails(String additionalDuration) {
        super();
        this.additionalDuration = additionalDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Additional duration to extend the sandbox lifetime, in ISO 8601 duration format. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDuration")
        private String additionalDuration;

        /**
         * Additional duration to extend the sandbox lifetime, in ISO 8601 duration format.
         *
         * @param additionalDuration the value to set
         * @return this builder
         */
        public Builder additionalDuration(String additionalDuration) {
            this.additionalDuration = additionalDuration;
            this.__explicitlySet__.add("additionalDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtendSandboxDetails build() {
            ExtendSandboxDetails model = new ExtendSandboxDetails(this.additionalDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtendSandboxDetails model) {
            if (model.wasPropertyExplicitlySet("additionalDuration")) {
                this.additionalDuration(model.getAdditionalDuration());
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

    /** Additional duration to extend the sandbox lifetime, in ISO 8601 duration format. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDuration")
    private final String additionalDuration;

    /**
     * Additional duration to extend the sandbox lifetime, in ISO 8601 duration format.
     *
     * @return the value
     */
    public String getAdditionalDuration() {
        return additionalDuration;
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
        sb.append("ExtendSandboxDetails(");
        sb.append("super=").append(super.toString());
        sb.append("additionalDuration=").append(String.valueOf(this.additionalDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtendSandboxDetails)) {
            return false;
        }

        ExtendSandboxDetails other = (ExtendSandboxDetails) o;
        return java.util.Objects.equals(this.additionalDuration, other.additionalDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.additionalDuration == null
                                ? 43
                                : this.additionalDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
