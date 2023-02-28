/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating a Run Object Store Script step. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateRunObjectStoreScriptUserDefinedStepDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateRunObjectStoreScriptUserDefinedStepDetails
        extends UpdateDrPlanUserDefinedStepDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the instance where this script or command should be executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
        private String runOnInstanceId;

        /**
         * The OCID of the instance where this script or command should be executed.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRunObjectStoreScriptUserDefinedStepDetails build() {
            UpdateRunObjectStoreScriptUserDefinedStepDetails model =
                    new UpdateRunObjectStoreScriptUserDefinedStepDetails(
                            this.runOnInstanceId, this.objectStorageScriptLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRunObjectStoreScriptUserDefinedStepDetails model) {
            if (model.wasPropertyExplicitlySet("runOnInstanceId")) {
                this.runOnInstanceId(model.getRunOnInstanceId());
            }
            if (model.wasPropertyExplicitlySet("objectStorageScriptLocation")) {
                this.objectStorageScriptLocation(model.getObjectStorageScriptLocation());
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
    public UpdateRunObjectStoreScriptUserDefinedStepDetails(
            String runOnInstanceId,
            UpdateObjectStorageScriptLocationDetails objectStorageScriptLocation) {
        super();
        this.runOnInstanceId = runOnInstanceId;
        this.objectStorageScriptLocation = objectStorageScriptLocation;
    }

    /** The OCID of the instance where this script or command should be executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("runOnInstanceId")
    private final String runOnInstanceId;

    /**
     * The OCID of the instance where this script or command should be executed.
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
        sb.append("UpdateRunObjectStoreScriptUserDefinedStepDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runOnInstanceId=").append(String.valueOf(this.runOnInstanceId));
        sb.append(", objectStorageScriptLocation=")
                .append(String.valueOf(this.objectStorageScriptLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRunObjectStoreScriptUserDefinedStepDetails)) {
            return false;
        }

        UpdateRunObjectStoreScriptUserDefinedStepDetails other =
                (UpdateRunObjectStoreScriptUserDefinedStepDetails) o;
        return java.util.Objects.equals(this.runOnInstanceId, other.runOnInstanceId)
                && java.util.Objects.equals(
                        this.objectStorageScriptLocation, other.objectStorageScriptLocation)
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
        return result;
    }
}
