/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the details of an APEX FA Integration property set <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PropertySetApexFaIntegration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "key")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PropertySetApexFaIntegration extends PropertySet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isMutable")
        private Boolean isMutable;

        public Builder isMutable(Boolean isMutable) {
            this.isMutable = isMutable;
            this.__explicitlySet__.add("isMutable");
            return this;
        }
        /** APEX FA Integration key-value pairs. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationSubstitutions")
        private java.util.Map<String, String> authenticationSubstitutions;

        /**
         * APEX FA Integration key-value pairs.
         *
         * @param authenticationSubstitutions the value to set
         * @return this builder
         */
        public Builder authenticationSubstitutions(
                java.util.Map<String, String> authenticationSubstitutions) {
            this.authenticationSubstitutions = authenticationSubstitutions;
            this.__explicitlySet__.add("authenticationSubstitutions");
            return this;
        }
        /**
         * Specifies whether database credentials can be used in all workspaces on the APEX
         * instance. Supported values include: "Y", "N" and empty string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDbmsCredentialEnabled")
        private String instanceDbmsCredentialEnabled;

        /**
         * Specifies whether database credentials can be used in all workspaces on the APEX
         * instance. Supported values include: "Y", "N" and empty string.
         *
         * @param instanceDbmsCredentialEnabled the value to set
         * @return this builder
         */
        public Builder instanceDbmsCredentialEnabled(String instanceDbmsCredentialEnabled) {
            this.instanceDbmsCredentialEnabled = instanceDbmsCredentialEnabled;
            this.__explicitlySet__.add("instanceDbmsCredentialEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prerequisitesCheck")
        private ApexFaIntegrationPrerequisitesCheck prerequisitesCheck;

        public Builder prerequisitesCheck(ApexFaIntegrationPrerequisitesCheck prerequisitesCheck) {
            this.prerequisitesCheck = prerequisitesCheck;
            this.__explicitlySet__.add("prerequisitesCheck");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertySetApexFaIntegration build() {
            PropertySetApexFaIntegration model =
                    new PropertySetApexFaIntegration(
                            this.isMutable,
                            this.authenticationSubstitutions,
                            this.instanceDbmsCredentialEnabled,
                            this.prerequisitesCheck);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertySetApexFaIntegration model) {
            if (model.wasPropertyExplicitlySet("isMutable")) {
                this.isMutable(model.getIsMutable());
            }
            if (model.wasPropertyExplicitlySet("authenticationSubstitutions")) {
                this.authenticationSubstitutions(model.getAuthenticationSubstitutions());
            }
            if (model.wasPropertyExplicitlySet("instanceDbmsCredentialEnabled")) {
                this.instanceDbmsCredentialEnabled(model.getInstanceDbmsCredentialEnabled());
            }
            if (model.wasPropertyExplicitlySet("prerequisitesCheck")) {
                this.prerequisitesCheck(model.getPrerequisitesCheck());
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
    public PropertySetApexFaIntegration(
            Boolean isMutable,
            java.util.Map<String, String> authenticationSubstitutions,
            String instanceDbmsCredentialEnabled,
            ApexFaIntegrationPrerequisitesCheck prerequisitesCheck) {
        super(isMutable);
        this.authenticationSubstitutions = authenticationSubstitutions;
        this.instanceDbmsCredentialEnabled = instanceDbmsCredentialEnabled;
        this.prerequisitesCheck = prerequisitesCheck;
    }

    /** APEX FA Integration key-value pairs. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSubstitutions")
    private final java.util.Map<String, String> authenticationSubstitutions;

    /**
     * APEX FA Integration key-value pairs.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAuthenticationSubstitutions() {
        return authenticationSubstitutions;
    }

    /**
     * Specifies whether database credentials can be used in all workspaces on the APEX instance.
     * Supported values include: "Y", "N" and empty string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDbmsCredentialEnabled")
    private final String instanceDbmsCredentialEnabled;

    /**
     * Specifies whether database credentials can be used in all workspaces on the APEX instance.
     * Supported values include: "Y", "N" and empty string.
     *
     * @return the value
     */
    public String getInstanceDbmsCredentialEnabled() {
        return instanceDbmsCredentialEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("prerequisitesCheck")
    private final ApexFaIntegrationPrerequisitesCheck prerequisitesCheck;

    public ApexFaIntegrationPrerequisitesCheck getPrerequisitesCheck() {
        return prerequisitesCheck;
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
        sb.append("PropertySetApexFaIntegration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", authenticationSubstitutions=")
                .append(String.valueOf(this.authenticationSubstitutions));
        sb.append(", instanceDbmsCredentialEnabled=")
                .append(String.valueOf(this.instanceDbmsCredentialEnabled));
        sb.append(", prerequisitesCheck=").append(String.valueOf(this.prerequisitesCheck));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertySetApexFaIntegration)) {
            return false;
        }

        PropertySetApexFaIntegration other = (PropertySetApexFaIntegration) o;
        return java.util.Objects.equals(
                        this.authenticationSubstitutions, other.authenticationSubstitutions)
                && java.util.Objects.equals(
                        this.instanceDbmsCredentialEnabled, other.instanceDbmsCredentialEnabled)
                && java.util.Objects.equals(this.prerequisitesCheck, other.prerequisitesCheck)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.authenticationSubstitutions == null
                                ? 43
                                : this.authenticationSubstitutions.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDbmsCredentialEnabled == null
                                ? 43
                                : this.instanceDbmsCredentialEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.prerequisitesCheck == null
                                ? 43
                                : this.prerequisitesCheck.hashCode());
        return result;
    }
}
