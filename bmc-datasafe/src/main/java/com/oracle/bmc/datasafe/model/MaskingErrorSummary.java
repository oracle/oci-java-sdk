/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a masking error. A Masking error is an error seen during the masking run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaskingErrorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskingErrorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName", "error", "failedStatement", "timeCreated"})
    public MaskingErrorSummary(
            StepName stepName, String error, String failedStatement, java.util.Date timeCreated) {
        super();
        this.stepName = stepName;
        this.error = error;
        this.failedStatement = failedStatement;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The stepName of the masking error. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private StepName stepName;

        /**
         * The stepName of the masking error.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(StepName stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** The text of the masking error. */
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private String error;

        /**
         * The text of the masking error.
         *
         * @param error the value to set
         * @return this builder
         */
        public Builder error(String error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /** The statement resulting into the error. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedStatement")
        private String failedStatement;

        /**
         * The statement resulting into the error.
         *
         * @param failedStatement the value to set
         * @return this builder
         */
        public Builder failedStatement(String failedStatement) {
            this.failedStatement = failedStatement;
            this.__explicitlySet__.add("failedStatement");
            return this;
        }
        /**
         * The date and time the error entry was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the error entry was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingErrorSummary build() {
            MaskingErrorSummary model =
                    new MaskingErrorSummary(
                            this.stepName, this.error, this.failedStatement, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingErrorSummary model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
            }
            if (model.wasPropertyExplicitlySet("failedStatement")) {
                this.failedStatement(model.getFailedStatement());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The stepName of the masking error. */
    public enum StepName implements com.oracle.bmc.http.internal.BmcEnum {
        ExecuteMasking("EXECUTE_MASKING"),
        PreMasking("PRE_MASKING"),
        PostMasking("POST_MASKING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StepName.class);

        private final String value;
        private static java.util.Map<String, StepName> map;

        static {
            map = new java.util.HashMap<>();
            for (StepName v : StepName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StepName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StepName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StepName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The stepName of the masking error. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final StepName stepName;

    /**
     * The stepName of the masking error.
     *
     * @return the value
     */
    public StepName getStepName() {
        return stepName;
    }

    /** The text of the masking error. */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final String error;

    /**
     * The text of the masking error.
     *
     * @return the value
     */
    public String getError() {
        return error;
    }

    /** The statement resulting into the error. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedStatement")
    private final String failedStatement;

    /**
     * The statement resulting into the error.
     *
     * @return the value
     */
    public String getFailedStatement() {
        return failedStatement;
    }

    /**
     * The date and time the error entry was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the error entry was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("MaskingErrorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(", failedStatement=").append(String.valueOf(this.failedStatement));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingErrorSummary)) {
            return false;
        }

        MaskingErrorSummary other = (MaskingErrorSummary) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.failedStatement, other.failedStatement)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result =
                (result * PRIME)
                        + (this.failedStatement == null ? 43 : this.failedStatement.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
