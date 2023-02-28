/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of a term associated with an object. This is a brief summary returned as part of the
 * search result. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchTermSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SearchTermSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "glossaryKey",
        "glossaryName",
        "parentTermKey",
        "parentTermName"
    })
    public SearchTermSummary(
            String key,
            String displayName,
            String glossaryKey,
            String glossaryName,
            String parentTermKey,
            String parentTermName) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.glossaryKey = glossaryKey;
        this.glossaryName = glossaryName;
        this.parentTermKey = parentTermKey;
        this.parentTermName = parentTermName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique term key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique term key that is immutable.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Unique id of the parent glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique id of the parent glossary.
         *
         * @param glossaryKey the value to set
         * @return this builder
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }
        /** Name of the parent glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
        private String glossaryName;

        /**
         * Name of the parent glossary.
         *
         * @param glossaryName the value to set
         * @return this builder
         */
        public Builder glossaryName(String glossaryName) {
            this.glossaryName = glossaryName;
            this.__explicitlySet__.add("glossaryName");
            return this;
        }
        /** This terms parent term key. Will be null if the term has no parent term. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        /**
         * This terms parent term key. Will be null if the term has no parent term.
         *
         * @param parentTermKey the value to set
         * @return this builder
         */
        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }
        /** Name of the parent term key. Will be null if the term has no parent term. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
        private String parentTermName;

        /**
         * Name of the parent term key. Will be null if the term has no parent term.
         *
         * @param parentTermName the value to set
         * @return this builder
         */
        public Builder parentTermName(String parentTermName) {
            this.parentTermName = parentTermName;
            this.__explicitlySet__.add("parentTermName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchTermSummary build() {
            SearchTermSummary model =
                    new SearchTermSummary(
                            this.key,
                            this.displayName,
                            this.glossaryKey,
                            this.glossaryName,
                            this.parentTermKey,
                            this.parentTermName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchTermSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("glossaryName")) {
                this.glossaryName(model.getGlossaryName());
            }
            if (model.wasPropertyExplicitlySet("parentTermKey")) {
                this.parentTermKey(model.getParentTermKey());
            }
            if (model.wasPropertyExplicitlySet("parentTermName")) {
                this.parentTermName(model.getParentTermName());
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

    /** Unique term key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique term key that is immutable.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Unique id of the parent glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique id of the parent glossary.
     *
     * @return the value
     */
    public String getGlossaryKey() {
        return glossaryKey;
    }

    /** Name of the parent glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
    private final String glossaryName;

    /**
     * Name of the parent glossary.
     *
     * @return the value
     */
    public String getGlossaryName() {
        return glossaryName;
    }

    /** This terms parent term key. Will be null if the term has no parent term. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     *
     * @return the value
     */
    public String getParentTermKey() {
        return parentTermKey;
    }

    /** Name of the parent term key. Will be null if the term has no parent term. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
    private final String parentTermName;

    /**
     * Name of the parent term key. Will be null if the term has no parent term.
     *
     * @return the value
     */
    public String getParentTermName() {
        return parentTermName;
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
        sb.append("SearchTermSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", glossaryName=").append(String.valueOf(this.glossaryName));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", parentTermName=").append(String.valueOf(this.parentTermName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchTermSummary)) {
            return false;
        }

        SearchTermSummary other = (SearchTermSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.glossaryName, other.glossaryName)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(this.parentTermName, other.parentTermName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.glossaryName == null ? 43 : this.glossaryName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermName == null ? 43 : this.parentTermName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
