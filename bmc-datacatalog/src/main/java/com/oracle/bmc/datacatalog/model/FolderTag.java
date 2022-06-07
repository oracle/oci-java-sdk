/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Represents an association of a folder to a term.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FolderTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FolderTag {
    @Deprecated
    @java.beans.ConstructorProperties({
        "folderKey",
        "key",
        "name",
        "termKey",
        "termPath",
        "termDescription",
        "lifecycleState",
        "timeCreated",
        "createdById",
        "uri"
    })
    public FolderTag(
            String folderKey,
            String key,
            String name,
            String termKey,
            String termPath,
            String termDescription,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String createdById,
            String uri) {
        super();
        this.folderKey = folderKey;
        this.key = key;
        this.name = name;
        this.termKey = termKey;
        this.termPath = termPath;
        this.termDescription = termDescription;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.createdById = createdById;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termKey")
        private String termKey;

        public Builder termKey(String termKey) {
            this.termKey = termKey;
            this.__explicitlySet__.add("termKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termPath")
        private String termPath;

        public Builder termPath(String termPath) {
            this.termPath = termPath;
            this.__explicitlySet__.add("termPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
        private String termDescription;

        public Builder termDescription(String termDescription) {
            this.termDescription = termDescription;
            this.__explicitlySet__.add("termDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FolderTag build() {
            FolderTag __instance__ =
                    new FolderTag(
                            folderKey,
                            key,
                            name,
                            termKey,
                            termPath,
                            termDescription,
                            lifecycleState,
                            timeCreated,
                            createdById,
                            uri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FolderTag o) {
            Builder copiedBuilder =
                    folderKey(o.getFolderKey())
                            .key(o.getKey())
                            .name(o.getName())
                            .termKey(o.getTermKey())
                            .termPath(o.getTermPath())
                            .termDescription(o.getTermDescription())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .createdById(o.getCreatedById())
                            .uri(o.getUri());

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
     * The unique key of the folder associated with this tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    private final String folderKey;

    public String getFolderKey() {
        return folderKey;
    }

    /**
     * Unique tag key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * Name of the tag which matches the term name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Unique key of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termKey")
    private final String termKey;

    public String getTermKey() {
        return termKey;
    }

    /**
     * Path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termPath")
    private final String termPath;

    public String getTermPath() {
        return termPath;
    }

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
    private final String termDescription;

    public String getTermDescription() {
        return termDescription;
    }

    /**
     * The current state of the tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * OCID of the user who created the tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    public String getCreatedById() {
        return createdById;
    }

    /**
     * URI to the tag instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FolderTag(");
        sb.append("folderKey=").append(String.valueOf(this.folderKey));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", termKey=").append(String.valueOf(this.termKey));
        sb.append(", termPath=").append(String.valueOf(this.termPath));
        sb.append(", termDescription=").append(String.valueOf(this.termDescription));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FolderTag)) {
            return false;
        }

        FolderTag other = (FolderTag) o;
        return java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termPath, other.termPath)
                && java.util.Objects.equals(this.termDescription, other.termDescription)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result = (result * PRIME) + (this.termPath == null ? 43 : this.termPath.hashCode());
        result =
                (result * PRIME)
                        + (this.termDescription == null ? 43 : this.termDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
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
