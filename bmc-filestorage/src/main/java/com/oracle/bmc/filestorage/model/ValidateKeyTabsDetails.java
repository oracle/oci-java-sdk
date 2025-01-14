/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Validate keytabs request details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateKeyTabsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateKeyTabsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountTargetId", "keyTabSecretDetails"})
    public ValidateKeyTabsDetails(String mountTargetId, KeyTabSecretDetails keyTabSecretDetails) {
        super();
        this.mountTargetId = mountTargetId;
        this.keyTabSecretDetails = keyTabSecretDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * mount target whose keytabs are to be validated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
        private String mountTargetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * mount target whose keytabs are to be validated.
         *
         * @param mountTargetId the value to set
         * @return this builder
         */
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = mountTargetId;
            this.__explicitlySet__.add("mountTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretDetails")
        private KeyTabSecretDetails keyTabSecretDetails;

        public Builder keyTabSecretDetails(KeyTabSecretDetails keyTabSecretDetails) {
            this.keyTabSecretDetails = keyTabSecretDetails;
            this.__explicitlySet__.add("keyTabSecretDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateKeyTabsDetails build() {
            ValidateKeyTabsDetails model =
                    new ValidateKeyTabsDetails(this.mountTargetId, this.keyTabSecretDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateKeyTabsDetails model) {
            if (model.wasPropertyExplicitlySet("mountTargetId")) {
                this.mountTargetId(model.getMountTargetId());
            }
            if (model.wasPropertyExplicitlySet("keyTabSecretDetails")) {
                this.keyTabSecretDetails(model.getKeyTabSecretDetails());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * mount target whose keytabs are to be validated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
    private final String mountTargetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * mount target whose keytabs are to be validated.
     *
     * @return the value
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyTabSecretDetails")
    private final KeyTabSecretDetails keyTabSecretDetails;

    public KeyTabSecretDetails getKeyTabSecretDetails() {
        return keyTabSecretDetails;
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
        sb.append("ValidateKeyTabsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mountTargetId=").append(String.valueOf(this.mountTargetId));
        sb.append(", keyTabSecretDetails=").append(String.valueOf(this.keyTabSecretDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateKeyTabsDetails)) {
            return false;
        }

        ValidateKeyTabsDetails other = (ValidateKeyTabsDetails) o;
        return java.util.Objects.equals(this.mountTargetId, other.mountTargetId)
                && java.util.Objects.equals(this.keyTabSecretDetails, other.keyTabSecretDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mountTargetId == null ? 43 : this.mountTargetId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyTabSecretDetails == null
                                ? 43
                                : this.keyTabSecretDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
