/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * SAML policy is optionally used for Opensearch cluster to config SAML authentication <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecuritySamlConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecuritySamlConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "idpMetadataContent",
        "idpEntityId",
        "opendashboardUrl",
        "adminBackendRole",
        "subjectKey",
        "rolesKey"
    })
    public SecuritySamlConfig(
            Boolean isEnabled,
            String idpMetadataContent,
            String idpEntityId,
            String opendashboardUrl,
            String adminBackendRole,
            String subjectKey,
            String rolesKey) {
        super();
        this.isEnabled = isEnabled;
        this.idpMetadataContent = idpMetadataContent;
        this.idpEntityId = idpEntityId;
        this.opendashboardUrl = opendashboardUrl;
        this.adminBackendRole = adminBackendRole;
        this.subjectKey = subjectKey;
        this.rolesKey = rolesKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A flag determine whether SAML is enabled */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag determine whether SAML is enabled
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The content of identity provider metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("idpMetadataContent")
        private String idpMetadataContent;

        /**
         * The content of identity provider metadata
         *
         * @param idpMetadataContent the value to set
         * @return this builder
         */
        public Builder idpMetadataContent(String idpMetadataContent) {
            this.idpMetadataContent = idpMetadataContent;
            this.__explicitlySet__.add("idpMetadataContent");
            return this;
        }
        /** The unique name for a identity provider entity */
        @com.fasterxml.jackson.annotation.JsonProperty("idpEntityId")
        private String idpEntityId;

        /**
         * The unique name for a identity provider entity
         *
         * @param idpEntityId the value to set
         * @return this builder
         */
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = idpEntityId;
            this.__explicitlySet__.add("idpEntityId");
            return this;
        }
        /** The endpoint of opendashboard */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardUrl")
        private String opendashboardUrl;

        /**
         * The endpoint of opendashboard
         *
         * @param opendashboardUrl the value to set
         * @return this builder
         */
        public Builder opendashboardUrl(String opendashboardUrl) {
            this.opendashboardUrl = opendashboardUrl;
            this.__explicitlySet__.add("opendashboardUrl");
            return this;
        }
        /** The backend role of admins who have all permissions like local master user */
        @com.fasterxml.jackson.annotation.JsonProperty("adminBackendRole")
        private String adminBackendRole;

        /**
         * The backend role of admins who have all permissions like local master user
         *
         * @param adminBackendRole the value to set
         * @return this builder
         */
        public Builder adminBackendRole(String adminBackendRole) {
            this.adminBackendRole = adminBackendRole;
            this.__explicitlySet__.add("adminBackendRole");
            return this;
        }
        /** The subject key is used to get username from SAML assertion. By default, it is NameID */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectKey")
        private String subjectKey;

        /**
         * The subject key is used to get username from SAML assertion. By default, it is NameID
         *
         * @param subjectKey the value to set
         * @return this builder
         */
        public Builder subjectKey(String subjectKey) {
            this.subjectKey = subjectKey;
            this.__explicitlySet__.add("subjectKey");
            return this;
        }
        /** The roles key is sued to get backend roles from SAML assertion */
        @com.fasterxml.jackson.annotation.JsonProperty("rolesKey")
        private String rolesKey;

        /**
         * The roles key is sued to get backend roles from SAML assertion
         *
         * @param rolesKey the value to set
         * @return this builder
         */
        public Builder rolesKey(String rolesKey) {
            this.rolesKey = rolesKey;
            this.__explicitlySet__.add("rolesKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecuritySamlConfig build() {
            SecuritySamlConfig model =
                    new SecuritySamlConfig(
                            this.isEnabled,
                            this.idpMetadataContent,
                            this.idpEntityId,
                            this.opendashboardUrl,
                            this.adminBackendRole,
                            this.subjectKey,
                            this.rolesKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecuritySamlConfig model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("idpMetadataContent")) {
                this.idpMetadataContent(model.getIdpMetadataContent());
            }
            if (model.wasPropertyExplicitlySet("idpEntityId")) {
                this.idpEntityId(model.getIdpEntityId());
            }
            if (model.wasPropertyExplicitlySet("opendashboardUrl")) {
                this.opendashboardUrl(model.getOpendashboardUrl());
            }
            if (model.wasPropertyExplicitlySet("adminBackendRole")) {
                this.adminBackendRole(model.getAdminBackendRole());
            }
            if (model.wasPropertyExplicitlySet("subjectKey")) {
                this.subjectKey(model.getSubjectKey());
            }
            if (model.wasPropertyExplicitlySet("rolesKey")) {
                this.rolesKey(model.getRolesKey());
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

    /** A flag determine whether SAML is enabled */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag determine whether SAML is enabled
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The content of identity provider metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("idpMetadataContent")
    private final String idpMetadataContent;

    /**
     * The content of identity provider metadata
     *
     * @return the value
     */
    public String getIdpMetadataContent() {
        return idpMetadataContent;
    }

    /** The unique name for a identity provider entity */
    @com.fasterxml.jackson.annotation.JsonProperty("idpEntityId")
    private final String idpEntityId;

    /**
     * The unique name for a identity provider entity
     *
     * @return the value
     */
    public String getIdpEntityId() {
        return idpEntityId;
    }

    /** The endpoint of opendashboard */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardUrl")
    private final String opendashboardUrl;

    /**
     * The endpoint of opendashboard
     *
     * @return the value
     */
    public String getOpendashboardUrl() {
        return opendashboardUrl;
    }

    /** The backend role of admins who have all permissions like local master user */
    @com.fasterxml.jackson.annotation.JsonProperty("adminBackendRole")
    private final String adminBackendRole;

    /**
     * The backend role of admins who have all permissions like local master user
     *
     * @return the value
     */
    public String getAdminBackendRole() {
        return adminBackendRole;
    }

    /** The subject key is used to get username from SAML assertion. By default, it is NameID */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectKey")
    private final String subjectKey;

    /**
     * The subject key is used to get username from SAML assertion. By default, it is NameID
     *
     * @return the value
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /** The roles key is sued to get backend roles from SAML assertion */
    @com.fasterxml.jackson.annotation.JsonProperty("rolesKey")
    private final String rolesKey;

    /**
     * The roles key is sued to get backend roles from SAML assertion
     *
     * @return the value
     */
    public String getRolesKey() {
        return rolesKey;
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
        sb.append("SecuritySamlConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", idpMetadataContent=").append(String.valueOf(this.idpMetadataContent));
        sb.append(", idpEntityId=").append(String.valueOf(this.idpEntityId));
        sb.append(", opendashboardUrl=").append(String.valueOf(this.opendashboardUrl));
        sb.append(", adminBackendRole=").append(String.valueOf(this.adminBackendRole));
        sb.append(", subjectKey=").append(String.valueOf(this.subjectKey));
        sb.append(", rolesKey=").append(String.valueOf(this.rolesKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecuritySamlConfig)) {
            return false;
        }

        SecuritySamlConfig other = (SecuritySamlConfig) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.idpMetadataContent, other.idpMetadataContent)
                && java.util.Objects.equals(this.idpEntityId, other.idpEntityId)
                && java.util.Objects.equals(this.opendashboardUrl, other.opendashboardUrl)
                && java.util.Objects.equals(this.adminBackendRole, other.adminBackendRole)
                && java.util.Objects.equals(this.subjectKey, other.subjectKey)
                && java.util.Objects.equals(this.rolesKey, other.rolesKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.idpMetadataContent == null
                                ? 43
                                : this.idpMetadataContent.hashCode());
        result = (result * PRIME) + (this.idpEntityId == null ? 43 : this.idpEntityId.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardUrl == null ? 43 : this.opendashboardUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.adminBackendRole == null ? 43 : this.adminBackendRole.hashCode());
        result = (result * PRIME) + (this.subjectKey == null ? 43 : this.subjectKey.hashCode());
        result = (result * PRIME) + (this.rolesKey == null ? 43 : this.rolesKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
