/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * An external SCM configuration extends a SCM Configuration with necessary data to reach and use
 * the Source Code Management tool/platform used by a Remediation Recipe. An external SCM in ADM
 * refers to GitHub, or GitLab. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalScmConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scmType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalScmConfiguration extends ScmConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("branch")
        private String branch;

        public Builder branch(String branch) {
            this.branch = branch;
            this.__explicitlySet__.add("branch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildFileLocation")
        private String buildFileLocation;

        public Builder buildFileLocation(String buildFileLocation) {
            this.buildFileLocation = buildFileLocation;
            this.__explicitlySet__.add("buildFileLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutomergeEnabled")
        private Boolean isAutomergeEnabled;

        public Builder isAutomergeEnabled(Boolean isAutomergeEnabled) {
            this.isAutomergeEnabled = isAutomergeEnabled;
            this.__explicitlySet__.add("isAutomergeEnabled");
            return this;
        }
        /** The type of External Source Code Management. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalScmType")
        private ExternalScmType externalScmType;

        /**
         * The type of External Source Code Management.
         *
         * @param externalScmType the value to set
         * @return this builder
         */
        public Builder externalScmType(ExternalScmType externalScmType) {
            this.externalScmType = externalScmType;
            this.__explicitlySet__.add("externalScmType");
            return this;
        }
        /**
         * The repository URL for the SCM. For Non-Enterprise GitHub the expected format is
         * https://github.com/[owner]/[repoName] For Enterprise GitHub the expected format is
         * http(s)://[hostname]/api/v3/repos/[owner]/[repoName] For GitLab the expected format is
         * https://gitlab.com/[groupName]/[repoName]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The repository URL for the SCM. For Non-Enterprise GitHub the expected format is
         * https://github.com/[owner]/[repoName] For Enterprise GitHub the expected format is
         * http(s)://[hostname]/api/v3/repos/[owner]/[repoName] For GitLab the expected format is
         * https://gitlab.com/[groupName]/[repoName]
         *
         * @param repositoryUrl the value to set
         * @return this builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /** The username for the SCM (to perform operations such as cloning or pushing via HTTP). */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username for the SCM (to perform operations such as cloning or pushing via HTTP).
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The secret provides the credentials necessary to
         * authenticate against the SCM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
        private String patSecretId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The secret provides the credentials necessary to
         * authenticate against the SCM.
         *
         * @param patSecretId the value to set
         * @return this builder
         */
        public Builder patSecretId(String patSecretId) {
            this.patSecretId = patSecretId;
            this.__explicitlySet__.add("patSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalScmConfiguration build() {
            ExternalScmConfiguration model =
                    new ExternalScmConfiguration(
                            this.branch,
                            this.buildFileLocation,
                            this.isAutomergeEnabled,
                            this.externalScmType,
                            this.repositoryUrl,
                            this.username,
                            this.patSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalScmConfiguration model) {
            if (model.wasPropertyExplicitlySet("branch")) {
                this.branch(model.getBranch());
            }
            if (model.wasPropertyExplicitlySet("buildFileLocation")) {
                this.buildFileLocation(model.getBuildFileLocation());
            }
            if (model.wasPropertyExplicitlySet("isAutomergeEnabled")) {
                this.isAutomergeEnabled(model.getIsAutomergeEnabled());
            }
            if (model.wasPropertyExplicitlySet("externalScmType")) {
                this.externalScmType(model.getExternalScmType());
            }
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("patSecretId")) {
                this.patSecretId(model.getPatSecretId());
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
    public ExternalScmConfiguration(
            String branch,
            String buildFileLocation,
            Boolean isAutomergeEnabled,
            ExternalScmType externalScmType,
            String repositoryUrl,
            String username,
            String patSecretId) {
        super(branch, buildFileLocation, isAutomergeEnabled);
        this.externalScmType = externalScmType;
        this.repositoryUrl = repositoryUrl;
        this.username = username;
        this.patSecretId = patSecretId;
    }

    /** The type of External Source Code Management. */
    public enum ExternalScmType implements com.oracle.bmc.http.internal.BmcEnum {
        Github("GITHUB"),
        Gitlab("GITLAB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExternalScmType.class);

        private final String value;
        private static java.util.Map<String, ExternalScmType> map;

        static {
            map = new java.util.HashMap<>();
            for (ExternalScmType v : ExternalScmType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExternalScmType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExternalScmType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExternalScmType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of External Source Code Management. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalScmType")
    private final ExternalScmType externalScmType;

    /**
     * The type of External Source Code Management.
     *
     * @return the value
     */
    public ExternalScmType getExternalScmType() {
        return externalScmType;
    }

    /**
     * The repository URL for the SCM. For Non-Enterprise GitHub the expected format is
     * https://github.com/[owner]/[repoName] For Enterprise GitHub the expected format is
     * http(s)://[hostname]/api/v3/repos/[owner]/[repoName] For GitLab the expected format is
     * https://gitlab.com/[groupName]/[repoName]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The repository URL for the SCM. For Non-Enterprise GitHub the expected format is
     * https://github.com/[owner]/[repoName] For Enterprise GitHub the expected format is
     * http(s)://[hostname]/api/v3/repos/[owner]/[repoName] For GitLab the expected format is
     * https://gitlab.com/[groupName]/[repoName]
     *
     * @return the value
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /** The username for the SCM (to perform operations such as cloning or pushing via HTTP). */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username for the SCM (to perform operations such as cloning or pushing via HTTP).
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The secret provides the credentials necessary to
     * authenticate against the SCM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
    private final String patSecretId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The secret provides the credentials necessary to
     * authenticate against the SCM.
     *
     * @return the value
     */
    public String getPatSecretId() {
        return patSecretId;
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
        sb.append("ExternalScmConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", externalScmType=").append(String.valueOf(this.externalScmType));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", patSecretId=").append(String.valueOf(this.patSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalScmConfiguration)) {
            return false;
        }

        ExternalScmConfiguration other = (ExternalScmConfiguration) o;
        return java.util.Objects.equals(this.externalScmType, other.externalScmType)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.patSecretId, other.patSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalScmType == null ? 43 : this.externalScmType.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.patSecretId == null ? 43 : this.patSecretId.hashCode());
        return result;
    }
}
