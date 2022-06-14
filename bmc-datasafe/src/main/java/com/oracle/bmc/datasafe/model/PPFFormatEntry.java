/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Post Processing Function masking format is a special masking option that
 * enables you to use a custom function to further transform column values after
 * they have been masked using some other masking formats. It takes the intermediate
 * masked values as input and returns the final masked values. For example, you can
 * use it for adding checksums or special encodings to the masked values.
 * <p>
 * A post-processing function has the same signature as a user-defined function,
 * but it passes in the masked values the masking engine generates, and returns
 * the final masked values that should be used for masking. To learn more, check
 * Post Processing Function in the Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PPFFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PPFFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME
         * format. It can be a standalone or packaged function, so PACKAGE_NAME
         * is optional.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("postProcessingFunction")
        private String postProcessingFunction;

        /**
         * The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME
         * format. It can be a standalone or packaged function, so PACKAGE_NAME
         * is optional.
         *
         * @param postProcessingFunction the value to set
         * @return this builder
         **/
        public Builder postProcessingFunction(String postProcessingFunction) {
            this.postProcessingFunction = postProcessingFunction;
            this.__explicitlySet__.add("postProcessingFunction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PPFFormatEntry build() {
            PPFFormatEntry __instance__ = new PPFFormatEntry(description, postProcessingFunction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PPFFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .postProcessingFunction(o.getPostProcessingFunction());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public PPFFormatEntry(String description, String postProcessingFunction) {
        super(description);
        this.postProcessingFunction = postProcessingFunction;
    }

    /**
     * The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME
     * format. It can be a standalone or packaged function, so PACKAGE_NAME
     * is optional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postProcessingFunction")
    private final String postProcessingFunction;

    /**
     * The post processing function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME
     * format. It can be a standalone or packaged function, so PACKAGE_NAME
     * is optional.
     *
     * @return the value
     **/
    public String getPostProcessingFunction() {
        return postProcessingFunction;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PPFFormatEntry(");
        sb.append("super=").append(super.toString());
        sb.append(", postProcessingFunction=").append(String.valueOf(this.postProcessingFunction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PPFFormatEntry)) {
            return false;
        }

        PPFFormatEntry other = (PPFFormatEntry) o;
        return java.util.Objects.equals(this.postProcessingFunction, other.postProcessingFunction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.postProcessingFunction == null
                                ? 43
                                : this.postProcessingFunction.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
