/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class DiffLineDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
        private Integer baseLine;

        public Builder baseLine(Integer baseLine) {
            this.baseLine = baseLine;
            this.__explicitlySet__.add("baseLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
        private Integer targetLine;

        public Builder targetLine(Integer targetLine) {
            this.targetLine = targetLine;
            this.__explicitlySet__.add("targetLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
        private String lineContent;

        public Builder lineContent(String lineContent) {
            this.lineContent = lineContent;
            this.__explicitlySet__.add("lineContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictMarker")
        private ConflictMarker conflictMarker;

        public Builder conflictMarker(ConflictMarker conflictMarker) {
            this.conflictMarker = conflictMarker;
            this.__explicitlySet__.add("conflictMarker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffLineDetails build() {
            DiffLineDetails __instance__ =
                    new DiffLineDetails(baseLine, targetLine, lineContent, conflictMarker);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffLineDetails o) {
            Builder copiedBuilder =
                    baseLine(o.getBaseLine())
                            .targetLine(o.getTargetLine())
                            .lineContent(o.getLineContent())
                            .conflictMarker(o.getConflictMarker());

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
     * The number of a line in the base version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseLine")
    private final Integer baseLine;

    public Integer getBaseLine() {
        return baseLine;
    }

    /**
     * The number of a line in the target version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetLine")
    private final Integer targetLine;

    public Integer getTargetLine() {
        return targetLine;
    }

    /**
     * The contents of a line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
    private final String lineContent;

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

    public ConflictMarker getConflictMarker() {
        return conflictMarker;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DiffLineDetails(");
        sb.append("baseLine=").append(String.valueOf(this.baseLine));
        sb.append(", targetLine=").append(String.valueOf(this.targetLine));
        sb.append(", lineContent=").append(String.valueOf(this.lineContent));
        sb.append(", conflictMarker=").append(String.valueOf(this.conflictMarker));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
