/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Validate pattern using the expression and file list. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidatePatternDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidatePatternDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "expression",
        "filePathPrefix",
        "checkFilePathList",
        "checkFailureLimit"
    })
    public ValidatePatternDetails(
            String expression,
            String filePathPrefix,
            java.util.List<String> checkFilePathList,
            Integer checkFailureLimit) {
        super();
        this.expression = expression;
        this.filePathPrefix = filePathPrefix;
        this.checkFilePathList = checkFilePathList;
        this.checkFailureLimit = checkFailureLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * for reference purposes, some example objects a pattern is meant to work with.
         *
         * <p>If provided with the request,this overrides the list which already exists as part of
         * the pattern, if any.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
        private java.util.List<String> checkFilePathList;

        /**
         * List of file paths against which the pattern can be tried, as a check. This documents,
         * for reference purposes, some example objects a pattern is meant to work with.
         *
         * <p>If provided with the request,this overrides the list which already exists as part of
         * the pattern, if any.
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
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
         * Optional, if checkFilePathList is provided.
         *
         * <p>If provided with the request, this overrides the value which already exists as part of
         * the pattern, if any.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
        private Integer checkFailureLimit;

        /**
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
         * Optional, if checkFilePathList is provided.
         *
         * <p>If provided with the request, this overrides the value which already exists as part of
         * the pattern, if any.
         *
         * @param checkFailureLimit the value to set
         * @return this builder
         */
        public Builder checkFailureLimit(Integer checkFailureLimit) {
            this.checkFailureLimit = checkFailureLimit;
            this.__explicitlySet__.add("checkFailureLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidatePatternDetails build() {
            ValidatePatternDetails model =
                    new ValidatePatternDetails(
                            this.expression,
                            this.filePathPrefix,
                            this.checkFilePathList,
                            this.checkFailureLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidatePatternDetails model) {
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("filePathPrefix")) {
                this.filePathPrefix(model.getFilePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("checkFilePathList")) {
                this.checkFilePathList(model.getCheckFilePathList());
            }
            if (model.wasPropertyExplicitlySet("checkFailureLimit")) {
                this.checkFailureLimit(model.getCheckFailureLimit());
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
     * reference purposes, some example objects a pattern is meant to work with.
     *
     * <p>If provided with the request,this overrides the list which already exists as part of the
     * pattern, if any.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
    private final java.util.List<String> checkFilePathList;

    /**
     * List of file paths against which the pattern can be tried, as a check. This documents, for
     * reference purposes, some example objects a pattern is meant to work with.
     *
     * <p>If provided with the request,this overrides the list which already exists as part of the
     * pattern, if any.
     *
     * @return the value
     */
    public java.util.List<String> getCheckFilePathList() {
        return checkFilePathList;
    }

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
     * Optional, if checkFilePathList is provided.
     *
     * <p>If provided with the request, this overrides the value which already exists as part of the
     * pattern, if any.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
    private final Integer checkFailureLimit;

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails.
     * Optional, if checkFilePathList is provided.
     *
     * <p>If provided with the request, this overrides the value which already exists as part of the
     * pattern, if any.
     *
     * @return the value
     */
    public Integer getCheckFailureLimit() {
        return checkFailureLimit;
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
        sb.append("ValidatePatternDetails(");
        sb.append("super=").append(super.toString());
        sb.append("expression=").append(String.valueOf(this.expression));
        sb.append(", filePathPrefix=").append(String.valueOf(this.filePathPrefix));
        sb.append(", checkFilePathList=").append(String.valueOf(this.checkFilePathList));
        sb.append(", checkFailureLimit=").append(String.valueOf(this.checkFailureLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidatePatternDetails)) {
            return false;
        }

        ValidatePatternDetails other = (ValidatePatternDetails) o;
        return java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.filePathPrefix, other.filePathPrefix)
                && java.util.Objects.equals(this.checkFilePathList, other.checkFilePathList)
                && java.util.Objects.equals(this.checkFailureLimit, other.checkFailureLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.filePathPrefix == null ? 43 : this.filePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFilePathList == null ? 43 : this.checkFilePathList.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFailureLimit == null ? 43 : this.checkFailureLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
