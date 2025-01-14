/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The result of a comparison of two lines in the two content input strings. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompareLineResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompareLineResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "leftContent",
        "rightContent",
        "diffType",
        "leftIndices",
        "rightIndices"
    })
    public CompareLineResult(
            String leftContent,
            String rightContent,
            String diffType,
            String leftIndices,
            String rightIndices) {
        super();
        this.leftContent = leftContent;
        this.rightContent = rightContent;
        this.diffType = diffType;
        this.leftIndices = leftIndices;
        this.rightIndices = rightIndices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A line from the content on the left. This may be empty if there is no matching line on
         * the left for a line in the right content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("leftContent")
        private String leftContent;

        /**
         * A line from the content on the left. This may be empty if there is no matching line on
         * the left for a line in the right content.
         *
         * @param leftContent the value to set
         * @return this builder
         */
        public Builder leftContent(String leftContent) {
            this.leftContent = leftContent;
            this.__explicitlySet__.add("leftContent");
            return this;
        }
        /**
         * A line from the content on the right. This may be empty if there is no matching line on
         * the right for a line in the left content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rightContent")
        private String rightContent;

        /**
         * A line from the content on the right. This may be empty if there is no matching line on
         * the right for a line in the left content.
         *
         * @param rightContent the value to set
         * @return this builder
         */
        public Builder rightContent(String rightContent) {
            this.rightContent = rightContent;
            this.__explicitlySet__.add("rightContent");
            return this;
        }
        /**
         * The result of the line comparison. An empty string means the lines being compared are the
         * same. A pipe, |, means the lines are different, and a caret, > or <, means the line is
         * only found either on the right or the left.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("diffType")
        private String diffType;

        /**
         * The result of the line comparison. An empty string means the lines being compared are the
         * same. A pipe, |, means the lines are different, and a caret, > or <, means the line is
         * only found either on the right or the left.
         *
         * @param diffType the value to set
         * @return this builder
         */
        public Builder diffType(String diffType) {
            this.diffType = diffType;
            this.__explicitlySet__.add("diffType");
            return this;
        }
        /**
         * A comma delimited set of indices that identify which characters are different from those
         * in the right string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("leftIndices")
        private String leftIndices;

        /**
         * A comma delimited set of indices that identify which characters are different from those
         * in the right string.
         *
         * @param leftIndices the value to set
         * @return this builder
         */
        public Builder leftIndices(String leftIndices) {
            this.leftIndices = leftIndices;
            this.__explicitlySet__.add("leftIndices");
            return this;
        }
        /**
         * A comma delimited set of indices that identify which characters are different from those
         * in the left string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rightIndices")
        private String rightIndices;

        /**
         * A comma delimited set of indices that identify which characters are different from those
         * in the left string.
         *
         * @param rightIndices the value to set
         * @return this builder
         */
        public Builder rightIndices(String rightIndices) {
            this.rightIndices = rightIndices;
            this.__explicitlySet__.add("rightIndices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompareLineResult build() {
            CompareLineResult model =
                    new CompareLineResult(
                            this.leftContent,
                            this.rightContent,
                            this.diffType,
                            this.leftIndices,
                            this.rightIndices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompareLineResult model) {
            if (model.wasPropertyExplicitlySet("leftContent")) {
                this.leftContent(model.getLeftContent());
            }
            if (model.wasPropertyExplicitlySet("rightContent")) {
                this.rightContent(model.getRightContent());
            }
            if (model.wasPropertyExplicitlySet("diffType")) {
                this.diffType(model.getDiffType());
            }
            if (model.wasPropertyExplicitlySet("leftIndices")) {
                this.leftIndices(model.getLeftIndices());
            }
            if (model.wasPropertyExplicitlySet("rightIndices")) {
                this.rightIndices(model.getRightIndices());
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
     * A line from the content on the left. This may be empty if there is no matching line on the
     * left for a line in the right content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("leftContent")
    private final String leftContent;

    /**
     * A line from the content on the left. This may be empty if there is no matching line on the
     * left for a line in the right content.
     *
     * @return the value
     */
    public String getLeftContent() {
        return leftContent;
    }

    /**
     * A line from the content on the right. This may be empty if there is no matching line on the
     * right for a line in the left content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rightContent")
    private final String rightContent;

    /**
     * A line from the content on the right. This may be empty if there is no matching line on the
     * right for a line in the left content.
     *
     * @return the value
     */
    public String getRightContent() {
        return rightContent;
    }

    /**
     * The result of the line comparison. An empty string means the lines being compared are the
     * same. A pipe, |, means the lines are different, and a caret, > or <, means the line is only
     * found either on the right or the left.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diffType")
    private final String diffType;

    /**
     * The result of the line comparison. An empty string means the lines being compared are the
     * same. A pipe, |, means the lines are different, and a caret, > or <, means the line is only
     * found either on the right or the left.
     *
     * @return the value
     */
    public String getDiffType() {
        return diffType;
    }

    /**
     * A comma delimited set of indices that identify which characters are different from those in
     * the right string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("leftIndices")
    private final String leftIndices;

    /**
     * A comma delimited set of indices that identify which characters are different from those in
     * the right string.
     *
     * @return the value
     */
    public String getLeftIndices() {
        return leftIndices;
    }

    /**
     * A comma delimited set of indices that identify which characters are different from those in
     * the left string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rightIndices")
    private final String rightIndices;

    /**
     * A comma delimited set of indices that identify which characters are different from those in
     * the left string.
     *
     * @return the value
     */
    public String getRightIndices() {
        return rightIndices;
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
        sb.append("CompareLineResult(");
        sb.append("super=").append(super.toString());
        sb.append("leftContent=").append(String.valueOf(this.leftContent));
        sb.append(", rightContent=").append(String.valueOf(this.rightContent));
        sb.append(", diffType=").append(String.valueOf(this.diffType));
        sb.append(", leftIndices=").append(String.valueOf(this.leftIndices));
        sb.append(", rightIndices=").append(String.valueOf(this.rightIndices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompareLineResult)) {
            return false;
        }

        CompareLineResult other = (CompareLineResult) o;
        return java.util.Objects.equals(this.leftContent, other.leftContent)
                && java.util.Objects.equals(this.rightContent, other.rightContent)
                && java.util.Objects.equals(this.diffType, other.diffType)
                && java.util.Objects.equals(this.leftIndices, other.leftIndices)
                && java.util.Objects.equals(this.rightIndices, other.rightIndices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.leftContent == null ? 43 : this.leftContent.hashCode());
        result = (result * PRIME) + (this.rightContent == null ? 43 : this.rightContent.hashCode());
        result = (result * PRIME) + (this.diffType == null ? 43 : this.diffType.hashCode());
        result = (result * PRIME) + (this.leftIndices == null ? 43 : this.leftIndices.hashCode());
        result = (result * PRIME) + (this.rightIndices == null ? 43 : this.rightIndices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
