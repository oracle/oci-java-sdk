/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container repository readme.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerRepositoryReadme.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerRepositoryReadme {
    @Deprecated
    @java.beans.ConstructorProperties({"content", "format"})
    public ContainerRepositoryReadme(String content, Format format) {
        super();
        this.content = content;
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Readme content. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * Readme content. Avoid entering confidential information.
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * Readme format. Supported formats are text/plain and text/markdown.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private Format format;

        /**
         * Readme format. Supported formats are text/plain and text/markdown.
         * @param format the value to set
         * @return this builder
         **/
        public Builder format(Format format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRepositoryReadme build() {
            ContainerRepositoryReadme __instance__ = new ContainerRepositoryReadme(content, format);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepositoryReadme o) {
            Builder copiedBuilder = content(o.getContent()).format(o.getFormat());

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
     * Readme content. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * Readme content. Avoid entering confidential information.
     * @return the value
     **/
    public String getContent() {
        return content;
    }

    /**
     * Readme format. Supported formats are text/plain and text/markdown.
     **/
    public enum Format {
        TextMarkdown("TEXT_MARKDOWN"),
        TextPlain("TEXT_PLAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Format.class);

        private final String value;
        private static java.util.Map<String, Format> map;

        static {
            map = new java.util.HashMap<>();
            for (Format v : Format.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Format(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Format create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Format', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Readme format. Supported formats are text/plain and text/markdown.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

    /**
     * Readme format. Supported formats are text/plain and text/markdown.
     * @return the value
     **/
    public Format getFormat() {
        return format;
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
        sb.append("ContainerRepositoryReadme(");
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerRepositoryReadme)) {
            return false;
        }

        ContainerRepositoryReadme other = (ContainerRepositoryReadme) o;
        return java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
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
