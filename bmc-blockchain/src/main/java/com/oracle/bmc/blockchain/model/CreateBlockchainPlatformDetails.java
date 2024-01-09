/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform details for creating a new service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBlockchainPlatformDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBlockchainPlatformDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "platformRole",
        "computeShape",
        "isByol",
        "platformVersion",
        "idcsAccessToken",
        "federatedUserId",
        "caCertArchiveText",
        "freeformTags",
        "definedTags"
    })
    public CreateBlockchainPlatformDetails(
            String displayName,
            String compartmentId,
            String description,
            BlockchainPlatform.PlatformRole platformRole,
            BlockchainPlatform.ComputeShape computeShape,
            Boolean isByol,
            String platformVersion,
            String idcsAccessToken,
            String federatedUserId,
            String caCertArchiveText,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.platformRole = platformRole;
        this.computeShape = computeShape;
        this.isByol = isByol;
        this.platformVersion = platformVersion;
        this.idcsAccessToken = idcsAccessToken;
        this.federatedUserId = federatedUserId;
        this.caCertArchiveText = caCertArchiveText;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Platform Instance Display name, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Platform Instance Display name, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Platform Instance Description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Platform Instance Description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Role of platform - founder or participant */
        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private BlockchainPlatform.PlatformRole platformRole;

        /**
         * Role of platform - founder or participant
         *
         * @param platformRole the value to set
         * @return this builder
         */
        public Builder platformRole(BlockchainPlatform.PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }
        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private BlockchainPlatform.ComputeShape computeShape;

        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE
         *
         * @param computeShape the value to set
         * @return this builder
         */
        public Builder computeShape(BlockchainPlatform.ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }
        /** Bring your own license */
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license
         *
         * @param isByol the value to set
         * @return this builder
         */
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /** Platform version */
        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        /**
         * Platform version
         *
         * @param platformVersion the value to set
         * @return this builder
         */
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }
        /** IDCS access token with Identity Domain Administrator role */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
        private String idcsAccessToken;

        /**
         * IDCS access token with Identity Domain Administrator role
         *
         * @param idcsAccessToken the value to set
         * @return this builder
         */
        public Builder idcsAccessToken(String idcsAccessToken) {
            this.idcsAccessToken = idcsAccessToken;
            this.__explicitlySet__.add("idcsAccessToken");
            return this;
        }
        /** Identifier for a federated user */
        @com.fasterxml.jackson.annotation.JsonProperty("federatedUserId")
        private String federatedUserId;

        /**
         * Identifier for a federated user
         *
         * @param federatedUserId the value to set
         * @return this builder
         */
        public Builder federatedUserId(String federatedUserId) {
            this.federatedUserId = federatedUserId;
            this.__explicitlySet__.add("federatedUserId");
            return this;
        }
        /**
         * Base64 encoded text in ASCII character set of a Thirdparty CA Certificates archive file.
         * The Archive file is a zip file containing third part CA Certificates, the ca key and
         * certificate files used when issuing enrollment certificates (ECerts) and transaction
         * certificates (TCerts). The chainfile (if it exists) contains the certificate chain which
         * should be trusted for this CA, where the 1st in the chain is always the root CA
         * certificate. File list in zip file [ca-cert.pem,ca-key.pem,ca-chain.pem(optional)].
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caCertArchiveText")
        private String caCertArchiveText;

        /**
         * Base64 encoded text in ASCII character set of a Thirdparty CA Certificates archive file.
         * The Archive file is a zip file containing third part CA Certificates, the ca key and
         * certificate files used when issuing enrollment certificates (ECerts) and transaction
         * certificates (TCerts). The chainfile (if it exists) contains the certificate chain which
         * should be trusted for this CA, where the 1st in the chain is always the root CA
         * certificate. File list in zip file [ca-cert.pem,ca-key.pem,ca-chain.pem(optional)].
         *
         * @param caCertArchiveText the value to set
         * @return this builder
         */
        public Builder caCertArchiveText(String caCertArchiveText) {
            this.caCertArchiveText = caCertArchiveText;
            this.__explicitlySet__.add("caCertArchiveText");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBlockchainPlatformDetails build() {
            CreateBlockchainPlatformDetails model =
                    new CreateBlockchainPlatformDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.platformRole,
                            this.computeShape,
                            this.isByol,
                            this.platformVersion,
                            this.idcsAccessToken,
                            this.federatedUserId,
                            this.caCertArchiveText,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBlockchainPlatformDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("platformRole")) {
                this.platformRole(model.getPlatformRole());
            }
            if (model.wasPropertyExplicitlySet("computeShape")) {
                this.computeShape(model.getComputeShape());
            }
            if (model.wasPropertyExplicitlySet("isByol")) {
                this.isByol(model.getIsByol());
            }
            if (model.wasPropertyExplicitlySet("platformVersion")) {
                this.platformVersion(model.getPlatformVersion());
            }
            if (model.wasPropertyExplicitlySet("idcsAccessToken")) {
                this.idcsAccessToken(model.getIdcsAccessToken());
            }
            if (model.wasPropertyExplicitlySet("federatedUserId")) {
                this.federatedUserId(model.getFederatedUserId());
            }
            if (model.wasPropertyExplicitlySet("caCertArchiveText")) {
                this.caCertArchiveText(model.getCaCertArchiveText());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Platform Instance Display name, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Platform Instance Display name, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Platform Instance Description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Platform Instance Description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Role of platform - founder or participant */
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    private final BlockchainPlatform.PlatformRole platformRole;

    /**
     * Role of platform - founder or participant
     *
     * @return the value
     */
    public BlockchainPlatform.PlatformRole getPlatformRole() {
        return platformRole;
    }

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    private final BlockchainPlatform.ComputeShape computeShape;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE
     *
     * @return the value
     */
    public BlockchainPlatform.ComputeShape getComputeShape() {
        return computeShape;
    }

    /** Bring your own license */
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license
     *
     * @return the value
     */
    public Boolean getIsByol() {
        return isByol;
    }

    /** Platform version */
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    /**
     * Platform version
     *
     * @return the value
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /** IDCS access token with Identity Domain Administrator role */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
    private final String idcsAccessToken;

    /**
     * IDCS access token with Identity Domain Administrator role
     *
     * @return the value
     */
    public String getIdcsAccessToken() {
        return idcsAccessToken;
    }

    /** Identifier for a federated user */
    @com.fasterxml.jackson.annotation.JsonProperty("federatedUserId")
    private final String federatedUserId;

    /**
     * Identifier for a federated user
     *
     * @return the value
     */
    public String getFederatedUserId() {
        return federatedUserId;
    }

    /**
     * Base64 encoded text in ASCII character set of a Thirdparty CA Certificates archive file. The
     * Archive file is a zip file containing third part CA Certificates, the ca key and certificate
     * files used when issuing enrollment certificates (ECerts) and transaction certificates
     * (TCerts). The chainfile (if it exists) contains the certificate chain which should be trusted
     * for this CA, where the 1st in the chain is always the root CA certificate. File list in zip
     * file [ca-cert.pem,ca-key.pem,ca-chain.pem(optional)].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCertArchiveText")
    private final String caCertArchiveText;

    /**
     * Base64 encoded text in ASCII character set of a Thirdparty CA Certificates archive file. The
     * Archive file is a zip file containing third part CA Certificates, the ca key and certificate
     * files used when issuing enrollment certificates (ECerts) and transaction certificates
     * (TCerts). The chainfile (if it exists) contains the certificate chain which should be trusted
     * for this CA, where the 1st in the chain is always the root CA certificate. File list in zip
     * file [ca-cert.pem,ca-key.pem,ca-chain.pem(optional)].
     *
     * @return the value
     */
    public String getCaCertArchiveText() {
        return caCertArchiveText;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateBlockchainPlatformDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", platformRole=").append(String.valueOf(this.platformRole));
        sb.append(", computeShape=").append(String.valueOf(this.computeShape));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", idcsAccessToken=").append(String.valueOf(this.idcsAccessToken));
        sb.append(", federatedUserId=").append(String.valueOf(this.federatedUserId));
        sb.append(", caCertArchiveText=").append(String.valueOf(this.caCertArchiveText));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBlockchainPlatformDetails)) {
            return false;
        }

        CreateBlockchainPlatformDetails other = (CreateBlockchainPlatformDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.platformRole, other.platformRole)
                && java.util.Objects.equals(this.computeShape, other.computeShape)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.idcsAccessToken, other.idcsAccessToken)
                && java.util.Objects.equals(this.federatedUserId, other.federatedUserId)
                && java.util.Objects.equals(this.caCertArchiveText, other.caCertArchiveText)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.platformRole == null ? 43 : this.platformRole.hashCode());
        result = (result * PRIME) + (this.computeShape == null ? 43 : this.computeShape.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAccessToken == null ? 43 : this.idcsAccessToken.hashCode());
        result =
                (result * PRIME)
                        + (this.federatedUserId == null ? 43 : this.federatedUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.caCertArchiveText == null ? 43 : this.caCertArchiveText.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
