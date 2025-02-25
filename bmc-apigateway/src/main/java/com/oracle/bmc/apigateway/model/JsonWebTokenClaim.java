/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * An individual JWT claim.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JsonWebTokenClaim.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JsonWebTokenClaim extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "values", "isRequired"})
    public JsonWebTokenClaim(String key, java.util.List<String> values, Boolean isRequired) {
        super();
        this.key = key;
        this.values = values;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the claim.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Name of the claim.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The list of acceptable values for a given claim.
         * If this value is "null" or empty and "isRequired" set to "true", then
         * the presence of this claim in the JWT is validated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * The list of acceptable values for a given claim.
         * If this value is "null" or empty and "isRequired" set to "true", then
         * the presence of this claim in the JWT is validated.
         *
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /**
         * Whether the claim is required to be present in the JWT or not. If set
         * to "false", the claim values will be matched only if the claim is
         * present in the JWT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Whether the claim is required to be present in the JWT or not. If set
         * to "false", the claim values will be matched only if the claim is
         * present in the JWT.
         *
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JsonWebTokenClaim build() {
            JsonWebTokenClaim model = new JsonWebTokenClaim(this.key, this.values, this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JsonWebTokenClaim model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * Name of the claim.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Name of the claim.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The list of acceptable values for a given claim.
     * If this value is "null" or empty and "isRequired" set to "true", then
     * the presence of this claim in the JWT is validated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * The list of acceptable values for a given claim.
     * If this value is "null" or empty and "isRequired" set to "true", then
     * the presence of this claim in the JWT is validated.
     *
     * @return the value
     **/
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * Whether the claim is required to be present in the JWT or not. If set
     * to "false", the claim values will be matched only if the claim is
     * present in the JWT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Whether the claim is required to be present in the JWT or not. If set
     * to "false", the claim values will be matched only if the claim is
     * present in the JWT.
     *
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("JsonWebTokenClaim(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonWebTokenClaim)) {
            return false;
        }

        JsonWebTokenClaim other = (JsonWebTokenClaim) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
