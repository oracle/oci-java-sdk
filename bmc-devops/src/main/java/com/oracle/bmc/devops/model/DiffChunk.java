/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about a group of changes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffChunk.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DiffChunk extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "baseLine",
        "baseSpan",
        "targetLine",
        "targetSpan",
        "diffSections"
    })
    public DiffChunk(
            Integer baseLine,
            Integer baseSpan,
            Integer targetLine,
            Integer targetSpan,
            java.util.List<DiffSection> diffSections) {
        super();
        this.baseLine = baseLine;
        this.baseSpan = baseSpan;
        this.targetLine = targetLine;
        this.targetSpan = targetSpan;
        this.diffSections = diffSections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Line number in base version where changes begin. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
        private Integer baseLine;

        /**
         * Line number in base version where changes begin.
         *
         * @param baseLine the value to set
         * @return this builder
         */
        public Builder baseLine(Integer baseLine) {
            this.baseLine = baseLine;
            this.__explicitlySet__.add("baseLine");
            return this;
        }
        /** Number of lines chunk spans in base version. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseSpan")
        private Integer baseSpan;

        /**
         * Number of lines chunk spans in base version.
         *
         * @param baseSpan the value to set
         * @return this builder
         */
        public Builder baseSpan(Integer baseSpan) {
            this.baseSpan = baseSpan;
            this.__explicitlySet__.add("baseSpan");
            return this;
        }
        /** Line number in target version where changes begin. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
        private Integer targetLine;

        /**
         * Line number in target version where changes begin.
         *
         * @param targetLine the value to set
         * @return this builder
         */
        public Builder targetLine(Integer targetLine) {
            this.targetLine = targetLine;
            this.__explicitlySet__.add("targetLine");
            return this;
        }
        /** Number of lines chunk spans in target version. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetSpan")
        private Integer targetSpan;

        /**
         * Number of lines chunk spans in target version.
         *
         * @param targetSpan the value to set
         * @return this builder
         */
        public Builder targetSpan(Integer targetSpan) {
            this.targetSpan = targetSpan;
            this.__explicitlySet__.add("targetSpan");
            return this;
        }
        /** List of difference section. */
        @com.fasterxml.jackson.annotation.JsonProperty("diffSections")
        private java.util.List<DiffSection> diffSections;

        /**
         * List of difference section.
         *
         * @param diffSections the value to set
         * @return this builder
         */
        public Builder diffSections(java.util.List<DiffSection> diffSections) {
            this.diffSections = diffSections;
            this.__explicitlySet__.add("diffSections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffChunk build() {
            DiffChunk model =
                    new DiffChunk(
                            this.baseLine,
                            this.baseSpan,
                            this.targetLine,
                            this.targetSpan,
                            this.diffSections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffChunk model) {
            if (model.wasPropertyExplicitlySet("baseLine")) {
                this.baseLine(model.getBaseLine());
            }
            if (model.wasPropertyExplicitlySet("baseSpan")) {
                this.baseSpan(model.getBaseSpan());
            }
            if (model.wasPropertyExplicitlySet("targetLine")) {
                this.targetLine(model.getTargetLine());
            }
            if (model.wasPropertyExplicitlySet("targetSpan")) {
                this.targetSpan(model.getTargetSpan());
            }
            if (model.wasPropertyExplicitlySet("diffSections")) {
                this.diffSections(model.getDiffSections());
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

    /** Line number in base version where changes begin. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
    private final Integer baseLine;

    /**
     * Line number in base version where changes begin.
     *
     * @return the value
     */
    public Integer getBaseLine() {
        return baseLine;
    }

    /** Number of lines chunk spans in base version. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseSpan")
    private final Integer baseSpan;

    /**
     * Number of lines chunk spans in base version.
     *
     * @return the value
     */
    public Integer getBaseSpan() {
        return baseSpan;
    }

    /** Line number in target version where changes begin. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
    private final Integer targetLine;

    /**
     * Line number in target version where changes begin.
     *
     * @return the value
     */
    public Integer getTargetLine() {
        return targetLine;
    }

    /** Number of lines chunk spans in target version. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetSpan")
    private final Integer targetSpan;

    /**
     * Number of lines chunk spans in target version.
     *
     * @return the value
     */
    public Integer getTargetSpan() {
        return targetSpan;
    }

    /** List of difference section. */
    @com.fasterxml.jackson.annotation.JsonProperty("diffSections")
    private final java.util.List<DiffSection> diffSections;

    /**
     * List of difference section.
     *
     * @return the value
     */
    public java.util.List<DiffSection> getDiffSections() {
        return diffSections;
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
        sb.append("DiffChunk(");
        sb.append("super=").append(super.toString());
        sb.append("baseLine=").append(String.valueOf(this.baseLine));
        sb.append(", baseSpan=").append(String.valueOf(this.baseSpan));
        sb.append(", targetLine=").append(String.valueOf(this.targetLine));
        sb.append(", targetSpan=").append(String.valueOf(this.targetSpan));
        sb.append(", diffSections=").append(String.valueOf(this.diffSections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiffChunk)) {
            return false;
        }

        DiffChunk other = (DiffChunk) o;
        return java.util.Objects.equals(this.baseLine, other.baseLine)
                && java.util.Objects.equals(this.baseSpan, other.baseSpan)
                && java.util.Objects.equals(this.targetLine, other.targetLine)
                && java.util.Objects.equals(this.targetSpan, other.targetSpan)
                && java.util.Objects.equals(this.diffSections, other.diffSections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.baseLine == null ? 43 : this.baseLine.hashCode());
        result = (result * PRIME) + (this.baseSpan == null ? 43 : this.baseSpan.hashCode());
        result = (result * PRIME) + (this.targetLine == null ? 43 : this.targetLine.hashCode());
        result = (result * PRIME) + (this.targetSpan == null ? 43 : this.targetSpan.hashCode());
        result = (result * PRIME) + (this.diffSections == null ? 43 : this.diffSections.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
