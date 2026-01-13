/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating a Run Object Store Script precheck step. <br>
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
        builder = UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails
        extends UpdateDrPlanUserDefinedStepDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the instance on which this precjeck script or command should be executed.
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
         * The OCID of the instance on which this precjeck script or command should be executed.
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageScriptLocation")
        private UpdateObjectStorageScriptLocationDetails objectStorageScriptLocation;

        public Builder objectStorageScriptLocation(
                UpdateObjectStorageScriptLocationDetails objectStorageScriptLocation) {
            this.objectStorageScriptLocation = objectStorageScriptLocation;
            this.__explicitlySet__.add("objectStorageScriptLocation");
            return this;
        }
        /**
         * The entire path and arguments for the script that is stored in object store, or inside a
         * compressed archive in object store. Example: {@code /usr/bin/python3.7
         * scripts/start_server.py --port 8080 --env "production" --max-connections 200 --log-level
         * "INFO"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptCommand")
        private String scriptCommand;

        /**
         * The entire path and arguments for the script that is stored in object store, or inside a
         * compressed archive in object store. Example: {@code /usr/bin/python3.7
         * scripts/start_server.py --port 8080 --env "production" --max-connections 200 --log-level
         * "INFO"}
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
         * The user ID on the instance that will be used to execute the script specified in
         * 'scriptCommand'. Example: {@code opc}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
        private String runAsUser;

        /**
         * The user ID on the instance that will be used to execute the script specified in
         * 'scriptCommand'. Example: {@code opc}
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

        public UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails build() {
            UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails model =
                    new UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails(
                            this.runOnInstanceId,
                            this.objectStorageScriptLocation,
                            this.scriptCommand,
                            this.runAsUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails model) {
            if (model.wasPropertyExplicitlySet("runOnInstanceId")) {
                this.runOnInstanceId(model.getRunOnInstanceId());
            }
            if (model.wasPropertyExplicitlySet("objectStorageScriptLocation")) {
                this.objectStorageScriptLocation(model.getObjectStorageScriptLocation());
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
    public UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails(
            String runOnInstanceId,
            UpdateObjectStorageScriptLocationDetails objectStorageScriptLocation,
            String scriptCommand,
            String runAsUser) {
        super();
        this.runOnInstanceId = runOnInstanceId;
        this.objectStorageScriptLocation = objectStorageScriptLocation;
        this.scriptCommand = scriptCommand;
        this.runAsUser = runAsUser;
    }

    /**
     * The OCID of the instance on which this precjeck script or command should be executed.
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
     * The OCID of the instance on which this precjeck script or command should be executed.
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

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageScriptLocation")
    private final UpdateObjectStorageScriptLocationDetails objectStorageScriptLocation;

    public UpdateObjectStorageScriptLocationDetails getObjectStorageScriptLocation() {
        return objectStorageScriptLocation;
    }

    /**
     * The entire path and arguments for the script that is stored in object store, or inside a
     * compressed archive in object store. Example: {@code /usr/bin/python3.7
     * scripts/start_server.py --port 8080 --env "production" --max-connections 200 --log-level
     * "INFO"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptCommand")
    private final String scriptCommand;

    /**
     * The entire path and arguments for the script that is stored in object store, or inside a
     * compressed archive in object store. Example: {@code /usr/bin/python3.7
     * scripts/start_server.py --port 8080 --env "production" --max-connections 200 --log-level
     * "INFO"}
     *
     * @return the value
     */
    public String getScriptCommand() {
        return scriptCommand;
    }

    /**
     * The user ID on the instance that will be used to execute the script specified in
     * 'scriptCommand'. Example: {@code opc}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    private final String runAsUser;

    /**
     * The user ID on the instance that will be used to execute the script specified in
     * 'scriptCommand'. Example: {@code opc}
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
        sb.append("UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runOnInstanceId=").append(String.valueOf(this.runOnInstanceId));
        sb.append(", objectStorageScriptLocation=")
                .append(String.valueOf(this.objectStorageScriptLocation));
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
        if (!(o instanceof UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails)) {
            return false;
        }

        UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails other =
                (UpdateRunObjectStoreScriptUserDefinedCustomPrecheckStepDetails) o;
        return java.util.Objects.equals(this.runOnInstanceId, other.runOnInstanceId)
                && java.util.Objects.equals(
                        this.objectStorageScriptLocation, other.objectStorageScriptLocation)
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
                        + (this.objectStorageScriptLocation == null
                                ? 43
                                : this.objectStorageScriptLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptCommand == null ? 43 : this.scriptCommand.hashCode());
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        return result;
    }
}
