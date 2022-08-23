/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Information to run a MediaWorkflow identified by its OCID.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMediaWorkflowJobByIdDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "workflowIdentifierType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMediaWorkflowJobByIdDetails extends CreateMediaWorkflowJobDetails {
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
        /**
         * OCID of the MediaWorkflow that should be run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowId")
        private String mediaWorkflowId;

        /**
         * OCID of the MediaWorkflow that should be run.
         * @param mediaWorkflowId the value to set
         * @return this builder
         **/
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            this.__explicitlySet__.add("mediaWorkflowId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMediaWorkflowJobByIdDetails build() {
            CreateMediaWorkflowJobByIdDetails model =
                    new CreateMediaWorkflowJobByIdDetails(
                            this.mediaWorkflowConfigurationIds,
                            this.compartmentId,
                            this.displayName,
                            this.parameters,
                            this.freeformTags,
                            this.definedTags,
                            this.mediaWorkflowId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMediaWorkflowJobByIdDetails model) {
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
            if (model.wasPropertyExplicitlySet("mediaWorkflowId")) {
                this.mediaWorkflowId(model.getMediaWorkflowId());
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

    @Deprecated
    public CreateMediaWorkflowJobByIdDetails(
            java.util.List<String> mediaWorkflowConfigurationIds,
            String compartmentId,
            String displayName,
            java.util.Map<String, Object> parameters,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String mediaWorkflowId) {
        super(
                mediaWorkflowConfigurationIds,
                compartmentId,
                displayName,
                parameters,
                freeformTags,
                definedTags);
        this.mediaWorkflowId = mediaWorkflowId;
    }

    /**
     * OCID of the MediaWorkflow that should be run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowId")
    private final String mediaWorkflowId;

    /**
     * OCID of the MediaWorkflow that should be run.
     * @return the value
     **/
    public String getMediaWorkflowId() {
        return mediaWorkflowId;
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
        sb.append("CreateMediaWorkflowJobByIdDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mediaWorkflowId=").append(String.valueOf(this.mediaWorkflowId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMediaWorkflowJobByIdDetails)) {
            return false;
        }

        CreateMediaWorkflowJobByIdDetails other = (CreateMediaWorkflowJobByIdDetails) o;
        return java.util.Objects.equals(this.mediaWorkflowId, other.mediaWorkflowId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mediaWorkflowId == null ? 43 : this.mediaWorkflowId.hashCode());
        return result;
    }
}
