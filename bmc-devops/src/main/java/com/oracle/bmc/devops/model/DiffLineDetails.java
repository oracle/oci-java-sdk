/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about a line within the difference.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffLineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiffLineDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"baseLine", "targetLine", "lineContent", "conflictMarker"})
    public DiffLineDetails(
            Integer baseLine,
            Integer targetLine,
            String lineContent,
            ConflictMarker conflictMarker) {
        super();
        this.baseLine = baseLine;
        this.targetLine = targetLine;
        this.lineContent = lineContent;
        this.conflictMarker = conflictMarker;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of a line in the base version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
        private Integer baseLine;

        /**
         * The number of a line in the base version.
         * @param baseLine the value to set
         * @return this builder
         **/
        public Builder baseLine(Integer baseLine) {
            this.baseLine = baseLine;
            this.__explicitlySet__.add("baseLine");
            return this;
        }
        /**
         * The number of a line in the target version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
        private Integer targetLine;

        /**
         * The number of a line in the target version.
         * @param targetLine the value to set
         * @return this builder
         **/
        public Builder targetLine(Integer targetLine) {
            this.targetLine = targetLine;
            this.__explicitlySet__.add("targetLine");
            return this;
        }
        /**
         * The contents of a line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
        private String lineContent;

        /**
         * The contents of a line.
         * @param lineContent the value to set
         * @return this builder
         **/
        public Builder lineContent(String lineContent) {
            this.lineContent = lineContent;
            this.__explicitlySet__.add("lineContent");
            return this;
        }
        /**
         * Indicates whether a line in a conflicted section of the difference is from the base version, the target version, or if its just a marker indicating the beginning, middle, or end of a conflicted section.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("conflictMarker")
        private ConflictMarker conflictMarker;

        /**
         * Indicates whether a line in a conflicted section of the difference is from the base version, the target version, or if its just a marker indicating the beginning, middle, or end of a conflicted section.
         * @param conflictMarker the value to set
         * @return this builder
         **/
        public Builder conflictMarker(ConflictMarker conflictMarker) {
            this.conflictMarker = conflictMarker;
            this.__explicitlySet__.add("conflictMarker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffLineDetails build() {
            DiffLineDetails model =
                    new DiffLineDetails(
                            this.baseLine, this.targetLine, this.lineContent, this.conflictMarker);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffLineDetails model) {
            if (model.wasPropertyExplicitlySet("baseLine")) {
                this.baseLine(model.getBaseLine());
            }
            if (model.wasPropertyExplicitlySet("targetLine")) {
                this.targetLine(model.getTargetLine());
            }
            if (model.wasPropertyExplicitlySet("lineContent")) {
                this.lineContent(model.getLineContent());
            }
            if (model.wasPropertyExplicitlySet("conflictMarker")) {
                this.conflictMarker(model.getConflictMarker());
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
     * The number of a line in the base version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
    private final Integer baseLine;

    /**
     * The number of a line in the base version.
     * @return the value
     **/
    public Integer getBaseLine() {
        return baseLine;
    }

    /**
     * The number of a line in the target version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
    private final Integer targetLine;

    /**
     * The number of a line in the target version.
     * @return the value
     **/
    public Integer getTargetLine() {
        return targetLine;
    }

    /**
     * The contents of a line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
    private final String lineContent;

    /**
     * The contents of a line.
     * @return the value
     **/
    public String getLineContent() {
        return lineContent;
    }

    /**
     * Indicates whether a line in a conflicted section of the difference is from the base version, the target version, or if its just a marker indicating the beginning, middle, or end of a conflicted section.
     **/
    public enum ConflictMarker {
        Base("BASE"),
        Target("TARGET"),
        Marker("MARKER"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConflictMarker.class);

        private final String value;
        private static java.util.Map<String, ConflictMarker> map;

        static {
            map = new java.util.HashMap<>();
            for (ConflictMarker v : ConflictMarker.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConflictMarker(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConflictMarker create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConflictMarker', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether a line in a conflicted section of the difference is from the base version, the target version, or if its just a marker indicating the beginning, middle, or end of a conflicted section.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictMarker")
    private final ConflictMarker conflictMarker;

    /**
     * Indicates whether a line in a conflicted section of the difference is from the base version, the target version, or if its just a marker indicating the beginning, middle, or end of a conflicted section.
     * @return the value
     **/
    public ConflictMarker getConflictMarker() {
        return conflictMarker;
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
        sb.append("DiffLineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("baseLine=").append(String.valueOf(this.baseLine));
        sb.append(", targetLine=").append(String.valueOf(this.targetLine));
        sb.append(", lineContent=").append(String.valueOf(this.lineContent));
        sb.append(", conflictMarker=").append(String.valueOf(this.conflictMarker));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiffLineDetails)) {
            return false;
        }

        DiffLineDetails other = (DiffLineDetails) o;
        return java.util.Objects.equals(this.baseLine, other.baseLine)
                && java.util.Objects.equals(this.targetLine, other.targetLine)
                && java.util.Objects.equals(this.lineContent, other.lineContent)
                && java.util.Objects.equals(this.conflictMarker, other.conflictMarker)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.baseLine == null ? 43 : this.baseLine.hashCode());
        result = (result * PRIME) + (this.targetLine == null ? 43 : this.targetLine.hashCode());
        result = (result * PRIME) + (this.lineContent == null ? 43 : this.lineContent.hashCode());
        result =
                (result * PRIME)
                        + (this.conflictMarker == null ? 43 : this.conflictMarker.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
