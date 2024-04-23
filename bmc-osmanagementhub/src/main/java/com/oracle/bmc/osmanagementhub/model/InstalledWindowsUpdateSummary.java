/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines an installed update for a Windows instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstalledWindowsUpdateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstalledWindowsUpdateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "updateId", "updateType"})
    public InstalledWindowsUpdateSummary(
            String name, String updateId, ClassificationTypes updateType) {
        super();
        this.name = name;
        this.updateId = updateId;
        this.updateType = updateType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the Windows update. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Windows update.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateId")
        private String updateId;

        /**
         * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         *
         * @param updateId the value to set
         * @return this builder
         */
        public Builder updateId(String updateId) {
            this.updateId = updateId;
            this.__explicitlySet__.add("updateId");
            return this;
        }
        /** The type of Windows update. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private ClassificationTypes updateType;

        /**
         * The type of Windows update.
         *
         * @param updateType the value to set
         * @return this builder
         */
        public Builder updateType(ClassificationTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstalledWindowsUpdateSummary build() {
            InstalledWindowsUpdateSummary model =
                    new InstalledWindowsUpdateSummary(this.name, this.updateId, this.updateType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstalledWindowsUpdateSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("updateId")) {
                this.updateId(model.getUpdateId());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
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

    /** Name of the Windows update. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Windows update.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateId")
    private final String updateId;

    /**
     * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     *
     * @return the value
     */
    public String getUpdateId() {
        return updateId;
    }

    /** The type of Windows update. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final ClassificationTypes updateType;

    /**
     * The type of Windows update.
     *
     * @return the value
     */
    public ClassificationTypes getUpdateType() {
        return updateType;
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
        sb.append("InstalledWindowsUpdateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", updateId=").append(String.valueOf(this.updateId));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstalledWindowsUpdateSummary)) {
            return false;
        }

        InstalledWindowsUpdateSummary other = (InstalledWindowsUpdateSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.updateId, other.updateId)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
