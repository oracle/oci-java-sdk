/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LookupField
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LookupField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LookupField {
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
        @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
        private String commonFieldName;

        public Builder commonFieldName(String commonFieldName) {
            this.commonFieldName = commonFieldName;
            this.__explicitlySet__.add("commonFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
        private String defaultMatchValue;

        public Builder defaultMatchValue(String defaultMatchValue) {
            this.defaultMatchValue = defaultMatchValue;
            this.__explicitlySet__.add("defaultMatchValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
        private Boolean isCommonField;

        public Builder isCommonField(Boolean isCommonField) {
            this.isCommonField = isCommonField;
            this.__explicitlySet__.add("isCommonField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
        private String matchOperator;

        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            this.__explicitlySet__.add("matchOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LookupField build() {
            LookupField __instance__ =
                    new LookupField(
                            commonFieldName,
                            defaultMatchValue,
                            displayName,
                            isCommonField,
                            matchOperator,
                            name,
                            position);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LookupField o) {
            Builder copiedBuilder =
                    commonFieldName(o.getCommonFieldName())
                            .defaultMatchValue(o.getDefaultMatchValue())
                            .displayName(o.getDisplayName())
                            .isCommonField(o.getIsCommonField())
                            .matchOperator(o.getMatchOperator())
                            .name(o.getName())
                            .position(o.getPosition());

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

    /**
     * The common field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
    private final String commonFieldName;

    public String getCommonFieldName() {
        return commonFieldName;
    }

    /**
     * The default match value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
    private final String defaultMatchValue;

    public String getDefaultMatchValue() {
        return defaultMatchValue;
    }

    /**
     * The field display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * A flag indicating whether or not the lookup field is a common field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
    private final Boolean isCommonField;

    public Boolean getIsCommonField() {
        return isCommonField;
    }

    /**
     * The match operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
    private final String matchOperator;

    public String getMatchOperator() {
        return matchOperator;
    }

    /**
     * The field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * THe field position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Long position;

    public Long getPosition() {
        return position;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LookupField(");
        sb.append("commonFieldName=").append(String.valueOf(this.commonFieldName));
        sb.append(", defaultMatchValue=").append(String.valueOf(this.defaultMatchValue));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isCommonField=").append(String.valueOf(this.isCommonField));
        sb.append(", matchOperator=").append(String.valueOf(this.matchOperator));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
