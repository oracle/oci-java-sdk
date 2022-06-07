/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the artifacts delivered through the Deliver Artifacts stage.
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
    property = "artifactType",
    defaultImpl = DeliveredArtifact.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ContainerRegistryDeliveredArtifact.class,
        name = "OCIR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GenericDeliveredArtifact.class,
        name = "GENERIC_ARTIFACT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DeliveredArtifact {
    @Deprecated
    @java.beans.ConstructorProperties({"deployArtifactId", "outputArtifactName"})
    protected DeliveredArtifact(String deployArtifactId, String outputArtifactName) {
        super();
        this.deployArtifactId = deployArtifactId;
        this.outputArtifactName = outputArtifactName;
    }

    /**
     * The OCID of the deployment artifact definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
    private final String deployArtifactId;

    public String getDeployArtifactId() {
        return deployArtifactId;
    }

    /**
     * Name of the output artifact defined in the build specification file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
    private final String outputArtifactName;

    public String getOutputArtifactName() {
        return outputArtifactName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeliveredArtifact(");
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
                && java.util.Objects.equals(this.outputArtifactName, other.outputArtifactName);
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
        return result;
    }

    /**
     * Type of artifact delivered.
     **/
    public enum ArtifactType {
        GenericArtifact("GENERIC_ARTIFACT"),
        Ocir("OCIR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
