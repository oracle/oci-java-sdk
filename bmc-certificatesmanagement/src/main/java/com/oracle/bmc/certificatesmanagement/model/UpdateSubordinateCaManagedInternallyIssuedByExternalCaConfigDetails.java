/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The configuration details for updating an internally managed subordinate certificate authority
 * (CA) which is issued by an external CA. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails
        extends UpdateCertificateAuthorityConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        private Stage stage;

        public Builder stage(Stage stage) {
            this.stage = stage;
            this.__explicitlySet__.add("stage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionDetails")
        private UpdateCertificateAuthorityActionDetails actionDetails;

        public Builder actionDetails(UpdateCertificateAuthorityActionDetails actionDetails) {
            this.actionDetails = actionDetails;
            this.__explicitlySet__.add("actionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails build() {
            UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails model =
                    new UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails(
                            this.versionName, this.stage, this.actionDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails model) {
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("stage")) {
                this.stage(model.getStage());
            }
            if (model.wasPropertyExplicitlySet("actionDetails")) {
                this.actionDetails(model.getActionDetails());
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
    public UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails(
            String versionName,
            Stage stage,
            UpdateCertificateAuthorityActionDetails actionDetails) {
        super(versionName, stage);
        this.actionDetails = actionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("actionDetails")
    private final UpdateCertificateAuthorityActionDetails actionDetails;

    public UpdateCertificateAuthorityActionDetails getActionDetails() {
        return actionDetails;
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
        sb.append("UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", actionDetails=").append(String.valueOf(this.actionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails)) {
            return false;
        }

        UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails other =
                (UpdateSubordinateCaManagedInternallyIssuedByExternalCaConfigDetails) o;
        return java.util.Objects.equals(this.actionDetails, other.actionDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.actionDetails == null ? 43 : this.actionDetails.hashCode());
        return result;
    }
}
