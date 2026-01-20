/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A source reference or citation for a piece of content. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CohereCitationV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereCitationV2
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"start", "end", "text", "contentIndex", "type", "sources"})
    public CohereCitationV2(
            Integer start,
            Integer end,
            String text,
            Integer contentIndex,
            Type type,
            java.util.List<CohereCitationSourceV2> sources) {
        super();
        this.start = start;
        this.end = end;
        this.text = text;
        this.contentIndex = contentIndex;
        this.type = type;
        this.sources = sources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Start index of the cited snippet in the original source text. */
        @com.fasterxml.jackson.annotation.JsonProperty("start")
        private Integer start;

        /**
         * Start index of the cited snippet in the original source text.
         *
         * @param start the value to set
         * @return this builder
         */
        public Builder start(Integer start) {
            this.start = start;
            this.__explicitlySet__.add("start");
            return this;
        }
        /** End index of the cited snippet in the original source text. */
        @com.fasterxml.jackson.annotation.JsonProperty("end")
        private Integer end;

        /**
         * End index of the cited snippet in the original source text.
         *
         * @param end the value to set
         * @return this builder
         */
        public Builder end(Integer end) {
            this.end = end;
            this.__explicitlySet__.add("end");
            return this;
        }
        /** Text snippet that is being cited. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Text snippet that is being cited.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Index of the content block in which this citation appears. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentIndex")
        private Integer contentIndex;

        /**
         * Index of the content block in which this citation appears.
         *
         * @param contentIndex the value to set
         * @return this builder
         */
        public Builder contentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            this.__explicitlySet__.add("contentIndex");
            return this;
        }
        /** The type of citation indicating what part of the response it is for. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of citation indicating what part of the response it is for.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** List of source objects for this citation. */
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<CohereCitationSourceV2> sources;

        /**
         * List of source objects for this citation.
         *
         * @param sources the value to set
         * @return this builder
         */
        public Builder sources(java.util.List<CohereCitationSourceV2> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereCitationV2 build() {
            CohereCitationV2 model =
                    new CohereCitationV2(
                            this.start,
                            this.end,
                            this.text,
                            this.contentIndex,
                            this.type,
                            this.sources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereCitationV2 model) {
            if (model.wasPropertyExplicitlySet("start")) {
                this.start(model.getStart());
            }
            if (model.wasPropertyExplicitlySet("end")) {
                this.end(model.getEnd());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("contentIndex")) {
                this.contentIndex(model.getContentIndex());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
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

    /** Start index of the cited snippet in the original source text. */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    private final Integer start;

    /**
     * Start index of the cited snippet in the original source text.
     *
     * @return the value
     */
    public Integer getStart() {
        return start;
    }

    /** End index of the cited snippet in the original source text. */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    private final Integer end;

    /**
     * End index of the cited snippet in the original source text.
     *
     * @return the value
     */
    public Integer getEnd() {
        return end;
    }

    /** Text snippet that is being cited. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Text snippet that is being cited.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Index of the content block in which this citation appears. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentIndex")
    private final Integer contentIndex;

    /**
     * Index of the content block in which this citation appears.
     *
     * @return the value
     */
    public Integer getContentIndex() {
        return contentIndex;
    }

    /** The type of citation indicating what part of the response it is for. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        TextContent("TEXT_CONTENT"),
        ThinkingContent("THINKING_CONTENT"),
        Plan("PLAN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of citation indicating what part of the response it is for. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of citation indicating what part of the response it is for.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** List of source objects for this citation. */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<CohereCitationSourceV2> sources;

    /**
     * List of source objects for this citation.
     *
     * @return the value
     */
    public java.util.List<CohereCitationSourceV2> getSources() {
        return sources;
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
        sb.append("CohereCitationV2(");
        sb.append("super=").append(super.toString());
        sb.append("start=").append(String.valueOf(this.start));
        sb.append(", end=").append(String.valueOf(this.end));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", contentIndex=").append(String.valueOf(this.contentIndex));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereCitationV2)) {
            return false;
        }

        CohereCitationV2 other = (CohereCitationV2) o;
        return java.util.Objects.equals(this.start, other.start)
                && java.util.Objects.equals(this.end, other.end)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.contentIndex, other.contentIndex)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.sources, other.sources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.contentIndex == null ? 43 : this.contentIndex.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
