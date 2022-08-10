/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * grok pattern object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GrokPattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GrokPattern extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pattern",
        "name",
        "fieldTimeKey",
        "fieldTimeFormat",
        "fieldTimeZone"
    })
    public GrokPattern(
            String pattern,
            String name,
            String fieldTimeKey,
            String fieldTimeFormat,
            String fieldTimeZone) {
        super();
        this.pattern = pattern;
        this.name = name;
        this.fieldTimeKey = fieldTimeKey;
        this.fieldTimeFormat = fieldTimeFormat;
        this.fieldTimeZone = fieldTimeZone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The grok pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * The grok pattern.
         * @param pattern the value to set
         * @return this builder
         **/
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /**
         * The name key to tag this grok pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name key to tag this grok pattern.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specify the time field for the event time. If the event doesn't have this field, the current time is used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
        private String fieldTimeKey;

        /**
         * Specify the time field for the event time. If the event doesn't have this field, the current time is used.
         * @param fieldTimeKey the value to set
         * @return this builder
         **/
        public Builder fieldTimeKey(String fieldTimeKey) {
            this.fieldTimeKey = fieldTimeKey;
            this.__explicitlySet__.add("fieldTimeKey");
            return this;
        }
        /**
         * Process value using the specified format. This is available only when time_type is a string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeFormat")
        private String fieldTimeFormat;

        /**
         * Process value using the specified format. This is available only when time_type is a string.
         * @param fieldTimeFormat the value to set
         * @return this builder
         **/
        public Builder fieldTimeFormat(String fieldTimeFormat) {
            this.fieldTimeFormat = fieldTimeFormat;
            this.__explicitlySet__.add("fieldTimeFormat");
            return this;
        }
        /**
         * Use the specified time zone. The time value can be parsed or formatted in the specified time zone.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeZone")
        private String fieldTimeZone;

        /**
         * Use the specified time zone. The time value can be parsed or formatted in the specified time zone.
         * @param fieldTimeZone the value to set
         * @return this builder
         **/
        public Builder fieldTimeZone(String fieldTimeZone) {
            this.fieldTimeZone = fieldTimeZone;
            this.__explicitlySet__.add("fieldTimeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GrokPattern build() {
            GrokPattern model =
                    new GrokPattern(
                            this.pattern,
                            this.name,
                            this.fieldTimeKey,
                            this.fieldTimeFormat,
                            this.fieldTimeZone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GrokPattern model) {
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("fieldTimeKey")) {
                this.fieldTimeKey(model.getFieldTimeKey());
            }
            if (model.wasPropertyExplicitlySet("fieldTimeFormat")) {
                this.fieldTimeFormat(model.getFieldTimeFormat());
            }
            if (model.wasPropertyExplicitlySet("fieldTimeZone")) {
                this.fieldTimeZone(model.getFieldTimeZone());
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
     * The grok pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * The grok pattern.
     * @return the value
     **/
    public String getPattern() {
        return pattern;
    }

    /**
     * The name key to tag this grok pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name key to tag this grok pattern.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Specify the time field for the event time. If the event doesn't have this field, the current time is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
    private final String fieldTimeKey;

    /**
     * Specify the time field for the event time. If the event doesn't have this field, the current time is used.
     * @return the value
     **/
    public String getFieldTimeKey() {
        return fieldTimeKey;
    }

    /**
     * Process value using the specified format. This is available only when time_type is a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeFormat")
    private final String fieldTimeFormat;

    /**
     * Process value using the specified format. This is available only when time_type is a string.
     * @return the value
     **/
    public String getFieldTimeFormat() {
        return fieldTimeFormat;
    }

    /**
     * Use the specified time zone. The time value can be parsed or formatted in the specified time zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeZone")
    private final String fieldTimeZone;

    /**
     * Use the specified time zone. The time value can be parsed or formatted in the specified time zone.
     * @return the value
     **/
    public String getFieldTimeZone() {
        return fieldTimeZone;
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
        sb.append("GrokPattern(");
        sb.append("super=").append(super.toString());
        sb.append("pattern=").append(String.valueOf(this.pattern));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", fieldTimeKey=").append(String.valueOf(this.fieldTimeKey));
        sb.append(", fieldTimeFormat=").append(String.valueOf(this.fieldTimeFormat));
        sb.append(", fieldTimeZone=").append(String.valueOf(this.fieldTimeZone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GrokPattern)) {
            return false;
        }

        GrokPattern other = (GrokPattern) o;
        return java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.fieldTimeKey, other.fieldTimeKey)
                && java.util.Objects.equals(this.fieldTimeFormat, other.fieldTimeFormat)
                && java.util.Objects.equals(this.fieldTimeZone, other.fieldTimeZone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.fieldTimeKey == null ? 43 : this.fieldTimeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldTimeFormat == null ? 43 : this.fieldTimeFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldTimeZone == null ? 43 : this.fieldTimeZone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
