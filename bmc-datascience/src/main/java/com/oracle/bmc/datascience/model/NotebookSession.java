/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Notebook sessions are interactive coding environments for data scientists.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NotebookSession.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NotebookSession {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeCreated",
        "displayName",
        "projectId",
        "createdBy",
        "compartmentId",
        "notebookSessionConfigurationDetails",
        "notebookSessionConfigDetails",
        "notebookSessionRuntimeConfigDetails",
        "notebookSessionUrl",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public NotebookSession(
            String id,
            java.util.Date timeCreated,
            String displayName,
            String projectId,
            String createdBy,
            String compartmentId,
            NotebookSessionConfigurationDetails notebookSessionConfigurationDetails,
            NotebookSessionConfigDetails notebookSessionConfigDetails,
            NotebookSessionRuntimeConfigDetails notebookSessionRuntimeConfigDetails,
            String notebookSessionUrl,
            NotebookSessionLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.timeCreated = timeCreated;
        this.displayName = displayName;
        this.projectId = projectId;
        this.createdBy = createdBy;
        this.compartmentId = compartmentId;
        this.notebookSessionConfigurationDetails = notebookSessionConfigurationDetails;
        this.notebookSessionConfigDetails = notebookSessionConfigDetails;
        this.notebookSessionRuntimeConfigDetails = notebookSessionRuntimeConfigDetails;
        this.notebookSessionUrl = notebookSessionUrl;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: 2019-08-25T21:10:29.41Z
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: 2019-08-25T21:10:29.41Z
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
         * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
         * Example: {@code My NotebookSession}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
         * Example: {@code My NotebookSession}
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the notebook session.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session's compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session's compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionConfigurationDetails")
        private NotebookSessionConfigurationDetails notebookSessionConfigurationDetails;

        public Builder notebookSessionConfigurationDetails(
                NotebookSessionConfigurationDetails notebookSessionConfigurationDetails) {
            this.notebookSessionConfigurationDetails = notebookSessionConfigurationDetails;
            this.__explicitlySet__.add("notebookSessionConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionConfigDetails")
        private NotebookSessionConfigDetails notebookSessionConfigDetails;

        public Builder notebookSessionConfigDetails(
                NotebookSessionConfigDetails notebookSessionConfigDetails) {
            this.notebookSessionConfigDetails = notebookSessionConfigDetails;
            this.__explicitlySet__.add("notebookSessionConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionRuntimeConfigDetails")
        private NotebookSessionRuntimeConfigDetails notebookSessionRuntimeConfigDetails;

        public Builder notebookSessionRuntimeConfigDetails(
                NotebookSessionRuntimeConfigDetails notebookSessionRuntimeConfigDetails) {
            this.notebookSessionRuntimeConfigDetails = notebookSessionRuntimeConfigDetails;
            this.__explicitlySet__.add("notebookSessionRuntimeConfigDetails");
            return this;
        }
        /**
         * The URL to interact with the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionUrl")
        private String notebookSessionUrl;

        /**
         * The URL to interact with the notebook session.
         * @param notebookSessionUrl the value to set
         * @return this builder
         **/
        public Builder notebookSessionUrl(String notebookSessionUrl) {
            this.notebookSessionUrl = notebookSessionUrl;
            this.__explicitlySet__.add("notebookSessionUrl");
            return this;
        }
        /**
         * The state of the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private NotebookSessionLifecycleState lifecycleState;

        /**
         * The state of the notebook session.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(NotebookSessionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the state of the notebook session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the state of the notebook session.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotebookSession build() {
            NotebookSession __instance__ =
                    new NotebookSession(
                            id,
                            timeCreated,
                            displayName,
                            projectId,
                            createdBy,
                            compartmentId,
                            notebookSessionConfigurationDetails,
                            notebookSessionConfigDetails,
                            notebookSessionRuntimeConfigDetails,
                            notebookSessionUrl,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotebookSession o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .timeCreated(o.getTimeCreated())
                            .displayName(o.getDisplayName())
                            .projectId(o.getProjectId())
                            .createdBy(o.getCreatedBy())
                            .compartmentId(o.getCompartmentId())
                            .notebookSessionConfigurationDetails(
                                    o.getNotebookSessionConfigurationDetails())
                            .notebookSessionConfigDetails(o.getNotebookSessionConfigDetails())
                            .notebookSessionRuntimeConfigDetails(
                                    o.getNotebookSessionRuntimeConfigDetails())
                            .notebookSessionUrl(o.getNotebookSessionUrl())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: 2019-08-25T21:10:29.41Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: 2019-08-25T21:10:29.41Z
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
     * Example: {@code My NotebookSession}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be modified. Avoid entering confidential information.
     * Example: {@code My NotebookSession}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project associated with the notebook session.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the notebook session.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the notebook session's compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionConfigurationDetails")
    private final NotebookSessionConfigurationDetails notebookSessionConfigurationDetails;

    public NotebookSessionConfigurationDetails getNotebookSessionConfigurationDetails() {
        return notebookSessionConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionConfigDetails")
    private final NotebookSessionConfigDetails notebookSessionConfigDetails;

    public NotebookSessionConfigDetails getNotebookSessionConfigDetails() {
        return notebookSessionConfigDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionRuntimeConfigDetails")
    private final NotebookSessionRuntimeConfigDetails notebookSessionRuntimeConfigDetails;

    public NotebookSessionRuntimeConfigDetails getNotebookSessionRuntimeConfigDetails() {
        return notebookSessionRuntimeConfigDetails;
    }

    /**
     * The URL to interact with the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionUrl")
    private final String notebookSessionUrl;

    /**
     * The URL to interact with the notebook session.
     * @return the value
     **/
    public String getNotebookSessionUrl() {
        return notebookSessionUrl;
    }

    /**
     * The state of the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final NotebookSessionLifecycleState lifecycleState;

    /**
     * The state of the notebook session.
     * @return the value
     **/
    public NotebookSessionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the state of the notebook session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the state of the notebook session.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("NotebookSession(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", notebookSessionConfigurationDetails=")
                .append(String.valueOf(this.notebookSessionConfigurationDetails));
        sb.append(", notebookSessionConfigDetails=")
                .append(String.valueOf(this.notebookSessionConfigDetails));
        sb.append(", notebookSessionRuntimeConfigDetails=")
                .append(String.valueOf(this.notebookSessionRuntimeConfigDetails));
        sb.append(", notebookSessionUrl=").append(String.valueOf(this.notebookSessionUrl));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotebookSession)) {
            return false;
        }

        NotebookSession other = (NotebookSession) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.notebookSessionConfigurationDetails,
                        other.notebookSessionConfigurationDetails)
                && java.util.Objects.equals(
                        this.notebookSessionConfigDetails, other.notebookSessionConfigDetails)
                && java.util.Objects.equals(
                        this.notebookSessionRuntimeConfigDetails,
                        other.notebookSessionRuntimeConfigDetails)
                && java.util.Objects.equals(this.notebookSessionUrl, other.notebookSessionUrl)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionConfigurationDetails == null
                                ? 43
                                : this.notebookSessionConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionConfigDetails == null
                                ? 43
                                : this.notebookSessionConfigDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionRuntimeConfigDetails == null
                                ? 43
                                : this.notebookSessionRuntimeConfigDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionUrl == null
                                ? 43
                                : this.notebookSessionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
