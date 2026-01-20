/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Configuration for reasoning features. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CohereThinkingV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereThinkingV2
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "tokenBudget"})
    public CohereThinkingV2(Type type, Integer tokenBudget) {
        super();
        this.type = type;
        this.tokenBudget = tokenBudget;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Reasoning is enabled by default for models that support it, but can be turned off by
         * setting type = disbaled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Reasoning is enabled by default for models that support it, but can be turned off by
         * setting type = disbaled.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The maximum number of tokens the model can use for thinking, which must be set to a
         * positive integer. The model will stop thinking if it reaches the thinking token budget
         * and will proceed with the response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenBudget")
        private Integer tokenBudget;

        /**
         * The maximum number of tokens the model can use for thinking, which must be set to a
         * positive integer. The model will stop thinking if it reaches the thinking token budget
         * and will proceed with the response.
         *
         * @param tokenBudget the value to set
         * @return this builder
         */
        public Builder tokenBudget(Integer tokenBudget) {
            this.tokenBudget = tokenBudget;
            this.__explicitlySet__.add("tokenBudget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereThinkingV2 build() {
            CohereThinkingV2 model = new CohereThinkingV2(this.type, this.tokenBudget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereThinkingV2 model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("tokenBudget")) {
                this.tokenBudget(model.getTokenBudget());
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

    /**
     * Reasoning is enabled by default for models that support it, but can be turned off by setting
     * type = disbaled.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * Reasoning is enabled by default for models that support it, but can be turned off by setting
     * type = disbaled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Reasoning is enabled by default for models that support it, but can be turned off by setting
     * type = disbaled.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The maximum number of tokens the model can use for thinking, which must be set to a positive
     * integer. The model will stop thinking if it reaches the thinking token budget and will
     * proceed with the response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenBudget")
    private final Integer tokenBudget;

    /**
     * The maximum number of tokens the model can use for thinking, which must be set to a positive
     * integer. The model will stop thinking if it reaches the thinking token budget and will
     * proceed with the response.
     *
     * @return the value
     */
    public Integer getTokenBudget() {
        return tokenBudget;
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
        sb.append("CohereThinkingV2(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", tokenBudget=").append(String.valueOf(this.tokenBudget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereThinkingV2)) {
            return false;
        }

        CohereThinkingV2 other = (CohereThinkingV2) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.tokenBudget, other.tokenBudget)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.tokenBudget == null ? 43 : this.tokenBudget.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
