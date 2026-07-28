/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a the Google PubSub Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateGooglePubSubConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateGooglePubSubConnectionDetails extends UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * The base64 encoded content of the service account key file containing the credentials
         * required to use Google PubSub. Deprecated: This field is deprecated and replaced by
         * "serviceAccountKeyFileSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFile")
        private char[] serviceAccountKeyFile;

        /**
         * The base64 encoded content of the service account key file containing the credentials
         * required to use Google PubSub. Deprecated: This field is deprecated and replaced by
         * "serviceAccountKeyFileSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param serviceAccountKeyFile the value to set
         * @return this builder
         */
        public Builder serviceAccountKeyFile(char[] serviceAccountKeyFile) {
            this.serviceAccountKeyFile = serviceAccountKeyFile;
            this.__explicitlySet__.add("serviceAccountKeyFile");
            return this;
        }

        public Builder serviceAccountKeyFile(String serviceAccountKeyFile) {
            this.serviceAccountKeyFile =
                    serviceAccountKeyFile != null ? serviceAccountKeyFile.toCharArray() : null;
            this.__explicitlySet__.add("serviceAccountKeyFile");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the service account key file is stored, which contains the
         * credentials required to use Google PubSub. Note: When provided, 'serviceAccountKeyFile'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFileSecretId")
        private String serviceAccountKeyFileSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the service account key file is stored, which contains the
         * credentials required to use Google PubSub. Note: When provided, 'serviceAccountKeyFile'
         * field must not be provided.
         *
         * @param serviceAccountKeyFileSecretId the value to set
         * @return this builder
         */
        public Builder serviceAccountKeyFileSecretId(String serviceAccountKeyFileSecretId) {
            this.serviceAccountKeyFileSecretId = serviceAccountKeyFileSecretId;
            this.__explicitlySet__.add("serviceAccountKeyFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGooglePubSubConnectionDetails build() {
            UpdateGooglePubSubConnectionDetails model =
                    new UpdateGooglePubSubConnectionDetails(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.securityAttributes,
                            this.serviceAccountKeyFile,
                            this.serviceAccountKeyFileSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGooglePubSubConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("serviceAccountKeyFile")) {
                this.serviceAccountKeyFile(model.getServiceAccountKeyFile());
            }
            if (model.wasPropertyExplicitlySet("serviceAccountKeyFileSecretId")) {
                this.serviceAccountKeyFileSecretId(model.getServiceAccountKeyFileSecretId());
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
    public UpdateGooglePubSubConnectionDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String serviceAccountKeyFile,
            String serviceAccountKeyFileSecretId) {
        super(
                displayName,
                description,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds,
                securityAttributes);
        this.serviceAccountKeyFile =
                serviceAccountKeyFile != null ? serviceAccountKeyFile.toCharArray() : null;
        this.serviceAccountKeyFileSecretId = serviceAccountKeyFileSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateGooglePubSubConnectionDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("displayName") String displayName,
            @com.fasterxml.jackson.annotation.JsonProperty("description") String description,
            @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
                    java.util.Map<String, String> freeformTags,
            @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
                    java.util.Map<String, java.util.Map<String, Object>> definedTags,
            @com.fasterxml.jackson.annotation.JsonProperty("vaultId") String vaultId,
            @com.fasterxml.jackson.annotation.JsonProperty("keyId") String keyId,
            @com.fasterxml.jackson.annotation.JsonProperty("nsgIds") java.util.List<String> nsgIds,
            @com.fasterxml.jackson.annotation.JsonProperty("subnetId") String subnetId,
            @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
                    RoutingMethod routingMethod,
            @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
                    Boolean doesUseSecretIds,
            @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
                    java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFile")
                    char[] serviceAccountKeyFile,
            @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFileSecretId")
                    String serviceAccountKeyFileSecretId) {
        super(
                displayName,
                description,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds,
                securityAttributes);
        this.serviceAccountKeyFile = serviceAccountKeyFile;
        this.serviceAccountKeyFileSecretId = serviceAccountKeyFileSecretId;
    }

    /**
     * The base64 encoded content of the service account key file containing the credentials
     * required to use Google PubSub. Deprecated: This field is deprecated and replaced by
     * "serviceAccountKeyFileSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFile")
    private final char[] serviceAccountKeyFile;

    /**
     * The base64 encoded content of the service account key file containing the credentials
     * required to use Google PubSub. Deprecated: This field is deprecated and replaced by
     * &quot;serviceAccountKeyFileSecretId&quot;. This change follows the GoldenGate &quot;Plain
     * Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getServiceAccountKeyFile__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getServiceAccountKeyFile() {
        return serviceAccountKeyFile != null ? new String(serviceAccountKeyFile) : null;
    }

    /**
     * The base64 encoded content of the service account key file containing the credentials
     * required to use Google PubSub. Deprecated: This field is deprecated and replaced by
     * "serviceAccountKeyFileSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFile")
    public char[] getServiceAccountKeyFile__AsCharArray() {
        return serviceAccountKeyFile;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the service account key file is stored, which contains the
     * credentials required to use Google PubSub. Note: When provided, 'serviceAccountKeyFile' field
     * must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFileSecretId")
    private final String serviceAccountKeyFileSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the service account key file is stored, which contains the
     * credentials required to use Google PubSub. Note: When provided, 'serviceAccountKeyFile' field
     * must not be provided.
     *
     * @return the value
     */
    public String getServiceAccountKeyFileSecretId() {
        return serviceAccountKeyFileSecretId;
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
        sb.append("UpdateGooglePubSubConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", serviceAccountKeyFile=").append("<redacted>");
        sb.append(", serviceAccountKeyFileSecretId=")
                .append(String.valueOf(this.serviceAccountKeyFileSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGooglePubSubConnectionDetails)) {
            return false;
        }

        UpdateGooglePubSubConnectionDetails other = (UpdateGooglePubSubConnectionDetails) o;
        return java.util.Objects.equals(this.serviceAccountKeyFile, other.serviceAccountKeyFile)
                && java.util.Objects.equals(
                        this.serviceAccountKeyFileSecretId, other.serviceAccountKeyFileSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceAccountKeyFile == null
                                ? 43
                                : this.serviceAccountKeyFile.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceAccountKeyFileSecretId == null
                                ? 43
                                : this.serviceAccountKeyFileSecretId.hashCode());
        return result;
    }
}
