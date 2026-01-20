/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for creating the identity configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateIdentityConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIdentityConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterAdminPassword",
        "displayName",
        "identityDomainId",
        "confidentialApplicationId",
        "upstConfigurationDetails",
        "iamUserSyncConfigurationDetails"
    })
    public CreateIdentityConfigurationDetails(
            String clusterAdminPassword,
            String displayName,
            String identityDomainId,
            String confidentialApplicationId,
            UpstConfigurationDetails upstConfigurationDetails,
            IamUserSyncConfigurationDetails iamUserSyncConfigurationDetails) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.displayName = displayName;
        this.identityDomainId = identityDomainId;
        this.confidentialApplicationId = confidentialApplicationId;
        this.upstConfigurationDetails = upstConfigurationDetails;
        this.iamUserSyncConfigurationDetails = iamUserSyncConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base-64 encoded password for the cluster admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * Display name of the identity configuration, required for creating identity configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the identity configuration, required for creating identity configuration.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Identity domain OCID to use for identity config, required for creating identity
         * configuration
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
        private String identityDomainId;

        /**
         * Identity domain OCID to use for identity config, required for creating identity
         * configuration
         *
         * @param identityDomainId the value to set
         * @return this builder
         */
        public Builder identityDomainId(String identityDomainId) {
            this.identityDomainId = identityDomainId;
            this.__explicitlySet__.add("identityDomainId");
            return this;
        }
        /**
         * Identity domain confidential application ID for the identity config, required for
         * creating identity configuration
         */
        @com.fasterxml.jackson.annotation.JsonProperty("confidentialApplicationId")
        private String confidentialApplicationId;

        /**
         * Identity domain confidential application ID for the identity config, required for
         * creating identity configuration
         *
         * @param confidentialApplicationId the value to set
         * @return this builder
         */
        public Builder confidentialApplicationId(String confidentialApplicationId) {
            this.confidentialApplicationId = confidentialApplicationId;
            this.__explicitlySet__.add("confidentialApplicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upstConfigurationDetails")
        private UpstConfigurationDetails upstConfigurationDetails;

        public Builder upstConfigurationDetails(UpstConfigurationDetails upstConfigurationDetails) {
            this.upstConfigurationDetails = upstConfigurationDetails;
            this.__explicitlySet__.add("upstConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iamUserSyncConfigurationDetails")
        private IamUserSyncConfigurationDetails iamUserSyncConfigurationDetails;

        public Builder iamUserSyncConfigurationDetails(
                IamUserSyncConfigurationDetails iamUserSyncConfigurationDetails) {
            this.iamUserSyncConfigurationDetails = iamUserSyncConfigurationDetails;
            this.__explicitlySet__.add("iamUserSyncConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIdentityConfigurationDetails build() {
            CreateIdentityConfigurationDetails model =
                    new CreateIdentityConfigurationDetails(
                            this.clusterAdminPassword,
                            this.displayName,
                            this.identityDomainId,
                            this.confidentialApplicationId,
                            this.upstConfigurationDetails,
                            this.iamUserSyncConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIdentityConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("identityDomainId")) {
                this.identityDomainId(model.getIdentityDomainId());
            }
            if (model.wasPropertyExplicitlySet("confidentialApplicationId")) {
                this.confidentialApplicationId(model.getConfidentialApplicationId());
            }
            if (model.wasPropertyExplicitlySet("upstConfigurationDetails")) {
                this.upstConfigurationDetails(model.getUpstConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("iamUserSyncConfigurationDetails")) {
                this.iamUserSyncConfigurationDetails(model.getIamUserSyncConfigurationDetails());
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

    /** Base-64 encoded password for the cluster admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /** Display name of the identity configuration, required for creating identity configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the identity configuration, required for creating identity configuration.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Identity domain OCID to use for identity config, required for creating identity configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
    private final String identityDomainId;

    /**
     * Identity domain OCID to use for identity config, required for creating identity configuration
     *
     * @return the value
     */
    public String getIdentityDomainId() {
        return identityDomainId;
    }

    /**
     * Identity domain confidential application ID for the identity config, required for creating
     * identity configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("confidentialApplicationId")
    private final String confidentialApplicationId;

    /**
     * Identity domain confidential application ID for the identity config, required for creating
     * identity configuration
     *
     * @return the value
     */
    public String getConfidentialApplicationId() {
        return confidentialApplicationId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("upstConfigurationDetails")
    private final UpstConfigurationDetails upstConfigurationDetails;

    public UpstConfigurationDetails getUpstConfigurationDetails() {
        return upstConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iamUserSyncConfigurationDetails")
    private final IamUserSyncConfigurationDetails iamUserSyncConfigurationDetails;

    public IamUserSyncConfigurationDetails getIamUserSyncConfigurationDetails() {
        return iamUserSyncConfigurationDetails;
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
        sb.append("CreateIdentityConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", identityDomainId=").append(String.valueOf(this.identityDomainId));
        sb.append(", confidentialApplicationId=")
                .append(String.valueOf(this.confidentialApplicationId));
        sb.append(", upstConfigurationDetails=")
                .append(String.valueOf(this.upstConfigurationDetails));
        sb.append(", iamUserSyncConfigurationDetails=")
                .append(String.valueOf(this.iamUserSyncConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdentityConfigurationDetails)) {
            return false;
        }

        CreateIdentityConfigurationDetails other = (CreateIdentityConfigurationDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.identityDomainId, other.identityDomainId)
                && java.util.Objects.equals(
                        this.confidentialApplicationId, other.confidentialApplicationId)
                && java.util.Objects.equals(
                        this.upstConfigurationDetails, other.upstConfigurationDetails)
                && java.util.Objects.equals(
                        this.iamUserSyncConfigurationDetails, other.iamUserSyncConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainId == null ? 43 : this.identityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.confidentialApplicationId == null
                                ? 43
                                : this.confidentialApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.upstConfigurationDetails == null
                                ? 43
                                : this.upstConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.iamUserSyncConfigurationDetails == null
                                ? 43
                                : this.iamUserSyncConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
