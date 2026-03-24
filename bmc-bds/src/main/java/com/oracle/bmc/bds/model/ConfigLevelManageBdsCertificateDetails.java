/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of certificate configuration / certificate authority level used to trigger the BDS
 * certificate generation or renewal. <br>
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
        builder = ConfigLevelManageBdsCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "triggerType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigLevelManageBdsCertificateDetails
        extends ManageBdsCertificateLevelTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the BDS certificate configuration used to generate or renew BDS certificate(s).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateConfigurationId")
        private String certificateConfigurationId;

        /**
         * The id of the BDS certificate configuration used to generate or renew BDS certificate(s).
         *
         * @param certificateConfigurationId the value to set
         * @return this builder
         */
        public Builder certificateConfigurationId(String certificateConfigurationId) {
            this.certificateConfigurationId = certificateConfigurationId;
            this.__explicitlySet__.add("certificateConfigurationId");
            return this;
        }
        /**
         * Boolean flag specifying whether the request will only generate certificates for nodes
         * which do not have the same certificate authority as the certificate configuration or not.
         * The flag is only used for generating certificates from CONFIG_LEVEL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMissingNodesOnly")
        private Boolean isMissingNodesOnly;

        /**
         * Boolean flag specifying whether the request will only generate certificates for nodes
         * which do not have the same certificate authority as the certificate configuration or not.
         * The flag is only used for generating certificates from CONFIG_LEVEL.
         *
         * @param isMissingNodesOnly the value to set
         * @return this builder
         */
        public Builder isMissingNodesOnly(Boolean isMissingNodesOnly) {
            this.isMissingNodesOnly = isMissingNodesOnly;
            this.__explicitlySet__.add("isMissingNodesOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigLevelManageBdsCertificateDetails build() {
            ConfigLevelManageBdsCertificateDetails model =
                    new ConfigLevelManageBdsCertificateDetails(
                            this.certificateConfigurationId, this.isMissingNodesOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigLevelManageBdsCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("certificateConfigurationId")) {
                this.certificateConfigurationId(model.getCertificateConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("isMissingNodesOnly")) {
                this.isMissingNodesOnly(model.getIsMissingNodesOnly());
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
    public ConfigLevelManageBdsCertificateDetails(
            String certificateConfigurationId, Boolean isMissingNodesOnly) {
        super();
        this.certificateConfigurationId = certificateConfigurationId;
        this.isMissingNodesOnly = isMissingNodesOnly;
    }

    /** The id of the BDS certificate configuration used to generate or renew BDS certificate(s). */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateConfigurationId")
    private final String certificateConfigurationId;

    /**
     * The id of the BDS certificate configuration used to generate or renew BDS certificate(s).
     *
     * @return the value
     */
    public String getCertificateConfigurationId() {
        return certificateConfigurationId;
    }

    /**
     * Boolean flag specifying whether the request will only generate certificates for nodes which
     * do not have the same certificate authority as the certificate configuration or not. The flag
     * is only used for generating certificates from CONFIG_LEVEL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMissingNodesOnly")
    private final Boolean isMissingNodesOnly;

    /**
     * Boolean flag specifying whether the request will only generate certificates for nodes which
     * do not have the same certificate authority as the certificate configuration or not. The flag
     * is only used for generating certificates from CONFIG_LEVEL.
     *
     * @return the value
     */
    public Boolean getIsMissingNodesOnly() {
        return isMissingNodesOnly;
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
        sb.append("ConfigLevelManageBdsCertificateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", certificateConfigurationId=")
                .append(String.valueOf(this.certificateConfigurationId));
        sb.append(", isMissingNodesOnly=").append(String.valueOf(this.isMissingNodesOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigLevelManageBdsCertificateDetails)) {
            return false;
        }

        ConfigLevelManageBdsCertificateDetails other = (ConfigLevelManageBdsCertificateDetails) o;
        return java.util.Objects.equals(
                        this.certificateConfigurationId, other.certificateConfigurationId)
                && java.util.Objects.equals(this.isMissingNodesOnly, other.isMissingNodesOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateConfigurationId == null
                                ? 43
                                : this.certificateConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.isMissingNodesOnly == null
                                ? 43
                                : this.isMissingNodesOnly.hashCode());
        return result;
    }
}
