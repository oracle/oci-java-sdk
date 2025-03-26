/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request to create execution action resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExecutionActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateExecutionActionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "executionWindowId",
        "actionType",
        "actionParams",
        "actionMembers",
        "freeformTags",
        "definedTags"
    })
    public CreateExecutionActionDetails(
            String compartmentId,
            String executionWindowId,
            ActionType actionType,
            java.util.Map<String, String> actionParams,
            java.util.List<ExecutionActionMember> actionMembers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.executionWindowId = executionWindowId;
        this.actionType = actionType;
        this.actionParams = actionParams;
        this.actionMembers = actionMembers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the execution window resource the execution action belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionWindowId")
        private String executionWindowId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the execution window resource the execution action belongs to.
         * @param executionWindowId the value to set
         * @return this builder
         **/
        public Builder executionWindowId(String executionWindowId) {
            this.executionWindowId = executionWindowId;
            this.__explicitlySet__.add("executionWindowId");
            return this;
        }
        /**
         * The action type of the execution action being performed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The action type of the execution action being performed
         * @param actionType the value to set
         * @return this builder
         **/
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
         * Example: {@code {"count": "3"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
        private java.util.Map<String, String> actionParams;

        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
         * Example: {@code {"count": "3"}}
         *
         * @param actionParams the value to set
         * @return this builder
         **/
        public Builder actionParams(java.util.Map<String, String> actionParams) {
            this.actionParams = actionParams;
            this.__explicitlySet__.add("actionParams");
            return this;
        }
        /**
         * List of action members of this execution action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
        private java.util.List<ExecutionActionMember> actionMembers;

        /**
         * List of action members of this execution action.
         * @param actionMembers the value to set
         * @return this builder
         **/
        public Builder actionMembers(java.util.List<ExecutionActionMember> actionMembers) {
            this.actionMembers = actionMembers;
            this.__explicitlySet__.add("actionMembers");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public CreateExecutionActionDetails build() {
            CreateExecutionActionDetails model =
                    new CreateExecutionActionDetails(
                            this.compartmentId,
                            this.executionWindowId,
                            this.actionType,
                            this.actionParams,
                            this.actionMembers,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExecutionActionDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("executionWindowId")) {
                this.executionWindowId(model.getExecutionWindowId());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("actionParams")) {
                this.actionParams(model.getActionParams());
            }
            if (model.wasPropertyExplicitlySet("actionMembers")) {
                this.actionMembers(model.getActionMembers());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the execution window resource the execution action belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionWindowId")
    private final String executionWindowId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the execution window resource the execution action belongs to.
     * @return the value
     **/
    public String getExecutionWindowId() {
        return executionWindowId;
    }

    /**
     * The action type of the execution action being performed
     **/
    public enum ActionType {
        DbServerFullSoftwareUpdate("DB_SERVER_FULL_SOFTWARE_UPDATE"),
        StorageServerFullSoftwareUpdate("STORAGE_SERVER_FULL_SOFTWARE_UPDATE"),
        NetworkSwitchFullSoftwareUpdate("NETWORK_SWITCH_FULL_SOFTWARE_UPDATE"),
        ;

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ActionType: " + key);
        }
    };
    /**
     * The action type of the execution action being performed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The action type of the execution action being performed
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
    private final java.util.Map<String, String> actionParams;

    /**
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getActionParams() {
        return actionParams;
    }

    /**
     * List of action members of this execution action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
    private final java.util.List<ExecutionActionMember> actionMembers;

    /**
     * List of action members of this execution action.
     * @return the value
     **/
    public java.util.List<ExecutionActionMember> getActionMembers() {
        return actionMembers;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateExecutionActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", executionWindowId=").append(String.valueOf(this.executionWindowId));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", actionParams=").append(String.valueOf(this.actionParams));
        sb.append(", actionMembers=").append(String.valueOf(this.actionMembers));
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
        if (!(o instanceof CreateExecutionActionDetails)) {
            return false;
        }

        CreateExecutionActionDetails other = (CreateExecutionActionDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.executionWindowId, other.executionWindowId)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.actionParams, other.actionParams)
                && java.util.Objects.equals(this.actionMembers, other.actionMembers)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionWindowId == null ? 43 : this.executionWindowId.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.actionParams == null ? 43 : this.actionParams.hashCode());
        result =
                (result * PRIME)
                        + (this.actionMembers == null ? 43 : this.actionMembers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
