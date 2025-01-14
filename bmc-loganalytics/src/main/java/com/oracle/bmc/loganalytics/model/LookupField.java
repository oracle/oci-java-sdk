/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LookupField <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LookupField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LookupField extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commonFieldName",
        "defaultMatchValue",
        "displayName",
        "isCommonField",
        "matchOperator",
        "name",
        "position"
    })
    public LookupField(
            String commonFieldName,
            String defaultMatchValue,
            String displayName,
            Boolean isCommonField,
            String matchOperator,
            String name,
            Long position) {
        super();
        this.commonFieldName = commonFieldName;
        this.defaultMatchValue = defaultMatchValue;
        this.displayName = displayName;
        this.isCommonField = isCommonField;
        this.matchOperator = matchOperator;
        this.name = name;
        this.position = position;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The common field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
        private String commonFieldName;

        /**
         * The common field name.
         *
         * @param commonFieldName the value to set
         * @return this builder
         */
        public Builder commonFieldName(String commonFieldName) {
            this.commonFieldName = commonFieldName;
            this.__explicitlySet__.add("commonFieldName");
            return this;
        }
        /** The default match value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
        private String defaultMatchValue;

        /**
         * The default match value.
         *
         * @param defaultMatchValue the value to set
         * @return this builder
         */
        public Builder defaultMatchValue(String defaultMatchValue) {
            this.defaultMatchValue = defaultMatchValue;
            this.__explicitlySet__.add("defaultMatchValue");
            return this;
        }
        /** The field display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The field display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A flag indicating whether or not the lookup field is a common field. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
        private Boolean isCommonField;

        /**
         * A flag indicating whether or not the lookup field is a common field.
         *
         * @param isCommonField the value to set
         * @return this builder
         */
        public Builder isCommonField(Boolean isCommonField) {
            this.isCommonField = isCommonField;
            this.__explicitlySet__.add("isCommonField");
            return this;
        }
        /** The match operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
        private String matchOperator;

        /**
         * The match operator.
         *
         * @param matchOperator the value to set
         * @return this builder
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            this.__explicitlySet__.add("matchOperator");
            return this;
        }
        /** The field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The field name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** THe field position. */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        /**
         * THe field position.
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LookupField build() {
            LookupField model =
                    new LookupField(
                            this.commonFieldName,
                            this.defaultMatchValue,
                            this.displayName,
                            this.isCommonField,
                            this.matchOperator,
                            this.name,
                            this.position);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LookupField model) {
            if (model.wasPropertyExplicitlySet("commonFieldName")) {
                this.commonFieldName(model.getCommonFieldName());
            }
            if (model.wasPropertyExplicitlySet("defaultMatchValue")) {
                this.defaultMatchValue(model.getDefaultMatchValue());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isCommonField")) {
                this.isCommonField(model.getIsCommonField());
            }
            if (model.wasPropertyExplicitlySet("matchOperator")) {
                this.matchOperator(model.getMatchOperator());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
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

    /** The common field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
    private final String commonFieldName;

    /**
     * The common field name.
     *
     * @return the value
     */
    public String getCommonFieldName() {
        return commonFieldName;
    }

    /** The default match value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
    private final String defaultMatchValue;

    /**
     * The default match value.
     *
     * @return the value
     */
    public String getDefaultMatchValue() {
        return defaultMatchValue;
    }

    /** The field display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The field display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A flag indicating whether or not the lookup field is a common field. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
    private final Boolean isCommonField;

    /**
     * A flag indicating whether or not the lookup field is a common field.
     *
     * @return the value
     */
    public Boolean getIsCommonField() {
        return isCommonField;
    }

    /** The match operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
    private final String matchOperator;

    /**
     * The match operator.
     *
     * @return the value
     */
    public String getMatchOperator() {
        return matchOperator;
    }

    /** The field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The field name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** THe field position. */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Long position;

    /**
     * THe field position.
     *
     * @return the value
     */
    public Long getPosition() {
        return position;
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
        sb.append("LookupField(");
        sb.append("super=").append(super.toString());
        sb.append("commonFieldName=").append(String.valueOf(this.commonFieldName));
        sb.append(", defaultMatchValue=").append(String.valueOf(this.defaultMatchValue));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isCommonField=").append(String.valueOf(this.isCommonField));
        sb.append(", matchOperator=").append(String.valueOf(this.matchOperator));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LookupField)) {
            return false;
        }

        LookupField other = (LookupField) o;
        return java.util.Objects.equals(this.commonFieldName, other.commonFieldName)
                && java.util.Objects.equals(this.defaultMatchValue, other.defaultMatchValue)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isCommonField, other.isCommonField)
                && java.util.Objects.equals(this.matchOperator, other.matchOperator)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.position, other.position)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.commonFieldName == null ? 43 : this.commonFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultMatchValue == null ? 43 : this.defaultMatchValue.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isCommonField == null ? 43 : this.isCommonField.hashCode());
        result =
                (result * PRIME)
                        + (this.matchOperator == null ? 43 : this.matchOperator.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
