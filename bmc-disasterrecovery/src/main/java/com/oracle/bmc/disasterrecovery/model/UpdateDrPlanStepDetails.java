/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating a DR plan step.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDrPlanStepDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrPlanStepDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "errorMode",
        "timeout",
        "isEnabled",
        "userDefinedStep"
    })
    public UpdateDrPlanStepDetails(
            String id,
            String displayName,
            DrPlanStepErrorMode errorMode,
            Integer timeout,
            Boolean isEnabled,
            UpdateDrPlanUserDefinedStepDetails userDefinedStep) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.errorMode = errorMode;
        this.timeout = timeout;
        this.isEnabled = isEnabled;
        this.userDefinedStep = userDefinedStep;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of the step.
         * <p>
         * Example: {@code sgid1.step..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of the step.
         * <p>
         * Example: {@code sgid1.step..uniqueID}
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The display name of the step in a group.
         * <p>
         * Example: {@code My_STEP_3A - EBS Start - STAGE A}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the step in a group.
         * <p>
         * Example: {@code My_STEP_3A - EBS Start - STAGE A}
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
         * The error mode for this step.
         * The default error mode for the step is {@code STOP_ON_ERROR}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMode")
        private DrPlanStepErrorMode errorMode;

        /**
         * The error mode for this step.
         * The default error mode for the step is {@code STOP_ON_ERROR}.
         *
         * @param errorMode the value to set
         * @return this builder
         **/
        public Builder errorMode(DrPlanStepErrorMode errorMode) {
            this.errorMode = errorMode;
            this.__explicitlySet__.add("errorMode");
            return this;
        }
        /**
         * The timeout in seconds for executing this step.
         * When creating a new step, if no timeout is specified, the default timeout is set to {@code 3600} seconds.
         * <p>
         * Example: {@code 600}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private Integer timeout;

        /**
         * The timeout in seconds for executing this step.
         * When creating a new step, if no timeout is specified, the default timeout is set to {@code 3600} seconds.
         * <p>
         * Example: {@code 600}
         *
         * @param timeout the value to set
         * @return this builder
         **/
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }
        /**
         * A flag indicating whether this step should be enabled for execution.
         * The default value for the isEnabled flag is {@code true}.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag indicating whether this step should be enabled for execution.
         * The default value for the isEnabled flag is {@code true}.
         * <p>
         * Example: {@code true}
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userDefinedStep")
        private UpdateDrPlanUserDefinedStepDetails userDefinedStep;

        public Builder userDefinedStep(UpdateDrPlanUserDefinedStepDetails userDefinedStep) {
            this.userDefinedStep = userDefinedStep;
            this.__explicitlySet__.add("userDefinedStep");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrPlanStepDetails build() {
            UpdateDrPlanStepDetails model =
                    new UpdateDrPlanStepDetails(
                            this.id,
                            this.displayName,
                            this.errorMode,
                            this.timeout,
                            this.isEnabled,
                            this.userDefinedStep);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrPlanStepDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("errorMode")) {
                this.errorMode(model.getErrorMode());
            }
            if (model.wasPropertyExplicitlySet("timeout")) {
                this.timeout(model.getTimeout());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("userDefinedStep")) {
                this.userDefinedStep(model.getUserDefinedStep());
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
     * The unique id of the step.
     * <p>
     * Example: {@code sgid1.step..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of the step.
     * <p>
     * Example: {@code sgid1.step..uniqueID}
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The display name of the step in a group.
     * <p>
     * Example: {@code My_STEP_3A - EBS Start - STAGE A}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the step in a group.
     * <p>
     * Example: {@code My_STEP_3A - EBS Start - STAGE A}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The error mode for this step.
     * The default error mode for the step is {@code STOP_ON_ERROR}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMode")
    private final DrPlanStepErrorMode errorMode;

    /**
     * The error mode for this step.
     * The default error mode for the step is {@code STOP_ON_ERROR}.
     *
     * @return the value
     **/
    public DrPlanStepErrorMode getErrorMode() {
        return errorMode;
    }

    /**
     * The timeout in seconds for executing this step.
     * When creating a new step, if no timeout is specified, the default timeout is set to {@code 3600} seconds.
     * <p>
     * Example: {@code 600}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final Integer timeout;

    /**
     * The timeout in seconds for executing this step.
     * When creating a new step, if no timeout is specified, the default timeout is set to {@code 3600} seconds.
     * <p>
     * Example: {@code 600}
     *
     * @return the value
     **/
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * A flag indicating whether this step should be enabled for execution.
     * The default value for the isEnabled flag is {@code true}.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag indicating whether this step should be enabled for execution.
     * The default value for the isEnabled flag is {@code true}.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userDefinedStep")
    private final UpdateDrPlanUserDefinedStepDetails userDefinedStep;

    public UpdateDrPlanUserDefinedStepDetails getUserDefinedStep() {
        return userDefinedStep;
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
        sb.append("UpdateDrPlanStepDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", errorMode=").append(String.valueOf(this.errorMode));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", userDefinedStep=").append(String.valueOf(this.userDefinedStep));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrPlanStepDetails)) {
            return false;
        }

        UpdateDrPlanStepDetails other = (UpdateDrPlanStepDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.errorMode, other.errorMode)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.userDefinedStep, other.userDefinedStep)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.errorMode == null ? 43 : this.errorMode.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.userDefinedStep == null ? 43 : this.userDefinedStep.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
