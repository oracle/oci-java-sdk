/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EfdRegexResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EfdRegexResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "baseFieldName",
        "id",
        "matchResult",
        "parsedFieldCount",
        "parsedFields",
        "regex",
        "status",
        "statusDescription",
        "isValidRegexSyntax",
        "violations"
    })
    public EfdRegexResult(
            String baseFieldName,
            Long id,
            RegexMatchResult matchResult,
            Integer parsedFieldCount,
            java.util.Map<String, String> parsedFields,
            String regex,
            String status,
            String statusDescription,
            Boolean isValidRegexSyntax,
            java.util.List<Violation> violations) {
        super();
        this.baseFieldName = baseFieldName;
        this.id = id;
        this.matchResult = matchResult;
        this.parsedFieldCount = parsedFieldCount;
        this.parsedFields = parsedFields;
        this.regex = regex;
        this.status = status;
        this.statusDescription = statusDescription;
        this.isValidRegexSyntax = isValidRegexSyntax;
        this.violations = violations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The base field name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
        private String baseFieldName;

        /**
         * The base field name.
         * @param baseFieldName the value to set
         * @return this builder
         **/
        public Builder baseFieldName(String baseFieldName) {
            this.baseFieldName = baseFieldName;
            this.__explicitlySet__.add("baseFieldName");
            return this;
        }
        /**
         * the unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * the unique identifier.
         * @param id the value to set
         * @return this builder
         **/
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
        /**
         * The parsed field count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldCount")
        private Integer parsedFieldCount;

        /**
         * The parsed field count.
         * @param parsedFieldCount the value to set
         * @return this builder
         **/
        public Builder parsedFieldCount(Integer parsedFieldCount) {
            this.parsedFieldCount = parsedFieldCount;
            this.__explicitlySet__.add("parsedFieldCount");
            return this;
        }
        /**
         * The parsed fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parsedFields")
        private java.util.Map<String, String> parsedFields;

        /**
         * The parsed fields.
         * @param parsedFields the value to set
         * @return this builder
         **/
        public Builder parsedFields(java.util.Map<String, String> parsedFields) {
            this.parsedFields = parsedFields;
            this.__explicitlySet__.add("parsedFields");
            return this;
        }
        /**
         * The regular expression.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regex")
        private String regex;

        /**
         * The regular expression.
         * @param regex the value to set
         * @return this builder
         **/
        public Builder regex(String regex) {
            this.regex = regex;
            this.__explicitlySet__.add("regex");
            return this;
        }
        /**
         * The status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The Status description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        /**
         * The Status description.
         * @param statusDescription the value to set
         * @return this builder
         **/
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }
        /**
         * A flag indicating whether or not the regular expression is valid.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isValidRegexSyntax")
        private Boolean isValidRegexSyntax;

        /**
         * A flag indicating whether or not the regular expression is valid.
         *
         * @param isValidRegexSyntax the value to set
         * @return this builder
         **/
        public Builder isValidRegexSyntax(Boolean isValidRegexSyntax) {
            this.isValidRegexSyntax = isValidRegexSyntax;
            this.__explicitlySet__.add("isValidRegexSyntax");
            return this;
        }
        /**
         * The list of violations (if any).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("violations")
        private java.util.List<Violation> violations;

        /**
         * The list of violations (if any).
         * @param violations the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The base field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseFieldName")
    private final String baseFieldName;

    /**
     * The base field name.
     * @return the value
     **/
    public String getBaseFieldName() {
        return baseFieldName;
    }

    /**
     * the unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * the unique identifier.
     * @return the value
     **/
    public Long getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchResult")
    private final RegexMatchResult matchResult;

    public RegexMatchResult getMatchResult() {
        return matchResult;
    }

    /**
     * The parsed field count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFieldCount")
    private final Integer parsedFieldCount;

    /**
     * The parsed field count.
     * @return the value
     **/
    public Integer getParsedFieldCount() {
        return parsedFieldCount;
    }

    /**
     * The parsed fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFields")
    private final java.util.Map<String, String> parsedFields;

    /**
     * The parsed fields.
     * @return the value
     **/
    public java.util.Map<String, String> getParsedFields() {
        return parsedFields;
    }

    /**
     * The regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regex")
    private final String regex;

    /**
     * The regular expression.
     * @return the value
     **/
    public String getRegex() {
        return regex;
    }

    /**
     * The status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status.
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * The Status description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    private final String statusDescription;

    /**
     * The Status description.
     * @return the value
     **/
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * A flag indicating whether or not the regular expression is valid.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValidRegexSyntax")
    private final Boolean isValidRegexSyntax;

    /**
     * A flag indicating whether or not the regular expression is valid.
     *
     * @return the value
     **/
    public Boolean getIsValidRegexSyntax() {
        return isValidRegexSyntax;
    }

    /**
     * The list of violations (if any).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violations")
    private final java.util.List<Violation> violations;

    /**
     * The list of violations (if any).
     * @return the value
     **/
    public java.util.List<Violation> getViolations() {
        return violations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EfdRegexResult(");
        sb.append("baseFieldName=").append(String.valueOf(this.baseFieldName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", matchResult=").append(String.valueOf(this.matchResult));
        sb.append(", parsedFieldCount=").append(String.valueOf(this.parsedFieldCount));
        sb.append(", parsedFields=").append(String.valueOf(this.parsedFields));
        sb.append(", regex=").append(String.valueOf(this.regex));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDescription=").append(String.valueOf(this.statusDescription));
        sb.append(", isValidRegexSyntax=").append(String.valueOf(this.isValidRegexSyntax));
        sb.append(", violations=").append(String.valueOf(this.violations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EfdRegexResult)) {
            return false;
        }

        EfdRegexResult other = (EfdRegexResult) o;
        return java.util.Objects.equals(this.baseFieldName, other.baseFieldName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.matchResult, other.matchResult)
                && java.util.Objects.equals(this.parsedFieldCount, other.parsedFieldCount)
                && java.util.Objects.equals(this.parsedFields, other.parsedFields)
                && java.util.Objects.equals(this.regex, other.regex)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDescription, other.statusDescription)
                && java.util.Objects.equals(this.isValidRegexSyntax, other.isValidRegexSyntax)
                && java.util.Objects.equals(this.violations, other.violations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.baseFieldName == null ? 43 : this.baseFieldName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.matchResult == null ? 43 : this.matchResult.hashCode());
        result =
                (result * PRIME)
                        + (this.parsedFieldCount == null ? 43 : this.parsedFieldCount.hashCode());
        result = (result * PRIME) + (this.parsedFields == null ? 43 : this.parsedFields.hashCode());
        result = (result * PRIME) + (this.regex == null ? 43 : this.regex.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDescription == null ? 43 : this.statusDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.isValidRegexSyntax == null
                                ? 43
                                : this.isValidRegexSyntax.hashCode());
        result = (result * PRIME) + (this.violations == null ? 43 : this.violations.hashCode());
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
