/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Information to run a system MediaWorkflow identified by its name. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMediaWorkflowJobByNameDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "workflowIdentifierType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMediaWorkflowJobByNameDetails extends CreateMediaWorkflowJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
        private java.util.List<String> mediaWorkflowConfigurationIds;

        public Builder mediaWorkflowConfigurationIds(
                java.util.List<String> mediaWorkflowConfigurationIds) {
            this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
            this.__explicitlySet__.add("mediaWorkflowConfigurationIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, Object> parameters;

        public Builder parameters(java.util.Map<String, Object> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /** Name of the system MediaWorkflow that should be run. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowName")
        private String mediaWorkflowName;

        /**
         * Name of the system MediaWorkflow that should be run.
         *
         * @param mediaWorkflowName the value to set
         * @return this builder
         */
        public Builder mediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            this.__explicitlySet__.add("mediaWorkflowName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMediaWorkflowJobByNameDetails build() {
            CreateMediaWorkflowJobByNameDetails model =
                    new CreateMediaWorkflowJobByNameDetails(
                            this.mediaWorkflowConfigurationIds,
                            this.compartmentId,
                            this.displayName,
                            this.parameters,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.mediaWorkflowName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMediaWorkflowJobByNameDetails model) {
            if (model.wasPropertyExplicitlySet("mediaWorkflowConfigurationIds")) {
                this.mediaWorkflowConfigurationIds(model.getMediaWorkflowConfigurationIds());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("mediaWorkflowName")) {
                this.mediaWorkflowName(model.getMediaWorkflowName());
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

    @Deprecated
    public CreateMediaWorkflowJobByNameDetails(
            java.util.List<String> mediaWorkflowConfigurationIds,
            String compartmentId,
            String displayName,
            java.util.Map<String, Object> parameters,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ResourceLock> locks,
            String mediaWorkflowName) {
        super(
                mediaWorkflowConfigurationIds,
                compartmentId,
                displayName,
                parameters,
                freeformTags,
                definedTags,
                locks);
        this.mediaWorkflowName = mediaWorkflowName;
    }

    /** Name of the system MediaWorkflow that should be run. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowName")
    private final String mediaWorkflowName;

    /**
     * Name of the system MediaWorkflow that should be run.
     *
     * @return the value
     */
    public String getMediaWorkflowName() {
        return mediaWorkflowName;
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
        sb.append("CreateMediaWorkflowJobByNameDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mediaWorkflowName=").append(String.valueOf(this.mediaWorkflowName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMediaWorkflowJobByNameDetails)) {
            return false;
        }

        CreateMediaWorkflowJobByNameDetails other = (CreateMediaWorkflowJobByNameDetails) o;
        return java.util.Objects.equals(this.mediaWorkflowName, other.mediaWorkflowName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mediaWorkflowName == null ? 43 : this.mediaWorkflowName.hashCode());
        return result;
    }
}
