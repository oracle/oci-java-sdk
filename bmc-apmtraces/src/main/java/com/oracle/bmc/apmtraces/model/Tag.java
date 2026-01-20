/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a tag which is a key-value pair. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Tag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Tag extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tagName", "tagValue"})
    public Tag(String tagName, String tagValue) {
        super();
        this.tagName = tagName;
        this.tagValue = tagValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Key that specifies the tag name. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagName")
        private String tagName;

        /**
         * Key that specifies the tag name.
         *
         * @param tagName the value to set
         * @return this builder
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            this.__explicitlySet__.add("tagName");
            return this;
        }
        /** Value associated with the tag key. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagValue")
        private String tagValue;

        /**
         * Value associated with the tag key.
         *
         * @param tagValue the value to set
         * @return this builder
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            this.__explicitlySet__.add("tagValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Tag build() {
            Tag model = new Tag(this.tagName, this.tagValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Tag model) {
            if (model.wasPropertyExplicitlySet("tagName")) {
                this.tagName(model.getTagName());
            }
            if (model.wasPropertyExplicitlySet("tagValue")) {
                this.tagValue(model.getTagValue());
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

    /** Key that specifies the tag name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagName")
    private final String tagName;

    /**
     * Key that specifies the tag name.
     *
     * @return the value
     */
    public String getTagName() {
        return tagName;
    }

    /** Value associated with the tag key. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagValue")
    private final String tagValue;

    /**
     * Value associated with the tag key.
     *
     * @return the value
     */
    public String getTagValue() {
        return tagValue;
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
        sb.append("Tag(");
        sb.append("super=").append(super.toString());
        sb.append("tagName=").append(String.valueOf(this.tagName));
        sb.append(", tagValue=").append(String.valueOf(this.tagValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tag)) {
            return false;
        }

        Tag other = (Tag) o;
        return java.util.Objects.equals(this.tagName, other.tagName)
                && java.util.Objects.equals(this.tagValue, other.tagValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tagName == null ? 43 : this.tagName.hashCode());
        result = (result * PRIME) + (this.tagValue == null ? 43 : this.tagValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
