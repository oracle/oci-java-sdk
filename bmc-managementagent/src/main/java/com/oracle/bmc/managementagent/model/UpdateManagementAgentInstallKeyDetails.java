/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Details required to change Management Agent install key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateManagementAgentInstallKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateManagementAgentInstallKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isKeyActive", "displayName"})
    public UpdateManagementAgentInstallKeyDetails(Boolean isKeyActive, String displayName) {
        super();
        this.isKeyActive = isKeyActive;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** if set to true the install key state would be set to Active and if false to Inactive */
        @com.fasterxml.jackson.annotation.JsonProperty("isKeyActive")
        private Boolean isKeyActive;

        /**
         * if set to true the install key state would be set to Active and if false to Inactive
         *
         * @param isKeyActive the value to set
         * @return this builder
         */
        public Builder isKeyActive(Boolean isKeyActive) {
            this.isKeyActive = isKeyActive;
            this.__explicitlySet__.add("isKeyActive");
            return this;
        }
        /** New displayName of Agent install key. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * New displayName of Agent install key.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateManagementAgentInstallKeyDetails build() {
            UpdateManagementAgentInstallKeyDetails model =
                    new UpdateManagementAgentInstallKeyDetails(this.isKeyActive, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateManagementAgentInstallKeyDetails model) {
            if (model.wasPropertyExplicitlySet("isKeyActive")) {
                this.isKeyActive(model.getIsKeyActive());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /** if set to true the install key state would be set to Active and if false to Inactive */
    @com.fasterxml.jackson.annotation.JsonProperty("isKeyActive")
    private final Boolean isKeyActive;

    /**
     * if set to true the install key state would be set to Active and if false to Inactive
     *
     * @return the value
     */
    public Boolean getIsKeyActive() {
        return isKeyActive;
    }

    /** New displayName of Agent install key. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * New displayName of Agent install key.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("UpdateManagementAgentInstallKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isKeyActive=").append(String.valueOf(this.isKeyActive));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateManagementAgentInstallKeyDetails)) {
            return false;
        }

        UpdateManagementAgentInstallKeyDetails other = (UpdateManagementAgentInstallKeyDetails) o;
        return java.util.Objects.equals(this.isKeyActive, other.isKeyActive)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isKeyActive == null ? 43 : this.isKeyActive.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
