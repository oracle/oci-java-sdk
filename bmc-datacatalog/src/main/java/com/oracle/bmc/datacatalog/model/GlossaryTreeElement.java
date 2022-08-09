/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Glossary tree element with child terms.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GlossaryTreeElement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GlossaryTreeElement extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "childTerms",
        "key",
        "displayName",
        "description",
        "glossaryKey",
        "uri",
        "parentTermKey",
        "isAllowedToHaveChildTerms",
        "path",
        "timeCreated",
        "workflowStatus",
        "associatedObjectCount",
        "lifecycleState"
    })
    public GlossaryTreeElement(
            java.util.List<GlossaryTreeElement> childTerms,
            String key,
            String displayName,
            String description,
            String glossaryKey,
            String uri,
            String parentTermKey,
            Boolean isAllowedToHaveChildTerms,
            String path,
            java.util.Date timeCreated,
            TermWorkflowStatus workflowStatus,
            Integer associatedObjectCount,
            LifecycleState lifecycleState) {
        super();
        this.childTerms = childTerms;
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.glossaryKey = glossaryKey;
        this.uri = uri;
        this.parentTermKey = parentTermKey;
        this.isAllowedToHaveChildTerms = isAllowedToHaveChildTerms;
        this.path = path;
        this.timeCreated = timeCreated;
        this.workflowStatus = workflowStatus;
        this.associatedObjectCount = associatedObjectCount;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of child terms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childTerms")
        private java.util.List<GlossaryTreeElement> childTerms;

        /**
         * An array of child terms.
         * @param childTerms the value to set
         * @return this builder
         **/
        public Builder childTerms(java.util.List<GlossaryTreeElement> childTerms) {
            this.childTerms = childTerms;
            this.__explicitlySet__.add("childTerms");
            return this;
        }
        /**
         * Unique term key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique term key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detailed description of the term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the term.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Unique id of the parent glossary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique id of the parent glossary.
         * @param glossaryKey the value to set
         * @return this builder
         **/
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }
        /**
         * URI to the term instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the term instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * This terms parent term key. Will be null if the term has no parent term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        /**
         * This terms parent term key. Will be null if the term has no parent term.
         * @param parentTermKey the value to set
         * @return this builder
         **/
        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }
        /**
         * Indicates whether a term may contain child terms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
        private Boolean isAllowedToHaveChildTerms;

        /**
         * Indicates whether a term may contain child terms.
         * @param isAllowedToHaveChildTerms the value to set
         * @return this builder
         **/
        public Builder isAllowedToHaveChildTerms(Boolean isAllowedToHaveChildTerms) {
            this.isAllowedToHaveChildTerms = isAllowedToHaveChildTerms;
            this.__explicitlySet__.add("isAllowedToHaveChildTerms");
            return this;
        }
        /**
         * Absolute path of the term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Absolute path of the term.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The date and time the term was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the term was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Status of the approval process workflow for this business term in the glossary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        /**
         * Status of the approval process workflow for this business term in the glossary.
         * @param workflowStatus the value to set
         * @return this builder
         **/
        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }
        /**
         * The number of objects tagged with this term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
        private Integer associatedObjectCount;

        /**
         * The number of objects tagged with this term.
         * @param associatedObjectCount the value to set
         * @return this builder
         **/
        public Builder associatedObjectCount(Integer associatedObjectCount) {
            this.associatedObjectCount = associatedObjectCount;
            this.__explicitlySet__.add("associatedObjectCount");
            return this;
        }
        /**
         * State of the term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the term.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlossaryTreeElement build() {
            GlossaryTreeElement model =
                    new GlossaryTreeElement(
                            this.childTerms,
                            this.key,
                            this.displayName,
                            this.description,
                            this.glossaryKey,
                            this.uri,
                            this.parentTermKey,
                            this.isAllowedToHaveChildTerms,
                            this.path,
                            this.timeCreated,
                            this.workflowStatus,
                            this.associatedObjectCount,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlossaryTreeElement model) {
            if (model.wasPropertyExplicitlySet("childTerms")) {
                this.childTerms(model.getChildTerms());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("parentTermKey")) {
                this.parentTermKey(model.getParentTermKey());
            }
            if (model.wasPropertyExplicitlySet("isAllowedToHaveChildTerms")) {
                this.isAllowedToHaveChildTerms(model.getIsAllowedToHaveChildTerms());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("workflowStatus")) {
                this.workflowStatus(model.getWorkflowStatus());
            }
            if (model.wasPropertyExplicitlySet("associatedObjectCount")) {
                this.associatedObjectCount(model.getAssociatedObjectCount());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * An array of child terms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childTerms")
    private final java.util.List<GlossaryTreeElement> childTerms;

    /**
     * An array of child terms.
     * @return the value
     **/
    public java.util.List<GlossaryTreeElement> getChildTerms() {
        return childTerms;
    }

    /**
     * Unique term key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique term key that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the term.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Unique id of the parent glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique id of the parent glossary.
     * @return the value
     **/
    public String getGlossaryKey() {
        return glossaryKey;
    }

    /**
     * URI to the term instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the term instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     * @return the value
     **/
    public String getParentTermKey() {
        return parentTermKey;
    }

    /**
     * Indicates whether a term may contain child terms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
    private final Boolean isAllowedToHaveChildTerms;

    /**
     * Indicates whether a term may contain child terms.
     * @return the value
     **/
    public Boolean getIsAllowedToHaveChildTerms() {
        return isAllowedToHaveChildTerms;
    }

    /**
     * Absolute path of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Absolute path of the term.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * The date and time the term was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the term was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Status of the approval process workflow for this business term in the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    /**
     * Status of the approval process workflow for this business term in the glossary.
     * @return the value
     **/
    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * The number of objects tagged with this term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
    private final Integer associatedObjectCount;

    /**
     * The number of objects tagged with this term.
     * @return the value
     **/
    public Integer getAssociatedObjectCount() {
        return associatedObjectCount;
    }

    /**
     * State of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the term.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("GlossaryTreeElement(");
        sb.append("super=").append(super.toString());
        sb.append("childTerms=").append(String.valueOf(this.childTerms));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", isAllowedToHaveChildTerms=")
                .append(String.valueOf(this.isAllowedToHaveChildTerms));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", workflowStatus=").append(String.valueOf(this.workflowStatus));
        sb.append(", associatedObjectCount=").append(String.valueOf(this.associatedObjectCount));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GlossaryTreeElement)) {
            return false;
        }

        GlossaryTreeElement other = (GlossaryTreeElement) o;
        return java.util.Objects.equals(this.childTerms, other.childTerms)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(
                        this.isAllowedToHaveChildTerms, other.isAllowedToHaveChildTerms)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.workflowStatus, other.workflowStatus)
                && java.util.Objects.equals(this.associatedObjectCount, other.associatedObjectCount)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.childTerms == null ? 43 : this.childTerms.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllowedToHaveChildTerms == null
                                ? 43
                                : this.isAllowedToHaveChildTerms.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowStatus == null ? 43 : this.workflowStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedObjectCount == null
                                ? 43
                                : this.associatedObjectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
