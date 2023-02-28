/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for an end user license agreement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Agreement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Agreement extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "contentUrl",
        "signature",
        "compartmentId",
        "author",
        "prompt"
    })
    public Agreement(
            String id,
            String contentUrl,
            String signature,
            String compartmentId,
            Author author,
            String prompt) {
        super();
        this.id = id;
        this.contentUrl = contentUrl;
        this.signature = signature;
        this.compartmentId = compartmentId;
        this.author = author;
        this.prompt = prompt;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier for the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the agreement.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The content URL of the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
        private String contentUrl;

        /**
         * The content URL of the agreement.
         *
         * @param contentUrl the value to set
         * @return this builder
         */
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            this.__explicitlySet__.add("contentUrl");
            return this;
        }
        /**
         * A time-based signature that can be used to accept an agreement or remove a previously
         * accepted agreement from the list that Marketplace checks before a deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        /**
         * A time-based signature that can be used to accept an agreement or remove a previously
         * accepted agreement from the list that Marketplace checks before a deployment.
         *
         * @param signature the value to set
         * @return this builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }
        /** The unique identifier for the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Who authored the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("author")
        private Author author;

        /**
         * Who authored the agreement.
         *
         * @param author the value to set
         * @return this builder
         */
        public Builder author(Author author) {
            this.author = author;
            this.__explicitlySet__.add("author");
            return this;
        }
        /** Textual prompt to read and accept the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("prompt")
        private String prompt;

        /**
         * Textual prompt to read and accept the agreement.
         *
         * @param prompt the value to set
         * @return this builder
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            this.__explicitlySet__.add("prompt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Agreement build() {
            Agreement model =
                    new Agreement(
                            this.id,
                            this.contentUrl,
                            this.signature,
                            this.compartmentId,
                            this.author,
                            this.prompt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Agreement model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("contentUrl")) {
                this.contentUrl(model.getContentUrl());
            }
            if (model.wasPropertyExplicitlySet("signature")) {
                this.signature(model.getSignature());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("author")) {
                this.author(model.getAuthor());
            }
            if (model.wasPropertyExplicitlySet("prompt")) {
                this.prompt(model.getPrompt());
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

    /** The unique identifier for the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the agreement.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The content URL of the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
    private final String contentUrl;

    /**
     * The content URL of the agreement.
     *
     * @return the value
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * A time-based signature that can be used to accept an agreement or remove a previously
     * accepted agreement from the list that Marketplace checks before a deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    /**
     * A time-based signature that can be used to accept an agreement or remove a previously
     * accepted agreement from the list that Marketplace checks before a deployment.
     *
     * @return the value
     */
    public String getSignature() {
        return signature;
    }

    /** The unique identifier for the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Who authored the agreement. */
    public enum Author implements com.oracle.bmc.http.internal.BmcEnum {
        Oracle("ORACLE"),
        Partner("PARTNER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Author.class);

        private final String value;
        private static java.util.Map<String, Author> map;

        static {
            map = new java.util.HashMap<>();
            for (Author v : Author.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Author(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Author create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Author', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Who authored the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    private final Author author;

    /**
     * Who authored the agreement.
     *
     * @return the value
     */
    public Author getAuthor() {
        return author;
    }

    /** Textual prompt to read and accept the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

    /**
     * Textual prompt to read and accept the agreement.
     *
     * @return the value
     */
    public String getPrompt() {
        return prompt;
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
        sb.append("Agreement(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", contentUrl=").append(String.valueOf(this.contentUrl));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", author=").append(String.valueOf(this.author));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Agreement)) {
            return false;
        }

        Agreement other = (Agreement) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.contentUrl, other.contentUrl)
                && java.util.Objects.equals(this.signature, other.signature)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.author, other.author)
                && java.util.Objects.equals(this.prompt, other.prompt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.contentUrl == null ? 43 : this.contentUrl.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.author == null ? 43 : this.author.hashCode());
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
