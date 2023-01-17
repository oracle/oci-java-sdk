/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in pattern update operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePatternDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdatePatternDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "expression",
        "filePathPrefix",
        "checkFilePathList",
        "isEnableCheckFailureLimit",
        "checkFailureLimit",
        "properties"
    })
    public UpdatePatternDetails(
            String displayName,
            String description,
            String expression,
            String filePathPrefix,
            java.util.List<String> checkFilePathList,
            Boolean isEnableCheckFailureLimit,
            Integer checkFailureLimit,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.expression = expression;
        this.filePathPrefix = filePathPrefix;
        this.checkFilePathList = checkFilePathList;
        this.isEnableCheckFailureLimit = isEnableCheckFailureLimit;
        this.checkFailureLimit = checkFailureLimit;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detailed description of the Pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the Pattern.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Input string which drives the selection process, allowing for fine-grained control using
         * qualifiers. Refer to the user documentation for details of the format and examples. A
         * pattern cannot include both a prefix and an expression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * Input string which drives the selection process, allowing for fine-grained control using
         * qualifiers. Refer to the user documentation for details of the format and examples. A
         * pattern cannot include both a prefix and an expression.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /**
         * Input string which drives the selection process. Refer to the user documentation for
         * details of the format and examples. A pattern cannot include both a prefix and an
         * expression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
        private String filePathPrefix;

        /**
         * Input string which drives the selection process. Refer to the user documentation for
         * details of the format and examples. A pattern cannot include both a prefix and an
         * expression.
         *
         * @param filePathPrefix the value to set
         * @return this builder
         */
        public Builder filePathPrefix(String filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            this.__explicitlySet__.add("filePathPrefix");
            return this;
        }
        /**
         * List of file paths against which the pattern can be tried, as a check. This documents,
         * for reference purposes, some example objects a pattern is meant to work with. If
         * isEnableCheckFailureLimit is set to true, this will be run as a validation during the
         * request, such that if the check fails the request fails. If isEnableCheckFailureLimit
         * instead is set to (the default) false, a pattern will still be created or updated even if
         * the check fails, with a lifecycleState of FAILED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
        private java.util.List<String> checkFilePathList;

        /**
         * List of file paths against which the pattern can be tried, as a check. This documents,
         * for reference purposes, some example objects a pattern is meant to work with. If
         * isEnableCheckFailureLimit is set to true, this will be run as a validation during the
         * request, such that if the check fails the request fails. If isEnableCheckFailureLimit
         * instead is set to (the default) false, a pattern will still be created or updated even if
         * the check fails, with a lifecycleState of FAILED.
         *
         * @param checkFilePathList the value to set
         * @return this builder
         */
        public Builder checkFilePathList(java.util.List<String> checkFilePathList) {
            this.checkFilePathList = checkFilePathList;
            this.__explicitlySet__.add("checkFilePathList");
            return this;
        }
        /**
         * Indicates whether the pattern check, against the checkFilePathList, will fail the request
         * if the count of UNMATCHED files is above the checkFailureLimit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
        private Boolean isEnableCheckFailureLimit;

        /**
         * Indicates whether the pattern check, against the checkFilePathList, will fail the request
         * if the count of UNMATCHED files is above the checkFailureLimit.
         *
         * @param isEnableCheckFailureLimit the value to set
         * @return this builder
         */
        public Builder isEnableCheckFailureLimit(Boolean isEnableCheckFailureLimit) {
            this.isEnableCheckFailureLimit = isEnableCheckFailureLimit;
            this.__explicitlySet__.add("isEnableCheckFailureLimit");
            return this;
        }
        /**
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
         * Optional, if checkFilePathList is provided - but if isEnableCheckFailureLimit is set to
         * true it is required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
        private Integer checkFailureLimit;

        /**
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
         * Optional, if checkFilePathList is provided - but if isEnableCheckFailureLimit is set to
         * true it is required.
         *
         * @param checkFailureLimit the value to set
         * @return this builder
         */
        public Builder checkFailureLimit(Integer checkFailureLimit) {
            this.checkFailureLimit = checkFailureLimit;
            this.__explicitlySet__.add("checkFailureLimit");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the pattern type. Each
         * pattern type definition defines it's set of required and optional properties. Example:
         * {@code {"properties": { "default": { "tbd"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the pattern type. Each
         * pattern type definition defines it's set of required and optional properties. Example:
         * {@code {"properties": { "default": { "tbd"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePatternDetails build() {
            UpdatePatternDetails model =
                    new UpdatePatternDetails(
                            this.displayName,
                            this.description,
                            this.expression,
                            this.filePathPrefix,
                            this.checkFilePathList,
                            this.isEnableCheckFailureLimit,
                            this.checkFailureLimit,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePatternDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("filePathPrefix")) {
                this.filePathPrefix(model.getFilePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("checkFilePathList")) {
                this.checkFilePathList(model.getCheckFilePathList());
            }
            if (model.wasPropertyExplicitlySet("isEnableCheckFailureLimit")) {
                this.isEnableCheckFailureLimit(model.getIsEnableCheckFailureLimit());
            }
            if (model.wasPropertyExplicitlySet("checkFailureLimit")) {
                this.checkFailureLimit(model.getCheckFailureLimit());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detailed description of the Pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the Pattern.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Input string which drives the selection process, allowing for fine-grained control using
     * qualifiers. Refer to the user documentation for details of the format and examples. A pattern
     * cannot include both a prefix and an expression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * Input string which drives the selection process, allowing for fine-grained control using
     * qualifiers. Refer to the user documentation for details of the format and examples. A pattern
     * cannot include both a prefix and an expression.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Input string which drives the selection process. Refer to the user documentation for details
     * of the format and examples. A pattern cannot include both a prefix and an expression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
    private final String filePathPrefix;

    /**
     * Input string which drives the selection process. Refer to the user documentation for details
     * of the format and examples. A pattern cannot include both a prefix and an expression.
     *
     * @return the value
     */
    public String getFilePathPrefix() {
        return filePathPrefix;
    }

    /**
     * List of file paths against which the pattern can be tried, as a check. This documents, for
     * reference purposes, some example objects a pattern is meant to work with. If
     * isEnableCheckFailureLimit is set to true, this will be run as a validation during the
     * request, such that if the check fails the request fails. If isEnableCheckFailureLimit instead
     * is set to (the default) false, a pattern will still be created or updated even if the check
     * fails, with a lifecycleState of FAILED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
    private final java.util.List<String> checkFilePathList;

    /**
     * List of file paths against which the pattern can be tried, as a check. This documents, for
     * reference purposes, some example objects a pattern is meant to work with. If
     * isEnableCheckFailureLimit is set to true, this will be run as a validation during the
     * request, such that if the check fails the request fails. If isEnableCheckFailureLimit instead
     * is set to (the default) false, a pattern will still be created or updated even if the check
     * fails, with a lifecycleState of FAILED.
     *
     * @return the value
     */
    public java.util.List<String> getCheckFilePathList() {
        return checkFilePathList;
    }

    /**
     * Indicates whether the pattern check, against the checkFilePathList, will fail the request if
     * the count of UNMATCHED files is above the checkFailureLimit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
    private final Boolean isEnableCheckFailureLimit;

    /**
     * Indicates whether the pattern check, against the checkFilePathList, will fail the request if
     * the count of UNMATCHED files is above the checkFailureLimit.
     *
     * @return the value
     */
    public Boolean getIsEnableCheckFailureLimit() {
        return isEnableCheckFailureLimit;
    }

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
     * Optional, if checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true
     * it is required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
    private final Integer checkFailureLimit;

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
     * Optional, if checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true
     * it is required.
     *
     * @return the value
     */
    public Integer getCheckFailureLimit() {
        return checkFailureLimit;
    }

    /**
     * A map of maps that contains the properties which are specific to the pattern type. Each
     * pattern type definition defines it's set of required and optional properties. Example: {@code
     * {"properties": { "default": { "tbd"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the pattern type. Each
     * pattern type definition defines it's set of required and optional properties. Example: {@code
     * {"properties": { "default": { "tbd"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("UpdatePatternDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", filePathPrefix=").append(String.valueOf(this.filePathPrefix));
        sb.append(", checkFilePathList=").append(String.valueOf(this.checkFilePathList));
        sb.append(", isEnableCheckFailureLimit=")
                .append(String.valueOf(this.isEnableCheckFailureLimit));
        sb.append(", checkFailureLimit=").append(String.valueOf(this.checkFailureLimit));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePatternDetails)) {
            return false;
        }

        UpdatePatternDetails other = (UpdatePatternDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.filePathPrefix, other.filePathPrefix)
                && java.util.Objects.equals(this.checkFilePathList, other.checkFilePathList)
                && java.util.Objects.equals(
                        this.isEnableCheckFailureLimit, other.isEnableCheckFailureLimit)
                && java.util.Objects.equals(this.checkFailureLimit, other.checkFailureLimit)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.filePathPrefix == null ? 43 : this.filePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFilePathList == null ? 43 : this.checkFilePathList.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableCheckFailureLimit == null
                                ? 43
                                : this.isEnableCheckFailureLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFailureLimit == null ? 43 : this.checkFailureLimit.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
