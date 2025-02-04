/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Provide a base64 encoded image. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageUrl.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImageUrl extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"url", "detail"})
    public ImageUrl(String url, Detail detail) {
        super();
        this.url = url;
        this.detail = detail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The base64 encoded image data.
         *
         * <p>Example for a png image: {@code { "type": "IMAGE", "imageUrl": { "url":
         * "data:image/png;base64,<base64 encoded image content>" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The base64 encoded image data.
         *
         * <p>Example for a png image: {@code { "type": "IMAGE", "imageUrl": { "url":
         * "data:image/png;base64,<base64 encoded image content>" } }}
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The default value is AUTO and only AUTO is supported. This option controls how to convert
         * the base64 encoded image to tokens.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("detail")
        private Detail detail;

        /**
         * The default value is AUTO and only AUTO is supported. This option controls how to convert
         * the base64 encoded image to tokens.
         *
         * @param detail the value to set
         * @return this builder
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            this.__explicitlySet__.add("detail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageUrl build() {
            ImageUrl model = new ImageUrl(this.url, this.detail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageUrl model) {
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("detail")) {
                this.detail(model.getDetail());
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
     * The base64 encoded image data.
     *
     * <p>Example for a png image: {@code { "type": "IMAGE", "imageUrl": { "url":
     * "data:image/png;base64,<base64 encoded image content>" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The base64 encoded image data.
     *
     * <p>Example for a png image: {@code { "type": "IMAGE", "imageUrl": { "url":
     * "data:image/png;base64,<base64 encoded image content>" } }}
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /**
     * The default value is AUTO and only AUTO is supported. This option controls how to convert the
     * base64 encoded image to tokens.
     */
    public enum Detail implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        High("HIGH"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Detail.class);

        private final String value;
        private static java.util.Map<String, Detail> map;

        static {
            map = new java.util.HashMap<>();
            for (Detail v : Detail.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Detail(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Detail create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Detail', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The default value is AUTO and only AUTO is supported. This option controls how to convert the
     * base64 encoded image to tokens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    private final Detail detail;

    /**
     * The default value is AUTO and only AUTO is supported. This option controls how to convert the
     * base64 encoded image to tokens.
     *
     * @return the value
     */
    public Detail getDetail() {
        return detail;
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
        sb.append("ImageUrl(");
        sb.append("super=").append(super.toString());
        sb.append("url=").append(String.valueOf(this.url));
        sb.append(", detail=").append(String.valueOf(this.detail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageUrl)) {
            return false;
        }

        ImageUrl other = (ImageUrl) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.detail, other.detail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.detail == null ? 43 : this.detail.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
