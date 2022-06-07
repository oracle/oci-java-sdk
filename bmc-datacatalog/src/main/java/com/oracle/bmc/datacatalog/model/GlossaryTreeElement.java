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
public final class GlossaryTreeElement {
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
        @com.fasterxml.jackson.annotation.JsonProperty("childTerms")
        private java.util.List<GlossaryTreeElement> childTerms;

        public Builder childTerms(java.util.List<GlossaryTreeElement> childTerms) {
            this.childTerms = childTerms;
            this.__explicitlySet__.add("childTerms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
        private Boolean isAllowedToHaveChildTerms;

        public Builder isAllowedToHaveChildTerms(Boolean isAllowedToHaveChildTerms) {
            this.isAllowedToHaveChildTerms = isAllowedToHaveChildTerms;
            this.__explicitlySet__.add("isAllowedToHaveChildTerms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
        private Integer associatedObjectCount;

        public Builder associatedObjectCount(Integer associatedObjectCount) {
            this.associatedObjectCount = associatedObjectCount;
            this.__explicitlySet__.add("associatedObjectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlossaryTreeElement build() {
            GlossaryTreeElement __instance__ =
                    new GlossaryTreeElement(
                            childTerms,
                            key,
                            displayName,
                            description,
                            glossaryKey,
                            uri,
                            parentTermKey,
                            isAllowedToHaveChildTerms,
                            path,
                            timeCreated,
                            workflowStatus,
                            associatedObjectCount,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlossaryTreeElement o) {
            Builder copiedBuilder =
                    childTerms(o.getChildTerms())
                            .key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .glossaryKey(o.getGlossaryKey())
                            .uri(o.getUri())
                            .parentTermKey(o.getParentTermKey())
                            .isAllowedToHaveChildTerms(o.getIsAllowedToHaveChildTerms())
                            .path(o.getPath())
                            .timeCreated(o.getTimeCreated())
                            .workflowStatus(o.getWorkflowStatus())
                            .associatedObjectCount(o.getAssociatedObjectCount())
                            .lifecycleState(o.getLifecycleState());

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
     * An array of child terms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childTerms")
    private final java.util.List<GlossaryTreeElement> childTerms;

    public java.util.List<GlossaryTreeElement> getChildTerms() {
        return childTerms;
    }

    /**
     * Unique term key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

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

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Unique id of the parent glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    public String getGlossaryKey() {
        return glossaryKey;
    }

    /**
     * URI to the term instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    public String getParentTermKey() {
        return parentTermKey;
    }

    /**
     * Indicates whether a term may contain child terms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
    private final Boolean isAllowedToHaveChildTerms;

    public Boolean getIsAllowedToHaveChildTerms() {
        return isAllowedToHaveChildTerms;
    }

    /**
     * Absolute path of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

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

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Status of the approval process workflow for this business term in the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * The number of objects tagged with this term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
    private final Integer associatedObjectCount;

    public Integer getAssociatedObjectCount() {
        return associatedObjectCount;
    }

    /**
     * State of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GlossaryTreeElement(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
