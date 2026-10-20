/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Databricks Engine Connection. <br>
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
        builder = UpdateDatabricksEngineConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDatabricksEngineConnectionDetails extends UpdateConnectionDetails {
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
        /** Used authentication mechanism to access the Databricks Engine REST API. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private DatabricksEngineConnection.AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access the Databricks Engine REST API.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(
                DatabricksEngineConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * Databricks workspace base URL for the REST API. e.g.:
         * 'https://<workspace>.azuredatabricks.net/api/2.0/' e.g.:
         * 'https://<workspace>.cloud.databricks.com/api/2.0/'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceUrl")
        private String workspaceUrl;

        /**
         * Databricks workspace base URL for the REST API. e.g.:
         * 'https://<workspace>.azuredatabricks.net/api/2.0/' e.g.:
         * 'https://<workspace>.cloud.databricks.com/api/2.0/'
         *
         * @param workspaceUrl the value to set
         * @return this builder
         */
        public Builder workspaceUrl(String workspaceUrl) {
            this.workspaceUrl = workspaceUrl;
            this.__explicitlySet__.add("workspaceUrl");
            return this;
        }
        /**
         * Personal access token used to connect to the Databricks Engine REST API. Only applicable
         * for authenticationType == PERSONAL_ACCESS_TOKEN. Deprecated: This field is deprecated and
         * replaced by "authTokenSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private char[] authToken;

        /**
         * Personal access token used to connect to the Databricks Engine REST API. Only applicable
         * for authenticationType == PERSONAL_ACCESS_TOKEN. Deprecated: This field is deprecated and
         * replaced by "authTokenSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param authToken the value to set
         * @return this builder
         */
        public Builder authToken(char[] authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
            return this;
        }

        public Builder authToken(String authToken) {
            this.authToken = authToken != null ? authToken.toCharArray() : null;
            this.__explicitlySet__.add("authToken");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the personal access token is stored. Only applicable for authenticationType
         * == PERSONAL_ACCESS_TOKEN. Note: When provided, 'authToken' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authTokenSecretId")
        private String authTokenSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the personal access token is stored. Only applicable for authenticationType
         * == PERSONAL_ACCESS_TOKEN. Note: When provided, 'authToken' field must not be provided.
         *
         * @param authTokenSecretId the value to set
         * @return this builder
         */
        public Builder authTokenSecretId(String authTokenSecretId) {
            this.authTokenSecretId = authTokenSecretId;
            this.__explicitlySet__.add("authTokenSecretId");
            return this;
        }
        /** OAuth client id, only applicable for authenticationType == OAUTH_M2M */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * OAuth client id, only applicable for authenticationType == OAUTH_M2M
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * OAuth client secret, only applicable for authenticationType == OAUTH_M2M Deprecated: This
         * field is deprecated and replaced by "clientSecretSecretId". This change follows the
         * GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private char[] clientSecret;

        /**
         * OAuth client secret, only applicable for authenticationType == OAUTH_M2M Deprecated: This
         * field is deprecated and replaced by "clientSecretSecretId". This change follows the
         * GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param clientSecret the value to set
         * @return this builder
         */
        public Builder clientSecret(char[] clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret != null ? clientSecret.toCharArray() : null;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the client secret is stored. Only applicable for authenticationType ==
         * OAUTH_M2M. Note: When provided, 'clientSecret' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
        private String clientSecretSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the client secret is stored. Only applicable for authenticationType ==
         * OAUTH_M2M. Note: When provided, 'clientSecret' field must not be provided.
         *
         * @param clientSecretSecretId the value to set
         * @return this builder
         */
        public Builder clientSecretSecretId(String clientSecretSecretId) {
            this.clientSecretSecretId = clientSecretSecretId;
            this.__explicitlySet__.add("clientSecretSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
        private UpdateDatabricksEngineArtifactLocationDetails artifactLocation;

        public Builder artifactLocation(
                UpdateDatabricksEngineArtifactLocationDetails artifactLocation) {
            this.artifactLocation = artifactLocation;
            this.__explicitlySet__.add("artifactLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDatabricksEngineConnectionDetails build() {
            UpdateDatabricksEngineConnectionDetails model =
                    new UpdateDatabricksEngineConnectionDetails(
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
                            this.authenticationType,
                            this.workspaceUrl,
                            this.authToken,
                            this.authTokenSecretId,
                            this.clientId,
                            this.clientSecret,
                            this.clientSecretSecretId,
                            this.artifactLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDatabricksEngineConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("workspaceUrl")) {
                this.workspaceUrl(model.getWorkspaceUrl());
            }
            if (model.wasPropertyExplicitlySet("authToken")) {
                this.authToken(model.getAuthToken());
            }
            if (model.wasPropertyExplicitlySet("authTokenSecretId")) {
                this.authTokenSecretId(model.getAuthTokenSecretId());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("clientSecretSecretId")) {
                this.clientSecretSecretId(model.getClientSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("artifactLocation")) {
                this.artifactLocation(model.getArtifactLocation());
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
    public UpdateDatabricksEngineConnectionDetails(
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
            DatabricksEngineConnection.AuthenticationType authenticationType,
            String workspaceUrl,
            String authToken,
            String authTokenSecretId,
            String clientId,
            String clientSecret,
            String clientSecretSecretId,
            UpdateDatabricksEngineArtifactLocationDetails artifactLocation) {
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
        this.authenticationType = authenticationType;
        this.workspaceUrl = workspaceUrl;
        this.authToken = authToken != null ? authToken.toCharArray() : null;
        this.authTokenSecretId = authTokenSecretId;
        this.clientId = clientId;
        this.clientSecret = clientSecret != null ? clientSecret.toCharArray() : null;
        this.clientSecretSecretId = clientSecretSecretId;
        this.artifactLocation = artifactLocation;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateDatabricksEngineConnectionDetails(
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
            @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
                    DatabricksEngineConnection.AuthenticationType authenticationType,
            @com.fasterxml.jackson.annotation.JsonProperty("workspaceUrl") String workspaceUrl,
            @com.fasterxml.jackson.annotation.JsonProperty("authToken") char[] authToken,
            @com.fasterxml.jackson.annotation.JsonProperty("authTokenSecretId")
                    String authTokenSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("clientId") String clientId,
            @com.fasterxml.jackson.annotation.JsonProperty("clientSecret") char[] clientSecret,
            @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
                    String clientSecretSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
                    UpdateDatabricksEngineArtifactLocationDetails artifactLocation) {
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
        this.authenticationType = authenticationType;
        this.workspaceUrl = workspaceUrl;
        this.authToken = authToken;
        this.authTokenSecretId = authTokenSecretId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientSecretSecretId = clientSecretSecretId;
        this.artifactLocation = artifactLocation;
    }

    /** Used authentication mechanism to access the Databricks Engine REST API. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final DatabricksEngineConnection.AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access the Databricks Engine REST API.
     *
     * @return the value
     */
    public DatabricksEngineConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Databricks workspace base URL for the REST API. e.g.:
     * 'https://<workspace>.azuredatabricks.net/api/2.0/' e.g.:
     * 'https://<workspace>.cloud.databricks.com/api/2.0/'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceUrl")
    private final String workspaceUrl;

    /**
     * Databricks workspace base URL for the REST API. e.g.:
     * 'https://<workspace>.azuredatabricks.net/api/2.0/' e.g.:
     * 'https://<workspace>.cloud.databricks.com/api/2.0/'
     *
     * @return the value
     */
    public String getWorkspaceUrl() {
        return workspaceUrl;
    }

    /**
     * Personal access token used to connect to the Databricks Engine REST API. Only applicable for
     * authenticationType == PERSONAL_ACCESS_TOKEN. Deprecated: This field is deprecated and
     * replaced by "authTokenSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    private final char[] authToken;

    /**
     * Personal access token used to connect to the Databricks Engine REST API. Only applicable for
     * authenticationType &#x3D;&#x3D; PERSONAL_ACCESS_TOKEN. Deprecated: This field is deprecated
     * and replaced by &quot;authTokenSecretId&quot;. This change follows the GoldenGate &quot;Plain
     * Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getAuthToken__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAuthToken() {
        return authToken != null ? new String(authToken) : null;
    }

    /**
     * Personal access token used to connect to the Databricks Engine REST API. Only applicable for
     * authenticationType == PERSONAL_ACCESS_TOKEN. Deprecated: This field is deprecated and
     * replaced by "authTokenSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    public char[] getAuthToken__AsCharArray() {
        return authToken;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the personal access token is stored. Only applicable for authenticationType ==
     * PERSONAL_ACCESS_TOKEN. Note: When provided, 'authToken' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authTokenSecretId")
    private final String authTokenSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the personal access token is stored. Only applicable for authenticationType ==
     * PERSONAL_ACCESS_TOKEN. Note: When provided, 'authToken' field must not be provided.
     *
     * @return the value
     */
    public String getAuthTokenSecretId() {
        return authTokenSecretId;
    }

    /** OAuth client id, only applicable for authenticationType == OAUTH_M2M */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * OAuth client id, only applicable for authenticationType == OAUTH_M2M
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * OAuth client secret, only applicable for authenticationType == OAUTH_M2M Deprecated: This
     * field is deprecated and replaced by "clientSecretSecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final char[] clientSecret;

    /**
     * OAuth client secret, only applicable for authenticationType &#x3D;&#x3D; OAUTH_M2M
     * Deprecated: This field is deprecated and replaced by &quot;clientSecretSecretId&quot;. This
     * change follows the GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getClientSecret__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getClientSecret() {
        return clientSecret != null ? new String(clientSecret) : null;
    }

    /**
     * OAuth client secret, only applicable for authenticationType == OAUTH_M2M Deprecated: This
     * field is deprecated and replaced by "clientSecretSecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    public char[] getClientSecret__AsCharArray() {
        return clientSecret;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the client secret is stored. Only applicable for authenticationType ==
     * OAUTH_M2M. Note: When provided, 'clientSecret' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
    private final String clientSecretSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the client secret is stored. Only applicable for authenticationType ==
     * OAUTH_M2M. Note: When provided, 'clientSecret' field must not be provided.
     *
     * @return the value
     */
    public String getClientSecretSecretId() {
        return clientSecretSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
    private final UpdateDatabricksEngineArtifactLocationDetails artifactLocation;

    public UpdateDatabricksEngineArtifactLocationDetails getArtifactLocation() {
        return artifactLocation;
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
        sb.append("UpdateDatabricksEngineConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", workspaceUrl=").append(String.valueOf(this.workspaceUrl));
        sb.append(", authToken=").append("<redacted>");
        sb.append(", authTokenSecretId=").append(String.valueOf(this.authTokenSecretId));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append("<redacted>");
        sb.append(", clientSecretSecretId=").append(String.valueOf(this.clientSecretSecretId));
        sb.append(", artifactLocation=").append(String.valueOf(this.artifactLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabricksEngineConnectionDetails)) {
            return false;
        }

        UpdateDatabricksEngineConnectionDetails other = (UpdateDatabricksEngineConnectionDetails) o;
        return java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.workspaceUrl, other.workspaceUrl)
                && java.util.Objects.equals(this.authToken, other.authToken)
                && java.util.Objects.equals(this.authTokenSecretId, other.authTokenSecretId)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.clientSecretSecretId, other.clientSecretSecretId)
                && java.util.Objects.equals(this.artifactLocation, other.artifactLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.workspaceUrl == null ? 43 : this.workspaceUrl.hashCode());
        result = (result * PRIME) + (this.authToken == null ? 43 : this.authToken.hashCode());
        result =
                (result * PRIME)
                        + (this.authTokenSecretId == null ? 43 : this.authTokenSecretId.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretSecretId == null
                                ? 43
                                : this.clientSecretSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactLocation == null ? 43 : this.artifactLocation.hashCode());
        return result;
    }
}
