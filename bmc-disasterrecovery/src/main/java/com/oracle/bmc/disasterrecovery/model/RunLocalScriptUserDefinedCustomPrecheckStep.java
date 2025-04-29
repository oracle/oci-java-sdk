/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Run Local Script User Defined custom precheck step details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunLocalScriptUserDefinedCustomPrecheckStep.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunLocalScriptUserDefinedCustomPrecheckStep extends DrPlanUserDefinedStep {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the instance on which this script or command should be executed.
         *
         * <p>*For moving instances:** *runOnInstanceId* must be the OCID of the instance in the
         * region where the instance is currently present.
         *
         * <p>*For non-moving instances:** *runOnInstanceId* must be the OCID of the non-moving
         * instance.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
        private String runOnInstanceId;

        /**
         * The OCID of the instance on which this script or command should be executed.
         *
         * <p>*For moving instances:** *runOnInstanceId* must be the OCID of the instance in the
         * region where the instance is currently present.
         *
         * <p>*For non-moving instances:** *runOnInstanceId* must be the OCID of the non-moving
         * instance.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         *
         * @param runOnInstanceId the value to set
         * @return this builder
         */
        public Builder runOnInstanceId(String runOnInstanceId) {
            this.runOnInstanceId = runOnInstanceId;
            this.__explicitlySet__.add("runOnInstanceId");
            return this;
        }
        /**
         * The region in which the instance is present.
         *
         * <p>Example: {@code us-ashburn-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceRegion")
        private String runOnInstanceRegion;

        /**
         * The region in which the instance is present.
         *
         * <p>Example: {@code us-ashburn-1}
         *
         * @param runOnInstanceRegion the value to set
         * @return this builder
         */
        public Builder runOnInstanceRegion(String runOnInstanceRegion) {
            this.runOnInstanceRegion = runOnInstanceRegion;
            this.__explicitlySet__.add("runOnInstanceRegion");
            return this;
        }
        /**
         * The script name and arguments.
         *
         * <p>Example: {@code /usr/bin/python3 /home/opc/scripts/my_app_script.py arg1 arg2 arg3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptCommand")
        private String scriptCommand;

        /**
         * The script name and arguments.
         *
         * <p>Example: {@code /usr/bin/python3 /home/opc/scripts/my_app_script.py arg1 arg2 arg3}
         *
         * @param scriptCommand the value to set
         * @return this builder
         */
        public Builder scriptCommand(String scriptCommand) {
            this.scriptCommand = scriptCommand;
            this.__explicitlySet__.add("scriptCommand");
            return this;
        }
        /**
         * The userid on the instance to be used for executing the script or command.
         *
         * <p>Example: {@code opc}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
        private String runAsUser;

        /**
         * The userid on the instance to be used for executing the script or command.
         *
         * <p>Example: {@code opc}
         *
         * @param runAsUser the value to set
         * @return this builder
         */
        public Builder runAsUser(String runAsUser) {
            this.runAsUser = runAsUser;
            this.__explicitlySet__.add("runAsUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunLocalScriptUserDefinedCustomPrecheckStep build() {
            RunLocalScriptUserDefinedCustomPrecheckStep model =
                    new RunLocalScriptUserDefinedCustomPrecheckStep(
                            this.runOnInstanceId,
                            this.runOnInstanceRegion,
                            this.scriptCommand,
                            this.runAsUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunLocalScriptUserDefinedCustomPrecheckStep model) {
            if (model.wasPropertyExplicitlySet("runOnInstanceId")) {
                this.runOnInstanceId(model.getRunOnInstanceId());
            }
            if (model.wasPropertyExplicitlySet("runOnInstanceRegion")) {
                this.runOnInstanceRegion(model.getRunOnInstanceRegion());
            }
            if (model.wasPropertyExplicitlySet("scriptCommand")) {
                this.scriptCommand(model.getScriptCommand());
            }
            if (model.wasPropertyExplicitlySet("runAsUser")) {
                this.runAsUser(model.getRunAsUser());
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
    public RunLocalScriptUserDefinedCustomPrecheckStep(
            String runOnInstanceId,
            String runOnInstanceRegion,
            String scriptCommand,
            String runAsUser) {
        super();
        this.runOnInstanceId = runOnInstanceId;
        this.runOnInstanceRegion = runOnInstanceRegion;
        this.scriptCommand = scriptCommand;
        this.runAsUser = runAsUser;
    }

    /**
     * The OCID of the instance on which this script or command should be executed.
     *
     * <p>*For moving instances:** *runOnInstanceId* must be the OCID of the instance in the region
     * where the instance is currently present.
     *
     * <p>*For non-moving instances:** *runOnInstanceId* must be the OCID of the non-moving
     * instance.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
    private final String runOnInstanceId;

    /**
     * The OCID of the instance on which this script or command should be executed.
     *
     * <p>*For moving instances:** *runOnInstanceId* must be the OCID of the instance in the region
     * where the instance is currently present.
     *
     * <p>*For non-moving instances:** *runOnInstanceId* must be the OCID of the non-moving
     * instance.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     *
     * @return the value
     */
    public String getRunOnInstanceId() {
        return runOnInstanceId;
    }

    /**
     * The region in which the instance is present.
     *
     * <p>Example: {@code us-ashburn-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceRegion")
    private final String runOnInstanceRegion;

    /**
     * The region in which the instance is present.
     *
     * <p>Example: {@code us-ashburn-1}
     *
     * @return the value
     */
    public String getRunOnInstanceRegion() {
        return runOnInstanceRegion;
    }

    /**
     * The script name and arguments.
     *
     * <p>Example: {@code /usr/bin/python3 /home/opc/scripts/my_app_script.py arg1 arg2 arg3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptCommand")
    private final String scriptCommand;

    /**
     * The script name and arguments.
     *
     * <p>Example: {@code /usr/bin/python3 /home/opc/scripts/my_app_script.py arg1 arg2 arg3}
     *
     * @return the value
     */
    public String getScriptCommand() {
        return scriptCommand;
    }

    /**
     * The userid on the instance to be used for executing the script or command.
     *
     * <p>Example: {@code opc}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    private final String runAsUser;

    /**
     * The userid on the instance to be used for executing the script or command.
     *
     * <p>Example: {@code opc}
     *
     * @return the value
     */
    public String getRunAsUser() {
        return runAsUser;
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
        sb.append("RunLocalScriptUserDefinedCustomPrecheckStep(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runOnInstanceId=").append(String.valueOf(this.runOnInstanceId));
        sb.append(", runOnInstanceRegion=").append(String.valueOf(this.runOnInstanceRegion));
        sb.append(", scriptCommand=").append(String.valueOf(this.scriptCommand));
        sb.append(", runAsUser=").append(String.valueOf(this.runAsUser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunLocalScriptUserDefinedCustomPrecheckStep)) {
            return false;
        }

        RunLocalScriptUserDefinedCustomPrecheckStep other =
                (RunLocalScriptUserDefinedCustomPrecheckStep) o;
        return java.util.Objects.equals(this.runOnInstanceId, other.runOnInstanceId)
                && java.util.Objects.equals(this.runOnInstanceRegion, other.runOnInstanceRegion)
                && java.util.Objects.equals(this.scriptCommand, other.scriptCommand)
                && java.util.Objects.equals(this.runAsUser, other.runAsUser)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.runOnInstanceId == null ? 43 : this.runOnInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.runOnInstanceRegion == null
                                ? 43
                                : this.runOnInstanceRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptCommand == null ? 43 : this.scriptCommand.hashCode());
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        return result;
    }
}
