/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies source of an artifact. <br>
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
        property = "deployArtifactSourceType",
        defaultImpl = DeployArtifactSource.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericDeployArtifactSource.class,
            name = "GENERIC_ARTIFACT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HelmRepositoryDeployArtifactSource.class,
            name = "HELM_CHART"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OcirDeployArtifactSource.class,
            name = "OCIR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HelmCommandSpecArtifactSource.class,
            name = "HELM_COMMAND_SPEC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InlineDeployArtifactSource.class,
            name = "INLINE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DeployArtifactSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected DeployArtifactSource() {
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
        sb.append("DeployArtifactSource(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployArtifactSource)) {
            return false;
        }

        DeployArtifactSource other = (DeployArtifactSource) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies types of artifact sources. */
    public enum DeployArtifactSourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Inline("INLINE"),
        Ocir("OCIR"),
        GenericArtifact("GENERIC_ARTIFACT"),
        HelmChart("HELM_CHART"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeployArtifactSourceType.class);

        private final String value;
        private static java.util.Map<String, DeployArtifactSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeployArtifactSourceType v : DeployArtifactSourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeployArtifactSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeployArtifactSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeployArtifactSourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
