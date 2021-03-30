/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * EfdRegexResult
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EfdRegexResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EfdRegexResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
        private String baseFieldName;

        public Builder baseFieldName(String baseFieldName) {
            this.baseFieldName = baseFieldName;
            this.__explicitlySet__.add("baseFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchResult")
        private RegexMatchResult matchResult;

        public Builder matchResult(RegexMatchResult matchResult) {
            this.matchResult = matchResult;
            this.__explicitlySet__.add("matchResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldCount")
        private Integer parsedFieldCount;

        public Builder parsedFieldCount(Integer parsedFieldCount) {
            this.parsedFieldCount = parsedFieldCount;
            this.__explicitlySet__.add("parsedFieldCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsedFields")
        private java.util.Map<String, String> parsedFields;

        public Builder parsedFields(java.util.Map<String, String> parsedFields) {
            this.parsedFields = parsedFields;
            this.__explicitlySet__.add("parsedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regex")
        private String regex;

        public Builder regex(String regex) {
            this.regex = regex;
            this.__explicitlySet__.add("regex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isValidRegexSyntax")
        private Boolean isValidRegexSyntax;

        public Builder isValidRegexSyntax(Boolean isValidRegexSyntax) {
            this.isValidRegexSyntax = isValidRegexSyntax;
            this.__explicitlySet__.add("isValidRegexSyntax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("violations")
        private java.util.List<Violation> violations;

        public Builder violations(java.util.List<Violation> violations) {
            this.violations = violations;
            this.__explicitlySet__.add("violations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EfdRegexResult build() {
            EfdRegexResult __instance__ =
                    new EfdRegexResult(
                            baseFieldName,
                            id,
                            matchResult,
                            parsedFieldCount,
                            parsedFields,
                            regex,
                            status,
                            statusDescription,
                            isValidRegexSyntax,
                            violations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EfdRegexResult o) {
            Builder copiedBuilder =
                    baseFieldName(o.getBaseFieldName())
                            .id(o.getId())
                            .matchResult(o.getMatchResult())
                            .parsedFieldCount(o.getParsedFieldCount())
                            .parsedFields(o.getParsedFields())
                            .regex(o.getRegex())
                            .status(o.getStatus())
                            .statusDescription(o.getStatusDescription())
                            .isValidRegexSyntax(o.getIsValidRegexSyntax())
                            .violations(o.getViolations());

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

    /**
     * The base field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
    String baseFieldName;

    /**
     * the unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    Long id;

    @com.fasterxml.jackson.annotation.JsonProperty("matchResult")
    RegexMatchResult matchResult;

    /**
     * The parsed field count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldCount")
    Integer parsedFieldCount;

    /**
     * The parsed fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFields")
    java.util.Map<String, String> parsedFields;

    /**
     * The regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regex")
    String regex;

    /**
     * The status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    /**
     * The Status description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    String statusDescription;

    /**
     * A flag indicating whether or not the regular expression is valid.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValidRegexSyntax")
    Boolean isValidRegexSyntax;

    /**
     * The list of violations (if any).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violations")
    java.util.List<Violation> violations;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
