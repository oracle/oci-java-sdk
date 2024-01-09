/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full term definition. A defined business term in a business glossary. As well as a term
 * definition, simple format rules for attributes mapping to the term (for example, the expected
 * data type and length restrictions) may be stated at the term level. Nesting of terms to support a
 * hierarchy is supported by default. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Term.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Term extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "glossaryKey",
        "parentTermKey",
        "isAllowedToHaveChildTerms",
        "path",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "owner",
        "workflowStatus",
        "uri",
        "associatedObjectCount",
        "associatedObjects",
        "customPropertyMembers"
    })
    public Term(
            String key,
            String displayName,
            String description,
            String glossaryKey,
            String parentTermKey,
            Boolean isAllowedToHaveChildTerms,
            String path,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String owner,
            TermWorkflowStatus workflowStatus,
            String uri,
            Integer associatedObjectCount,
            java.util.List<TermAssociatedObject> associatedObjects,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.glossaryKey = glossaryKey;
        this.parentTermKey = parentTermKey;
        this.isAllowedToHaveChildTerms = isAllowedToHaveChildTerms;
        this.path = path;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.owner = owner;
        this.workflowStatus = workflowStatus;
        this.uri = uri;
        this.associatedObjectCount = associatedObjectCount;
        this.associatedObjects = associatedObjects;
        this.customPropertyMembers = customPropertyMembers;
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
        /** Detailed description of the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the term.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /** Indicates whether a term may contain child terms. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
        private Boolean isAllowedToHaveChildTerms;

        /**
         * Indicates whether a term may contain child terms.
         *
         * @param isAllowedToHaveChildTerms the value to set
         * @return this builder
         */
        public Builder isAllowedToHaveChildTerms(Boolean isAllowedToHaveChildTerms) {
            this.isAllowedToHaveChildTerms = isAllowedToHaveChildTerms;
            this.__explicitlySet__.add("isAllowedToHaveChildTerms");
            return this;
        }
        /** Absolute path of the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Absolute path of the term.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The current state of the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the term.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the term was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the term was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time that any change was made to the term. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the term. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** OCID of the user who created the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the term.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who modified the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who modified the term.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /** OCID of the user who is the owner of this business terminology. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * OCID of the user who is the owner of this business terminology.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** Status of the approval process workflow for this business term in the glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        /**
         * Status of the approval process workflow for this business term in the glossary.
         *
         * @param workflowStatus the value to set
         * @return this builder
         */
        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }
        /** URI to the term instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the term instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** The number of objects tagged with this term */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
        private Integer associatedObjectCount;

        /**
         * The number of objects tagged with this term
         *
         * @param associatedObjectCount the value to set
         * @return this builder
         */
        public Builder associatedObjectCount(Integer associatedObjectCount) {
            this.associatedObjectCount = associatedObjectCount;
            this.__explicitlySet__.add("associatedObjectCount");
            return this;
        }
        /** Array of objects associated to a term. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedObjects")
        private java.util.List<TermAssociatedObject> associatedObjects;

        /**
         * Array of objects associated to a term.
         *
         * @param associatedObjects the value to set
         * @return this builder
         */
        public Builder associatedObjects(java.util.List<TermAssociatedObject> associatedObjects) {
            this.associatedObjects = associatedObjects;
            this.__explicitlySet__.add("associatedObjects");
            return this;
        }
        /** The list of customized properties along with the values for this object */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertyGetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         *
         * @param customPropertyMembers the value to set
         * @return this builder
         */
        public Builder customPropertyMembers(
                java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Term build() {
            Term model =
                    new Term(
                            this.key,
                            this.displayName,
                            this.description,
                            this.glossaryKey,
                            this.parentTermKey,
                            this.isAllowedToHaveChildTerms,
                            this.path,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.owner,
                            this.workflowStatus,
                            this.uri,
                            this.associatedObjectCount,
                            this.associatedObjects,
                            this.customPropertyMembers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Term model) {
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
            if (model.wasPropertyExplicitlySet("parentTermKey")) {
                this.parentTermKey(model.getParentTermKey());
            }
            if (model.wasPropertyExplicitlySet("isAllowedToHaveChildTerms")) {
                this.isAllowedToHaveChildTerms(model.getIsAllowedToHaveChildTerms());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("workflowStatus")) {
                this.workflowStatus(model.getWorkflowStatus());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("associatedObjectCount")) {
                this.associatedObjectCount(model.getAssociatedObjectCount());
            }
            if (model.wasPropertyExplicitlySet("associatedObjects")) {
                this.associatedObjects(model.getAssociatedObjects());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
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

    /** Detailed description of the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the term.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /** Indicates whether a term may contain child terms. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowedToHaveChildTerms")
    private final Boolean isAllowedToHaveChildTerms;

    /**
     * Indicates whether a term may contain child terms.
     *
     * @return the value
     */
    public Boolean getIsAllowedToHaveChildTerms() {
        return isAllowedToHaveChildTerms;
    }

    /** Absolute path of the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Absolute path of the term.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The current state of the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the term.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the term was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the term was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the term. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the term. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the term.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who modified the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who modified the term.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /** OCID of the user who is the owner of this business terminology. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * OCID of the user who is the owner of this business terminology.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** Status of the approval process workflow for this business term in the glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    /**
     * Status of the approval process workflow for this business term in the glossary.
     *
     * @return the value
     */
    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    /** URI to the term instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the term instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** The number of objects tagged with this term */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedObjectCount")
    private final Integer associatedObjectCount;

    /**
     * The number of objects tagged with this term
     *
     * @return the value
     */
    public Integer getAssociatedObjectCount() {
        return associatedObjectCount;
    }

    /** Array of objects associated to a term. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedObjects")
    private final java.util.List<TermAssociatedObject> associatedObjects;

    /**
     * Array of objects associated to a term.
     *
     * @return the value
     */
    public java.util.List<TermAssociatedObject> getAssociatedObjects() {
        return associatedObjects;
    }

    /** The list of customized properties along with the values for this object */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     *
     * @return the value
     */
    public java.util.List<CustomPropertyGetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
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
        sb.append("Term(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", isAllowedToHaveChildTerms=")
                .append(String.valueOf(this.isAllowedToHaveChildTerms));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", workflowStatus=").append(String.valueOf(this.workflowStatus));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", associatedObjectCount=").append(String.valueOf(this.associatedObjectCount));
        sb.append(", associatedObjects=").append(String.valueOf(this.associatedObjects));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Term)) {
            return false;
        }

        Term other = (Term) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(
                        this.isAllowedToHaveChildTerms, other.isAllowedToHaveChildTerms)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.workflowStatus, other.workflowStatus)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.associatedObjectCount, other.associatedObjectCount)
                && java.util.Objects.equals(this.associatedObjects, other.associatedObjects)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllowedToHaveChildTerms == null
                                ? 43
                                : this.isAllowedToHaveChildTerms.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowStatus == null ? 43 : this.workflowStatus.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedObjectCount == null
                                ? 43
                                : this.associatedObjectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedObjects == null ? 43 : this.associatedObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
