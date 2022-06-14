/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Lets you rename an attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RenameRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RenameRule extends ProjectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
        private Boolean isJavaRegexSyntax;

        public Builder isJavaRegexSyntax(Boolean isJavaRegexSyntax) {
            this.isJavaRegexSyntax = isJavaRegexSyntax;
            this.__explicitlySet__.add("isJavaRegexSyntax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies whether to skip remaining rules when a match is found.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
        private Boolean isSkipRemainingRulesOnMatch;

        /**
         * Specifies whether to skip remaining rules when a match is found.
         * @param isSkipRemainingRulesOnMatch the value to set
         * @return this builder
         **/
        public Builder isSkipRemainingRulesOnMatch(Boolean isSkipRemainingRulesOnMatch) {
            this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
            this.__explicitlySet__.add("isSkipRemainingRulesOnMatch");
            return this;
        }
        /**
         * The attribute name that needs to be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fromName")
        private String fromName;

        /**
         * The attribute name that needs to be renamed.
         * @param fromName the value to set
         * @return this builder
         **/
        public Builder fromName(String fromName) {
            this.fromName = fromName;
            this.__explicitlySet__.add("fromName");
            return this;
        }
        /**
         * The new attribute name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toName")
        private String toName;

        /**
         * The new attribute name.
         * @param toName the value to set
         * @return this builder
         **/
        public Builder toName(String toName) {
            this.toName = toName;
            this.__explicitlySet__.add("toName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameRule build() {
            RenameRule __instance__ =
                    new RenameRule(
                            key,
                            modelVersion,
                            parentRef,
                            isJavaRegexSyntax,
                            configValues,
                            objectStatus,
                            description,
                            isSkipRemainingRulesOnMatch,
                            fromName,
                            toName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameRule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .isJavaRegexSyntax(o.getIsJavaRegexSyntax())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .isSkipRemainingRulesOnMatch(o.getIsSkipRemainingRulesOnMatch())
                            .fromName(o.getFromName())
                            .toName(o.getToName());

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
    public RenameRule(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Boolean isJavaRegexSyntax,
            ConfigValues configValues,
            Integer objectStatus,
            String description,
            Boolean isSkipRemainingRulesOnMatch,
            String fromName,
            String toName) {
        super(
                key,
                modelVersion,
                parentRef,
                isJavaRegexSyntax,
                configValues,
                objectStatus,
                description);
        this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
        this.fromName = fromName;
        this.toName = toName;
    }

    /**
     * Specifies whether to skip remaining rules when a match is found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
    private final Boolean isSkipRemainingRulesOnMatch;

    /**
     * Specifies whether to skip remaining rules when a match is found.
     * @return the value
     **/
    public Boolean getIsSkipRemainingRulesOnMatch() {
        return isSkipRemainingRulesOnMatch;
    }

    /**
     * The attribute name that needs to be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromName")
    private final String fromName;

    /**
     * The attribute name that needs to be renamed.
     * @return the value
     **/
    public String getFromName() {
        return fromName;
    }

    /**
     * The new attribute name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toName")
    private final String toName;

    /**
     * The new attribute name.
     * @return the value
     **/
    public String getToName() {
        return toName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RenameRule(");
        sb.append("super=").append(super.toString());
        sb.append(", isSkipRemainingRulesOnMatch=")
                .append(String.valueOf(this.isSkipRemainingRulesOnMatch));
        sb.append(", fromName=").append(String.valueOf(this.fromName));
        sb.append(", toName=").append(String.valueOf(this.toName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameRule)) {
            return false;
        }

        RenameRule other = (RenameRule) o;
        return java.util.Objects.equals(
                        this.isSkipRemainingRulesOnMatch, other.isSkipRemainingRulesOnMatch)
                && java.util.Objects.equals(this.fromName, other.fromName)
                && java.util.Objects.equals(this.toName, other.toName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isSkipRemainingRulesOnMatch == null
                                ? 43
                                : this.isSkipRemainingRulesOnMatch.hashCode());
        result = (result * PRIME) + (this.fromName == null ? 43 : this.fromName.hashCode());
        result = (result * PRIME) + (this.toName == null ? 43 : this.toName.hashCode());
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
