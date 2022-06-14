/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Build source required for the Build stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType",
    defaultImpl = BuildSource.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GithubBuildSource.class,
        name = "GITHUB"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BitbucketCloudBuildSource.class,
        name = "BITBUCKET_CLOUD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DevopsCodeRepositoryBuildSource.class,
        name = "DEVOPS_CODE_REPOSITORY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GitlabBuildSource.class,
        name = "GITLAB"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BuildSource {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "repositoryUrl", "branch"})
    protected BuildSource(String name, String repositoryUrl, String branch) {
        super();
        this.name = name;
        this.repositoryUrl = repositoryUrl;
        this.branch = branch;
    }

    /**
     * Name of the build source. This must be unique within a build source collection. The name can be used by customers to locate the working directory pertinent to this repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the build source. This must be unique within a build source collection. The name can be used by customers to locate the working directory pertinent to this repository.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * URL for the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * URL for the repository.
     * @return the value
     **/
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * Branch name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    private final String branch;

    /**
     * Branch name.
     * @return the value
     **/
    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BuildSource(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", branch=").append(String.valueOf(this.branch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildSource)) {
            return false;
        }

        BuildSource other = (BuildSource) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.branch, other.branch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.branch == null ? 43 : this.branch.hashCode());
        return result;
    }

    /**
     * The type of source provider.
     **/
    public enum ConnectionType {
        Github("GITHUB"),
        Gitlab("GITLAB"),
        BitbucketCloud("BITBUCKET_CLOUD"),
        DevopsCodeRepository("DEVOPS_CODE_REPOSITORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConnectionType.class);

        private final String value;
        private static java.util.Map<String, ConnectionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConnectionType v : ConnectionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConnectionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConnectionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConnectionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
