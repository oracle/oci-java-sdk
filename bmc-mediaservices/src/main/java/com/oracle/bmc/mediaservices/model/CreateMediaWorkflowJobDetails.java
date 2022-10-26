/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Information to run the MediaWorkflow. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "workflowIdentifierType",
        defaultImpl = CreateMediaWorkflowJobDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateMediaWorkflowJobByNameDetails.class,
            name = "NAME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateMediaWorkflowJobByIdDetails.class,
            name = "ID")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CreateMediaWorkflowJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mediaWorkflowConfigurationIds",
        "compartmentId",
        "displayName",
        "parameters",
        "freeformTags",
        "definedTags"
    })
    protected CreateMediaWorkflowJobDetails(
            java.util.List<String> mediaWorkflowConfigurationIds,
            String compartmentId,
            String displayName,
            java.util.Map<String, Object> parameters,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.parameters = parameters;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /** Configurations to be applied to this run of the workflow. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
    private final java.util.List<String> mediaWorkflowConfigurationIds;

    /**
     * Configurations to be applied to this run of the workflow.
     *
     * @return the value
     */
    public java.util.List<String> getMediaWorkflowConfigurationIds() {
        return mediaWorkflowConfigurationIds;
    }

    /** ID of the compartment in which the job should be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * ID of the compartment in which the job should be created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
     * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
     * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON. The
     * top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The top
     * level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, Object> parameters;

    /**
     * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
     * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
     * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON. The
     * top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The top
     * level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateMediaWorkflowJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mediaWorkflowConfigurationIds=")
                .append(String.valueOf(this.mediaWorkflowConfigurationIds));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMediaWorkflowJobDetails)) {
            return false;
        }

        CreateMediaWorkflowJobDetails other = (CreateMediaWorkflowJobDetails) o;
        return java.util.Objects.equals(
                        this.mediaWorkflowConfigurationIds, other.mediaWorkflowConfigurationIds)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mediaWorkflowConfigurationIds == null
                                ? 43
                                : this.mediaWorkflowConfigurationIds.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Discriminate identification of a workflow by name versus a workflow by ID. */
    public enum WorkflowIdentifierType implements com.oracle.bmc.http.internal.BmcEnum {
        Id("ID"),
        Name("NAME"),
        ;

        private final String value;
        private static java.util.Map<String, WorkflowIdentifierType> map;

        static {
            map = new java.util.HashMap<>();
            for (WorkflowIdentifierType v : WorkflowIdentifierType.values()) {
                map.put(v.getValue(), v);
            }
        }

        WorkflowIdentifierType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WorkflowIdentifierType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WorkflowIdentifierType: " + key);
        }
    };
}
