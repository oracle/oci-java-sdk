/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Options for controlling citation generation in RAG flows. <br>
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
        builder = CitationOptionsV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CitationOptionsV2
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mode"})
    public CitationOptionsV2(Mode mode) {
        super();
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Dictates the approach taken to generating citations as part of the RAG flow. Defaults to
         * "accurate". - "ACCURATE": More precise citation generation. - "FAST": Faster but may be
         * less precise. - "OFF": Disables citation generation. Note: {@code command-r7b-12-2024}
         * and {@code command-a-03-2025} only support "FAST" and "OFF".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * Dictates the approach taken to generating citations as part of the RAG flow. Defaults to
         * "accurate". - "ACCURATE": More precise citation generation. - "FAST": Faster but may be
         * less precise. - "OFF": Disables citation generation. Note: {@code command-r7b-12-2024}
         * and {@code command-a-03-2025} only support "FAST" and "OFF".
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CitationOptionsV2 build() {
            CitationOptionsV2 model = new CitationOptionsV2(this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CitationOptionsV2 model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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
     * Dictates the approach taken to generating citations as part of the RAG flow. Defaults to
     * "accurate". - "ACCURATE": More precise citation generation. - "FAST": Faster but may be less
     * precise. - "OFF": Disables citation generation. Note: {@code command-r7b-12-2024} and {@code
     * command-a-03-2025} only support "FAST" and "OFF".
     */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Fast("FAST"),
        Accurate("ACCURATE"),
        Off("OFF"),
        ;

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                map.put(v.getValue(), v);
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
    /**
     * Dictates the approach taken to generating citations as part of the RAG flow. Defaults to
     * "accurate". - "ACCURATE": More precise citation generation. - "FAST": Faster but may be less
     * precise. - "OFF": Disables citation generation. Note: {@code command-r7b-12-2024} and {@code
     * command-a-03-2025} only support "FAST" and "OFF".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * Dictates the approach taken to generating citations as part of the RAG flow. Defaults to
     * "accurate". - "ACCURATE": More precise citation generation. - "FAST": Faster but may be less
     * precise. - "OFF": Disables citation generation. Note: {@code command-r7b-12-2024} and {@code
     * command-a-03-2025} only support "FAST" and "OFF".
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
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
        sb.append("CitationOptionsV2(");
        sb.append("super=").append(super.toString());
        sb.append("mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CitationOptionsV2)) {
            return false;
        }

        CitationOptionsV2 other = (CitationOptionsV2) o;
        return java.util.Objects.equals(this.mode, other.mode) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
