/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The source from which the build run is triggered. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType",
        defaultImpl = BuildRunSource.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GitlabServerBuildRunSource.class,
            name = "GITLAB_SERVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BitbucketServerBuildRunSource.class,
            name = "BITBUCKET_SERVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GithubBuildRunSource.class,
            name = "GITHUB"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DevopsCodeRepositoryBuildRunSource.class,
            name = "DEVOPS_CODE_REPOSITORY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VbsBuildRunSource.class,
            name = "VBS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ManualBuildRunSource.class,
            name = "MANUAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BitbucketCloudBuildRunSource.class,
            name = "BITBUCKET_CLOUD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GitlabBuildRunSource.class,
            name = "GITLAB")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BuildRunSource extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected BuildRunSource() {
        super();
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
        sb.append("BuildRunSource(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildRunSource)) {
            return false;
        }

        BuildRunSource other = (BuildRunSource) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The source from which the build run is triggered. */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Github("GITHUB"),
        Gitlab("GITLAB"),
        GitlabServer("GITLAB_SERVER"),
        BitbucketCloud("BITBUCKET_CLOUD"),
        BitbucketServer("BITBUCKET_SERVER"),
        DevopsCodeRepository("DEVOPS_CODE_REPOSITORY"),
        Vbs("VBS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceType.class);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
