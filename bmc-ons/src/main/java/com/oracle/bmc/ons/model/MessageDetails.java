/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The content of the message to be published.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MessageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MessageDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"title", "body"})
    public MessageDetails(String title, String body) {
        super();
        this.title = title;
        this.body = body;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The title of the message to be published. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The title of the message to be published. Avoid entering confidential information.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The body of the message to be published.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The body of the message to be published.
         * Avoid entering confidential information.
         *
         * @param body the value to set
         * @return this builder
         **/
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MessageDetails build() {
            MessageDetails model = new MessageDetails(this.title, this.body);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MessageDetails model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
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
     * The title of the message to be published. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The title of the message to be published. Avoid entering confidential information.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * The body of the message to be published.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The body of the message to be published.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getBody() {
        return body;
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
        sb.append("MessageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("title=").append(String.valueOf(this.title));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageDetails)) {
            return false;
        }

        MessageDetails other = (MessageDetails) o;
        return java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.body, other.body)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
