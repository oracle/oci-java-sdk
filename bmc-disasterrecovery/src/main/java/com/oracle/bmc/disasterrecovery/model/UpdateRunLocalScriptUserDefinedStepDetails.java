/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating a Run Local Script step. <br>
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
        builder = UpdateRunLocalScriptUserDefinedStepDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRunLocalScriptUserDefinedStepDetails
        extends UpdateDrPlanUserDefinedStepDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the instance where this script or command should be executed.
         *
         * <p>Example: {@code ocid1.instance.oc1.phx.&lt;unique_id&gt;}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
        private String runOnInstanceId;

        /**
         * The OCID of the instance where this script or command should be executed.
         *
         * <p>Example: {@code ocid1.instance.oc1.phx.&lt;unique_id&gt;}
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

        public UpdateRunLocalScriptUserDefinedStepDetails build() {
            UpdateRunLocalScriptUserDefinedStepDetails model =
                    new UpdateRunLocalScriptUserDefinedStepDetails(
                            this.runOnInstanceId, this.scriptCommand, this.runAsUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRunLocalScriptUserDefinedStepDetails model) {
            if (model.wasPropertyExplicitlySet("runOnInstanceId")) {
                this.runOnInstanceId(model.getRunOnInstanceId());
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
    public UpdateRunLocalScriptUserDefinedStepDetails(
            String runOnInstanceId, String scriptCommand, String runAsUser) {
        super();
        this.runOnInstanceId = runOnInstanceId;
        this.scriptCommand = scriptCommand;
        this.runAsUser = runAsUser;
    }

    /**
     * The OCID of the instance where this script or command should be executed.
     *
     * <p>Example: {@code ocid1.instance.oc1.phx.&lt;unique_id&gt;}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
    private final String runOnInstanceId;

    /**
     * The OCID of the instance where this script or command should be executed.
     *
     * <p>Example: {@code ocid1.instance.oc1.phx.&lt;unique_id&gt;}
     *
     * @return the value
     */
    public String getRunOnInstanceId() {
        return runOnInstanceId;
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
        sb.append("UpdateRunLocalScriptUserDefinedStepDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runOnInstanceId=").append(String.valueOf(this.runOnInstanceId));
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
        if (!(o instanceof UpdateRunLocalScriptUserDefinedStepDetails)) {
            return false;
        }

        UpdateRunLocalScriptUserDefinedStepDetails other =
                (UpdateRunLocalScriptUserDefinedStepDetails) o;
        return java.util.Objects.equals(this.runOnInstanceId, other.runOnInstanceId)
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
                        + (this.scriptCommand == null ? 43 : this.scriptCommand.hashCode());
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        return result;
    }
}
