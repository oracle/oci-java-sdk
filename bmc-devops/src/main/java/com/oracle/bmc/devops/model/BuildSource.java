/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
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

    /**
     * Name of the build source. This must be unique within a build source collection. The name can be used by customers to locate the working directory pertinent to this repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * URL for the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    String repositoryUrl;

    /**
     * Branch name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    String branch;

    /**
     * The type of source provider.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ConnectionType {
        Github("GITHUB"),
        Gitlab("GITLAB"),
        DevopsCodeRepository("DEVOPS_CODE_REPOSITORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
