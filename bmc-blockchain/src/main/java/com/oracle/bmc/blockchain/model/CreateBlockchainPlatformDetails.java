/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform details for creating a new service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateBlockchainPlatformDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private BlockchainPlatform.PlatformRole platformRole;

        public Builder platformRole(BlockchainPlatform.PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private BlockchainPlatform.ComputeShape computeShape;

        public Builder computeShape(BlockchainPlatform.ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
        private String idcsAccessToken;

        public Builder idcsAccessToken(String idcsAccessToken) {
            this.idcsAccessToken = idcsAccessToken;
            this.__explicitlySet__.add("idcsAccessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("federatedUserId")
        private String federatedUserId;

        public Builder federatedUserId(String federatedUserId) {
            this.federatedUserId = federatedUserId;
            this.__explicitlySet__.add("federatedUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("caCertArchiveText")
        private String caCertArchiveText;

        public Builder caCertArchiveText(String caCertArchiveText) {
            this.caCertArchiveText = caCertArchiveText;
            this.__explicitlySet__.add("caCertArchiveText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBlockchainPlatformDetails build() {
            CreateBlockchainPlatformDetails __instance__ =
                    new CreateBlockchainPlatformDetails(
                            displayName,
                            compartmentId,
                            description,
                            platformRole,
                            computeShape,
                            isByol,
                            idcsAccessToken,
                            federatedUserId,
                            caCertArchiveText,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBlockchainPlatformDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .platformRole(o.getPlatformRole())
                            .computeShape(o.getComputeShape())
                            .isByol(o.getIsByol())
                            .idcsAccessToken(o.getIdcsAccessToken())
                            .federatedUserId(o.getFederatedUserId())
                            .caCertArchiveText(o.getCaCertArchiveText())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Platform Instance Display name, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Platform Instance Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Role of platform - founder or participant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    BlockchainPlatform.PlatformRole platformRole;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    BlockchainPlatform.ComputeShape computeShape;

    /**
     * Bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    Boolean isByol;

    /**
     * IDCS access token with Identity Domain Administrator role
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
    String idcsAccessToken;

    /**
     * Identifier for a federated user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("federatedUserId")
    String federatedUserId;

    /**
     * Base64 encoded text in ASCII character set of a Thirdparty CA Certificates archive file.
     * The Archive file is a zip file containing third part CA Certificates,
     * the ca key and certificate files used when issuing enrollment certificates
     * (ECerts) and transaction certificates (TCerts). The chainfile (if it exists)
     * contains the certificate chain which should be trusted for this CA, where
     * the 1st in the chain is always the root CA certificate.
     * File list in zip file [ca-cert.pem,ca-key.pem,ca-chain.pem(optional)].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertArchiveText")
    String caCertArchiveText;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
