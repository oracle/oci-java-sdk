/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full glossary details. A glossary of business terms, such as 'Customer', 'Account', 'Contact' ,
 * 'Address', or 'Product', with definitions, used to provide common meaning across disparate data
 * assets. Business glossaries may be hierarchical where some terms may contain child terms to allow
 * them to be used as 'taxonomies'. By linking data assets, data entities, and attributes to
 * glossaries and glossary terms, the glossary can act as a way of organizing data catalog objects
 * in a hierarchy to make a large number of objects more navigable and easier to consume. Objects in
 * the data aatalog, such as data assets or data entities, may be linked to any level in the
 * glossary, so that the glossary can be used to browse the available data according to the business
 * model of the organization. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Glossary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Glossary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "catalogId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "owner",
        "workflowStatus",
        "customPropertyMembers",
        "importJobDefinitionKey",
        "importJobKey",
        "latestImportJobExecutionKey",
        "latestImportJobExecutionStatus",
        "uri"
    })
    public Glossary(
            String key,
            String displayName,
            String description,
            String catalogId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String owner,
            TermWorkflowStatus workflowStatus,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers,
            String importJobDefinitionKey,
            String importJobKey,
            String latestImportJobExecutionKey,
            String latestImportJobExecutionStatus,
            String uri) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogId = catalogId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.owner = owner;
        this.workflowStatus = workflowStatus;
        this.customPropertyMembers = customPropertyMembers;
        this.importJobDefinitionKey = importJobDefinitionKey;
        this.importJobKey = importJobKey;
        this.latestImportJobExecutionKey = latestImportJobExecutionKey;
        this.latestImportJobExecutionStatus = latestImportJobExecutionStatus;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique glossary key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique glossary key that is immutable.
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
        /** Detailed description of the glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the glossary.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The data catalog's OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         *
         * @param catalogId the value to set
         * @return this builder
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /** The current state of the glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the glossary.
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
         * The date and time the glossary was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the glossary was created, in the format defined by
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
         * The last time that any change was made to the glossary. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the glossary. An
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
        /** OCID of the user who created this metadata element. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created this metadata element.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who updated this metadata element. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who updated this metadata element.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /** OCID of the user who is the owner of the glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * OCID of the user who is the owner of the glossary.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** Status of the approval process workflow for this business glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        /**
         * Status of the approval process workflow for this business glossary.
         *
         * @param workflowStatus the value to set
         * @return this builder
         */
        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
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
        /** The unique key of the job definition resource that was used in the Glossary import. */
        @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
        private String importJobDefinitionKey;

        /**
         * The unique key of the job definition resource that was used in the Glossary import.
         *
         * @param importJobDefinitionKey the value to set
         * @return this builder
         */
        public Builder importJobDefinitionKey(String importJobDefinitionKey) {
            this.importJobDefinitionKey = importJobDefinitionKey;
            this.__explicitlySet__.add("importJobDefinitionKey");
            return this;
        }
        /** The unique key of the job policy for Glossary import. */
        @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
        private String importJobKey;

        /**
         * The unique key of the job policy for Glossary import.
         *
         * @param importJobKey the value to set
         * @return this builder
         */
        public Builder importJobKey(String importJobKey) {
            this.importJobKey = importJobKey;
            this.__explicitlySet__.add("importJobKey");
            return this;
        }
        /** The unique key of the parent job execution for which the log resource was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
        private String latestImportJobExecutionKey;

        /**
         * The unique key of the parent job execution for which the log resource was created.
         *
         * @param latestImportJobExecutionKey the value to set
         * @return this builder
         */
        public Builder latestImportJobExecutionKey(String latestImportJobExecutionKey) {
            this.latestImportJobExecutionKey = latestImportJobExecutionKey;
            this.__explicitlySet__.add("latestImportJobExecutionKey");
            return this;
        }
        /**
         * Status of the latest glossary import job execution, such as running, paused, or
         * completed. This may include additional information like time import started , import file
         * size and % of completion
         */
        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
        private String latestImportJobExecutionStatus;

        /**
         * Status of the latest glossary import job execution, such as running, paused, or
         * completed. This may include additional information like time import started , import file
         * size and % of completion
         *
         * @param latestImportJobExecutionStatus the value to set
         * @return this builder
         */
        public Builder latestImportJobExecutionStatus(String latestImportJobExecutionStatus) {
            this.latestImportJobExecutionStatus = latestImportJobExecutionStatus;
            this.__explicitlySet__.add("latestImportJobExecutionStatus");
            return this;
        }
        /** URI to the tag instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the tag instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Glossary build() {
            Glossary model =
                    new Glossary(
                            this.key,
                            this.displayName,
                            this.description,
                            this.catalogId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.owner,
                            this.workflowStatus,
                            this.customPropertyMembers,
                            this.importJobDefinitionKey,
                            this.importJobKey,
                            this.latestImportJobExecutionKey,
                            this.latestImportJobExecutionStatus,
                            this.uri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Glossary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
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
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("importJobDefinitionKey")) {
                this.importJobDefinitionKey(model.getImportJobDefinitionKey());
            }
            if (model.wasPropertyExplicitlySet("importJobKey")) {
                this.importJobKey(model.getImportJobKey());
            }
            if (model.wasPropertyExplicitlySet("latestImportJobExecutionKey")) {
                this.latestImportJobExecutionKey(model.getLatestImportJobExecutionKey());
            }
            if (model.wasPropertyExplicitlySet("latestImportJobExecutionStatus")) {
                this.latestImportJobExecutionStatus(model.getLatestImportJobExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
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

    /** Unique glossary key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique glossary key that is immutable.
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

    /** Detailed description of the glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the glossary.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The data catalog's OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     *
     * @return the value
     */
    public String getCatalogId() {
        return catalogId;
    }

    /** The current state of the glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the glossary.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the glossary was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the glossary was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the glossary. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the glossary. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created this metadata element. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created this metadata element.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who updated this metadata element. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who updated this metadata element.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /** OCID of the user who is the owner of the glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * OCID of the user who is the owner of the glossary.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** Status of the approval process workflow for this business glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    private final TermWorkflowStatus workflowStatus;

    /**
     * Status of the approval process workflow for this business glossary.
     *
     * @return the value
     */
    public TermWorkflowStatus getWorkflowStatus() {
        return workflowStatus;
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

    /** The unique key of the job definition resource that was used in the Glossary import. */
    @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
    private final String importJobDefinitionKey;

    /**
     * The unique key of the job definition resource that was used in the Glossary import.
     *
     * @return the value
     */
    public String getImportJobDefinitionKey() {
        return importJobDefinitionKey;
    }

    /** The unique key of the job policy for Glossary import. */
    @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
    private final String importJobKey;

    /**
     * The unique key of the job policy for Glossary import.
     *
     * @return the value
     */
    public String getImportJobKey() {
        return importJobKey;
    }

    /** The unique key of the parent job execution for which the log resource was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
    private final String latestImportJobExecutionKey;

    /**
     * The unique key of the parent job execution for which the log resource was created.
     *
     * @return the value
     */
    public String getLatestImportJobExecutionKey() {
        return latestImportJobExecutionKey;
    }

    /**
     * Status of the latest glossary import job execution, such as running, paused, or completed.
     * This may include additional information like time import started , import file size and % of
     * completion
     */
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
    private final String latestImportJobExecutionStatus;

    /**
     * Status of the latest glossary import job execution, such as running, paused, or completed.
     * This may include additional information like time import started , import file size and % of
     * completion
     *
     * @return the value
     */
    public String getLatestImportJobExecutionStatus() {
        return latestImportJobExecutionStatus;
    }

    /** URI to the tag instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the tag instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
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
        sb.append("Glossary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", workflowStatus=").append(String.valueOf(this.workflowStatus));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", importJobDefinitionKey=").append(String.valueOf(this.importJobDefinitionKey));
        sb.append(", importJobKey=").append(String.valueOf(this.importJobKey));
        sb.append(", latestImportJobExecutionKey=")
                .append(String.valueOf(this.latestImportJobExecutionKey));
        sb.append(", latestImportJobExecutionStatus=")
                .append(String.valueOf(this.latestImportJobExecutionStatus));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Glossary)) {
            return false;
        }

        Glossary other = (Glossary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.workflowStatus, other.workflowStatus)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(
                        this.importJobDefinitionKey, other.importJobDefinitionKey)
                && java.util.Objects.equals(this.importJobKey, other.importJobKey)
                && java.util.Objects.equals(
                        this.latestImportJobExecutionKey, other.latestImportJobExecutionKey)
                && java.util.Objects.equals(
                        this.latestImportJobExecutionStatus, other.latestImportJobExecutionStatus)
                && java.util.Objects.equals(this.uri, other.uri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result =
                (result * PRIME)
                        + (this.importJobDefinitionKey == null
                                ? 43
                                : this.importJobDefinitionKey.hashCode());
        result = (result * PRIME) + (this.importJobKey == null ? 43 : this.importJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.latestImportJobExecutionKey == null
                                ? 43
                                : this.latestImportJobExecutionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.latestImportJobExecutionStatus == null
                                ? 43
                                : this.latestImportJobExecutionStatus.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
