/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * An individual question that the customer can answer about the CPE device.
 * <p>
 * The customer provides answers to these questions in
 * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest) updateTunnelCpeDeviceConfig}.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CpeDeviceConfigQuestion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CpeDeviceConfigQuestion
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "explanation"})
    public CpeDeviceConfigQuestion(String key, String displayName, String explanation) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.explanation = explanation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string that identifies the question.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A string that identifies the question.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A descriptive label for the question (for example, to display in a form in a graphical interface).
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive label for the question (for example, to display in a form in a graphical interface).
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A description or explanation of the question, to help the customer answer accurately.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("explanation")
        private String explanation;

        /**
         * A description or explanation of the question, to help the customer answer accurately.
         *
         * @param explanation the value to set
         * @return this builder
         **/
        public Builder explanation(String explanation) {
            this.explanation = explanation;
            this.__explicitlySet__.add("explanation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpeDeviceConfigQuestion build() {
            CpeDeviceConfigQuestion model =
                    new CpeDeviceConfigQuestion(this.key, this.displayName, this.explanation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpeDeviceConfigQuestion model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("explanation")) {
                this.explanation(model.getExplanation());
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
     * A string that identifies the question.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A string that identifies the question.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A descriptive label for the question (for example, to display in a form in a graphical interface).
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive label for the question (for example, to display in a form in a graphical interface).
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A description or explanation of the question, to help the customer answer accurately.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("explanation")
    private final String explanation;

    /**
     * A description or explanation of the question, to help the customer answer accurately.
     *
     * @return the value
     **/
    public String getExplanation() {
        return explanation;
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
        sb.append("CpeDeviceConfigQuestion(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", explanation=").append(String.valueOf(this.explanation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpeDeviceConfigQuestion)) {
            return false;
        }

        CpeDeviceConfigQuestion other = (CpeDeviceConfigQuestion) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.explanation, other.explanation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.explanation == null ? 43 : this.explanation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
