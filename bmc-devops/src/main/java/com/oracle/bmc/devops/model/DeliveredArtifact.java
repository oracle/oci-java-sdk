/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the artifacts delivered through the Deliver Artifacts stage. <br>
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
        property = "artifactType",
        defaultImpl = DeliveredArtifact.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ContainerRegistryDeliveredArtifact.class,
            name = "OCIR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericDeliveredArtifact.class,
            name = "GENERIC_ARTIFACT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DeliveredArtifact extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deployArtifactId", "outputArtifactName"})
    protected DeliveredArtifact(String deployArtifactId, String outputArtifactName) {
        super();
        this.deployArtifactId = deployArtifactId;
        this.outputArtifactName = outputArtifactName;
    }

    /** The OCID of the deployment artifact definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
    private final String deployArtifactId;

    /**
     * The OCID of the deployment artifact definition.
     *
     * @return the value
     */
    public String getDeployArtifactId() {
        return deployArtifactId;
    }

    /** Name of the output artifact defined in the build specification file. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
    private final String outputArtifactName;

    /**
     * Name of the output artifact defined in the build specification file.
     *
     * @return the value
     */
    public String getOutputArtifactName() {
        return outputArtifactName;
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
        sb.append("DeliveredArtifact(");
        sb.append("super=").append(super.toString());
        sb.append("deployArtifactId=").append(String.valueOf(this.deployArtifactId));
        sb.append(", outputArtifactName=").append(String.valueOf(this.outputArtifactName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeliveredArtifact)) {
            return false;
        }

        DeliveredArtifact other = (DeliveredArtifact) o;
        return java.util.Objects.equals(this.deployArtifactId, other.deployArtifactId)
                && java.util.Objects.equals(this.outputArtifactName, other.outputArtifactName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployArtifactId == null ? 43 : this.deployArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.outputArtifactName == null
                                ? 43
                                : this.outputArtifactName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of artifact delivered. */
    public enum ArtifactType implements com.oracle.bmc.http.internal.BmcEnum {
        GenericArtifact("GENERIC_ARTIFACT"),
        Ocir("OCIR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ArtifactType.class);

        private final String value;
        private static java.util.Map<String, ArtifactType> map;

        static {
            map = new java.util.HashMap<>();
            for (ArtifactType v : ArtifactType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ArtifactType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ArtifactType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ArtifactType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
