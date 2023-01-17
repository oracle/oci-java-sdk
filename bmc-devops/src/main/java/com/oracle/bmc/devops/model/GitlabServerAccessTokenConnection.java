/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The properties that define a connection of the type {@code GITLAB_SERVER_ACCESS_TOKEN}.
 * This type corresponds to a connection in GitLab self-hosted server that is authenticated with a
 * personal access token.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GitlabServerAccessTokenConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GitlabServerAccessTokenConnection extends Connection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The OCID of personal access token saved in secret store.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * The OCID of personal access token saved in secret store.
         * @param accessToken the value to set
         * @return this builder
         **/
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /**
         * The baseUrl of the hosted GitLabServer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * The baseUrl of the hosted GitLabServer.
         * @param baseUrl the value to set
         * @return this builder
         **/
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
        private TlsVerifyConfig tlsVerifyConfig;

        public Builder tlsVerifyConfig(TlsVerifyConfig tlsVerifyConfig) {
            this.tlsVerifyConfig = tlsVerifyConfig;
            this.__explicitlySet__.add("tlsVerifyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GitlabServerAccessTokenConnection build() {
            GitlabServerAccessTokenConnection model =
                    new GitlabServerAccessTokenConnection(
                            this.id,
                            this.description,
                            this.displayName,
                            this.compartmentId,
                            this.projectId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.accessToken,
                            this.baseUrl,
                            this.tlsVerifyConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitlabServerAccessTokenConnection model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("baseUrl")) {
                this.baseUrl(model.getBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("tlsVerifyConfig")) {
                this.tlsVerifyConfig(model.getTlsVerifyConfig());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public GitlabServerAccessTokenConnection(
            String id,
            String description,
            String displayName,
            String compartmentId,
            String projectId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String accessToken,
            String baseUrl,
            TlsVerifyConfig tlsVerifyConfig) {
        super(
                id,
                description,
                displayName,
                compartmentId,
                projectId,
                timeCreated,
                timeUpdated,
                lifecycleDetails,
                lifecycleState,
                freeformTags,
                definedTags,
                systemTags);
        this.accessToken = accessToken;
        this.baseUrl = baseUrl;
        this.tlsVerifyConfig = tlsVerifyConfig;
    }

    /**
     * The OCID of personal access token saved in secret store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * The OCID of personal access token saved in secret store.
     * @return the value
     **/
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * The baseUrl of the hosted GitLabServer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * The baseUrl of the hosted GitLabServer.
     * @return the value
     **/
    public String getBaseUrl() {
        return baseUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
    private final TlsVerifyConfig tlsVerifyConfig;

    public TlsVerifyConfig getTlsVerifyConfig() {
        return tlsVerifyConfig;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GitlabServerAccessTokenConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", tlsVerifyConfig=").append(String.valueOf(this.tlsVerifyConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitlabServerAccessTokenConnection)) {
            return false;
        }

        GitlabServerAccessTokenConnection other = (GitlabServerAccessTokenConnection) o;
        return java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.tlsVerifyConfig, other.tlsVerifyConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsVerifyConfig == null ? 43 : this.tlsVerifyConfig.hashCode());
        return result;
    }
}
