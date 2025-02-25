/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * A configuration for the Source Code Management tool/platform used by a remediation recipe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "scmType",
    defaultImpl = ScmConfiguration.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OciCodeRepositoryConfiguration.class,
        name = "OCI_CODE_REPOSITORY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExternalScmConfiguration.class,
        name = "EXTERNAL_SCM"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ScmConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"branch", "buildFileLocation", "isAutomergeEnabled"})
    protected ScmConfiguration(
            String branch, String buildFileLocation, Boolean isAutomergeEnabled) {
        super();
        this.branch = branch;
        this.buildFileLocation = buildFileLocation;
        this.isAutomergeEnabled = isAutomergeEnabled;
    }

    /**
     * The branch used by ADM to patch vulnerabilities.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    private final String branch;

    /**
     * The branch used by ADM to patch vulnerabilities.
     * @return the value
     **/
    public String getBranch() {
        return branch;
    }

    /**
     * The location of the build file relative to the root of the repository. Only Maven build files (POM) are currently supported.
     * If this property is not specified, ADM will use the build file located at the root of the repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildFileLocation")
    private final String buildFileLocation;

    /**
     * The location of the build file relative to the root of the repository. Only Maven build files (POM) are currently supported.
     * If this property is not specified, ADM will use the build file located at the root of the repository.
     *
     * @return the value
     **/
    public String getBuildFileLocation() {
        return buildFileLocation;
    }

    /**
     * If true, the Pull Request (PR) will be merged after the verify stage completes successfully
     * If false, the PR with the proposed changes must be reviewed and manually merged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomergeEnabled")
    private final Boolean isAutomergeEnabled;

    /**
     * If true, the Pull Request (PR) will be merged after the verify stage completes successfully
     * If false, the PR with the proposed changes must be reviewed and manually merged.
     *
     * @return the value
     **/
    public Boolean getIsAutomergeEnabled() {
        return isAutomergeEnabled;
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
        sb.append("ScmConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("branch=").append(String.valueOf(this.branch));
        sb.append(", buildFileLocation=").append(String.valueOf(this.buildFileLocation));
        sb.append(", isAutomergeEnabled=").append(String.valueOf(this.isAutomergeEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScmConfiguration)) {
            return false;
        }

        ScmConfiguration other = (ScmConfiguration) o;
        return java.util.Objects.equals(this.branch, other.branch)
                && java.util.Objects.equals(this.buildFileLocation, other.buildFileLocation)
                && java.util.Objects.equals(this.isAutomergeEnabled, other.isAutomergeEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branch == null ? 43 : this.branch.hashCode());
        result =
                (result * PRIME)
                        + (this.buildFileLocation == null ? 43 : this.buildFileLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutomergeEnabled == null
                                ? 43
                                : this.isAutomergeEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of Source Code Management.
     **/
    public enum ScmType {
        OciCodeRepository("OCI_CODE_REPOSITORY"),
        ExternalScm("EXTERNAL_SCM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScmType.class);

        private final String value;
        private static java.util.Map<String, ScmType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScmType v : ScmType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScmType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScmType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScmType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
