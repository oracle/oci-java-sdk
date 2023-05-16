/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * The request body when byte data is provided in detect call, which is Base64 encoded. The default
 * type of the data is CSV and can be JSON by setting the 'contentType'. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EmbeddedInputDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "inputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmbeddedInputDetails extends InputDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentType contentType;

        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private byte[] content;

        public Builder content(byte[] content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmbeddedInputDetails build() {
            EmbeddedInputDetails model = new EmbeddedInputDetails(this.contentType, this.content);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmbeddedInputDetails model) {
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
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

    @Deprecated
    public EmbeddedInputDetails(ContentType contentType, byte[] content) {
        super();
        this.contentType = contentType;
        this.content = content;
    }

    /** */
    public enum ContentType implements com.oracle.bmc.http.internal.BmcEnum {
        Csv("CSV"),
        Json("JSON"),
        ;

        private final String value;
        private static java.util.Map<String, ContentType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentType v : ContentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContentType: " + key);
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentType contentType;

    public ContentType getContentType() {
        return contentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final byte[] content;

    public byte[] getContent() {
        return content;
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
        sb.append("EmbeddedInputDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", content=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.content)
                                : (String.valueOf(this.content)
                                        + (this.content != null
                                                ? " (byte[" + this.content.length + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmbeddedInputDetails)) {
            return false;
        }

        EmbeddedInputDetails other = (EmbeddedInputDetails) o;
        return java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Arrays.equals(this.content, other.content)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.content);
        return result;
    }
}
