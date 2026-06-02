/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The result of prompt injection protection. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PromptInjectionProtectionResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PromptInjectionProtectionResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"score", "flaggedModalities"})
    public PromptInjectionProtectionResult(
            Double score, java.util.List<FlaggedModalities> flaggedModalities) {
        super();
        this.score = score;
        this.flaggedModalities = flaggedModalities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The score indicating the likelihood of a prompt injection attack. */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * The score indicating the likelihood of a prompt injection attack.
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }
        /**
         * The input modalities flagged by the prompt injection result. Present only when the
         * request is processed using a non-empty {@code multimodalInput}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flaggedModalities")
        private java.util.List<FlaggedModalities> flaggedModalities;

        /**
         * The input modalities flagged by the prompt injection result. Present only when the
         * request is processed using a non-empty {@code multimodalInput}.
         *
         * @param flaggedModalities the value to set
         * @return this builder
         */
        public Builder flaggedModalities(java.util.List<FlaggedModalities> flaggedModalities) {
            this.flaggedModalities = flaggedModalities;
            this.__explicitlySet__.add("flaggedModalities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PromptInjectionProtectionResult build() {
            PromptInjectionProtectionResult model =
                    new PromptInjectionProtectionResult(this.score, this.flaggedModalities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromptInjectionProtectionResult model) {
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
            }
            if (model.wasPropertyExplicitlySet("flaggedModalities")) {
                this.flaggedModalities(model.getFlaggedModalities());
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

    /** The score indicating the likelihood of a prompt injection attack. */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * The score indicating the likelihood of a prompt injection attack.
     *
     * @return the value
     */
    public Double getScore() {
        return score;
    }

    /** */
    public enum FlaggedModalities implements com.oracle.bmc.http.internal.BmcEnum {
        Text("TEXT"),
        Image("IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FlaggedModalities.class);

        private final String value;
        private static java.util.Map<String, FlaggedModalities> map;

        static {
            map = new java.util.HashMap<>();
            for (FlaggedModalities v : FlaggedModalities.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FlaggedModalities(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FlaggedModalities create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FlaggedModalities', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The input modalities flagged by the prompt injection result. Present only when the request is
     * processed using a non-empty {@code multimodalInput}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flaggedModalities")
    private final java.util.List<FlaggedModalities> flaggedModalities;

    /**
     * The input modalities flagged by the prompt injection result. Present only when the request is
     * processed using a non-empty {@code multimodalInput}.
     *
     * @return the value
     */
    public java.util.List<FlaggedModalities> getFlaggedModalities() {
        return flaggedModalities;
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
        sb.append("PromptInjectionProtectionResult(");
        sb.append("super=").append(super.toString());
        sb.append("score=").append(String.valueOf(this.score));
        sb.append(", flaggedModalities=").append(String.valueOf(this.flaggedModalities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromptInjectionProtectionResult)) {
            return false;
        }

        PromptInjectionProtectionResult other = (PromptInjectionProtectionResult) o;
        return java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.flaggedModalities, other.flaggedModalities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result =
                (result * PRIME)
                        + (this.flaggedModalities == null ? 43 : this.flaggedModalities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
